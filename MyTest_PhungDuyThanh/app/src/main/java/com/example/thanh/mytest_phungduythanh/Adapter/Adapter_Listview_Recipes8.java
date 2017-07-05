package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes8;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by THANH on 6/30/2017.
 */

public class Adapter_Listview_Recipes8 extends BaseAdapter {
    private Context context;
    private ArrayList<dlRecipes8> datas;
    private LayoutInflater layoutInflater;
    public Adapter_Listview_Recipes8(Context context,ArrayList<dlRecipes8> datas)
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
        Adapter_Listview_Recipes8.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapter_Listview_Recipes8.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_listview_recipes8,null);
            viewHolder.txtName1= (TextView) convertView.findViewById(R.id.txtName_recipes8);
            viewHolder.txtName2= (TextView) convertView.findViewById(R.id.txtName2_recipes8);
            viewHolder.txtName3=(TextView)convertView.findViewById(R.id.txtName3_recipes8);
            viewHolder.txtName4= (TextView) convertView.findViewById(R.id.txt_name_recipes8);
            viewHolder.txtName5= (TextView) convertView.findViewById(R.id.txt_sotim_recipes8);
            viewHolder.txtName6=(TextView)convertView.findViewById(R.id.txt_sobl_recipes8);
            viewHolder.imgImage=(ImageView)convertView.findViewById(R.id.img_recipes8);
            viewHolder.circleImageView=(CircleImageView)convertView.findViewById(R.id.img_avatar_recipes8);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapter_Listview_Recipes8.ViewHolder)convertView.getTag();
        }
        dlRecipes8 item=(dlRecipes8)getItem(position);

        viewHolder.txtName1.setText(item.getName1());
        viewHolder.txtName2.setText(item.getName2());
        viewHolder.txtName3.setText(item.getName3());
        viewHolder.txtName4.setText(item.getName4());
        viewHolder.txtName5.setText(item.getName5());
        viewHolder.txtName6.setText(item.getName6());
        viewHolder.imgImage.setImageResource(item.getUrlImage());
        viewHolder.circleImageView.setImageResource(item.getUrlImage_Avatar());
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName1;
        private TextView txtName2;
        private TextView txtName3;
        private TextView txtName4;
        private TextView txtName5;
        private TextView txtName6;
        private ImageView imgImage;
        private CircleImageView circleImageView;
    }
}
