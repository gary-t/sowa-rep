package com.xtb.so.mem.rpc;


import com.xtb.api.dto.in.RegUserDto;
import com.xtb.api.dto.in.UpdUserDto;
import com.xtb.api.dto.out.UserAccountDto;
import pers.tbsowa.common.dto.HandlerInfo;

public interface SoUserRpcService {

    public boolean addUser(RegUserDto regUserDto) throws Exception;

    public boolean updUser(UpdUserDto updUserDto, HandlerInfo handlerInfo) throws Exception;

    public UserAccountDto findUserByAccount(String account) throws Exception;

}
