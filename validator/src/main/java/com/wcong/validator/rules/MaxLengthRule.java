package com.wcong.validator.rules;

/**
 * Created by wangcong on 2017/3/9.
 * <p> 最大长度
 */

public class MaxLengthRule implements Rule {
    private String message;
    private int length;

    public MaxLengthRule(int length, String message) {
        this.length = length;
        this.message = message;
    }

    @Override
    public boolean validate(String value) {
        return value.length() <= length;
    }

    @Override
    public String getErrorMessage() {
        return message;
    }
}
