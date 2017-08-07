package com.xtb.so.member.persistence.mappers;

import java.util.Map;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xtb.so.member.persistence.entities.SoUser;

@Mapper
public interface SoUserMapper {
	public List<Map<String,Object>> queryRecords(Map<String,Object> map);
	public List<SoUser> queryByEntitys(SoUser entity);
	public SoUser findByPrimaryKey( @Param("userId") String userId);	
	public int countRecords(Map<String,Object> map);
	public void updateRecord(SoUser entity);
	public void insertRecord(SoUser entity);
	public void deleteRecord(SoUser entity); 
	public void deleteRecordByKey( @Param("userId") String userId, @Param("updateUser") String updateUser);
}
