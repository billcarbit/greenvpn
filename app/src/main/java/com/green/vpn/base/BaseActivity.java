package com.green.vpn.base;

import android.app.Activity;

/**
 * Created by Administrator on 2017/6/21.
 */
public abstract class BaseActivity extends Activity {

    protected void initViewAndData(int layoutId) {
        setContentView(layoutId);
        initView();
        initData();
    }

    protected abstract void initView();

    protected abstract void initData();

}
