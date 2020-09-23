package com.example.rrtest.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rrtest.Adapter.LearnWithRnrAdapter;
import com.example.rrtest.Pojo.LearnWithRNRPojo;
import com.example.rrtest.R;

import java.util.ArrayList;

public class Learn_with_rnr extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_with_rnr);
        ArrayList<LearnWithRNRPojo> learnWithRNRPojos=new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerViewSub);


        learnWithRNRPojos.add(new LearnWithRNRPojo("Why Invest" , "Why you should invest in stock market?" , R.drawable.submodule_one));
        learnWithRNRPojos.add(new LearnWithRNRPojo("Basics of stock market." , "What you should know before investing in market?" , R.drawable.submodule_two));
        learnWithRNRPojos.add(new LearnWithRNRPojo("Finding great companies." , "Where you should invest?" , R.drawable.submodule_three));
        learnWithRNRPojos.add(new LearnWithRNRPojo("Your investing life." , "Everything you should know about investing." , R.drawable.submodule_four));
        learnWithRNRPojos.add(new LearnWithRNRPojo("Getting started." , "How you should start investing" , R.drawable.submodule_five));
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        LearnWithRnrAdapter learnWithRnrAdapter=new LearnWithRnrAdapter(learnWithRNRPojos ,this);
        recyclerView.setAdapter(learnWithRnrAdapter);
    }
}
