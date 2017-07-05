package com.example.thanh.mytest_phungduythanh.Activity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;

import com.example.thanh.mytest_phungduythanh.Adapter.ViewPager_Adapter;
import com.example.thanh.mytest_phungduythanh.Fragment.Tab1_Recipes10;
import com.example.thanh.mytest_phungduythanh.Fragment.Tab2_Recipes10;
import com.example.thanh.mytest_phungduythanh.Fragment.Tab3_Recipes10;
import com.example.thanh.mytest_phungduythanh.Fragment.Tab4_Recipes10;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;
import java.util.List;

public class Recipes10 extends AppCompatActivity implements TabHost.OnTabChangeListener,ViewPager.OnPageChangeListener {

    private TabHost tabHost;
    private ViewPager viewPager;
    private List<Fragment> fragments;
    private ViewPager_Adapter viewPager_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes10);
        Init();
        setListFragments();

        tabHost.getTabWidget().setDividerDrawable(null);
        TabHost.TabSpec Tab1=tabHost.newTabSpec("Tab 1");
        TabHost.TabSpec Tab2=tabHost.newTabSpec("Tab 1");
        TabHost.TabSpec Tab3=tabHost.newTabSpec("Tab 1");
        TabHost.TabSpec Tab4=tabHost.newTabSpec("Tab 1");
        LayoutInflater inflater=LayoutInflater.from(Recipes10.this);

        View v1=inflater.inflate(R.layout.custom_tab1_recipes10,null);
        Tab1.setIndicator("");
        Tab1.setIndicator(v1);
        Tab1.setContent(new FakeContent(getApplicationContext()));

        View v2=inflater.inflate(R.layout.custom_tab2_recipes10,null);
        Tab2.setIndicator(v2);
        Tab2.setContent(new FakeContent(getApplicationContext()));

        View v3=inflater.inflate(R.layout.custom_tab3_recipes10,null);
        Tab3.setIndicator(v3);
        Tab3.setContent(new FakeContent(getApplicationContext()));

        View v4=inflater.inflate(R.layout.custom_tab4_recipes10,null);
        Tab4.setIndicator(v4);
        Tab4.setContent(new FakeContent(getApplicationContext()));

        tabHost.addTab(Tab1);
        tabHost.addTab(Tab2);
        tabHost.addTab(Tab3);
        tabHost.addTab(Tab4);


        viewPager_adapter=new ViewPager_Adapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(viewPager_adapter);

        viewPager.addOnPageChangeListener(this);
        tabHost.setOnTabChangedListener(this);
    }
    private void Init()
    {
        tabHost=(TabHost)findViewById(android.R.id.tabhost);
        tabHost.setup();
        viewPager=(ViewPager)findViewById(R.id.viewPager_recipes10);

    }
    private void setListFragments()
    {
        fragments=new ArrayList<>();
        fragments.add(new Tab1_Recipes10());
        fragments.add(new Tab2_Recipes10());
        fragments.add(new Tab3_Recipes10());
        fragments.add(new Tab4_Recipes10());

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tabHost.setCurrentTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabChanged(String tabId) {
        int selectTab=tabHost.getCurrentTab();
        viewPager.setCurrentItem(selectTab);
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
