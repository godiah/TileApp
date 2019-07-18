package com.example.myapplication001;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductImagesAdapter01 extends PagerAdapter {

    List<Integer> tileproductImages;
    List<Integer> tileproductTitles;
    List<Integer> tileproductPrices;

    public ProductImagesAdapter01(List<Integer> tileproductImages, List<Integer> tileproductTitles, List<Integer> tileproductPrices) {
        this.tileproductImages = tileproductImages;
        this.tileproductTitles = tileproductTitles;
        this.tileproductPrices = tileproductPrices;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView image = new ImageView(container.getContext());
        TextView title = new TextView(container.getContext());
        TextView price = new TextView(container.getContext());
        price.setText(tileproductPrices.get(position));
        title.setText(tileproductTitles.get(position));
        image.setImageResource(tileproductImages.get(position));

        return container;
    }

    @Override
    public int getCount() {

        return tileproductImages.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }
}

