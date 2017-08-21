package com.xtb.so.mem.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.tbsowa.common.dto.ResultDTO;
import pers.tbsowa.common.utils.KeyGeneratorUtils;
import pers.tbsowa.redis.utils.IRedisUtil;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.xtb.so.common.SiteConstants;
import com.xtb.so.common.SiteErrorConstants;
import com.xtb.so.common.SiteUrlConstants;
import com.xtb.so.exceptions.SoSiteException;
import com.xtb.so.mem.vo.SmsCodeVo;
import com.xtb.so.utils.RandUtils;

@Controller
public class KaptchaController {
	
	@Autowired
	private DefaultKaptcha defaultKaptcha;

	@RequestMapping(value = SiteUrlConstants.SITE_USER_KAPTCHA,
			method= RequestMethod.GET,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ResultDTO<Map<String,Object>> getKaptcha(HttpServletRequest request) throws Exception{
		ResultDTO<Map<String,Object>> resultDto = new ResultDTO<Map<String,Object>>();
//		byte[] captchaChallengeAsJpeg = null;  
		ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
		Map<String,Object> map = new HashMap<String,Object>();
//		HttpSession session = request.getSession();
		String kaptcha = defaultKaptcha.createText();
		String key = SiteConstants.KAPTCHA_PREFIX + KeyGeneratorUtils.getUuid();
		IRedisUtil.set(key , kaptcha, 5, TimeUnit.MINUTES);
//		session.setAttribute("identifyingCode", kaptcha);
		//使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中  
		BufferedImage bufferedImage = defaultKaptcha.createImage(kaptcha);
		ImageIO.write(bufferedImage, "jpg", jpegOutputStream);
		
		//定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组  
		byte[] captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        
/*        response.setHeader("Cache-Control", "no-store");    
        response.setHeader("Pragma", "no-cache");    
        response.setDateHeader("Expires", 0);    
        response.setContentType("image/jpeg");    
        ServletOutputStream responseOutputStream =    
                response.getOutputStream();    
        responseOutputStream.write(captchaChallengeAsJpeg);    
        responseOutputStream.flush();    
        responseOutputStream.close();   */ 
		map.put("identifyCode", new Base64().encodeAsString(captchaChallengeAsJpeg));
		map.put("identifyKey", key);
		resultDto.setData(map);
		return resultDto;
	}
	
	@RequestMapping(value = SiteUrlConstants.SITE_USER_GETSMSCODE,
			method= RequestMethod.POST,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ResultDTO<Map<String,Object>> getSmsCode(HttpServletRequest request,SmsCodeVo smsCodeVo) throws Exception{
		if(StringUtils.isBlank(smsCodeVo.getMobile())){
			throw new SoSiteException(SiteErrorConstants.SIUS010);
		}
		if(StringUtils.isBlank(smsCodeVo.getKaptchaCode())){
			throw new SoSiteException(SiteErrorConstants.SIUS009);
		}
		if(StringUtils.isBlank(smsCodeVo.getKaptchaKey())){
			throw new SoSiteException(SiteErrorConstants.SIUS009);
		} else{
			try{
				String code = IRedisUtil.get(smsCodeVo.getKaptchaKey());
				if(smsCodeVo.getKaptchaCode().equals(code)){
					//移除验证码
					IRedisUtil.delete(smsCodeVo.getKaptchaKey());
				}else{
					throw new SoSiteException(SiteErrorConstants.SIUS009);
				}
			} catch(Exception e){
				throw new SoSiteException(SiteErrorConstants.SIUS009);
			}
		}
		
		ResultDTO<Map<String,Object>> resultDto = new ResultDTO<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String,Object>();
		//1.生成验证码
		String code = RandUtils.getRandNumber(6);
		//2.存储redis,设置过期时间5分钟
		IRedisUtil.set(smsCodeVo.getMobile(), code, 5, TimeUnit.MINUTES);
		//TODO 3.发送短信
		map.put("smsCode", code);
		resultDto.setData(map);
		return resultDto;
	}
}
