package com.xtb.so.member.persistence.mappers;

import java.util.Map;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xtb.so.member.persistence.entities.SoAccount;

@Mapper
public interface SoAccountMapper {
	public List<Map<String,Object>> queryRecords(Map<String,Object> map);
	public List<SoAccount> queryByEntitys(SoAccount entity);
	public SoAccount findByPrimaryKey( @Param("accountId") String accountId);	
	public int countRecords(Map<String,Object> map);
	public void updateRecord(SoAccount entity);
	public void insertRecord(SoAccount entity);
	public void deleteRecord(SoAccount entity); 
	public void deleteRecordByKey( @Param("accountId") String accountId, @Param("updateUser") String updateUser);
}
