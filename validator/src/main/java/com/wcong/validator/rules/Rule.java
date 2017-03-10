package com.wcong.validator.rules;

/**
 * Created by wangcong on 2017/3/9.
 * <p>
 */

public interface Rule {

    boolean validate(String value);

    String getErrorMessage();
}
