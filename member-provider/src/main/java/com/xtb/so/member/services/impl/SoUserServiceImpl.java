package com.xtb.so.member.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.tbsowa.common.dto.HandlerInfo;
import pers.tbsowa.common.dto.SimplePage;
import pers.tbsowa.common.utils.DateUtils;
import pers.tbsowa.common.utils.KeyGeneratorUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xtb.api.dto.in.RegUserDto;
import com.xtb.api.dto.in.UpdUserDto;
import com.xtb.so.common.SoConstants;
import com.xtb.so.member.persistence.entities.SoAccount;
import com.xtb.so.member.persistence.entities.SoUser;
import com.xtb.so.member.persistence.mappers.SoUserMapper;
import com.xtb.so.member.services.SoAccountService;
import com.xtb.so.member.services.SoUserService;

@Service
public class SoUserServiceImpl implements SoUserService {
	
	@Autowired
	private SoAccountService soAccountService;
	
	@Autowired
	private SoUserMapper _SoUserMapper;
	
	public SoUserMapper getMapper(){
		return _SoUserMapper;
	}
	
	/**
	 * 查询
	 */
	public List<Map<String, Object>> queryRecords(Map<String, Object> map){
		return _SoUserMapper.queryRecords(map);
	}
	
	/**
	 * 分页查询
	 */
	public Page<Map<String, Object>> queryRecords(Map<String, Object> map, SimplePage simplePage){
		PageHelper.startPage(simplePage.getPageNum(), simplePage.getPageSize(), simplePage.getCount()); 
		return (Page<Map<String, Object>>) _SoUserMapper.queryRecords(map);
	}
	
	/**
	 * 根据对象查询
	 */
	public List<SoUser> queryByEntitys(SoUser souser){
		return _SoUserMapper.queryByEntitys(souser);
	}
	
	/**
	 * 根据主键获取数据
	 */
	public SoUser findByPrimaryKey(String userId){
		return _SoUserMapper.findByPrimaryKey(userId);	
	}
	
	/**
	 * 根据条件查询记录条数
	 */
	public int countRecords(Map<String, Object> map){
		return _SoUserMapper.countRecords(map);
	}
	
	/**
	 * 修改
	 */
	public void updateRecord(SoUser souser) throws Exception {
		if ( souser.getUserId() == null  ) {
			throw new Exception("userId 为空，不能修改 ");
		}
		_SoUserMapper.updateRecord(souser);
	}
	
	/**
	 * 逻辑删除 valid修改为0
	 */
	public void deleteRecord(SoUser souser) throws Exception {
		_SoUserMapper.deleteRecord(souser);
	}
	
	/**
	 * 逻辑删除 valid修改为0
	 */
	public void deleteRecordByKey(String userId  , String deleteUser) throws Exception {
		if (  userId == null ) {
			throw new Exception("userId 为空，不能删除 ");
		}
		_SoUserMapper.deleteRecordByKey(userId , deleteUser);
	}
	
	/**
	 * 新增
	 */
	public void insertRecord(SoUser souser){
		_SoUserMapper.insertRecord(souser);
	}
	
	/*****************************************************************************************/
	
	@Override
	@Transactional(rollbackFor=Exception.class)
	public boolean addUser(RegUserDto regUserDto) throws Exception{
		String userId = KeyGeneratorUtils.getUuid();
		// TODO
		String userCode = "";
		// 1.生成账号
		createAccount(regUserDto,userId,userCode);
		// 2.添加用户信息
		addSoUser(regUserDto,userId,userCode);
		return true;
	}
	
	private void createAccount(RegUserDto regUserDto,String userId,String userCode) throws Exception{
		// 1.生成系统账号
		addSoAccount(userCode,SoConstants.SO_ACCOUNTTYPE_SYS,userId);
		// 2.生成注册账号
		addSoAccount(regUserDto.getAccount(),regUserDto.getAccountType(),userId);
	}
	
	private void addSoAccount(String account,String accountType,String userId) throws Exception{
		SoAccount soaccount = new SoAccount();
		soaccount.setAccountId(KeyGeneratorUtils.getUuid());
		soaccount.setAccount(account);
		soaccount.setAccountType(accountType);
		soaccount.setUserId(userId);
		soaccount.setCreateUser(userId);
		soaccount.setCreateDate(DateUtils.sysDate());
		soaccount.setUpdateUser(userId);
		soaccount.setUpdateDate(DateUtils.sysDate());
		soAccountService.insertRecord(soaccount);
	}
	
	private void addSoUser(RegUserDto regUserDto,String userId,String userCode) throws Exception{
		SoUser souser = new SoUser();
		souser.setUserId(userId);
		souser.setUserCode(userCode);
		souser.setUserPassword(regUserDto.getUserPassword());
		souser.setUserStatus(SoConstants.SO_USERSTATUS_00);
		if(SoConstants.SO_ACCOUNTTYPE_MOBILE.equals(regUserDto.getAccountType())){
			souser.setMobile(regUserDto.getAccount());
		}else if(SoConstants.SO_ACCOUNTTYPE_EMAIL.equals(regUserDto.getAccountType())){
			souser.setEmail(regUserDto.getAccount());
		}
		souser.setCreateUser(userId);
		souser.setCreateDate(DateUtils.sysDate());
		souser.setUpdateUser(userId);
		souser.setUpdateDate(DateUtils.sysDate());
		this.insertRecord(souser);
	}
	
	@Override
	public boolean updUser(UpdUserDto updUserDto,HandlerInfo handlerInfo) throws Exception{
		SoUser souser = new SoUser();
		BeanUtils.copyProperties(updUserDto, souser);
		souser.setUpdateUser(handlerInfo.getHandlerId());
		souser.setUpdateDate(DateUtils.sysDate());
		this.updateRecord(souser);
		return false;
	}
}
