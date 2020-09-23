package com.example.rrtest.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rrtest.R;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.card_one,R.drawable.card_two,R.drawable.card_three,R.drawable.card_four,R.drawable.card_five,R.drawable.card_six};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.why_invest_data, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView chapterNo = (TextView)view.findViewById(R.id.chapterNum);
        TextView compoundText = (TextView)view.findViewById(R.id.compoundText);
        TextView title = (TextView)view.findViewById(R.id.titleWhyInvest);
        TextView subtitle = (TextView)view.findViewById(R.id.subTitleWhyInvest);
        title.setText("Why Invest?");
        subtitle.setText("Why you should invest in stock market?");
        if(position==0){
            chapterNo.setText("Chapter 1/6");
            compoundText.setText("Why buy stocks");
        }else if(position==1)
            chapterNo.setText("Chapter 2/6");
        else if(position==2)
            chapterNo.setText("Chapter 3/6");
        else if(position==3)
            chapterNo.setText("Chapter 4/6");
        else if(position==4)
            chapterNo.setText("Chapter 5/6");
        else
            chapterNo.setText("Chapter 6/6");

        imageView.setImageResource(images[position]);


        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}