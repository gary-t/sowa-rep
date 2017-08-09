package com.xtb.so.mem.rpc.impl;

import com.xtb.api.IUserService;
import com.xtb.api.dto.in.RegUserDto;
import com.xtb.api.dto.in.UpdUserDto;
import com.xtb.api.dto.out.UserAccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xtb.so.mem.rpc.SoUserRpcService;
import pers.tbsowa.common.dto.HandlerInfo;

@Service
public class SoUserRpcServiceImpl implements SoUserRpcService {

    @Autowired
    private IUserService iUserService;

    public boolean addUser(RegUserDto regUserDto) throws Exception{
        return iUserService.addUser(regUserDto);
    }

    public boolean updUser(UpdUserDto updUserDto, HandlerInfo handlerInfo) throws Exception{
        return iUserService.updUser(updUserDto,handlerInfo);
    }

    public UserAccountDto findUserByAccount(String account) throws Exception{
        return iUserService.findUserByAccount(account);
    }

}
