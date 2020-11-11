package com.javalec.admin;

import com.javalec.base.ShareVar;

public class DBadminUserAction {
	
	
	// ShareVar class의 공통 변수 불러와서 private로 사용
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	
	// 내부적으로 사용할 column명 선언
	int userno;
	String userid;
	String username;
	String useremail;
	String userstate;
	String userjoindate;
	String userdeletedate;
	
	
	// constructor
	public DBadminUserAction() {
		// TODO Auto-generated constructor stub
	
	}
	

}
