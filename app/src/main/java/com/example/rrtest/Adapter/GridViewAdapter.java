package com.example.rrtest.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.rrtest.Pojo.GridviewPojo;
import com.example.rrtest.Activity.Learn_with_rnr;
import com.example.rrtest.R;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    private ArrayList<GridviewPojo> gridviewPojos;
    private Context context;
    LayoutInflater layoutInflater;

    public GridViewAdapter(ArrayList<GridviewPojo> gridviewPojos, Context context) {
        this.gridviewPojos = gridviewPojos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return gridviewPojos.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        Holder holder = new Holder();
        View rowView;

        rowView = layoutInflater.inflate(R.layout.dashboard_grid_content, null);
        holder.learnTv =( TextView) rowView.findViewById(R.id.learnTV);
        holder.watchTv =( TextView) rowView.findViewById(R.id.watchTv);
        holder.dashBoardImg = (ImageView) rowView.findViewById(R.id.dashboardImg);
        holder.linkClicktTv = (LinearLayout) rowView.findViewById(R.id.linkClicktTv);

        holder.learnTv.setText(gridviewPojos.get(position).getLearnTv());
        holder.watchTv.setText(gridviewPojos.get(position).getWatchTv());
        Glide.with(context)
                .load(gridviewPojos.get(position).getImgId())
                .into(holder.dashBoardImg);
        holder.linkClicktTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gridviewPojos.get(position).getLearnTv().toLowerCase().equalsIgnoreCase("learn with rnr")){
                    Intent intent= new Intent(context, Learn_with_rnr.class);
                    context.startActivity(intent);
                }
            }
        });
        return rowView;
    }

    public class Holder
    {
        TextView learnTv,watchTv;
        ImageView dashBoardImg;
        LinearLayout linkClicktTv;
    }

}