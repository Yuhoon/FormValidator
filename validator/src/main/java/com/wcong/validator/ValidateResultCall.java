package com.wcong.validator;

/**
 * Created by wangcong on 2017/3/9.
 * <p>
 */
public interface ValidateResultCall {

    void onSuccess();

    void onFailure(String message);
}
