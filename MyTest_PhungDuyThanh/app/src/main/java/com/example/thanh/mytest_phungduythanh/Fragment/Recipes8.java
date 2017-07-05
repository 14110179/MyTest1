package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Recipes8;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes2;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes8;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Recipes8 extends Fragment {


    public Recipes8() {
        // Required empty public constructor
    }
    private ListView listView;
    private ArrayList<dlRecipes8> datas;
    private Adapter_Listview_Recipes8 adapter_listview_recipes8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_recipes8, container, false);
        setDatas();
        Init(v);
        adapter_listview_recipes8=new Adapter_Listview_Recipes8(getContext(),datas);
        listView.setAdapter(adapter_listview_recipes8);
        return v;
    }
    private void Init(View v)
    {
        listView=(ListView)v.findViewById(R.id.list_recipes8);
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlRecipes8("Nam dapibus nisl vitae.","Breakfast",
                "Lorem ipsum dolor sit amet, consectetur adispiscing elit. Ut pretium pretium tempor. Ut eget imperdiet neque. In vo",
                "Alexander Jones","12","14",R.drawable.hinh1,R.drawable.avatar));
        datas.add(new dlRecipes8("Nam dapibus nisl vitae.","Breakfast",
                "Lorem ipsum dolor sit amet, consectetur adispiscing elit. Ut pretium pretium tempor. Ut eget imperdiet neque. In vo",
                "Alexander Jones","12","14",R.drawable.hinh2,R.drawable.avatar));
        datas.add(new dlRecipes8("Nam dapibus nisl vitae.","Breakfast",
                "Lorem ipsum dolor sit amet, consectetur adispiscing elit. Ut pretium pretium tempor. Ut eget imperdiet neque. In vo",
                "Alexander Jones","12","14",R.drawable.hinh3,R.drawable.avatar));
        datas.add(new dlRecipes8("Nam dapibus nisl vitae.","Breakfast",
                "Lorem ipsum dolor sit amet, consectetur adispiscing elit. Ut pretium pretium tempor. Ut eget imperdiet neque. In vo",
                "Alexander Jones","12","14",R.drawable.hinh4,R.drawable.avatar));
    }

}
