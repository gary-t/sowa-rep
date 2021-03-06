package com.xtb.so.mem.controllers;

import com.xtb.api.dto.in.RegUserDto;
import com.xtb.so.common.SiteConstants;
import com.xtb.so.common.SiteErrorConstants;
import com.xtb.so.common.SiteUrlConstants;
import com.xtb.so.exceptions.SoSiteException;
import com.xtb.so.mem.rpc.SoUserRpcService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.tbsowa.common.utils.RegexUtils;


@Controller
public class SoUserController {
	@Autowired
	private SoUserRpcService souserservice;

	@RequestMapping(value = SiteUrlConstants.SITE_USER_ADDUSER,
			method= RequestMethod.POST,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public boolean addUser(RegUserDto regUserDto) throws Exception{
		if(StringUtils.isBlank(regUserDto.getAccount())){
			throw new SoSiteException(SiteErrorConstants.SIUS001);
		}
		if(StringUtils.isBlank(regUserDto.getUserPassword())){
			throw new SoSiteException(SiteErrorConstants.SIUS002);
		}
		if(StringUtils.isBlank(regUserDto.getAccountType())){
			throw new SoSiteException(SiteErrorConstants.SIUS003);
		}
		if(StringUtils.isBlank(regUserDto.getIdentifyingCode())){
			throw new SoSiteException(SiteErrorConstants.SIUS004);
		}
		if(StringUtils.isBlank(regUserDto.getIdentifyingKey())){
			throw new SoSiteException(SiteErrorConstants.SIUS009);
		}
		if(!SiteConstants.ACCOUNT_TYPE_MOBILE.equals(regUserDto.getAccountType()) &&
				!SiteConstants.ACCOUNT_TYPE_EMAIL.equals(regUserDto.getAccountType())){
			throw new SoSiteException(SiteErrorConstants.SIUS005);
		}else{
			if(SiteConstants.ACCOUNT_TYPE_MOBILE.equals(regUserDto.getAccountType()) &&
					!RegexUtils.isMobile(regUserDto.getAccount())){
				throw new SoSiteException(SiteErrorConstants.SIUS007);
			}else if(SiteConstants.ACCOUNT_TYPE_EMAIL.equals(regUserDto.getAccountType()) &&
					!RegexUtils.isEmail(regUserDto.getAccount())){
				throw new SoSiteException(SiteErrorConstants.SIUS007);
			}

		}

//		IRedisUtil.get(regUserDto.getIdentifyingKey());
		
		return souserservice.addUser(regUserDto);
	}
	
	
	
}
