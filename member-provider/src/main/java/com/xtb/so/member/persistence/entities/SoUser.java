package com.xtb.so.member.persistence.entities;

import java.util.HashMap;
import java.util.Map;

import pers.tbsowa.common.dto.AbstractEntity;

public class SoUser extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	/**会员编号*/
	private String userId;  
	
	/**用户代码*/
	private String userCode;  
	
	/**用户姓名*/
	private String userName;  
	
	/**用户密码*/
	private String userPassword;  
	
	/**用户状态：00-注册用户,05-待审核,10-审核通过成为会员,15-审核驳回*/
	private String userStatus;  
	
	/**证件表编号*/
	private String certId;  
	
	/**手机号*/
	private String mobile;  
	
	/**昵称*/
	private String nickname;  
	
	/**邮箱*/
	private String email;  
	
	/**住址所在省*/
	private String province;  
	
	/**住址所在市*/
	private String city;  
	
	/**住址所在地区*/
	private String area;  
	
	/**详细地址*/
	private String address;  
	
	/**固定电话*/
	private String telephone;  
	
	/**头像地址*/
	private String img;  
	
	/**所在公司*/
	private String company;  
	
	/**所在部门*/
	private String department;  
	
	/**职业*/
	private String profession;  
	
	/**职位*/
	private String position;  
	
	/**所在行业*/
	private String industry;  
	
	/**工作年限*/
	private Integer worklife;  
	
	/**个人说明*/
	private String personalnote;  
	
	/**注册来源：web-网页,app-手机*/
	private String source;  
	
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
	
	/**有效标识：1-有效，0-无效*/
	private String valid;  
	
	/**创建者*/
	private String createUser;  
	
	/**创建日期*/
	private java.util.Date createDate;  
	
	/**修改者*/
	private String updateUser;  
	
	/**修改日期*/
	private java.util.Date updateDate;  
	
	/***/
	private String auditUser;  
	
	/**审核日期*/
	private java.util.Date auditDate;  
	
		/**会员编号*/
	public void setUserId(String userId){
		this.userId=userId;
	}
	/**会员编号*/
	public String getUserId(){
		return this.userId;
	}
	
	/**用户代码*/
	public void setUserCode(String userCode){
		this.userCode=userCode;
	}
	/**用户代码*/
	public String getUserCode(){
		return this.userCode;
	}
	
	/**用户姓名*/
	public void setUserName(String userName){
		this.userName=userName;
	}
	/**用户姓名*/
	public String getUserName(){
		return this.userName;
	}
	
	/**用户密码*/
	public void setUserPassword(String userPassword){
		this.userPassword=userPassword;
	}
	/**用户密码*/
	public String getUserPassword(){
		return this.userPassword;
	}
	
	/**用户状态：00-注册用户,05-待审核,10-审核通过成为会员,15-审核驳回*/
	public void setUserStatus(String userStatus){
		this.userStatus=userStatus;
	}
	/**用户状态：00-注册用户,05-待审核,10-审核通过成为会员,15-审核驳回*/
	public String getUserStatus(){
		return this.userStatus;
	}
	
	/**证件表编号*/
	public void setCertId(String certId){
		this.certId=certId;
	}
	/**证件表编号*/
	public String getCertId(){
		return this.certId;
	}
	
	/**手机号*/
	public void setMobile(String mobile){
		this.mobile=mobile;
	}
	/**手机号*/
	public String getMobile(){
		return this.mobile;
	}
	
	/**昵称*/
	public void setNickname(String nickname){
		this.nickname=nickname;
	}
	/**昵称*/
	public String getNickname(){
		return this.nickname;
	}
	
	/**邮箱*/
	public void setEmail(String email){
		this.email=email;
	}
	/**邮箱*/
	public String getEmail(){
		return this.email;
	}
	
	/**住址所在省*/
	public void setProvince(String province){
		this.province=province;
	}
	/**住址所在省*/
	public String getProvince(){
		return this.province;
	}
	
	/**住址所在市*/
	public void setCity(String city){
		this.city=city;
	}
	/**住址所在市*/
	public String getCity(){
		return this.city;
	}
	
	/**住址所在地区*/
	public void setArea(String area){
		this.area=area;
	}
	/**住址所在地区*/
	public String getArea(){
		return this.area;
	}
	
	/**详细地址*/
	public void setAddress(String address){
		this.address=address;
	}
	/**详细地址*/
	public String getAddress(){
		return this.address;
	}
	
	/**固定电话*/
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
	/**固定电话*/
	public String getTelephone(){
		return this.telephone;
	}
	
	/**头像地址*/
	public void setImg(String img){
		this.img=img;
	}
	/**头像地址*/
	public String getImg(){
		return this.img;
	}
	
	/**所在公司*/
	public void setCompany(String company){
		this.company=company;
	}
	/**所在公司*/
	public String getCompany(){
		return this.company;
	}
	
	/**所在部门*/
	public void setDepartment(String department){
		this.department=department;
	}
	/**所在部门*/
	public String getDepartment(){
		return this.department;
	}
	
	/**职业*/
	public void setProfession(String profession){
		this.profession=profession;
	}
	/**职业*/
	public String getProfession(){
		return this.profession;
	}
	
	/**职位*/
	public void setPosition(String position){
		this.position=position;
	}
	/**职位*/
	public String getPosition(){
		return this.position;
	}
	
	/**所在行业*/
	public void setIndustry(String industry){
		this.industry=industry;
	}
	/**所在行业*/
	public String getIndustry(){
		return this.industry;
	}
	
	/**工作年限*/
	public void setWorklife(Integer worklife){
		this.worklife=worklife;
	}
	/**工作年限*/
	public Integer getWorklife(){
		return this.worklife;
	}
	
	/**个人说明*/
	public void setPersonalnote(String personalnote){
		this.personalnote=personalnote;
	}
	/**个人说明*/
	public String getPersonalnote(){
		return this.personalnote;
	}
	
	/**注册来源：web-网页,app-手机*/
	public void setSource(String source){
		this.source=source;
	}
	/**注册来源：web-网页,app-手机*/
	public String getSource(){
		return this.source;
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
	
	/**有效标识：1-有效，0-无效*/
	public void setValid(String valid){
		this.valid=valid;
	}
	/**有效标识：1-有效，0-无效*/
	public String getValid(){
		return this.valid;
	}
	
	/**创建者*/
	public void setCreateUser(String createUser){
		this.createUser=createUser;
	}
	/**创建者*/
	public String getCreateUser(){
		return this.createUser;
	}
	
	/**创建日期*/
	public void setCreateDate(java.util.Date createDate){
		this.createDate=createDate;
	}
	/**创建日期*/
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
	
	/**修改者*/
	public void setUpdateUser(String updateUser){
		this.updateUser=updateUser;
	}
	/**修改者*/
	public String getUpdateUser(){
		return this.updateUser;
	}
	
	/**修改日期*/
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate=updateDate;
	}
	/**修改日期*/
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
	
	/***/
	public void setAuditUser(String auditUser){
		this.auditUser=auditUser;
	}
	/***/
	public String getAuditUser(){
		return this.auditUser;
	}
	
	/**审核日期*/
	public void setAuditDate(java.util.Date auditDate){
		this.auditDate=auditDate;
	}
	/**审核日期*/
	public java.util.Date getAuditDate(){
		return this.auditDate;
	}
	
		
	@Override
	public Map<String, Object> toMap() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userId",this.userId);
	map.put("userCode",this.userCode);
	map.put("userName",this.userName);
	map.put("userPassword",this.userPassword);
	map.put("userStatus",this.userStatus);
	map.put("certId",this.certId);
	map.put("mobile",this.mobile);
	map.put("nickname",this.nickname);
	map.put("email",this.email);
	map.put("province",this.province);
	map.put("city",this.city);
	map.put("area",this.area);
	map.put("address",this.address);
	map.put("telephone",this.telephone);
	map.put("img",this.img);
	map.put("company",this.company);
	map.put("department",this.department);
	map.put("profession",this.profession);
	map.put("position",this.position);
	map.put("industry",this.industry);
	map.put("worklife",this.worklife);
	map.put("personalnote",this.personalnote);
	map.put("source",this.source);
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
	map.put("auditUser",this.auditUser);
	map.put("auditDate",this.auditDate);
			return map;
	}
}