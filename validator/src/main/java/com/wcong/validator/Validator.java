package com.wcong.validator;

import android.widget.EditText;
import android.widget.TextView;

import com.wcong.validator.rules.Rule;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangcong on 2017/3/9.
 * <p>
 */

public class Validator {

    public Map<TextView, List<Rule>> validations = new LinkedHashMap<TextView, List<Rule>>();

    public void register(TextView textView, Rule... rules) {
        validations.put(textView, Arrays.asList(rules));
    }

    public void unregister(TextView textView) {
        validations.remove(textView);
    }

    public void validateAll(ValidateResultCall resultCall) {
        boolean isTure = true;
        for (TextView key : validations.keySet()) {
            for (Rule rule : validations.get(key)) {
                if (!rule.validate(String.valueOf(key.getText()))) {
                    key.requestFocus();
                    resultCall.onFailure(rule.getErrorMessage());
                    isTure = false;
                    return;
                }
            }
        }
        if (isTure)
            resultCall.onSuccess();
    }

    public boolean validate(EditText editText) {
        List<Rule> rules = validations.get(editText);
        if (rules == null) {
            return true;
        } else {
            for (Rule rule : rules) {
                boolean validate = rule.validate(String.valueOf(editText.getText()));
                if (!validate) {
                    return false;
                }
            }
        }
        return true;
    }

}
