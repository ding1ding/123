package com.example.welcome.activity.base;

import android.app.Activity;
import android.view.View;

/**
 * Created by HIT-you-CRY on 2015/4/1.
 */
public abstract class MyBaseActivity extends Activity implements View.OnClickListener{
    protected abstract void initView();
}
