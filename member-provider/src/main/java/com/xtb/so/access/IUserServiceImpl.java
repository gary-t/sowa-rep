package com.xtb.so.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.tbsowa.common.dto.HandlerInfo;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.xtb.api.IUserService;
import com.xtb.api.dto.in.RegUserDto;
import com.xtb.api.dto.in.UpdUserDto;
import com.xtb.so.common.SoConstants;
import com.xtb.so.member.services.SoUserService;

@Service
public class IUserServiceImpl implements IUserService {

	@Autowired
	private SoUserService soUserService;
	
	@Override
	public boolean addUser(RegUserDto regUserDto) throws Exception {
		if(regUserDto == null){
			throw new Exception("E001:注册用户信息为空");
		}
		if(StringUtils.isBlank(regUserDto.getAccount())){
			throw new Exception("E002:注册用户账户为空");
		}
		if(!SoConstants.SO_ACCOUNTTYPE_MOBILE.equals(regUserDto.getAccountType())
				&& !SoConstants.SO_ACCOUNTTYPE_EMAIL.equals(regUserDto.getAccountType())){
			throw new Exception("E003:注册账号类型错误");
		}
		if(StringUtils.isBlank(regUserDto.getUserPassword())){
			throw new Exception("E004:密码为空");
		}
		return soUserService.addUser(regUserDto);
	}
	
	@Override
	public boolean updUser(UpdUserDto updUserDto,HandlerInfo handlerInfo) throws Exception {
		if(updUserDto == null){
			throw new Exception("E005:更新用户信息为空");
		}
		if(StringUtils.isBlank(updUserDto.getUserId())){
			throw new Exception("E006:用户编号为空");
		}
		return soUserService.updUser(updUserDto,handlerInfo);
	}

}
