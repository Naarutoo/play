package com.example.playstore;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder1 extends RecyclerView.ViewHolder {
    ImageView mIvimage1;
    public Holder1(@NonNull View itemView) {
        super(itemView);
        initview();
    }

    private void initview() {
    mIvimage1 = itemView.findViewById(R.id.ivImage1);

    }
    public void setData1(Model1 model){
mIvimage1.setImageResource(model.getImage1());
    }


}
