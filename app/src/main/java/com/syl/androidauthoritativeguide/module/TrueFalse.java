package com.syl.androidauthoritativeguide.module;

/**
 * Created by Bright on 2018/1/16.
 *
 * @Describe
 * @Called
 */

public class TrueFalse {
    private int mResId;
    private boolean mDefaultVale;

    public TrueFalse(int resId, boolean defaultVale) {
        mResId = resId;
        mDefaultVale = defaultVale;
    }

    public int getResId() {
        return mResId;
    }

    public void setResId(int resId) {
        mResId = resId;
    }

    public boolean isDefaultVale() {
        return mDefaultVale;
    }

    public void setDefaultVale(boolean defaultVale) {
        mDefaultVale = defaultVale;
    }
}
