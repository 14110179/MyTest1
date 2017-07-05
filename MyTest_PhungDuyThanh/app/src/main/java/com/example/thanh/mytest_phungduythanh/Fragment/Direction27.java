package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Direction27;
import com.example.thanh.mytest_phungduythanh.CSDL.dlDirection27;
import com.example.thanh.mytest_phungduythanh.ExpandableHeightListView;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Direction27 extends Fragment {


    public Direction27() {
        // Required empty public constructor
    }
    private ExpandableHeightListView listView;
    private Adapter_Listview_Direction27 adapter_listview_direction27;
    private ArrayList<dlDirection27> datas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_direction27, container, false);
        // Inflate the layout for this fragment
        Init(v);
        setDatas();
        adapter_listview_direction27=new Adapter_Listview_Direction27(getContext(),datas);

        listView.setAdapter(adapter_listview_direction27);
        return v;
    }
    private void Init(View v)
    {
        listView=(ExpandableHeightListView)v.findViewById(R.id.list_direction27);
        listView.setExpanded(true);
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlDirection27("Ciabatta","1"));
        datas.add(new dlDirection27("Tablespoon Olive Oil","3"));
        datas.add(new dlDirection27("Boneless Skinless Chicken Breasts","2"));
        datas.add(new dlDirection27("Leav Lettuc Romain","1"));

    }

}
