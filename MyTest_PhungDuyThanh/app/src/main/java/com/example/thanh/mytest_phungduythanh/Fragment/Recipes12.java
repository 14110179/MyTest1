package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Gridview_Recipes12;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes2;
import com.example.thanh.mytest_phungduythanh.ExpandableHeightGridView;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Recipes12 extends Fragment {


    public Recipes12() {
        // Required empty public constructor
    }


    private ExpandableHeightGridView gridView;
    private ArrayList<dlRecipes2> datas;
    private Adapter_Gridview_Recipes12 adapter_gridview_recipes12;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_recipes12, container, false);
        gridView=(ExpandableHeightGridView)v.findViewById(R.id.grid_recipes12);
        gridView.setExpanded(true);
        setDatas();
        adapter_gridview_recipes12=new Adapter_Gridview_Recipes12(getContext(),datas);
        gridView.setAdapter(adapter_gridview_recipes12);
        // Inflate the layout for this fragment
        return v;
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlRecipes2("Nam dapibu.","30 minutes",R.drawable.hinh1));
        datas.add(new dlRecipes2("Cras quis.","15 min cook",R.drawable.hinh2));
        datas.add(new dlRecipes2("Nam dapibu.","30 minutes",R.drawable.hinh3));
        datas.add(new dlRecipes2("Cras quis.","15 min cook",R.drawable.hinh4));
    }
}
