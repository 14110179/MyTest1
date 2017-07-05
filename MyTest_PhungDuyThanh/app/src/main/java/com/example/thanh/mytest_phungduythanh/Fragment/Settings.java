package com.example.thanh.mytest_phungduythanh.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;



import com.example.thanh.mytest_phungduythanh.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Settings extends Fragment {


    public Settings() {
        // Required empty public constructor
    }
    private FragmentTabHost mTabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_settings, container, false);

        mTabHost = new FragmentTabHost(getActivity());
        mTabHost = (FragmentTabHost)v.findViewById(android.R.id.tabhost);
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);


        mTabHost.addTab(mTabHost.newTabSpec("Tab Profile").setIndicator("PROFILE"),
                Tab_Profile.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("Tab Dietary").setIndicator("DIETARY"),
                Tab_Dienary.class, null);


        return v;
    }

}
