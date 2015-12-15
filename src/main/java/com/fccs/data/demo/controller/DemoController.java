package com.fccs.data.demo.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fccs.data.demo.pojo.Demo;
import com.fccs.data.demo.service.DemoService;
import com.fccs.data.frame.util.DbUtil;

/*
 * test
 */
@Controller
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value="/demo/jsp")
	public String jsp(){
		System.out.println("controller demo --- --- ");
		return "demo/demo";
	}
	
	
	@RequestMapping(value="/demo/dbutil")
	@ResponseBody
	public List<Map<String, Object>> dbutil() throws SQLException{
		System.out.println("controller demo dbutil --- --- ");
		String sql = "select user_name name,user_password password from visual_user";
		return DbUtil.getMapList(sql);
	}
	
	@RequestMapping(value="/demo/commonMapper")
	@ResponseBody
	public List<Demo> commonMapper() throws SQLException{
		System.out.println("controller demo common_mapper --- --- ");
		return demoService.selectAll();
	}
	
	@RequestMapping(value="/demo/mybatis")
	@ResponseBody
	public List<Demo> mybatis() throws SQLException{
		System.out.println("controller demo mybatis --- --- ");
		return demoService.getDemos();
	}
	
	

}
