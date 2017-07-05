package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Direction29;
import com.example.thanh.mytest_phungduythanh.CSDL.dlDirection29;
import com.example.thanh.mytest_phungduythanh.ExpandableHeightListView;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Direction29 extends Fragment {


    public Direction29() {
        // Required empty public constructor
    }
    private ExpandableHeightListView listView;
    private Adapter_Listview_Direction29 adapter_listview_direction29;
    private ArrayList<dlDirection29> datas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_direction29, container, false);
        // Inflate the layout for this fragment
        Init(v);
        setDatas();
        adapter_listview_direction29=new Adapter_Listview_Direction29(getContext(),datas);
        listView.setAdapter(adapter_listview_direction29);
        return v;
    }
    private void Init(View v)
    {
        listView=(ExpandableHeightListView)v.findViewById(R.id.list_direction29);
        listView.setExpanded(true);
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlDirection29("abasa abasa abasaabasa abasaabasaabasaabasa " +
                "abasa abasaabasaabasaabasa abasa abasa abasa abasa abasa abasa abasa abasa abasa abasa ",R.drawable.hinh1));
        datas.add(new dlDirection29("abasa abasa abasaabasa abasaabasaabasaabasa " +
                "abasa abasaabasaabasaabasa abasa abasa abasa abasa abasa abasa abasa abasa abasa abasa ",R.drawable.hinh2));
        datas.add(new dlDirection29("abasa abasa abasaabasa abasaabasaabasaabasa " +
                "abasa abasaabasaabasaabasa abasa abasa abasa abasa abasa abasa abasa abasa abasa abasa ",R.drawable.hinh3));
        datas.add(new dlDirection29("abasa abasa abasaabasa abasaabasaabasaabasa " +
                "abasa abasaabasaabasaabasa abasa abasa abasa abasa abasa abasa abasa abasa abasa abasa ",R.drawable.hinh4));
    }

}
