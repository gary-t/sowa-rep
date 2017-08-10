package com.xtb.so.access;

import com.xtb.api.dto.out.UserAccountDto;
import com.xtb.so.common.ErrorConstants;
import com.xtb.so.exceptions.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.tbsowa.common.dto.HandlerInfo;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.xtb.api.UserService;
import com.xtb.api.dto.in.RegUserDto;
import com.xtb.api.dto.in.UpdUserDto;
import com.xtb.so.common.SoConstants;
import com.xtb.so.member.services.SoUserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SoUserService soUserService;
	
	@Override
	public boolean addUser(RegUserDto regUserDto) throws Exception {
		if(regUserDto == null){
			throw new UserException(ErrorConstants.SOUS001);
		}
		if(StringUtils.isBlank(regUserDto.getAccount())){
			throw new UserException(ErrorConstants.SOUS002);
		}
		if(!SoConstants.SO_ACCOUNTTYPE_MOBILE.equals(regUserDto.getAccountType())
				&& !SoConstants.SO_ACCOUNTTYPE_EMAIL.equals(regUserDto.getAccountType())){
			throw new UserException(ErrorConstants.SOUS003);
		}
		if(StringUtils.isBlank(regUserDto.getUserPassword())){
			throw new UserException(ErrorConstants.SOUS004);
		}
		return soUserService.addUser(regUserDto);
	}
	
	@Override
	public boolean updUser(UpdUserDto updUserDto,HandlerInfo handlerInfo) throws Exception {
		if(updUserDto == null){
			throw new UserException(ErrorConstants.SOUS005);
		}
		if(StringUtils.isBlank(updUserDto.getUserId())){
			throw new UserException(ErrorConstants.SOUS006);
		}
		return soUserService.updUser(updUserDto,handlerInfo);
	}

	@Override
	public UserAccountDto findUserByAccount(String account) throws Exception{
		if(StringUtils.isBlank(account)){
			throw new UserException(ErrorConstants.SOUS008);
		}
		return soUserService.findUserByAccount(account);
	}

}
