package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlDirection25;
import com.example.thanh.mytest_phungduythanh.CSDL.dlDirection27;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 7/3/2017.
 */

public class Adapter_Listview_Direction27 extends BaseAdapter {
    private Context context;
    private ArrayList<dlDirection27> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Listview_Direction27(Context context,ArrayList<dlDirection27> datas)
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
        Adapter_Listview_Direction27.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Listview_Direction27.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_listview_direction27,null);
            viewHolder.txtName1= (TextView) convertView.findViewById(R.id.txtName1_direction27);
            viewHolder.txtName2= (TextView) convertView.findViewById(R.id.txtName2_direction27);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Listview_Direction27.ViewHolder)convertView.getTag();
        }
        dlDirection27 item=(dlDirection27)getItem(position);

        viewHolder.txtName1.setText(item.getName1());
        viewHolder.txtName2.setText(item.getName2());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName1;
        private TextView txtName2;
    }
}
