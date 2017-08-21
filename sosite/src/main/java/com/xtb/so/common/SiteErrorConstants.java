package com.xtb.so.common;

/**
 * Created by DELL on 2017/8/8.
 */
public enum SiteErrorConstants {
    SIUS001("SIUS001","账户为空"),
    SIUS002("SIUS002","密码为空"),
    SIUS003("SIUS003","账号类型为空"),
    SIUS004("SIUS004","验证码为空"),
    SIUS005("SIUS005","账号类型错误"),
    SIUS006("SIUS006","账号类型错误"),
    SIUS007("SIUS007","账户格式错误"),
    SIUS008("SIUS008","请输入正确的手机号"),
    SIUS009("SIUS009","验证码错误,请刷新重试"),
    SIUS010("SIUS010","手机号不能为空"),
    ;

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    SiteErrorConstants(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
