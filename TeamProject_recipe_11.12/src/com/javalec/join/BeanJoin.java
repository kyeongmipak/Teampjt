package com.javalec.join;

//import com.javalec.base.ShareVar;

public class BeanJoin {

//	public static final String id_mysql = ShareVar.idUser;
//    public static final String pw_mysql = ShareVar.pwUser;
    
	// field
	int userno;
	String userid;
	String userpw;
	String username;
	String useremail;
	String userstate;
	
	// constructor
	public BeanJoin() {
		
	}




	
	
	// method
	


	public int getUserno() {
		return userno;
	}
	
	public BeanJoin(String userid) {
		super();
		this.userid = userid;
	}
	
	


	public BeanJoin(String userid, String userpw, String username, String useremail) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.useremail = useremail;
	}


	public String getUseremail() {
		return useremail;
	}


	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	public String getUserstate() {
		return userstate;
	}


	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}


	public void setUserno(int userno) {
		this.userno = userno;
	}
	
	
	public String getUserid() {
		return userid;
	}
	
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	public String getUserpw() {
		return userpw;
	}
	
	
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	
	public String getUsername() {
		return username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
	
}

