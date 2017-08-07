package com.xtb.api.dto.in;

import java.io.Serializable;

public class RegUserDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**账号*/
	private String account;
	/**账号类型:mobile-手机号,email-邮箱*/
	private String accountType;  
	/**密码*/
	private String userPassword;  
	/**验证码*/
	private String identifyingCode;
	/**验证码key*/
	private String identifyingKey;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getIdentifyingCode() {
		return identifyingCode;
	}
	public void setIdentifyingCode(String identifyingCode) {
		this.identifyingCode = identifyingCode;
	}
	public String getIdentifyingKey() {
		return identifyingKey;
	}
	public void setIdentifyingKey(String identifyingKey) {
		this.identifyingKey = identifyingKey;
	}
	
}
