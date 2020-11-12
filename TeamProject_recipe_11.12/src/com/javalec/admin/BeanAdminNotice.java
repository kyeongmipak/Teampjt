package com.javalec.admin;

public class BeanAdminNotice {

	// field
	int noticeno;
	String noticetitle;
	String noticetime;
	String noticetext;
	String noticeUpdatetime;
	
	// constructor
	public BeanAdminNotice() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public BeanAdminNotice(String noticetitle, String noticetext) {
		super();
		this.noticetitle = noticetitle;
		this.noticetext = noticetext;
	}




	public BeanAdminNotice(int noticeno, String noticetitle, String noticetime) {
		super();
		this.noticeno = noticeno;
		this.noticetitle = noticetitle;
		this.noticetime = noticetime;
	}
	

	public BeanAdminNotice(int noticeno, String noticetitle, String noticetime, String noticeUpdatetime) {
		super();
		this.noticeno = noticeno;
		this.noticetitle = noticetitle;
		this.noticetime = noticetime;
		this.noticeUpdatetime = noticeUpdatetime;
	}

	

	public BeanAdminNotice(int noticeno, String noticetitle, String noticetime, String noticetext,
			String noticeUpdatetime) {
		super();
		this.noticeno = noticeno;
		this.noticetitle = noticetitle;
		this.noticetime = noticetime;
		this.noticetext = noticetext;
		this.noticeUpdatetime = noticeUpdatetime;
	}

	
	public int getNoticeno() {
		return noticeno;
	}

	public void setNoticeno(int noticeno) {
		this.noticeno = noticeno;
	}

	public String getNoticetitle() {
		return noticetitle;
	}

	public void setNoticetitle(String noticetitle) {
		this.noticetitle = noticetitle;
	}

	public String getNoticetime() {
		return noticetime;
	}

	public void setNoticetime(String noticetime) {
		this.noticetime = noticetime;
	}

	public String getNoticetext() {
		return noticetext;
	}

	public void setNoticetext(String noticetext) {
		this.noticetext = noticetext;
	}

	public String getNoticeUpdatetime() {
		return noticeUpdatetime;
	}

	public void setNoticeUpdatetime(String noticeUpdatetime) {
		this.noticeUpdatetime = noticeUpdatetime;
	}


	
	
	
	
}
