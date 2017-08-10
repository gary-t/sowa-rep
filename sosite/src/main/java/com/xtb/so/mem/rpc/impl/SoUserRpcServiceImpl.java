package com.xtb.so.mem.rpc.impl;

import com.xtb.api.UserService;
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
    private UserService userService;

    public boolean addUser(RegUserDto regUserDto) throws Exception{
        return userService.addUser(regUserDto);
    }

    public boolean updUser(UpdUserDto updUserDto, HandlerInfo handlerInfo) throws Exception{
        return userService.updUser(updUserDto,handlerInfo);
    }

    public UserAccountDto findUserByAccount(String account) throws Exception{
        return userService.findUserByAccount(account);
    }

}
