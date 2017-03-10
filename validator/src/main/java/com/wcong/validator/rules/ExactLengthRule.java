package com.wcong.validator.rules;

/**
 * Created by wangcong on 2017/3/9.
 * <p> 长度是否满足标准
 */

public class ExactLengthRule implements Rule {
    private String message = "Must be at most 16 characters long";
    private int length;

    public ExactLengthRule(int length, String message) {
        this.length = length;
        this.message = message;
    }

    @Override
    public boolean validate(String value) {
        if (value == null && length == 0) {
            return true;
        } else if (value != null) {
            return value.length() == length;
        } else {
            return false;
        }

    }

    @Override
    public String getErrorMessage() {
        return message;
    }
}
