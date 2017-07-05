package com.example.thanh.mytest_phungduythanh.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.thanh.mytest_phungduythanh.Fragment.Tab_Login;
import com.example.thanh.mytest_phungduythanh.Fragment.Tab_SignUp;

import java.util.List;

/**
 * Created by THANH on 7/5/2017.
 */

public class ViewPager_Adapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    public ViewPager_Adapter(FragmentManager fm, List<Fragment> fragments ) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
       return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
