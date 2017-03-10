package com.wcong.validator.rules;

/**
 * Created by wangcong on 2017/3/9.
 * <p> 最小长度
 */

public class MinLengthRule implements Rule {
    private String message;
    private int length;

    public MinLengthRule(int length, String message) {
        this.length = length;
        this.message = message;
    }

    @Override
    public boolean validate(String value) {
        if (value == null && length == 0) {
            return true;
        } else if (value != null) {
            return value.length() >= length;
        } else {
            return false;
        }
    }

    @Override
    public String getErrorMessage() {
        return message;
    }
}
