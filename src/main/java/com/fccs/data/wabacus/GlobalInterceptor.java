package com.fccs.data.wabacus;


import com.wabacus.system.*;
import com.wabacus.system.intercept.AbsPageInterceptor;



public class GlobalInterceptor extends AbsPageInterceptor {
	
	public void doStart(ReportRequest rrequest) {
		System.out.println("----before-----");
	}

	public void doEnd(ReportRequest rrequest) {
		System.out.println("----end-----");
	}




}
