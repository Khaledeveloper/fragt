package com.example.khaled.fragments;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class Main3ActivityTabs extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, Tab2.OnFragmentInteractionListener,Tab3.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_tabs);

        TabLayout tabLayout =(TabLayout) findViewById(R.id.TabLayoutMain3);
        tabLayout.addTab(tabLayout.newTab().setText("TabN1"));
        tabLayout.addTab(tabLayout.newTab().setText("TabN2"));
        tabLayout.addTab(tabLayout.newTab().setText("TabN3"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        final ViewPager viewPager =(ViewPager)findViewById(R.id.ViewPagerMain);
        final FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(fragmentAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
