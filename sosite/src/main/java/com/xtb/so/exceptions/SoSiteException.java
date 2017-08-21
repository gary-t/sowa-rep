package com.xtb.so.exceptions;

import com.xtb.so.common.SiteErrorConstants;

/**
 * Created by DELL on 2017/8/8.
 */
public class SoSiteException extends Exception{

	private static final long serialVersionUID = 1L;
	
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

    public SoSiteException(String code, String errorMsg) {
        super(errorMsg);
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public SoSiteException(SiteErrorConstants errorConstants) {
        super(errorConstants.getMsg());
        this.code = errorConstants.getCode();
        this.errorMsg = errorConstants.getMsg();
    }
}
