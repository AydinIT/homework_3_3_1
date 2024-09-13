package com.example.rv_test;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class CarViewHolder extends RecyclerView.ViewHolder {
    private ImageView carImage;
    private TextView title, desc;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        carImage = itemView.findViewById(R.id.img_car);
        desc = itemView.findViewById(R.id.tv_desc);
        title = itemView.findViewById(R.id.tv_title);
    }

    protected void bind(Cars cars){
        title.setText(cars.getName());
        desc.setText(cars.getDesc());
        Glide.with(carImage).load(cars.getImage()).into(carImage);

    }

}
