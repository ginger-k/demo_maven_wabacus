package com.fccs.data.wabacus;


import com.wabacus.system.*;
import com.wabacus.system.intercept.AbsPageInterceptor;



public class GlobalInterceptor extends AbsPageInterceptor {
	
	public void doStart(ReportRequest rrequest) {
		//搜索框未输入时为null，否则为输入内容
		System.out.println("----before-----" + rrequest.getAttribute("txtname") + "---");
	}

	public void doEnd(ReportRequest rrequest) {
		//搜索框未输入时为 ""，否则为输入内容
		System.out.println("----end-----" + rrequest.getAttribute("txtname") + "---");
	}




}
