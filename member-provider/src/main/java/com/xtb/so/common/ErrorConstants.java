package com.xtb.so.common;

/**
 * Created by DELL on 2017/8/8.
 */
public enum ErrorConstants {
    SOUS001("SOUS001","注册用户信息为空"),
    SOUS002("SOUS001","注册用户账户为空"),
    SOUS003("SOUS001","注册账号类型错误"),
    SOUS004("SOUS001","密码为空"),
    SOUS005("SOUS001","更新用户信息为空"),
    SOUS006("SOUS001","用户编号为空"),
    SOUS007("SOUS007","账号信息错误"),
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

    ErrorConstants(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
