package com.example.playstore;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder2 extends RecyclerView.ViewHolder {
    ImageView mIvImage2;
    TextView tvName , tvRating;
    public Holder2(@NonNull  View itemView) {
        super(itemView);
initview();
    }

    private void initview() {
    mIvImage2 = itemView.findViewById(R.id.ivImage2);
    tvName = itemView.findViewById(R.id.tvAppName);
    tvRating =itemView.findViewById(R.id.tvRating);
    }
    public  void setData2(Model2 model2){
        mIvImage2.setImageResource(model2.getImage2());
        tvName.setText(model2.getName());
        tvRating.setText(model2.getRating());
    }
}
