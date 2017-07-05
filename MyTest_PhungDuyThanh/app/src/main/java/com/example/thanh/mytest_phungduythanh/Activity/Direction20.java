package com.example.thanh.mytest_phungduythanh.Activity;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;

import com.example.thanh.mytest_phungduythanh.R;

public class Direction20 extends TabActivity {

    private TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction20);
        Init();

        TabHost.TabSpec Tab1=tabHost.newTabSpec("Tab 1");
        TabHost.TabSpec Tab2=tabHost.newTabSpec("Tab 2");
        TabHost.TabSpec Tab3=tabHost.newTabSpec("Tab 3");

        LayoutInflater inflater=LayoutInflater.from(getApplicationContext());

        View v1=inflater.inflate(R.layout.custom_tab1_direction20,null);
        View v2=inflater.inflate(R.layout.custom_tab2_direction20,null);
        View v3=inflater.inflate(R.layout.custom_tab3_direction20,null);

        Tab1.setIndicator(v1);
        Tab1.setContent(new Intent(Direction20.this,Tab1_Direction20.class));

        Tab2.setIndicator(v2);
        Tab2.setContent(new Intent(Direction20.this,Tab2_Direction20.class));

        Tab3.setIndicator(v3);
        Tab3.setContent(new Intent(Direction20.this,Tab3_Direction20.class));

        tabHost.addTab(Tab1);
        tabHost.addTab(Tab2);
        tabHost.addTab(Tab3);

    }
    private void Init()
    {
        tabHost=(TabHost)findViewById(android.R.id.tabhost);
        tabHost.setup();
    }
}
