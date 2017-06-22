package com.green.vpn;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.green.vpn.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewAndData(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ConnectFragment fragment1 = new ConnectFragment();
        Bundle bundle = new Bundle();
        bundle.putString("a", "1");
        fragment1.setArguments(bundle);
        ft.replace(R.id.frame_layout, fragment1);
        ft.commitAllowingStateLoss();
    }

    @Override
    protected void initData() {

    }
}
