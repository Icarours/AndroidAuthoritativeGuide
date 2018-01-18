package com.syl.androidauthoritativeguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.syl.androidauthoritativeguide.module.TrueFalse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTrue = findViewById(R.id.btn_true);
        Button btnFalse = findViewById(R.id.btn_false);
        Button btnNext = findViewById(R.id.btn_next);
        TextView tvQuestion = findViewById(R.id.textView);
        final TrueFalse trueFalse = new TrueFalse(R.string.app_name, true);
        tvQuestion.setText(trueFalse.getResId());
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean defaultVale = trueFalse.isDefaultVale();
                if (defaultVale) {
                    Toast.makeText(MainActivity.this,R.string.valueTrue,Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,R.string.valueFalse,Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean defaultVale = trueFalse.isDefaultVale();
                if (!defaultVale) {
                    Toast.makeText(MainActivity.this,R.string.valueTrue,Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,R.string.valueFalse,Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
