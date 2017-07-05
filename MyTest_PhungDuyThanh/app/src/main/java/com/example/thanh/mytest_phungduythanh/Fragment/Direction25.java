package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Listview_Direction25;
import com.example.thanh.mytest_phungduythanh.CSDL.dlDirection25;
import com.example.thanh.mytest_phungduythanh.ExpandableHeightListView;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Direction25 extends Fragment {


    public Direction25() {
        // Required empty public constructor
    }

    private ExpandableHeightListView listView;
    private Adapter_Listview_Direction25 adapter_listview_direction25;
    private ArrayList<dlDirection25> datas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_direction25, container, false);
        Init(v);
        Setdatas();
        adapter_listview_direction25=new Adapter_Listview_Direction25(getContext(),datas);
        listView.setAdapter(adapter_listview_direction25);
        // Inflate the layout for this fragment
        return v;
    }
    private void Init(View v)
    {
        listView=(ExpandableHeightListView)v.findViewById(R.id.list_direction25);
        listView.setExpanded(true);
    }
    private void Setdatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlDirection25(R.drawable.img_green,R.drawable.img_hinh1,
                "Mauris non tempor quam, et lacinia saplen. Mauris accumsan eros" +
                        "eget libero posuere vulputate. Etiam elit elit, elementum sed varius at"));
        datas.add(new dlDirection25(R.drawable.img_orange,R.drawable.img_hinh2,
                "Mauris non tempor quam, et lacinia saplen. Mauris accumsan eros" +
                        "eget libero posuere vulputate. Etiam elit elit, elementum sed varius at"));
        datas.add(new dlDirection25(R.drawable.img_purple,R.drawable.img_hinh3,
                "Mauris non tempor quam, et lacinia saplen. Mauris accumsan eros" +
                        "eget libero posuere vulputate. Etiam elit elit, elementum sed varius at"));
        datas.add(new dlDirection25(R.drawable.img_yellow,R.drawable.img_hinh4,
                "Mauris non tempor quam, et lacinia saplen. Mauris accumsan eros" +
                        "eget libero posuere vulputate. Etiam elit elit, elementum sed varius at"));
    }
}
