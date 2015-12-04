package com.fccs.data.frame.spring;

import com.mchange.v2.c3p0.PoolBackedDataSource;
import com.wabacus.config.Config;

public class DataSourceFactory {

	public static PoolBackedDataSource createDataSource(){
		return (PoolBackedDataSource) Config.getInstance().getDataSource("ds_mysql").getDataSource();
	}
	
}
