package org.jsponetoone_bi.controller;

import org.jsponetoone_bi.dao.Mobile_Os_Dao;
import org.jsponetoone_bi.dto.Mobile;
import org.jsponetoone_bi.dto.Os;

public class Mobile_Os_Contraller {

	public static void main(String[] args) {
		Os os=new Os();
		os.setOid(1004);
		os.setBit(64);
		os.setName("android12");
		
		Mobile mobile=new Mobile();
		mobile.setMid(104);
		mobile.setColor("black");
		mobile.setPrice(4500);
		mobile.setBrand("Asus");
		
		os.setMobile(mobile);//os has mobile
		//mobile.setOs(os);//mobile has os
		
		mobile.setOs(os);
		
		
		
		Mobile_Os_Dao dao=new Mobile_Os_Dao();
		
		////dao.saveOs(os);
		////dao.saveMobile(mobile);
		//dao.saveMobile(mobile);//mobile has os but os does not have mobile
		dao.saveOs(os);//os has mobile but mobile does not has os

	}

}
