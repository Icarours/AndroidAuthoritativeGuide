package com.syl.geo_quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.syl.geo_quiz.module.TrueFalse;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mBtnNext;
    private Button mBtnFalse;
    private Button mBtnTrue;
    private TextView mTvQuestion;
    private TrueFalse[] mQuestionBank = {
            new TrueFalse(R.string.question1, false),
            new TrueFalse(R.string.question2, false),
            new TrueFalse(R.string.question3, true),
            new TrueFalse(R.string.question4, true),
            new TrueFalse(R.string.question5, true),
    };
    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTrue = findViewById(R.id.btn_true);
        mBtnFalse = findViewById(R.id.btn_false);
        mBtnNext = findViewById(R.id.btn_next);
        mTvQuestion = findViewById(R.id.textView);
        final TrueFalse trueFalse = mQuestionBank[mCurrentIndex];
        mTvQuestion.setText(trueFalse.getResId());
        mBtnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(true);
            }
        });
        mBtnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(false);
            }
        });
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, TAG + "---"+mCurrentIndex);
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                updateQuestion();
            }
        });
        updateQuestion();
    }

    private void updateQuestion() {
        int question = mQuestionBank[mCurrentIndex].getResId();
        mTvQuestion.setText(question);
    }

    private void checkAnswer(boolean userAnswer) {
        boolean defaultVale = mQuestionBank[mCurrentIndex].getDefaultVale();
        if (defaultVale == userAnswer) {
            Toast.makeText(MainActivity.this,R.string.valueTrue,Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,R.string.valueFalse,Toast.LENGTH_SHORT).show();
        }
    }
}
