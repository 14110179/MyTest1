package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Profile24;
import com.example.thanh.mytest_phungduythanh.CSDL.dlProfile;
import com.example.thanh.mytest_phungduythanh.ExpandableHeightListView;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile24 extends Fragment {


    public Profile24() {
        // Required empty public constructor
    }
    private ImageView imageView;
    private ExpandableHeightListView listView;
    private ArrayList<dlProfile> datas;
    private Adapter_Listview_Profile24 customAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_profile24, container, false);
        // Inflate the layout for this fragment
        setDatas();
        listView=(ExpandableHeightListView) v.findViewById(R.id.list_profile24);
        customAdapter=new Adapter_Listview_Profile24(getContext(),datas);
        listView.setAdapter(customAdapter);
        listView.setExpanded(true);
        return v;
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlProfile("Vestibulum rutrum qu.","37 likes",R.drawable.hinh2));
        datas.add(new dlProfile("Nam porttitor blandi","15 likes",R.drawable.hinh3));
        datas.add(new dlProfile("In hac habitassse pla","7 likes",R.drawable.hinh4));
        datas.add(new dlProfile("Curabitur lobortis","55 likes",R.drawable.hinh2));
    }
}
