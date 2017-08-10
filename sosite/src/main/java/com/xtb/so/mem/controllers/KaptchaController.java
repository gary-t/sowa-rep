package com.xtb.so.mem.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.xtb.so.common.SiteUrlConstants;

@Controller
public class KaptchaController {
	
	@Autowired
	private DefaultKaptcha defaultKaptcha;

	@RequestMapping(value = SiteUrlConstants.SITE_USER_KAPTCHA,
			method= RequestMethod.GET,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void getKaptcha(HttpServletRequest request,HttpServletResponse response) throws Exception{
//		ResultDTO<Map<String,Object>> resultDto = new ResultDTO<Map<String,Object>>();
		byte[] captchaChallengeAsJpeg = null;  
		ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
//		Map<String,Object> map = new HashMap<String,Object>();
		HttpSession session = request.getSession();
		String kaptcha = defaultKaptcha.createText();
		session.setAttribute("identifyingCode", kaptcha);
		//使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中  
		BufferedImage bufferedImage = defaultKaptcha.createImage(kaptcha);
		ImageIO.write(bufferedImage, "jpg", jpegOutputStream);
		
		//定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组  
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        
        response.setHeader("Cache-Control", "no-store");    
        response.setHeader("Pragma", "no-cache");    
        response.setDateHeader("Expires", 0);    
        response.setContentType("image/jpeg");    
        ServletOutputStream responseOutputStream =    
                response.getOutputStream();    
        responseOutputStream.write(captchaChallengeAsJpeg);    
        responseOutputStream.flush();    
        responseOutputStream.close();    
//		map.put("identifyingCode", kaptcha);
//		resultDto.setData(map);
//		return resultDto;
	}
}
