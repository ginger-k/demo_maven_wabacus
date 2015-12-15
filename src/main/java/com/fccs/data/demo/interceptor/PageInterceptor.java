package com.fccs.data.demo.interceptor;



import com.wabacus.config.component.application.report.ReportBean;
import com.wabacus.system.ReportRequest;
import com.wabacus.system.intercept.AbsPageInterceptor;

/*
 * 不知道为什么，page的interceptor不管用
 */
public class PageInterceptor extends AbsPageInterceptor {
	
	public void doStart(ReportRequest rrequest, ReportBean report) {
		String pageid=rrequest.getPagebean().getId();//
		System.out.println(" --- PageInterceptor --" + pageid);
	}
	

}
