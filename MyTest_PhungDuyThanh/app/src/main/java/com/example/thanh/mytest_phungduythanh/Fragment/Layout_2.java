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
public class Layout_2 extends Fragment {


    public Layout_2() {
        // Required empty public constructor
    }
    public static Layout_2 newInstance(int page, String title) {
        Layout_2 fragmentFirst = new Layout_2();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_layout_2, container, false);
        // Inflate the layout for this fragment
        return v;
    }

}
