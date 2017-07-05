package com.example.thanh.mytest_phungduythanh.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.thanh.mytest_phungduythanh.Activity.Direction20;
import com.example.thanh.mytest_phungduythanh.Activity.Explore11;
import com.example.thanh.mytest_phungduythanh.Activity.Recipes10;
import com.example.thanh.mytest_phungduythanh.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab_SignUp extends Fragment {


    public Tab_SignUp() {
        // Required empty public constructor
    }

    private Button btnSignUp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_tab__sign_up, container, false);
        Init(v);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), Explore11.class);
                startActivity(intent);
            }
        });
        return v;
    }
    private void Init(View v)
    {
        btnSignUp=(Button)v.findViewById(R.id.btnSignUp);
    }
}
