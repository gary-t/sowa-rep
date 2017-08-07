package com.xtb.so.member.services;

import java.util.List;
import java.util.Map;

import pers.tbsowa.common.dto.SimplePage;

import com.github.pagehelper.Page;
import com.xtb.so.member.persistence.entities.SoAccount;
import com.xtb.so.member.persistence.mappers.SoAccountMapper;

public interface SoAccountService {
	
	public abstract SoAccountMapper getMapper();
	
	/**
	 * 根据map查询
	 */
	public abstract List<Map<String, Object>> queryRecords(Map<String, Object> map);
	
	/**
	 * 分页查询
	 */
	public Page<Map<String, Object>> queryRecords(Map<String, Object> map, SimplePage simplePage);
	
	/**
	 * 根据对象查询
	 */
	public abstract List<SoAccount> queryByEntitys(SoAccount soaccount);
	
	/**
	 * 根据主键获取数据
	 */
	public abstract SoAccount findByPrimaryKey(String accountId);
	
	/**
	 * 根据条件查询记录条数
	 */
	public abstract int countRecords(Map<String, Object> map); 
 
	/**
	 * 修改
	 */
	public abstract void updateRecord(SoAccount soaccount) throws Exception;
	
	/**
	 * 逻辑删除 valid修改为0
	 */
	public abstract void deleteRecord(SoAccount soaccount) throws Exception;
	
	/**
	 * 逻辑删除 valid修改为0
	 */
	public abstract void deleteRecordByKey(String accountId , String deleteUser) throws Exception;
	
	/**
	 * 新增
	 */
	public abstract void insertRecord(SoAccount soaccount);

}
