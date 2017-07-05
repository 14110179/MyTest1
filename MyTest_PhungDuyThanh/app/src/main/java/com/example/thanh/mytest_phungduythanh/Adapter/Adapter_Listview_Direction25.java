package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlDirection25;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/1/2017.
 */

public class Adapter_Listview_Direction25 extends BaseAdapter {
    private Context context;
    private ArrayList<dlDirection25> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Listview_Direction25(Context context,ArrayList<dlDirection25> datas)
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
        Adapter_Listview_Direction25.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Listview_Direction25.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_listview_direction25,null);
            viewHolder.txtName= (TextView) convertView.findViewById(R.id.txt_direction25);
            viewHolder.imgImage1=(ImageView)convertView.findViewById(R.id.img1_direction25);
            viewHolder.imgImage2=(ImageView)convertView.findViewById(R.id.img2_direction25);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Listview_Direction25.ViewHolder)convertView.getTag();
        }
        dlDirection25 item=(dlDirection25)getItem(position);

        viewHolder.txtName.setText(item.getTxtNoiDung());
        viewHolder.imgImage1.setImageResource(item.getUrlImage1());
        viewHolder.imgImage2.setImageResource(item.getUrlImage2());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName;
        private ImageView imgImage1;
        private ImageView imgImage2;
    }
}
