package com.example.thanh.mytest_phungduythanh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.thanh.mytest_phungduythanh.Adapter.Adapter_Gridview_Recipes9;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Recipes9 extends Fragment {


    public Recipes9() {
        // Required empty public constructor
    }
    private GridView gridView;
    private ArrayList<dlHome2> datas;
    private Adapter_Gridview_Recipes9 customAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_recipes9, container, false);
        // Inflate the layout for this fragment
        setDatas();
        gridView=(GridView)v.findViewById(R.id.grid_recipes9);
        customAdapter=new Adapter_Gridview_Recipes9(getContext(),datas);
        gridView.setAdapter(customAdapter);
        return v;
    }
    private void setDatas()
    {
        datas=new ArrayList<>();
        datas.add(new dlHome2("Vestibulum rutrum qu.","Weelend backpacking with the guys","15 min",R.drawable.hinh1));
        datas.add(new dlHome2("Nam porttitor blandi","Weelend backpacking with the guys","25 min",R.drawable.hinh2));
        datas.add(new dlHome2("In hac habitassse pla","Weelend backpacking with the guys","30 min",R.drawable.hinh3));
        datas.add(new dlHome2("Curabitur lobortis","Weelend backpacking with the guys","40 min",R.drawable.hinh4));
    }
}
