package com.xtb.so.member.persistence.entities;

import java.util.HashMap;
import java.util.Map;

import pers.tbsowa.common.dto.AbstractEntity;

public class SoAccount extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	/**编号*/
	private String accountId;  
	
	/**账号*/
	private String account;  
	
	/**账号类型:sys-系统默认,mobile-手机号,nick-昵称,email-邮箱,uid-第三方账号*/
	private String accountType;  
	
	/**用户编号*/
	private String userId;  
	
	/**所属账号类型：1-个人 账号，0-企业账号*/
	private String isPersonal;  
	
	/**备注*/
	private String remark;  
	
	/**扩展字段1*/
	private String extend1;  
	
	/**扩展字段2*/
	private String extend2;  
	
	/**扩展字段3*/
	private String extend3;  
	
	/**扩展字段4*/
	private String extend4;  
	
	/**扩展字段5*/
	private String extend5;  
	
	/**扩展字段6*/
	private String extend6;  
	
	/**扩展字段7*/
	private String extend7;  
	
	/**扩展字段8*/
	private String extend8;  
	
	/**扩展字段9*/
	private String extend9;  
	
	/**扩展字段10*/
	private String extend10;  
	
	/**有效状态标识:1-有效，0-无效*/
	private String valid;  
	
	/**创建人*/
	private String createUser;  
	
	/**创建时间*/
	private java.util.Date createDate;  
	
	/**修改人*/
	private String updateUser;  
	
	/**修改时间*/
	private java.util.Date updateDate;  
	
		/**编号*/
	public void setAccountId(String accountId){
		this.accountId=accountId;
	}
	/**编号*/
	public String getAccountId(){
		return this.accountId;
	}
	
	/**账号*/
	public void setAccount(String account){
		this.account=account;
	}
	/**账号*/
	public String getAccount(){
		return this.account;
	}
	
	/**账号类型:sys-系统默认,mobile-手机号,nick-昵称,email-邮箱,uid-第三方账号*/
	public void setAccountType(String accountType){
		this.accountType=accountType;
	}
	/**账号类型:sys-系统默认,mobile-手机号,nick-昵称,email-邮箱,uid-第三方账号*/
	public String getAccountType(){
		return this.accountType;
	}
	
	/**用户编号*/
	public void setUserId(String userId){
		this.userId=userId;
	}
	/**用户编号*/
	public String getUserId(){
		return this.userId;
	}
	
	/**所属账号类型：1-个人 账号，0-企业账号*/
	public void setIsPersonal(String isPersonal){
		this.isPersonal=isPersonal;
	}
	/**所属账号类型：1-个人 账号，0-企业账号*/
	public String getIsPersonal(){
		return this.isPersonal;
	}
	
	/**备注*/
	public void setRemark(String remark){
		this.remark=remark;
	}
	/**备注*/
	public String getRemark(){
		return this.remark;
	}
	
	/**扩展字段1*/
	public void setExtend1(String extend1){
		this.extend1=extend1;
	}
	/**扩展字段1*/
	public String getExtend1(){
		return this.extend1;
	}
	
	/**扩展字段2*/
	public void setExtend2(String extend2){
		this.extend2=extend2;
	}
	/**扩展字段2*/
	public String getExtend2(){
		return this.extend2;
	}
	
	/**扩展字段3*/
	public void setExtend3(String extend3){
		this.extend3=extend3;
	}
	/**扩展字段3*/
	public String getExtend3(){
		return this.extend3;
	}
	
	/**扩展字段4*/
	public void setExtend4(String extend4){
		this.extend4=extend4;
	}
	/**扩展字段4*/
	public String getExtend4(){
		return this.extend4;
	}
	
	/**扩展字段5*/
	public void setExtend5(String extend5){
		this.extend5=extend5;
	}
	/**扩展字段5*/
	public String getExtend5(){
		return this.extend5;
	}
	
	/**扩展字段6*/
	public void setExtend6(String extend6){
		this.extend6=extend6;
	}
	/**扩展字段6*/
	public String getExtend6(){
		return this.extend6;
	}
	
	/**扩展字段7*/
	public void setExtend7(String extend7){
		this.extend7=extend7;
	}
	/**扩展字段7*/
	public String getExtend7(){
		return this.extend7;
	}
	
	/**扩展字段8*/
	public void setExtend8(String extend8){
		this.extend8=extend8;
	}
	/**扩展字段8*/
	public String getExtend8(){
		return this.extend8;
	}
	
	/**扩展字段9*/
	public void setExtend9(String extend9){
		this.extend9=extend9;
	}
	/**扩展字段9*/
	public String getExtend9(){
		return this.extend9;
	}
	
	/**扩展字段10*/
	public void setExtend10(String extend10){
		this.extend10=extend10;
	}
	/**扩展字段10*/
	public String getExtend10(){
		return this.extend10;
	}
	
	/**有效状态标识:1-有效，0-无效*/
	public void setValid(String valid){
		this.valid=valid;
	}
	/**有效状态标识:1-有效，0-无效*/
	public String getValid(){
		return this.valid;
	}
	
	/**创建人*/
	public void setCreateUser(String createUser){
		this.createUser=createUser;
	}
	/**创建人*/
	public String getCreateUser(){
		return this.createUser;
	}
	
	/**创建时间*/
	public void setCreateDate(java.util.Date createDate){
		this.createDate=createDate;
	}
	/**创建时间*/
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
	
	/**修改人*/
	public void setUpdateUser(String updateUser){
		this.updateUser=updateUser;
	}
	/**修改人*/
	public String getUpdateUser(){
		return this.updateUser;
	}
	
	/**修改时间*/
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate=updateDate;
	}
	/**修改时间*/
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
	
		
	@Override
	public Map<String, Object> toMap() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("accountId",this.accountId);
	map.put("account",this.account);
	map.put("accountType",this.accountType);
	map.put("userId",this.userId);
	map.put("isPersonal",this.isPersonal);
	map.put("remark",this.remark);
	map.put("extend1",this.extend1);
	map.put("extend2",this.extend2);
	map.put("extend3",this.extend3);
	map.put("extend4",this.extend4);
	map.put("extend5",this.extend5);
	map.put("extend6",this.extend6);
	map.put("extend7",this.extend7);
	map.put("extend8",this.extend8);
	map.put("extend9",this.extend9);
	map.put("extend10",this.extend10);
	map.put("valid",this.valid);
	map.put("createUser",this.createUser);
	map.put("createDate",this.createDate);
	map.put("updateUser",this.updateUser);
	map.put("updateDate",this.updateDate);
			return map;
	}
}