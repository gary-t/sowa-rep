package com.xtb.so.member.persistence.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SoSequenceMapper {
	public int getNextSeq( @Param("vType") String vType);
}
