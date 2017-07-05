package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Activity39;
import com.example.thanh.mytest_phungduythanh.CSDL.dlActivity;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Activity39 extends Fragment {


    public Activity39() {
        // Required empty public constructor
    }

    private ListView listView;
    private ArrayList<dlActivity> datas;
    private Adapter_Listview_Activity39 customAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_activity39, container, false);
        setDatas();
        listView=(ListView)v.findViewById(R.id.list_activity39);
        customAdapter=new Adapter_Listview_Activity39(getContext(),datas);
        listView.setAdapter(customAdapter);
        // Inflate the layout for this fragment
        return v;
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlActivity("Alexander Jones","15 min ago","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut pretium pretium tempor. Ut eget",R.drawable.hinh1));
        datas.add(new dlActivity("Nam porttitor blandi","30 min ago","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut pretium pretium tempor. Ut eget",R.drawable.hinh2));
        datas.add(new dlActivity("In hac habitassse pla","45 min ago","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut pretium pretium tempor. Ut eget",R.drawable.hinh3));
        datas.add(new dlActivity("Curabitur lobortis","55 min ago","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut pretium pretium tempor. Ut eget",R.drawable.hinh4));
    }

}
