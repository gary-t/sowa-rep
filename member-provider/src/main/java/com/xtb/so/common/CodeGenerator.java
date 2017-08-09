package com.xtb.so.common;

public class CodeGenerator {

	private static final	String[] prefix = {"u","a","b","c","d","e","f","g"};

	public static String userCode(int num){
		String seq = String.format("%08d", num);
        int index = 0;
        if(seq.length() > 8){
            index = seq.length()-8;
            seq = seq.substring(seq.length()-8,seq.length());
		}
        return String.format("%s%s",prefix[index],seq);
	}
	
}
