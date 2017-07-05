package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes10;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes2;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/5/2017.
 */

public class Adapter_Gridview_Recipes10 extends BaseAdapter {
    private Context context;
    private ArrayList<dlRecipes10> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Gridview_Recipes10(Context context,ArrayList<dlRecipes10> datas)
    {
        this.context=context;
        this.datas=datas;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return datas!=null?datas.size():0;
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Adapter_Gridview_Recipes10.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Gridview_Recipes10.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_gridview_recipes10,null);
            viewHolder.txt_Name1= (TextView) convertView.findViewById(R.id.txtName1_recipes10);
            viewHolder.txt_Name2= (TextView) convertView.findViewById(R.id.txtName2_recipes10);
            viewHolder.imgImage=(ImageView)convertView.findViewById(R.id.img_recipes10);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Gridview_Recipes10.ViewHolder)convertView.getTag();
        }
        dlRecipes10 item=(dlRecipes10)getItem(position);

        viewHolder.txt_Name1.setText(item.getName1());
        viewHolder.txt_Name2.setText(item.getName2());
        viewHolder.imgImage.setImageResource(item.getUrlImage());
        return convertView;
    }
    public class ViewHolder{
        private TextView txt_Name1;
        private TextView txt_Name2;
        private ImageView imgImage;
    }
}
