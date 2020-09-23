package com.example.rrtest.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.rrtest.Pojo.LeaderBoardPojo;
import com.example.rrtest.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LeaderBoardAdapter extends RecyclerView.Adapter<LeaderBoardAdapter.MyViewHolder>
{
    ArrayList<LeaderBoardPojo> leaderBoardPojos;
    Context context;

    public LeaderBoardAdapter(ArrayList<LeaderBoardPojo> leaderBoardPojos, Context context) {
        this.leaderBoardPojos = leaderBoardPojos;
        this.context = context;
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name , points,position;
        ImageView userImg;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            points=itemView.findViewById(R.id.point);
            name=itemView.findViewById(R.id.name);
            position=itemView.findViewById(R.id.posNo);
            userImg=itemView.findViewById(R.id.userIg);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater= LayoutInflater.from(viewGroup.getContext());

        View view= inflater.inflate(R.layout.leader_data , viewGroup , false);

        final MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
            LeaderBoardPojo leaderBoardPojo=leaderBoardPojos.get(i);
            myViewHolder.name.setText(leaderBoardPojo.getName());
            myViewHolder.position.setText(String.valueOf(leaderBoardPojo.getPosition()));
            myViewHolder.points.setText(String.valueOf(leaderBoardPojo.getPoints())+" points");

        Glide.with(context)
                .load(leaderBoardPojos.get(i).getImgid())
                .into(myViewHolder.userImg);

    }

    @Override
    public int getItemCount() {
        return leaderBoardPojos.size();
    }
}
