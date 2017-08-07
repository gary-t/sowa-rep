package com.xtb.so.access;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.xtb.api.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public Map<String, Object> findDemo(String name) {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("name", name);
		map.put("age", "10");
		return map;
	}

}
