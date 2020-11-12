package com.javalec.admin;

public class BeanAdminUser {
	
	
	// field
	int userno;
	String userid;
	String username;
	String userstate;
	String userinsertdate;
	String userdeletedate;
	String userpostnum;
	String userlikenum;
	String useremail;
	
	
	public BeanAdminUser() {
		// TODO Auto-generated constructor stub
	}

	
	

	public BeanAdminUser(int userno, String userid, String username, String userstate, String userinsertdate,
			String userdeletedate, String userpostnum, String useremail) {
		super();
		this.userno = userno;
		this.userid = userid;
		this.username = username;
		this.userstate = userstate;
		this.userinsertdate = userinsertdate;
		this.userdeletedate = userdeletedate;
		this.userpostnum = userpostnum;
		this.useremail = useremail;
	}




	public int getUserno() {
		return userno;
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


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUserstate() {
		return userstate;
	}


	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}


	public String getUserinsertdate() {
		return userinsertdate;
	}


	public void setUserinsertdate(String userinsertdate) {
		this.userinsertdate = userinsertdate;
	}


	public String getUserdeletedate() {
		return userdeletedate;
	}


	public void setUserdeletedate(String userdeletedate) {
		this.userdeletedate = userdeletedate;
	}


	public String getUserpostnum() {
		return userpostnum;
	}


	public void setUserpostnum(String userpostnum) {
		this.userpostnum = userpostnum;
	}


	public String getUserlikenum() {
		return userlikenum;
	}


	public void setUserlikenum(String userlikenum) {
		this.userlikenum = userlikenum;
	}


	public String getUseremail() {
		return useremail;
	}


	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	
	
	


	
	
	
}
