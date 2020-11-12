package com.javalec.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	String userstate;
	String userinsertdate;
	String userdeletedate;
	String userpostnum;
	String userlikenum;
	String useremail;
	
	
	
	// constructor
	public DBadminUserAction() {
		// TODO Auto-generated constructor stub
	
	}
	
	


	public DBadminUserAction(int userno) {
		super();
		this.userno = userno;
	}



	// method
	
	//-------------------------------------
	// 회원 목록 전체 검색
	public ArrayList<BeanAdminUser> userList() {
		ArrayList<BeanAdminUser> beanList = new ArrayList<BeanAdminUser>();
		
        String WhereDefault = "select userno, userid, username, userstate, userinsertdate, userdeletedate, count(postno), useremail ";
        String WhereDefault2 = "from userinfo left outer join post on userinfo_userno =userno and postdeletedate is null group by userno order by userno";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            Statement stmt_mysql = conn_mysql.createStatement();

            ResultSet rs = stmt_mysql.executeQuery(WhereDefault+WhereDefault2);

            while(rs.next()){
            	int wkUserno = rs.getInt(1);
            	String wkUserid = rs.getString(2);
            	String wkUsername = rs.getString(3);
               String wkUserstate = rs.getString(4);
               String wkUserinsertdate = rs.getString(5);
               String wkUserdeletedate = rs.getString(6);
               String wkUserpostnum = rs.getString(7);
               String wkUseremail = rs.getString(8);
               // Bean class에서 생성자 생성하여 bean에 한번에 저장되게한다.
               BeanAdminUser bean = new BeanAdminUser(wkUserno, wkUserid, wkUsername, wkUserstate, wkUserinsertdate, wkUserdeletedate, wkUserpostnum, wkUseremail);
               // beanlist에 bean 을 추가한다.
               beanList.add(bean);
            }
            conn_mysql.close();
        }
        catch (Exception e){
        	System.out.println(e);
            e.printStackTrace();
        }
		
        return beanList;
		
		
	}
	
	
	
	//-------------------------------------
	// 회원 table click
	public BeanAdminUser userTableClick() {
		// bean 을 쓸꺼라고 명시해주는 역할
		BeanAdminUser bean = null;
		String wkUserpostnum = "0";
        String WhereDefault = "select userno, userid, username, userstate, userinsertdate, userdeletedate, count(postno), useremail";
        String WhereDefault2 = " from userinfo left outer join post on userinfo_userno = userno where userno = "+ userno ;
	    String WhereDefault3 = " group by userno order by userno";
	   
	    
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	        Statement stmt_mysql = conn_mysql.createStatement();
	
	        ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2 + WhereDefault3);
	
	        while(rs.next()){
            	int wkUserno = rs.getInt(1);
            	String wkUserid = rs.getString(2);
            	String wkUsername = rs.getString(3);
               String wkUserstate = rs.getString(4);
               String wkUserinsertdate = rs.getString(5);
               String wkUserdeletedate = rs.getString(6);
               wkUserpostnum=rs.getString(7);           	   
               String wkUseremail = rs.getString(8);
	         
               bean = new BeanAdminUser(wkUserno, wkUserid, wkUsername, wkUserstate, wkUserinsertdate, wkUserdeletedate, wkUserpostnum, wkUseremail);
               // beanlist에 bean 을 추가한다.
               
	       }
	        conn_mysql.close();
	     }
	      catch (Exception e){
	    	  System.out.println(e);
	          e.printStackTrace();
	      }
	    
	    return bean;
	}
	
	
	
	//-------------------------------------
	// 회원 table 조건 검색
	public ArrayList<BeanAdminUser> selectSearch(String columnName, String search) {
		ArrayList<BeanAdminUser> beanList = new ArrayList<BeanAdminUser>();
		
        String WhereDefault = "select userno, userid, username, userstate, userinsertdate, userdeletedate, (select count(postno) from post where userno = userinfo_userno and postdeletedate is null group by userno), useremail";
        String WhereDefault2 = " from userinfo left outer join post on userinfo_userno = userno where " + columnName + " like '%"+ search + "%'";
	    String WhereDefault3 = " group by userno order by userno";

	    try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            Statement stmt_mysql = conn_mysql.createStatement();

	        ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2 + WhereDefault3);
	    	
	        while(rs.next()){
            	int wkUserno = rs.getInt(1);
            	String wkUserid = rs.getString(2);
            	String wkUsername = rs.getString(3);
               String wkUserstate = rs.getString(4);
               String wkUserinsertdate = rs.getString(5);
               String wkUserdeletedate = rs.getString(6);
               String wkUserpostnum = rs.getString(7);
               String wkUseremail = rs.getString(8);
	         
            	
               // Bean class에서 생성자 생성하여 bean에 한번에 저장되게한다.
               BeanAdminUser bean = new BeanAdminUser(wkUserno, wkUserid, wkUsername, wkUserstate, wkUserinsertdate, wkUserdeletedate, wkUserpostnum, wkUseremail);
               // beanlist에 bean 을 추가한다.
               beanList.add(bean);
            }
            conn_mysql.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
		
        return beanList;
		
	}
	
	
	//-------------------------------------
	// 회원별 작성된 게시글 like 받은 합계
	public String userLikeSum() {
		
		String wkLikesum = "";
        String WhereDefault = "select sum((select sum(likecheck) from liketable where postno = post_postno group by postno))";
        String WhereDefault2 = " from post where userinfo_userno = "+ userno ;
	   
	    
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	        Statement stmt_mysql = conn_mysql.createStatement();
	
	        ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2);
	
	        while(rs.next()){
	        	
              wkLikesum = rs.getString(1);
	         
	       }
	        if(wkLikesum == null) {
	        	wkLikesum="0";
	        }
	        conn_mysql.close();
	     }
	      catch (Exception e){
	    	  System.out.println(e);
	          e.printStackTrace();
	      }
	    
	    return wkLikesum;
	}
	
	
	
}
