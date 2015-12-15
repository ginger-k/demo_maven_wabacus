package com.fccs.data.demo.interceptor;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.wabacus.config.component.application.report.ColBean;
import com.wabacus.config.component.application.report.ReportBean;
import com.wabacus.system.ReportRequest;
import com.wabacus.system.intercept.AbsInterceptorDefaultAdapter;

public class ReportInterceptor extends AbsInterceptorDefaultAdapter {
	
	@Override
	public void doStart(ReportRequest rrequest, ReportBean report) {
		String pageid = rrequest.getPagebean().getId();
		System.out.println(" -- pageid : " + pageid);
		
		//搜索框未输入时为 ""，否则为输入内容
		System.out.println("----DemoInterceptor-----" + rrequest.getAttribute("txtname"));
		
		rrequest.getRequest().setAttribute("titleName", "request放入的标题");
	}
	
	@Override
	public Object afterLoadData(ReportRequest rrequest,ReportBean rbean,Object typeObj,Object dataObj) {
		List<ColBean> columns = rbean.getDbean().getLstCols();
		int size = rrequest.getReportDataListSize("report1");
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (int i =0; i < size; i++) {
			if (columns != null) {
				Map<String, Object> map = new HashMap<String, Object>();
				for (ColBean colBean : columns) {
					String columnName = colBean.getColumn();
					map.put(columnName, rrequest.getColDisplayValue("report1", columnName, i));
				}
				list.add(map);
			}
		}
		for (Map<String, Object> map : list) {
			for (Entry<String, Object> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " -- " + entry.getValue());
			}
		}
		rrequest.getRequest().setAttribute("size", list.size());
		return dataObj;
	}
	

}
