package com.wcong.validator.rules;

import android.widget.EditText;

/**
 * Created by wangcong on 2017/3/10.
 * <p>
 */

public class UniformityRule implements Rule{

    private EditText editText;
    private String message;

    public UniformityRule(EditText editText, String message) {
        this.editText = editText;
        this.message = message;
    }

    @Override
    public boolean validate(String value) {
        return value.equals(editText.getText().toString());
    }

    @Override
    public String getErrorMessage() {
        return message;
    }
}
