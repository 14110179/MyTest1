package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes2;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/3/2017.
 */

public class Adapter_Gridview_Recipes12 extends BaseAdapter {
    private Context context;
    private ArrayList<dlRecipes2> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Gridview_Recipes12(Context context,ArrayList<dlRecipes2> datas)
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
        Adapter_Gridview_Recipes12.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Gridview_Recipes12.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_gridview_recipes12,null);
            viewHolder.txt_Name= (TextView) convertView.findViewById(R.id.txt_name_recipes2);
            viewHolder.txt_Minutes= (TextView) convertView.findViewById(R.id.txt_minutes_recipes2);
            viewHolder.imgImage=(ImageView)convertView.findViewById(R.id.img_recipes2);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Gridview_Recipes12.ViewHolder)convertView.getTag();
        }
        dlRecipes2 item=(dlRecipes2)getItem(position);

        viewHolder.txt_Name.setText(item.getName());
        viewHolder.txt_Minutes.setText(item.getMinutes());
        viewHolder.imgImage.setImageResource(item.getUrlImage());
        return convertView;
    }
    public class ViewHolder{
        private TextView txt_Name;
        private TextView txt_Minutes;
        private ImageView imgImage;
    }
}
