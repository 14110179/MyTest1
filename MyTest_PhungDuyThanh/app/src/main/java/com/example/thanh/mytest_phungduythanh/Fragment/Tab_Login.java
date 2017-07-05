package com.example.thanh.mytest_phungduythanh.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.thanh.mytest_phungduythanh.Activity.Recipes_9;
import com.example.thanh.mytest_phungduythanh.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab_Login extends Fragment {


    public Tab_Login() {
        // Required empty public constructor
    }

    private Button btnLogin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_tab__login, container, false);
        btnLogin=(Button)v.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Recipes_9.class);
                startActivity(intent);
            }
        });
        return v;
    }

}
