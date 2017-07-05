package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.CSDL.dlShop36;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/2/2017.
 */

public class Adapter_Listview_Shop36 extends BaseAdapter {
    private Context context;
    private ArrayList<dlShop36> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Listview_Shop36(Context context,ArrayList<dlShop36> datas)
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
    public View getView(int position, View convertView, final ViewGroup parent) {
        Adapter_Listview_Shop36.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Listview_Shop36.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_list_shop36,null);
            viewHolder.txtName1= (TextView) convertView.findViewById(R.id.txtName1_shop36);
            viewHolder.txtName2= (TextView) convertView.findViewById(R.id.txtName2_shop36);
            viewHolder.imageView=(ImageView)convertView.findViewById(R.id.img_shop36);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Listview_Shop36.ViewHolder)convertView.getTag();
        }


        dlShop36 item=(dlShop36)getItem(position);

        viewHolder.txtName1.setText(item.getName1());
        viewHolder.txtName2.setText(item.getName2());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName1;
        private TextView txtName2;
        private ImageView imageView;
    }
}
