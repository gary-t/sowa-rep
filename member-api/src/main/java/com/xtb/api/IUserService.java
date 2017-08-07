package com.xtb.api;

import pers.tbsowa.common.dto.HandlerInfo;

import com.xtb.api.dto.in.RegUserDto;
import com.xtb.api.dto.in.UpdUserDto;

public interface IUserService {

	public boolean addUser(RegUserDto regUserDto) throws Exception;
	
	public boolean updUser(UpdUserDto updUserDto,HandlerInfo handlerInfo) throws Exception;
}
