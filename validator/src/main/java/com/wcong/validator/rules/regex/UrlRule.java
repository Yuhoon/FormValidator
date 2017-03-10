package com.wcong.validator.rules.regex;

/**
 * Created by wangcong on 2017/3/10.
 * <p>
 */

public class UrlRule extends RegexRule {
    public UrlRule(String message) {
        super("http(s)?://([\\\\w-]+\\\\.)+[\\\\w-]+(/[\\\\w- ./?%&=]*)?", message);
    }
}
