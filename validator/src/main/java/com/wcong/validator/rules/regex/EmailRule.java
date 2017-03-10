package com.wcong.validator.rules.regex;

/**
 * Created by wangcong on 2017/3/10.
 * <p> 邮箱校验
 */

public class EmailRule extends RegexRule{

    public EmailRule(String message) {
        super("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", message);
    }
}
