package com.wcong.validator;

import android.widget.TextView;

/**
 * Created by wangcong on 2017/3/9.
 * <p>
 */

public class ValidationError {
    private TextView field;
    private String errorMessage;

    public ValidationError(TextView field, String errorMessage) {
        this.field = field;
        this.errorMessage = errorMessage;
    }

    public TextView getField() {
        return field;
    }

    public void setField(TextView field) {
        this.field = field;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
