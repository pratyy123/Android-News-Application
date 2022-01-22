package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.pm.PermissionGroupInfo;
import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

TabLayout tabLayout;
TabItem mhome,mscience,mtech,msocial,msports,mhealth;
Pageradapter pageradapter;
Toolbar mtoolbar;
String api="876c76a0a09e499486beda0724148507";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mtoolbar=findViewById(R.id.Toolbar);
       setSupportActionBar(mtoolbar);
       mhome=findViewById(R.id.home);
       msports=findViewById(R.id.sports);
       mhealth=findViewById(R.id.health);
       mscience=findViewById(R.id.science);
       msocial=findViewById(R.id.social);
       mtech=findViewById(R.id.tech);
        ViewPager viewPager=findViewById(R.id.frafmentcontainer);
        tabLayout=findViewById(R.id.include);

        Pageradapter pageradapter= new Pageradapter(getSupportFragmentManager(), 6);
viewPager.setAdapter(pageradapter);

tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
        if(tab.getPosition()==0 || tab.getPosition()==1 ||tab.getPosition()==2 || tab.getPosition()==3 || tab.getPosition()==4 || tab.getPosition()==5){
            pageradapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});


viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



    }
}