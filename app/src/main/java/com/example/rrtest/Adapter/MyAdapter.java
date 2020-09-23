package com.example.rrtest.Adapter;

import android.content.res.Resources;
import android.util.SparseArray;
import android.view.ViewGroup;

import com.example.rrtest.Fragment.HomeFrag;
import com.example.rrtest.Fragment.LeaderBoardFrag;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    int TabCount;
    private Resources resources;

    SparseArray<Fragment> registeredFragments = new SparseArray<Fragment>();

    public MyAdapter(FragmentManager fm, Resources resources, int tabCount) {
        super(fm);

        this.resources = resources;
        this.TabCount = tabCount;
    }
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HomeFrag homeFrag = new HomeFrag();
                return homeFrag;
            case 1:
                HomeFrag homeFrag2 = new HomeFrag();
                return homeFrag2;
            case 2:
                LeaderBoardFrag leaderBoardFrag = new LeaderBoardFrag();
                return leaderBoardFrag;
            case 3:
                HomeFrag homeFrag3 = new HomeFrag();
                return homeFrag3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TabCount;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        registeredFragments.put(position, fragment);
        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        registeredFragments.remove(position);
        super.destroyItem(container, position, object);
    }
   public Fragment getRegisteredFragment(int position) {
        return registeredFragments.get(position);
    }
}