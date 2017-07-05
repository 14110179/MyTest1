package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlHome;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/3/2017.
 */

public class Adapter_Listview_Recipes6 extends BaseAdapter {
    private Context context;
    private ArrayList<dlHome> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Listview_Recipes6(Context context,ArrayList<dlHome> datas)
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
        ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_listview_recipes6,null);
            viewHolder.txtName1= (TextView) convertView.findViewById(R.id.txt1);
            viewHolder.txtName2= (TextView) convertView.findViewById(R.id.txt2);
            viewHolder.txtSoTim= (TextView) convertView.findViewById(R.id.txtsotim);
            viewHolder.imgAvatar=(ImageView)convertView.findViewById(R.id.avatar);
            viewHolder.imgImage=(ImageView)convertView.findViewById(R.id.imagemain);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder)convertView.getTag();
        }
        dlHome item=(dlHome)getItem(position);

        viewHolder.txtSoTim.setText(item.getTxtSoTim());
        viewHolder.txtName1.setText(item.getTxtName1());
        viewHolder.txtName2.setText(item.getTxtName2());
        //viewHolder.imgAvatar.setImageResource(item.getUrlAvatar());
        viewHolder.imgImage.setImageResource(item.getUrlImage());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName1;
        private TextView txtName2;
        private TextView txtSoTim;
        private ImageView imgAvatar;
        private ImageView imgImage;
    }
}
