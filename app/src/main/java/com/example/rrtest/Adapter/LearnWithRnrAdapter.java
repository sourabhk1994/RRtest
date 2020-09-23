package com.example.rrtest.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.rrtest.Pojo.LearnWithRNRPojo;
import com.example.rrtest.R;
import com.example.rrtest.Activity.WhyInvest;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LearnWithRnrAdapter extends RecyclerView.Adapter<LearnWithRnrAdapter.MyViewHolder> {
        ArrayList<LearnWithRNRPojo> learnWithRNRPojos;
        Context context;

    public LearnWithRnrAdapter(ArrayList<LearnWithRNRPojo> learnWithRNRPojos, Context context) {
            this.learnWithRNRPojos = learnWithRNRPojos;
            this.context = context;
            }
    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView title , subtitle;
        ImageView subImg;
        LinearLayout dataCell;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            subtitle=itemView.findViewById(R.id.subtitle);
            subImg=itemView.findViewById(R.id.subModuleImg);
            dataCell=itemView.findViewById(R.id.dataCell);
        }
    }

        @NonNull
        @Override
        public LearnWithRnrAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            LayoutInflater inflater= LayoutInflater.from(viewGroup.getContext());

            View view= inflater.inflate(R.layout.learn_with_rnr_data , viewGroup , false);

            final LearnWithRnrAdapter.MyViewHolder myViewHolder=new LearnWithRnrAdapter.MyViewHolder(view);
            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull LearnWithRnrAdapter.MyViewHolder myViewHolder, int i) {
            LearnWithRNRPojo learnWithRNRPojo=learnWithRNRPojos.get(i);
            myViewHolder.title.setText(learnWithRNRPojo.getTitle());
            myViewHolder.subtitle.setText(learnWithRNRPojo.getSubtitle());
            Glide.with(context)
                    .load(learnWithRNRPojos.get(i).getSubImg())
                    .into(myViewHolder.subImg);
            myViewHolder.dataCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(context, WhyInvest.class);
                    context.startActivity(intent);
                }
            });
    }

        @Override
        public int getItemCount() {
            return learnWithRNRPojos.size();
        }
}
