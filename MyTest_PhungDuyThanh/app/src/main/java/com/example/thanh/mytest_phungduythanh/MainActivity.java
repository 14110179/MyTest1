package com.example.thanh.mytest_phungduythanh;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;


import com.example.thanh.mytest_phungduythanh.Adapter.ViewPager_Adapter;
import com.example.thanh.mytest_phungduythanh.Fragment.Tab_Login;
import com.example.thanh.mytest_phungduythanh.Fragment.Tab_SignUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener{

    private TabHost mTabHost;
    private ViewPager viewPager;
    private ViewPager_Adapter viewPager_adapter;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        mTabHost.setup();
        mTabHost.getTabWidget().setDividerDrawable(null);
        mTabHost.setOnTabChangedListener(this);


        TabHost.TabSpec TabLogin = mTabHost.newTabSpec("Tab Login");
        TabHost.TabSpec TabSignUp = mTabHost.newTabSpec("Tab SignUp");

        LayoutInflater inflater=LayoutInflater.from(MainActivity.this);

        TabLogin.setIndicator("LOGIN");
        View v1=inflater.inflate(R.layout.custom_tab_login,null);
        TabLogin.setIndicator(v1);
        TabLogin.setContent(new FakeContent(getApplicationContext()));

        TabSignUp.setIndicator("SINGUP");
        View v2=inflater.inflate(R.layout.custom_tab_singup,null);
        TabSignUp.setIndicator(v2);
        TabSignUp.setContent(new FakeContent(getApplicationContext()));

        mTabHost.addTab(TabLogin);
        mTabHost.addTab(TabSignUp);

        setListFragment();
        viewPager_adapter=new ViewPager_Adapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(viewPager_adapter);
        viewPager.addOnPageChangeListener(this);

    }
    private void Init()
    {
        mTabHost=(TabHost)findViewById(android.R.id.tabhost);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
    }
    private void setListFragment()
    {
        fragments=new ArrayList<>();
        fragments.add(new Tab_Login());
        fragments.add(new Tab_SignUp());
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mTabHost.setCurrentTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabChanged(String tabId) {

        int selectPage=mTabHost.getCurrentTab();
        viewPager.setCurrentItem(selectPage);
    }

    public class FakeContent implements TabHost.TabContentFactory
    {
        private Context context;
        public FakeContent(Context context)
        {
            this.context=context;
        }

        @Override
        public View createTabContent(String tag) {
            View v=new View(context);
            v.setMinimumHeight(0);
            v.setMinimumWidth(0);
            return v ;
        }
    }

}
