package com.github.iamwee.mvpadaptersample.base;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by zeon on 9/5/2017 AD.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(ViewGroup parent, int layoutId) {
        super(LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false));
    }
}
