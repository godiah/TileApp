package com.example.myapplication001;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ImageViewAdapter extends RecyclerView.Adapter<ImageViewAdapter.ViewHolder> {

    private List<ImageViewModel> imageViewModelList;

    public ImageViewAdapter(List<ImageViewModel> imageViewModelList) {
        this.imageViewModelList = imageViewModelList;
    }

    @NonNull
    @Override
    public ImageViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_layout,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewAdapter.ViewHolder viewHolder, int position) {
        int resource = imageViewModelList.get(position).getProductImage();
        String title = imageViewModelList.get(position).getProductTitle();
        String price = imageViewModelList.get(position).getProductPrice();

//        viewHolder.setproductImage(resource);
//        viewHolder.setproductTitle(title);
//        viewHolder.setproductPrice(price);

        viewHolder.setProductImage(resource);
        viewHolder.setProductTitle(title);
        viewHolder.setProductPrice(price);
    }

    @Override
    public int getItemCount() {
        return imageViewModelList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView productImage;
        private TextView productTitle;
        private TextView productPrice;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.imageView2);
            productTitle = itemView.findViewById(R.id.good_title);
            productPrice = itemView.findViewById(R.id.product_price);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent productDetailsIntent = new Intent(itemView.getContext(),ImageViews01.class);
                    itemView.getContext().startActivity(productDetailsIntent);

                }
            });
        }

        private void setProductImage(int resource){
            productImage.setImageResource(resource);
        }

        private void setProductTitle(String title){
            productTitle.setText(title);
        }

        private void setProductPrice(String price){
            productPrice.setText(price);
        }

    }

}
