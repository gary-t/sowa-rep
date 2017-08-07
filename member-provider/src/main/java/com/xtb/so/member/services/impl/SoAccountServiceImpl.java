package com.xtb.so.member.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.tbsowa.common.dto.SimplePage;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xtb.so.member.persistence.entities.SoAccount;
import com.xtb.so.member.persistence.mappers.SoAccountMapper;
import com.xtb.so.member.services.SoAccountService;

@Service
public class SoAccountServiceImpl implements SoAccountService {
	@Autowired
	private SoAccountMapper _SoAccountMapper;
	
	public SoAccountMapper getMapper(){
		return _SoAccountMapper;
	}
	
	/**
	 * 查询
	 */
	public List<Map<String, Object>> queryRecords(Map<String, Object> map){
		return _SoAccountMapper.queryRecords(map);
	}
	
	/**
	 * 分页查询
	 */
	public Page<Map<String, Object>> queryRecords(Map<String, Object> map, SimplePage simplePage){
		PageHelper.startPage(simplePage.getPageNum(), simplePage.getPageSize(), simplePage.getCount()); 
		return (Page<Map<String, Object>>) _SoAccountMapper.queryRecords(map);
	}
	
	/**
	 * 根据对象查询
	 */
	public List<SoAccount> queryByEntitys(SoAccount soaccount){
		return _SoAccountMapper.queryByEntitys(soaccount);
	}
	
	/**
	 * 根据主键获取数据
	 */
	public SoAccount findByPrimaryKey(String accountId){
		return _SoAccountMapper.findByPrimaryKey(accountId);	
	}
	
	/**
	 * 根据条件查询记录条数
	 */
	public int countRecords(Map<String, Object> map){
		return _SoAccountMapper.countRecords(map);
	}
	
	/**
	 * 修改
	 */
	public void updateRecord(SoAccount soaccount) throws Exception {
		if ( soaccount.getAccountId() == null  ) {
			throw new Exception("accountId 为空，不能修改 ");
		}
		_SoAccountMapper.updateRecord(soaccount);
	}
	
	/**
	 * 逻辑删除 valid修改为0
	 */
	public void deleteRecord(SoAccount soaccount) throws Exception {
		_SoAccountMapper.deleteRecord(soaccount);
	}
	
	/**
	 * 逻辑删除 valid修改为0
	 */
	public void deleteRecordByKey(String accountId  , String deleteUser) throws Exception {
		if (  accountId == null ) {
			throw new Exception("accountId 为空，不能删除 ");
		}
		_SoAccountMapper.deleteRecordByKey(accountId , deleteUser);
	}
	
	/**
	 * 新增
	 */
	public void insertRecord(SoAccount soaccount){
		_SoAccountMapper.insertRecord(soaccount);
	}
	
}
