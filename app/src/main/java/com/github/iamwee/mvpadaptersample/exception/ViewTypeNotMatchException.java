package com.github.iamwee.mvpadaptersample.exception;

/**
 * Created by zeon on 9/6/2017 AD.
 */

public class ViewTypeNotMatchException extends NullPointerException {

    public ViewTypeNotMatchException(int viewType) {
        super("viewType " + viewType + " isn't match for this adapter.");
    }
}
