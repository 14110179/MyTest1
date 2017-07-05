package com.example.thanh.mytest_phungduythanh.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Shop36;
import com.example.thanh.mytest_phungduythanh.CSDL.dlShop36;
import com.example.thanh.mytest_phungduythanh.ExpandableHeightListView;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

public class Shop36 extends AppCompatActivity {
    private Toolbar toolbar;
    private ExpandableHeightListView listView;
    private Adapter_Listview_Shop36 adapter_listview_shop36;
    private ArrayList<dlShop36> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop36);
        Init();
        setDatas();

        setSupportActionBar(toolbar);
        toolbar.findViewById(R.id.btnBack_shop36).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        listView=(ExpandableHeightListView) findViewById(R.id.list_shop36);
        listView.setExpanded(true);
        adapter_listview_shop36=new Adapter_Listview_Shop36(getBaseContext(),datas);
        listView.setAdapter(adapter_listview_shop36);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Shop36.this, Shop37.class);
                startActivity(intent);
            }
        });
    }
    private void Init()
    {
        toolbar=(Toolbar)findViewById(R.id.toolbar_shop36);
        listView=(ExpandableHeightListView) findViewById(R.id.list_shop36);
        listView.setExpanded(true);


    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlShop36("200 g","Coffee"));
        datas.add(new dlShop36("30 g","Milk"));
        datas.add(new dlShop36("2","Eggs"));
        datas.add(new dlShop36("235 g","Flour"));
        datas.add(new dlShop36("5","Nam"));
        datas.add(new dlShop36("2","Cura"));
        datas.add(new dlShop36("...","Solt"));
    }
}
