package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Recipes6;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Recipes6 extends Fragment {


    public Recipes6() {
        // Required empty public constructor
    }

    private ListView listView;
    private ArrayList<dlHome> datas;
    private Adapter_Listview_Recipes6 customAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_recipes6, container, false);
        // Inflate the layout for this fragment
        listView=(ListView)v.findViewById(R.id.list_recipes6);
        setDatas();
        customAdapter=new Adapter_Listview_Recipes6(getContext(),datas);
        listView.setAdapter(customAdapter);
        return v;
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlHome("Strawberry & Cereals","Breakfast","344",R.drawable.hinh1,R.drawable.hinh1));
        datas.add(new dlHome("Salad Light","Lunch","157",R.drawable.hinh2,R.drawable.hinh2));
        datas.add(new dlHome("Honey","Breakfast","249",R.drawable.hinh4,R.drawable.hinh4));
        datas.add(new dlHome("Strawberry & Cereals","Breakfast","344",R.drawable.hinh3,R.drawable.hinh3));
    }

}
