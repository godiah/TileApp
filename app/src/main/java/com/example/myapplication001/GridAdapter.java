//package com.example.myapplication001;
//
//import android.content.Context;
//import android.media.Image;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class GridAdapter extends BaseAdapter {
//
//    Context context;
//    private final String[] values;
//    private final String[] prices;
//    private final int[] images;
//    View view;
//    LayoutInflater layoutInflater;
//
//    public GridAdapter(String[] values, String[] prices, int[] images) {
//        this.values = values;
//        this.prices = prices;
//        this.images = images;
//    }
//
//    @Override
//    public int getCount() {
//        return values.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        if (convertView == null){
//
//            view = layoutInflater.inflate(R.layout.row_data,null);
//            ImageView imageView = (ImageView) view.findViewById(R.id.tilePhoto);
//            TextView textView = (TextView) view.findViewById(R.id.tileSize);
//            TextView textView1 = (TextView) view.findViewById(R.id.tilePrice);
//
//            imageView.setImageResource(images[position]);
//            textView.setText(values[position]);
//            textView1.setText(prices[position]);
//        }
//        return view;
//    }
//}
