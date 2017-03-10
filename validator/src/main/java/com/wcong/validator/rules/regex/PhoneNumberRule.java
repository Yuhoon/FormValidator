package com.wcong.validator.rules.regex;

/**
 * Created by wangcong on 2017/3/9.
 * <p> 手机号校验
 */

public class PhoneNumberRule extends RegexRule {

    public PhoneNumberRule(String message) {
        super("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$", message);
    }
}
