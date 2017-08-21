package com.xtb.so.mem.vo;

import java.io.Serializable;

public class SmsCodeVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**手机号*/
	private String mobile;
	
	/**验证码*/
	private String kaptchaCode;
	
	/**验证码key*/
	private String kaptchaKey;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getKaptchaCode() {
		return kaptchaCode;
	}

	public void setKaptchaCode(String kaptchaCode) {
		this.kaptchaCode = kaptchaCode;
	}

	public String getKaptchaKey() {
		return kaptchaKey;
	}

	public void setKaptchaKey(String kaptchaKey) {
		this.kaptchaKey = kaptchaKey;
	}
	
}
