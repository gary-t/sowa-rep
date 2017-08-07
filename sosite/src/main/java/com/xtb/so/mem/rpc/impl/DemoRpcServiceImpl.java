package com.xtb.so.mem.rpc.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xtb.api.DemoService;
import com.xtb.so.mem.rpc.DemoRpcService;

@Service
public class DemoRpcServiceImpl implements DemoRpcService{

	@Autowired
	private DemoService demoService;
	
	@Override
	public Map<String, Object> findDemo(String name){
		return demoService.findDemo(name);
	}
}
