package com.wcong.validator.rules.regex;

/**
 * Created by wangcong on 2017/3/10.
 * <p> 身份证校验（15或18）
 */

public class IdCardRule extends RegexRule {

    public IdCardRule(String message) {
        super("^\\d{15}|\\d{18}$", message);
    }
}
