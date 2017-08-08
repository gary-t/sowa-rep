package com.xtb.api.dto.out;


import java.io.Serializable;

/**
 * Created by DELL on 2017/8/8.
 */
public class UserAccountDto implements Serializable {

    private static final long serialVersionUID = -4421236552508997991L;

    /**账号*/
    private String account;
    /**用户id*/
    private String userId;
    /**用户代码*/
    private String userCode;
    /**账号密码*/
    private String userPassword;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
