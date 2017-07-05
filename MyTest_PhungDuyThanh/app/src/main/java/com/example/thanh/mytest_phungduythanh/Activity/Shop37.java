package com.example.thanh.mytest_phungduythanh.Activity;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.example.thanh.mytest_phungduythanh.R;

public class Shop37 extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btnAddToCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop37);
        Init();
        setSupportActionBar(toolbar);
       toolbar.findViewById(R.id.btnBack_shop37).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog=new Dialog(Shop37.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.custom_dialog_shop38);

                Button dialogButton = (Button) dialog.findViewById(R.id.btnCheckOut);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }
    private void Init()
    {
        toolbar=(Toolbar)findViewById(R.id.toolbar_shop37);
        btnAddToCart=(Button)findViewById(R.id.btnAddToCart);
    }
}
