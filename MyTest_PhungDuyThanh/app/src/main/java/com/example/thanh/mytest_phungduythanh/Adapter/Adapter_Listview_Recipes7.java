package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/3/2017.
 */

public class Adapter_Listview_Recipes7 extends BaseAdapter {
    private Context context;
    private ArrayList<dlRecipes> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Listview_Recipes7(Context context,ArrayList<dlRecipes> datas)
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
        Adapter_Listview_Recipes7.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Listview_Recipes7.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_listview_recipes7,null);
            viewHolder.txtName1= (TextView) convertView.findViewById(R.id.txttitle);
            viewHolder.txtName2= (TextView) convertView.findViewById(R.id.txtminutes);
            viewHolder.imgImage=(ImageView)convertView.findViewById(R.id.imgNen);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Listview_Recipes7.ViewHolder)convertView.getTag();
        }
        dlRecipes item=(dlRecipes)getItem(position);


        viewHolder.txtName1.setText(item.getName1());
        viewHolder.txtName2.setText(item.getName2());
        viewHolder.imgImage.setImageResource(item.getUrlImage());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName1;
        private TextView txtName2;
        private ImageView imgImage;
    }
}
