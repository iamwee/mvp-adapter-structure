package com.github.iamwee.mvpadaptersample.main.adapter.item;

import com.github.iamwee.mvpadaptersample.base.BaseItem;

/**
 * Created by zeon on 9/5/2017 AD.
 */

public class TitleItem extends BaseItem {

    private String title;

    public TitleItem(String title) {
        super(MainItemType.TYPE_TITLE_LEFT);
        this.title = title;
    }

    public TitleItem(int type, String title) {
        super(type);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
