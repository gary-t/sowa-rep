package com.xtb.api;

import com.xtb.api.dto.out.UserAccountDto;
import pers.tbsowa.common.dto.HandlerInfo;

import com.xtb.api.dto.in.RegUserDto;
import com.xtb.api.dto.in.UpdUserDto;

public interface UserService {

	public boolean addUser(RegUserDto regUserDto) throws Exception;
	
	public boolean updUser(UpdUserDto updUserDto,HandlerInfo handlerInfo) throws Exception;

	public UserAccountDto findUserByAccount(String account) throws Exception;
}
