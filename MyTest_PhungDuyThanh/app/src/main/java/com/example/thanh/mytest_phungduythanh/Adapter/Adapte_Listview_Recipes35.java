package com.example.thanh.mytest_phungduythanh.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.mytest_phungduythanh.Activity.Shop36;
import com.example.thanh.mytest_phungduythanh.CSDL.dlHome2;
import com.example.thanh.mytest_phungduythanh.CSDL.dlRecipes35;
import com.example.thanh.mytest_phungduythanh.R;

import java.util.ArrayList;

/**
 * Created by THANH on 6/30/2017.
 */

public class Adapte_Listview_Recipes35 extends BaseAdapter {
    private Context context;
    private ArrayList<dlRecipes35> datas;
    private LayoutInflater layoutInflater;
    public Adapte_Listview_Recipes35(Context context,ArrayList<dlRecipes35> datas)
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
        final Adapte_Listview_Recipes35.ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new Adapte_Listview_Recipes35.ViewHolder();
            convertView=layoutInflater.inflate(R.layout.custom_listview_recipes35,null);
            viewHolder.txtName1= (TextView) convertView.findViewById(R.id.txt_title_recipes35);
            viewHolder.txtName2= (TextView) convertView.findViewById(R.id.txtName_recipes35);
            viewHolder.txtName3=(TextView)convertView.findViewById(R.id.txt_name_recipes35);
            viewHolder.txtName4= (TextView) convertView.findViewById(R.id.txtcalorie_recipes35);
            viewHolder.txtName5=(TextView)convertView.findViewById(R.id.txtmincook_recipes35);
            viewHolder.imgImage1=(ImageView)convertView.findViewById(R.id.img1_recipes35);
            viewHolder.imgImage2=(ImageView)convertView.findViewById(R.id.img2_recipes35);
            viewHolder.btnShop=(Button)convertView.findViewById(R.id.btnShop_recipes35) ;
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(Adapte_Listview_Recipes35.ViewHolder)convertView.getTag();
        }
        dlRecipes35 item=(dlRecipes35)getItem(position);

        viewHolder.txtName1.setText(item.getName1());
        viewHolder.txtName2.setText(item.getName2());
        viewHolder.txtName3.setText(item.getName3());
        viewHolder.txtName4.setText(item.getName4());
        viewHolder.txtName5.setText(item.getName5());
        viewHolder.imgImage1.setImageResource(item.getUrlImage1());
        viewHolder.imgImage2.setImageResource(item.getUrlImage2());

        viewHolder.btnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder.btnShop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context,Shop36.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);;
                        context.startActivity(intent);

                    }
                });
            }
        });
        return convertView;
    }
    public class ViewHolder{
        private TextView txtName1;
        private TextView txtName2;
        private TextView txtName3;
        private TextView txtName4;
        private TextView txtName5;
        private ImageView imgImage1;
        private ImageView imgImage2;
        private Button btnShop;
    }
}
