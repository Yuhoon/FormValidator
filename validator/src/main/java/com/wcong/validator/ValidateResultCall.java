package com.wcong.validator;

import android.widget.TextView;

/**
 * Created by wangcong on 2017/3/9.
 * <p>
 */
public interface ValidateResultCall {

    void onSuccess();

    void onFailure(TextView view,String message);
}
