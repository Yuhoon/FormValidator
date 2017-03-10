package com.wcong.validator.rules.regex;

import com.wcong.validator.rules.Rule;

import java.util.regex.Pattern;

/**
 * Created by wangcong on 2017/3/9.
 * <p> 正则表达式
 */

public class RegexRule implements Rule {
    private String regex;
    private String message;

    public RegexRule(String regex, String message) {
        this.regex = regex;
        this.message = message;
    }

    @Override
    public boolean validate(String value) {
        return Pattern.compile(regex).matcher(value).matches();
    }

    @Override
    public String getErrorMessage() {
        return message;
    }
}
