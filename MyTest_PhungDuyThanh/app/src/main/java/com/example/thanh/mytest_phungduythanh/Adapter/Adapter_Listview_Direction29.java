package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlDirection29;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/5/2017.
 */

public class Adapter_Listview_Direction29 extends BaseAdapter {
    private Context context;
    private ArrayList<dlDirection29> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Listview_Direction29(Context context,ArrayList<dlDirection29> datas)
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
        Adapter_Listview_Direction29.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Listview_Direction29.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_list_direction29,null);
            viewHolder.txtName1= (TextView) convertView.findViewById(R.id.txt_direction29);
            viewHolder.imgImage=(ImageView)convertView.findViewById(R.id.img_direction29);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Listview_Direction29.ViewHolder)convertView.getTag();
        }
        dlDirection29 item=(dlDirection29)getItem(position);

        viewHolder.txtName1.setText(item.getName());
        viewHolder.imgImage.setImageResource(item.getUrlImage());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName1;
        private ImageView imgImage;
    }
}
