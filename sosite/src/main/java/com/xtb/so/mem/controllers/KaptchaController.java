package com.xtb.so.mem.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.tbsowa.common.utils.RegexUtils;
import pers.tbsowa.redis.utils.IRedisUtil;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.xtb.so.common.SiteErrorConstants;
import com.xtb.so.common.SiteUrlConstants;
import com.xtb.so.exceptions.SoSiteException;

@Controller
public class KaptchaController {
	
	@Autowired
	private DefaultKaptcha defaultKaptcha;

	@RequestMapping(value = SiteUrlConstants.SITE_USER_ADDUSER,
			method= RequestMethod.GET,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> getKaptcha(String phone) throws Exception{
		if(StringUtils.isBlank(phone) ||
				!RegexUtils.isMobile(phone)){
			throw new SoSiteException(SiteErrorConstants.SIUS008);
		}
		Map<String,Object> map = new HashMap<String,Object>();
		String kaptcha = defaultKaptcha.createText();
		IRedisUtil.set(phone+kaptcha,kaptcha);
		return map;
	}
}
