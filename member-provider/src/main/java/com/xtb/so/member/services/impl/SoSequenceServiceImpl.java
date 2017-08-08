package com.xtb.so.member.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xtb.so.member.persistence.mappers.SoSequenceMapper;
import com.xtb.so.member.services.SoSequenceService;

@Service
public class SoSequenceServiceImpl implements SoSequenceService {

	@Autowired
	private SoSequenceMapper soSequenceMapper;
	
	@Override
	public int getNextSeq(String vType) {
		return soSequenceMapper.getNextSeq(vType);
	}

}
