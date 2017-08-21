package com.xtb.so.utils;

import java.util.Random;

public class RandUtils {

	/**
	 * 获取digit位随机数
	 * @param digit
	 * @return
	 */
	public static String getRandNumber(int digit){
		Random random = new Random();
		String s = String.valueOf(random.nextInt(9));
		for(int i=1;i<digit;i++){
			s += String.valueOf(random.nextInt(9));
		}
		return s;
	}

}
