package com.xtb.so.common;

import java.text.SimpleDateFormat;

public class CodeGenerator {

	public static void main(String[] args){
		System.out.println(frontCompWithZore(5));
		System.out.println(frontCompWithZore(15));
		System.out.println(frontCompWithZore(115));
		System.out.println(frontCompWithZore(1115));
		System.out.println(frontCompWithZore(11115));
	}
	
	public String userCode(int num){
		String seq = String.format("%03d", num);
		if(seq.length() > 3){
			seq = seq.substring(0, 3);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss"); 
		return null;
	}
	
	private static String frontCompWithZore(int num){
		return String.format("%03d", num);
	}
}
