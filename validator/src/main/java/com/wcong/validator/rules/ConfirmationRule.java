package com.wcong.validator.rules;

import android.widget.TextView;

/**
 * Created by wangcong on 2017/3/9.
 * <p> 确认信息
 */

public class ConfirmationRule implements Rule {
    private String message;
    private TextView field;

    public ConfirmationRule(TextView field, String message) {
        this.field = field;
        this.message = message;
    }

    @Override
    public boolean validate(String value) {
        return field.getText().equals(value);
    }

    @Override
    public String getErrorMessage() {
        return message;
    }
}
