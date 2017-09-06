package com.github.iamwee.mvpadaptersample.exception;

/**
 * Created by zeon on 9/5/2017 AD.
 */

public class PresenterNotFoundException extends NullPointerException {
    public PresenterNotFoundException() {
        super("presenter isn't created yet, did you forgot to new instance in onCreatePresenter() ?");
    }
}
