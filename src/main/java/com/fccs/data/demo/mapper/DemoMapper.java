package com.fccs.data.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.common.Mapper;

import com.fccs.data.demo.pojo.Demo;


@Repository
public interface DemoMapper extends Mapper<Demo> {
	
	List<Demo> getDemos();

}
