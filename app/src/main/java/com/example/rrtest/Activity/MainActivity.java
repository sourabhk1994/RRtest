package com.example.rrtest.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rrtest.Adapter.MyAdapter;
import com.example.rrtest.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Profile"));
        tabLayout.addTab(tabLayout.newTab().setText("LeaderBoard"));
        tabLayout.addTab(tabLayout.newTab().setText("Explore"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.getTabAt(0).setIcon(R.drawable.nav_home_checked);
        tabLayout.getTabAt(1).setIcon(R.drawable.nav_profile_unchecked);
        tabLayout.getTabAt(2).setIcon(R.drawable.nav_leaderboard_unchecked);
        tabLayout.getTabAt(3).setIcon(R.drawable.nav_explore_unchecked);
        final MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), getResources(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0)
                    tab.setIcon(R.drawable.nav_home_checked);
                else if (tab.getPosition() == 1)
                    tab.setIcon(R.drawable.nav_profile_checked);
                else if (tab.getPosition() == 2)
                    tab.setIcon(R.drawable.nav_leaderboard_checked);
                else
                    tab.setIcon(R.drawable.nav_explore_checked);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                if (tab.getPosition() == 0)
                    tab.setIcon(R.drawable.nav_home_unchecked);
                else if (tab.getPosition() == 1)
                    tab.setIcon(R.drawable.nav_profile_unchecked);
                else if (tab.getPosition() == 2)
                    tab.setIcon(R.drawable.nav_leaderboard_unchecked);
                else
                    tab.setIcon(R.drawable.nav_explore_unchecked);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
    }