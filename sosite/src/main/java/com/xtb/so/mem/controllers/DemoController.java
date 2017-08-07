package com.xtb.so.mem.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtb.so.mem.rpc.DemoRpcService;

@Controller
public class DemoController {
	
	@Autowired
	private DemoRpcService demoRpcService;

	@RequestMapping(value="/findDemo", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> findDemo(@RequestParam String name){
		return demoRpcService.findDemo(name);
	}
}
