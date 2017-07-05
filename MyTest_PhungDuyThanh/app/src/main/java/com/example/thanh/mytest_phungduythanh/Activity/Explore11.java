package com.example.thanh.mytest_phungduythanh.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thanh.mytest_phungduythanh.Adapter.ViewPager_Adapter;
import com.example.thanh.mytest_phungduythanh.Fragment.ViewPager1_Explore11;
import com.example.thanh.mytest_phungduythanh.Fragment.ViewPager2_Explore11;
import com.example.thanh.mytest_phungduythanh.Fragment.ViewPager3_Explore11;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;
import java.util.List;

public class Explore11 extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPager_Adapter viewPager_adapter;
    private List<Fragment> fragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore11);
        Init();
        setFragmentList();
        viewPager_adapter=new ViewPager_Adapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(viewPager_adapter);

    }
    private void Init()
    {
        viewPager=(ViewPager)findViewById(R.id.viewPaget_explore11);
    }
    private void setFragmentList()
    {
        fragmentList=new ArrayList<>();
        fragmentList.add(new ViewPager1_Explore11());
        fragmentList.add(new ViewPager2_Explore11());
        fragmentList.add(new ViewPager3_Explore11());
    }
}
