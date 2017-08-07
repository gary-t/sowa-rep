package com.xtb.api.dto.in;

import java.io.Serializable;

public class UpdUserDto implements Serializable{

	private static final long serialVersionUID = 1L;

	/**会员编号*/
	private String userId;  
	
	/**用户姓名*/
	private String userName;  
	
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
	
	/**备注*/
	private String remark;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Integer getWorklife() {
		return worklife;
	}

	public void setWorklife(Integer worklife) {
		this.worklife = worklife;
	}

	public String getPersonalnote() {
		return personalnote;
	}

	public void setPersonalnote(String personalnote) {
		this.personalnote = personalnote;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}  
	
}
