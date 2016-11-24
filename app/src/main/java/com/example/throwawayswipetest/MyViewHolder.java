package com.example.throwawayswipetest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    View view;
    TextView tv;

    LinearLayout.LayoutParams zeroHeightParams;
    LinearLayout.LayoutParams wrapContentHeightParams;

    public MyViewHolder(final View itemView) {
        super(itemView);
        view = itemView;
        tv = (TextView) itemView.findViewById(R.id.tv);

        zeroHeightParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0);
        wrapContentHeightParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    public void heightZero() {
        view.setLayoutParams(zeroHeightParams);
    }

    public void heightWrap() {
        view.setLayoutParams(wrapContentHeightParams);
    }
}
