package com.example.saba.tourguide;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

// Weather API, ViewPager, Fragments, TabLayout, ArrayAdapter, ArrayList Datastructure  implements HomeTab.OnFragmentInteractionListener, EventTab.OnFragmentInteractionListener, PublicPlaceTab.OnFragmentInteractionListener, RestaurantTab.OnFragmentInteractionListener
public class MainActivity extends AppCompatActivity implements  HomeTab.OnFragmentInteractionListener, EventTab.OnFragmentInteractionListener, PublicPlaceTab.OnFragmentInteractionListener, RestaurantTab.OnFragmentInteractionListener
{
    HomeTab homeTab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Events"));
        tabLayout.addTab(tabLayout.newTab().setText("Restaurant"));
        tabLayout.addTab(tabLayout.newTab().setText("Public Place"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


       final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpage);
       final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
       viewPager.setAdapter(adapter);

       viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
              viewPager.removeView(tab.getCustomView());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });



    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }}



