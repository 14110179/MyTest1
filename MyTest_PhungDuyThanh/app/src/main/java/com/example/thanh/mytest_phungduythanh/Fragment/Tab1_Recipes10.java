package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Gridview_Recipes10;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes10;
import com.example.thanh.mytest_phungduythanh.ExpandableHeightGridView;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1_Recipes10 extends Fragment {


    public Tab1_Recipes10() {
        // Required empty public constructor
    }
    private ExpandableHeightGridView gridView;
    private Adapter_Gridview_Recipes10 adapter_gridview_recipes10;
    private ArrayList<dlRecipes10> datas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_tab1__recipes10, container, false);
        Init(v);
        setDatas();

        adapter_gridview_recipes10=new Adapter_Gridview_Recipes10(getContext(),datas);
        gridView.setAdapter(adapter_gridview_recipes10);
        return v;
    }
    private void Init(View v)
    {
        gridView=(ExpandableHeightGridView)v.findViewById(R.id.grid_recipes10);
        gridView.setExpanded(true);
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlRecipes10("Nam dapibu","30 minutes",R.drawable.img_hinh1));
        datas.add(new dlRecipes10("Cras quis","15 minutes",R.drawable.img_hinh2));
        datas.add(new dlRecipes10("Nam dapibu","30 minutes",R.drawable.img_hinh3));
        datas.add(new dlRecipes10("Cras quis","15 minutes",R.drawable.img_hinh4));

    }

}
