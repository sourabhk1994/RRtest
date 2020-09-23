package com.example.rrtest.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.rrtest.Adapter.GridViewAdapter;
import com.example.rrtest.Pojo.GridviewPojo;
import com.example.rrtest.R;

import java.util.ArrayList;

public class HomeFrag extends Fragment {
    View rootView;
    GridView gridView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView= inflater.inflate(R.layout.fragment_home, container, false);
        ArrayList<GridviewPojo> gridviewPojos=new ArrayList<>();
        gridView=rootView.findViewById(R.id.GridView);

        gridviewPojos.add(new GridviewPojo("Learn With RNR" , "Start Now" , R.drawable.dashboard_one));
        gridviewPojos.add(new GridviewPojo("Videos" , "Watch Now" ,R.drawable.dashboardtwo));
        gridviewPojos.add(new GridviewPojo("Blogs & Articles" , "Read Now" ,R.drawable.dashboard_three));
        gridviewPojos.add(new GridviewPojo("Monthly Newsletter" , "Explore Now" ,R.drawable.dashboard_four));
        gridviewPojos.add(new GridviewPojo("Announcements" , "Explore Now" ,  R.drawable.dashboard_five));
        gridviewPojos.add(new GridviewPojo("Monthly Reasearch" , "Explore Now" , R.drawable.dashboard_six));

        GridViewAdapter gridViewAdapter=new GridViewAdapter(gridviewPojos ,getActivity());

        gridView.setAdapter(gridViewAdapter);



        return rootView;
    }
}
