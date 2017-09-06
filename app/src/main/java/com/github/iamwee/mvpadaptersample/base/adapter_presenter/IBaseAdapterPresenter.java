package com.github.iamwee.mvpadaptersample.base.adapter_presenter;

import com.github.iamwee.mvpadaptersample.base.BaseItem;

import java.util.List;

/**
 * Created by zeon on 9/5/2017 AD.
 */

public interface IBaseAdapterPresenter {

    int getItemCount();

    int getItemViewType(int position);

    void setItems(List<BaseItem> items);

    void setItem(int position, BaseItem item);

    void addItem(int position, BaseItem item);

    List<BaseItem> getItems();

    BaseItem getItem(int position);

    void removeItem(int position);

    void clear();
}
