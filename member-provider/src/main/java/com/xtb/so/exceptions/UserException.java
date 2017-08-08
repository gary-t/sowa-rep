package com.xtb.so.exceptions;

import com.xtb.so.common.ErrorConstants;

/**
 * Created by DELL on 2017/8/8.
 */
public class UserException extends Exception{

    private String code;
    private String errorMsg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public UserException(String code, String errorMsg) {
        super(errorMsg);
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public UserException(ErrorConstants errorConstants) {
        super(errorConstants.getMsg());
        this.code = errorConstants.getCode();
        this.errorMsg = errorConstants.getMsg();
    }
}
