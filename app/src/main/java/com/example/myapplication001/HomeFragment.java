package com.example.myapplication001;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {

    /////////// Horizontal Product Layout
    private TextView horizontalLayoutTitle;
//    private Button horizontalLayoutViewAllButton;
    private RecyclerView horizontalRecyclerView;
    /////////// Horizontal Product Layout

    ////////////// Banner Slider
    private ViewPager BannerSliderViewPager;
    private List<sliderModel> sliderModelList;
    private int currentPage = 2;
    private Timer timer;
    final private long DELAY_TIME = 3000;
    final private long PERIOD_TIME = 3000;
    ///////////// Banner Slider

    private Button trendingItemsBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        BannerSliderViewPager = view.findViewById(R.id.banner_slideViewpager);

        /////Trending Button
        trendingItemsBtn = view.findViewById(R.id.trending_viewallbtn);

        trendingItemsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trends = new Intent(getActivity(),trendingtilespurchase.class);
                startActivity(trends);
            }
        });
        /////Trending Button

        sliderModelList = new ArrayList<sliderModel>();

        sliderModelList.add(new sliderModel(R.drawable.floortile7,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile8,"#077AE4"));

        sliderModelList.add(new sliderModel(R.drawable.floortile1,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile2,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile3,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile4,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile5,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile6,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile7,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile8,"#077AE4"));

        sliderModelList.add(new sliderModel(R.drawable.floortile1,"#077AE4"));
        sliderModelList.add(new sliderModel(R.drawable.floortile2,"#077AE4"));



        sliderAdapter sliderAdapter = new sliderAdapter(sliderModelList);
        BannerSliderViewPager.setAdapter(sliderAdapter);
        BannerSliderViewPager.setClipToPadding(false);
        BannerSliderViewPager.setPageMargin(20);

        BannerSliderViewPager.setCurrentItem(currentPage);

        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                currentPage = i;
            }

            @Override
            public void onPageScrollStateChanged(int i) {
                if (i == ViewPager.SCROLL_STATE_IDLE){
                    PageLooper();
                }

            }
        };

        BannerSliderViewPager.addOnPageChangeListener(onPageChangeListener);

        startBannerSlideshow();

        BannerSliderViewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                PageLooper();
                startBannerSlideshow();

                if (event.getAction() == MotionEvent.ACTION_UP){
                    startBannerSlideshow();
                }
                return false;
            }
        });

        /////////// Horizontal Product Layout

        horizontalLayoutTitle = view.findViewById(R.id.horizontal_scrollayout_title);
//        horizontalLayoutViewAllButton = view.findViewById(R.id.horizontal_scrolllayout_btn);
        horizontalRecyclerView = view.findViewById(R.id.horizontal_recyclerview);

        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.dtile1,"Wood Tiles","8*10","1250/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.dtile2,"Garage Tiles","18*18","1475/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.dtile3,"Marble Tiles","8*8","1399/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.dtile7,"Porcelain Tiles","4*4","1250/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.dtile5,"Swiss Tiles","12*12","1500/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.dtile6,"Mosaic Tiles","18*24","1750/-"));

        HorizontalProductScrollAdapter  horizontalProductScrollAdapter= new HorizontalProductScrollAdapter(horizontalProductScrollModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        horizontalRecyclerView.setLayoutManager(linearLayoutManager);

        horizontalRecyclerView.setAdapter(horizontalProductScrollAdapter);
        horizontalProductScrollAdapter.notifyDataSetChanged();


        /////////// Horizontal Product Layout

        return view;
    }

    private void PageLooper()
    {
        if (currentPage == sliderModelList.size() - 2)
        {
            currentPage = 2;
            BannerSliderViewPager.setCurrentItem(currentPage,false);
        }
        if (currentPage == 1)
        {
            currentPage = sliderModelList.size() - 3;
            BannerSliderViewPager.setCurrentItem(currentPage,false);
        }

    }

    private void startBannerSlideshow(){
        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            @Override
            public void run() {
                if (currentPage >= sliderModelList.size()){
                    currentPage = 1;
                }
                BannerSliderViewPager.setCurrentItem(currentPage++,true);

            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        },DELAY_TIME,PERIOD_TIME);
    }

    private void stopBannerSlide(){
        timer.cancel();}

}
