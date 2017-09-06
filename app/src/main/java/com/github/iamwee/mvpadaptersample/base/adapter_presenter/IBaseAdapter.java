package com.github.iamwee.mvpadaptersample.base.adapter_presenter;

/**
 * Created by zeon on 9/5/2017 AD.
 */

public interface IBaseAdapter {

    void notifyDataSetChanged();

    void notifyItemChanged(int position);

    void notifyItemInserted(int position);

    void notifyItemRemoved(int position);
}
