package com.wcong.validator.rules;

/**
 * Created by wangcong on 2017/3/9.
 * <p> 非空检验
 */

public class RequiredRule implements Rule {
    private String message;

    public RequiredRule(String message) {
        this.message = message;
    }

    @Override
    public boolean validate(String value) {
        return value != null && !value.isEmpty();
    }

    @Override
    public String getErrorMessage() {
        return message;
    }
}
