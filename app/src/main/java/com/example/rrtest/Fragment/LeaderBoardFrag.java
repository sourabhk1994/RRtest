package com.example.rrtest.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.rrtest.Adapter.LeaderBoardAdapter;
import com.example.rrtest.Pojo.LeaderBoardPojo;
import com.example.rrtest.R;

import java.util.ArrayList;

public class LeaderBoardFrag extends Fragment {
    View rootView;
    RecyclerView recyclerView;
    ImageView img,imgOne,imgThree;
    TextView name,points,nameTwo,pointsTwo,nameThree,pointsThree;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView= inflater.inflate(R.layout.fragment_leader_board, container, false);
        ArrayList<LeaderBoardPojo> leaderBoardPojos=new ArrayList<>();
        ArrayList<LeaderBoardPojo> leaderBoardPojosTopThree=new ArrayList<>();
        recyclerView=rootView.findViewById(R.id.recyclerView);
        img=rootView.findViewById(R.id.img);
        imgOne=rootView.findViewById(R.id.imgTwo);
        imgThree=rootView.findViewById(R.id.imgThree);
        name=rootView.findViewById(R.id.name);
        nameTwo=rootView.findViewById(R.id.nameTwo);
        nameThree=rootView.findViewById(R.id.nameThree);
        points=rootView.findViewById(R.id.point);
        pointsTwo=rootView.findViewById(R.id.pointTwo);
        pointsThree=rootView.findViewById(R.id.pointThree);

        leaderBoardPojosTopThree.add(new LeaderBoardPojo(1 , "Sharang", R.drawable.leaderboard_one ,2000));
        leaderBoardPojosTopThree.add(new LeaderBoardPojo(2 , "Divya" , R.drawable.leaderboard_two,1700));
        leaderBoardPojosTopThree.add(new LeaderBoardPojo(3 , "Abhijit" ,  R.drawable.leaderboard_three,1600));
        leaderBoardPojos.add(new LeaderBoardPojo(4 , "Anjali" , R.drawable.leaderboard_four,1521));
        leaderBoardPojos.add(new LeaderBoardPojo(5 , "Akansha" ,  R.drawable.leaderboard_five,1221));
        leaderBoardPojos.add(new LeaderBoardPojo(6 , "Soni" ,  R.drawable.leaderboard_six,1210));
        leaderBoardPojos.add(new LeaderBoardPojo(7 , "Deepa" ,  R.drawable.leaderboard_seven,1021));
        leaderBoardPojos.add(new LeaderBoardPojo(8 , "Gautam" , R.drawable.leaderboard_eight,521));
        leaderBoardPojos.add(new LeaderBoardPojo(9 , "Manjeet" , R.drawable.leaderboard_nine,121));

        for(int i=0;i<leaderBoardPojosTopThree.size();i++){
            if(leaderBoardPojosTopThree.get(i).getPosition()==1){
                Glide.with(getActivity())
                        .load(leaderBoardPojosTopThree.get(i).getImgid())
                        .into(img);
                points.setText(String.valueOf(leaderBoardPojosTopThree.get(i).getPoints()) + " points");
                name.setText(leaderBoardPojosTopThree.get(i).getName());
            }else  if(leaderBoardPojosTopThree.get(i).getPosition()==2){
                Glide.with(getActivity())
                        .load(leaderBoardPojosTopThree.get(i).getImgid())
                        .into(imgOne);
                pointsTwo.setText(String.valueOf(leaderBoardPojosTopThree.get(i).getPoints()) + " points");
                nameTwo.setText(leaderBoardPojosTopThree.get(i).getName());
            }else  if(leaderBoardPojosTopThree.get(i).getPosition()==3){
                Glide.with(getActivity())
                        .load(leaderBoardPojosTopThree.get(i).getImgid())
                        .into(imgThree);
                pointsThree.setText(String.valueOf(leaderBoardPojosTopThree.get(i).getPoints()) + " points");
                nameThree.setText(leaderBoardPojosTopThree.get(i).getName());
            }
        }
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        LeaderBoardAdapter leaderBoardAdapter=new LeaderBoardAdapter(leaderBoardPojos , getActivity());

        recyclerView.setAdapter(leaderBoardAdapter);

        return rootView;
    }
}
