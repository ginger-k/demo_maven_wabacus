package com.fccs.data.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fccs.data.demo.mapper.DemoMapper;
import com.fccs.data.demo.pojo.Demo;
import com.fccs.data.frame.service.BaseService;

@Service
public class DemoService extends BaseService<Demo>{
	
	@Autowired
	private DemoMapper demoMapper;
	
	public List<Demo> getDemos() {
		return demoMapper.getDemos();
	}

}
