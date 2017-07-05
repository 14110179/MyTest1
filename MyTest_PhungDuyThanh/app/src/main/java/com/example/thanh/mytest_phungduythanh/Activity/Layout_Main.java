package com.example.thanh.mytest_phungduythanh.Activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.Adapter.MyViewPagerAdapter;
import com.example.thanh.mytest_phungduythanh.MainActivity;
import com.example.thanh.mytest_phungduythanh.R;

public class Layout_Main extends AppCompatActivity {
    private ViewPager viewPager;
    MyViewPagerAdapter myViewPagerAdapter;
    TextView btnClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__main);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        myViewPagerAdapter=new MyViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myViewPagerAdapter);
        btnClose=(TextView)findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Layout_Main.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
