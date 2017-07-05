package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thanh.mytest_phungduythanh.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab_Dienary extends Fragment {


    public Tab_Dienary() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_tab__dienary, container, false);
        // Inflate the layout for this fragment
        return v;
    }

}
