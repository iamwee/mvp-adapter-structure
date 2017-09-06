package com.github.iamwee.mvpadaptersample.base;

import android.support.v7.widget.RecyclerView;

import com.github.iamwee.mvpadaptersample.base.adapter_presenter.BaseAdapterPresenter;
import com.github.iamwee.mvpadaptersample.base.adapter_presenter.IBaseAdapter;
import com.github.iamwee.mvpadaptersample.exception.PresenterNotFoundException;

import java.util.List;

/**
 * Created by zeon on 9/5/2017 AD.
 */

public abstract class BaseAdapter<ViewHolder extends BaseViewHolder, Presenter extends BaseAdapterPresenter>
        extends RecyclerView.Adapter<ViewHolder> implements IBaseAdapter {

    private Presenter presenter;

    public BaseAdapter() {
        presenter = onCreatePresenter();
    }

    public abstract Presenter onCreatePresenter();

    public void setItems(List<BaseItem> items) {
        getPresenter().setItems(items);
    }

    @Override
    public int getItemCount() {
        return getPresenter().getItemCount();
    }

    @Override
    public int getItemViewType(int position) {
        return getPresenter().getItemViewType(position);
    }

    protected Presenter getPresenter() {
        if (presenter == null) throw new PresenterNotFoundException();
        return presenter;
    }
}
