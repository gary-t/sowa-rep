package com.xtb.so.member.services;

public interface SoSequenceService {

	/**
	 * 获取下一个序号
	 * @param vType
	 * @return
	 */
	public int getNextSeq(String vType);
}
