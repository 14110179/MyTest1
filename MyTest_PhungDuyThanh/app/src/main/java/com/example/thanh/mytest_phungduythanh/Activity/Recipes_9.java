package com.example.thanh.mytest_phungduythanh.Activity;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.thanh.mytest_phungduythanh.Fragment.Activity39;
import com.example.thanh.mytest_phungduythanh.Fragment.Direction25;
import com.example.thanh.mytest_phungduythanh.Fragment.Direction26;
import com.example.thanh.mytest_phungduythanh.Fragment.Direction27;
import com.example.thanh.mytest_phungduythanh.Fragment.Direction29;
import com.example.thanh.mytest_phungduythanh.Fragment.Profile24;
import com.example.thanh.mytest_phungduythanh.Fragment.Recipes12;
import com.example.thanh.mytest_phungduythanh.Fragment.Recipes35;
import com.example.thanh.mytest_phungduythanh.Fragment.Recipes6;
import com.example.thanh.mytest_phungduythanh.Fragment.Recipes7;
import com.example.thanh.mytest_phungduythanh.Fragment.Recipes8;
import com.example.thanh.mytest_phungduythanh.Fragment.Recipes9;
import com.example.thanh.mytest_phungduythanh.Fragment.Settings;

import com.example.thanh.mytest_phungduythanh.R;
import com.goka.blurredgridmenu.GridMenu;
import com.goka.blurredgridmenu.GridMenuFragment;

import java.util.ArrayList;
import java.util.List;

public class Recipes_9 extends AppCompatActivity {
    private RelativeLayout layout;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private ImageView imgMenu,imgMore;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private GridMenuFragment gridMenuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_9);
        init();

        gridMenuFragment=GridMenuFragment.newInstance(R.drawable.backgroud);
        setupGridMenu();
        imgMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
                tx.replace(R.id.main_frame, gridMenuFragment);
                tx.addToBackStack(null);
                tx.commit();
            }
        });

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               drawerLayout.openDrawer(Gravity.LEFT);
            }
        });



        configureToolbar();

        LayoutInflater inflater= (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View v=inflater.inflate(R.layout.header_navigation,null);
        navigationView.addHeaderView(v);
        configureNavigationDrawer();
    }
    private void setupGridMenu()
    {
        List<GridMenu> menus=new ArrayList<>();
        menus.add(new GridMenu("Salads",R.drawable.icon_test));
        menus.add(new GridMenu("Fish",R.drawable.icon_test));
        menus.add(new GridMenu("Sweeties",R.drawable.icon_test));
        menus.add(new GridMenu("Burgers",R.drawable.icon_test));
        menus.add(new GridMenu("Soup",R.drawable.icon_test));
        menus.add(new GridMenu("Drinks",R.drawable.icon_test));
        menus.add(new GridMenu("Fruits",R.drawable.icon_test));
        menus.add(new GridMenu("Bread",R.drawable.icon_test));
        menus.add(new GridMenu("Taco",R.drawable.icon_test));
        menus.add(new GridMenu("Pizza",R.drawable.icon_test));
        menus.add(new GridMenu("Coffe",R.drawable.icon_test));
        menus.add(new GridMenu("Sushi",R.drawable.icon_test));
        menus.add(new GridMenu("Potato",R.drawable.icon_test));
        menus.add(new GridMenu("Cheese",R.drawable.icon_test));
        menus.add(new GridMenu("Others",R.drawable.icon_test));
        gridMenuFragment.setupMenu(menus);
    }

    @Override
    public void onBackPressed() {
        if (0 == getSupportFragmentManager().getBackStackEntryCount()) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

    private void init()
    {
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        navigationView=(NavigationView)findViewById(R.id.navigation);
        imgMenu=(ImageView)findViewById(R.id.img_menu);
        imgMore=(ImageView)findViewById(R.id.img_more);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
    }
    private void configureToolbar() {
        setSupportActionBar(toolbar);
    }

    private void configureNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                Fragment f = null;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.homes) {
                   f= new Direction29();
                }
                else if (itemId == R.id.explore) {
                    f = new Profile24();
                }
                else if (itemId == R.id.recipes) {
                    f = new Recipes35();
                }
                else if (itemId == R.id.activity) {
                    f = new Activity39();
                }
                else if (itemId == R.id.settings) {
                    f = new Settings();
                }

                if (f != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame, f);
                    transaction.commit();
                    drawerLayout.closeDrawers();
                    return true;
                }

                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        switch(itemId) {
            // Android home
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;

            // manage other entries if you have it ...
        }

        return true;
    }
}
