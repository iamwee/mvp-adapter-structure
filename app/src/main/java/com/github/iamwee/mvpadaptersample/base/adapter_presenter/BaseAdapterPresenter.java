package com.github.iamwee.mvpadaptersample.base.adapter_presenter;

import com.github.iamwee.mvpadaptersample.base.BaseItem;

import java.util.List;

/**
 * Created by zeon on 9/5/2017 AD.
 */

public class BaseAdapterPresenter<Adapter extends IBaseAdapter> implements IBaseAdapterPresenter {

    private List<BaseItem> items;
    private Adapter adapter;

    public BaseAdapterPresenter(Adapter adapter) {
        this.adapter = adapter;
    }

    public Adapter getAdapter() {
        return adapter;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    @Override
    public void setItems(List<BaseItem> items) {
        this.items = items;
        getAdapter().notifyDataSetChanged();
    }

    @Override
    public void setItem(int position, BaseItem item) {
        items.set(position, item);
        getAdapter().notifyItemChanged(position);
    }

    @Override
    public void addItem(int position, BaseItem item) {
        items.add(position, item);
        getAdapter().notifyItemInserted(position);
    }

    @Override
    public List<BaseItem> getItems() {
        return items;
    }

    @Override
    public BaseItem getItem(int position) {
        return items.get(position);
    }

    @Override
    public void removeItem(int position) {
        items.remove(position);
        getAdapter().notifyItemRemoved(position);
    }

    @Override
    public void clear() {
        items.clear();
        getAdapter().notifyDataSetChanged();
    }

}
