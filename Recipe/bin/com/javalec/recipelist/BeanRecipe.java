package com.javalec.recipelist;

public class BeanRecipe {

	
	int postno;
	String userno;
	String title;
	String userid;
	String postinsertdate;
	String like;
	
	
	
	
	// Constructor
	
	public BeanRecipe(int postno, String title, String userid, String postinsertdate) {
		super();
		this.postno = postno;
		this.title = title;
		this.userid = userid;
		this.postinsertdate = postinsertdate;
	}
	
	

	public BeanRecipe(int postno, String title, String userid) {
		super();
		this.postno = postno;
		this.title = title;
		this.userid = userid;
	}







	public int getPostno() {
		return postno;
	}




	public void setPostno(int postno) {
		this.postno = postno;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getUserid() {
		return userid;
	}




	public void setUserid(String userid) {
		this.userid = userid;
	}




	public String getPostinsertdate() {
		return postinsertdate;
	}




	public void setPostinsertdate(String postinsertdate) {
		this.postinsertdate = postinsertdate;
	}
	
	
	
	
	
	// getter setter
	
	
	
	
	
	
}
