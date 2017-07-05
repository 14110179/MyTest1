package com.example.thanh.mytest_phungduythanh.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapte_Listview_Recipes35;
import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Recipes8;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes35;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes8;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Recipes35 extends Fragment {


    public Recipes35() {
        // Required empty public constructor
    }

    private ListView listView;
    private ArrayList<dlRecipes35> datas;
    private Adapte_Listview_Recipes35 adapte_listview_recipes35;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_recipes35, container, false);
        // Inflate the layout for this fragment
        setDatas();
        Init(v);
        adapte_listview_recipes35=new Adapte_Listview_Recipes35(getContext(),datas);
        listView.setAdapter(adapte_listview_recipes35);

        return v;
    }
    private void Init(View v)
    {
        listView=(ListView)v.findViewById(R.id.list_recipes35);

    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlRecipes35("Hipsters Coffee","How to cook",
                "Nam porttitor",
                "680 calorie","90 min cook",R.drawable.hinh1,R.drawable.hinh4));
        datas.add(new dlRecipes35("Hipsters Coffee","How to cook",
                "Nam porttitor",
                "680 calorie","90 min cook",R.drawable.hinh2,R.drawable.hinh3));
        datas.add(new dlRecipes35("Hipsters Coffee","How to cook",
                "Nam porttitor",
                "680 calorie","90 min cook",R.drawable.hinh3,R.drawable.hinh2));
        datas.add(new dlRecipes35("Hipsters Coffee","How to cook",
                "Nam porttitor",
                "680 calorie","90 min cook",R.drawable.hinh4,R.drawable.hinh1));
    }
}
