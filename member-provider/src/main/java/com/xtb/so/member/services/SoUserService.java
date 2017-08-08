package com.xtb.so.member.services;

import com.github.pagehelper.Page;
import com.xtb.api.dto.in.RegUserDto;
import com.xtb.api.dto.in.UpdUserDto;
import com.xtb.api.dto.out.UserAccountDto;
import com.xtb.so.member.persistence.entities.SoUser;
import com.xtb.so.member.persistence.mappers.SoUserMapper;
import pers.tbsowa.common.dto.HandlerInfo;
import pers.tbsowa.common.dto.SimplePage;

import java.util.List;
import java.util.Map;

public interface SoUserService {
	
	public abstract SoUserMapper getMapper();
	
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
	public abstract List<SoUser> queryByEntitys(SoUser souser);
	
	/**
	 * 根据主键获取数据
	 */
	public abstract SoUser findByPrimaryKey(String userId);
	
	/**
	 * 根据条件查询记录条数
	 */
	public abstract int countRecords(Map<String, Object> map); 
 
	/**
	 * 修改
	 */
	public abstract void updateRecord(SoUser souser) throws Exception;
	
	/**
	 * 逻辑删除 valid修改为0
	 */
	public abstract void deleteRecord(SoUser souser) throws Exception;
	
	/**
	 * 逻辑删除 valid修改为0
	 */
	public abstract void deleteRecordByKey(String userId , String deleteUser) throws Exception;
	
	/**
	 * 新增
	 */
	public abstract void insertRecord(SoUser souser);
	
	/**********************************************************************************************/

	/**
	 * 注册用户
	 * @param regUserDto
	 * @return
	 * @throws Exception
	 */
	public boolean addUser(RegUserDto regUserDto) throws Exception;
	
	/**
	 * 修改用户信息
	 * @param updUserDto
	 * @param handlerInfo
	 * @return
	 * @throws Exception
	 */
	public boolean updUser(UpdUserDto updUserDto,HandlerInfo handlerInfo) throws Exception;

	/**
	 * 通过账号获取用户信息
	 * @param account
     */
	public void findUserByAccount(String account);

	/**
	 * 获取用户账号信息
	 * @param account
	 * @return
	 */
	public UserAccountDto findUserAccount(String account) throws Exception;
}
