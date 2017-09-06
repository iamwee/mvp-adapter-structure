package com.github.iamwee.mvpadaptersample.main.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.iamwee.mvpadaptersample.R;
import com.github.iamwee.mvpadaptersample.base.BaseAdapter;
import com.github.iamwee.mvpadaptersample.base.BaseViewHolder;
import com.github.iamwee.mvpadaptersample.exception.ViewTypeNotMatchException;
import com.github.iamwee.mvpadaptersample.main.adapter.item.MainItemType;
import com.github.iamwee.mvpadaptersample.main.adapter.item.TitleItem;

/**
 * Created by zeon on 9/5/2017 AD.
 */

public class MainAdapter extends BaseAdapter<BaseViewHolder, MainAdapterPresenter> implements IMainAdapter {

    private OnActionListener listener;

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case MainItemType.TYPE_TITLE_LEFT:
                return new TitleViewHolder(parent);
            case MainItemType.TYPE_TITLE_RIGHT:
                return new TitleViewHolder(parent);
            default:
                throw new ViewTypeNotMatchException(viewType);
        }
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, int position) {
        if (holder instanceof TitleViewHolder) {
            TitleViewHolder viewHolder = (TitleViewHolder) holder;
            TitleItem item = (TitleItem) getPresenter().getItem(position);
            viewHolder.tvTitle.setText(item.getTitle());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) listener.onItemClick(holder.getAdapterPosition());
                }
            });
        }
    }

    @Override
    public MainAdapterPresenter onCreatePresenter() {
        return new MainAdapterPresenter(this);
    }


    public void setOnActionListener(OnActionListener listener) {
        this.listener = listener;
    }

    public interface OnActionListener {
        void onItemClick(int position);
    }

    private class TitleViewHolder extends BaseViewHolder {

        TextView tvTitle;

        private TitleViewHolder(ViewGroup parent) {
            super(parent, R.layout.item_title);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}
