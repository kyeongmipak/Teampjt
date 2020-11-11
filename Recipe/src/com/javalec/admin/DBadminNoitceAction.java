package com.javalec.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.javalec.base.ShareVar;

public class DBadminNoitceAction {

	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	
	// field
	int noticeno;
	String noticetitle;
	String noticetime;
	String noticetext;
	String noticeUpdatetime;
	
	
	
	// constructor
	public DBadminNoitceAction() {
		// TODO Auto-generated constructor stub
	}

	

	public DBadminNoitceAction(int noticeno) {
		super();
		this.noticeno = noticeno;
	}


	public DBadminNoitceAction(String noticetitle, String noticetext) {
		super();
		this.noticetitle = noticetitle;
		this.noticetext = noticetext;
	}
	
	
	
	
	// method
	
	//-------------------------------------
	// 공지사항 목록 전체 검색
	public ArrayList<BeanAdminNotice> noticeList() {
		ArrayList<BeanAdminNotice> beanList = new ArrayList<BeanAdminNotice>();
		
        String WhereDefault = "select noticeno, noticetitle, noticetime, noticeupdatedate from notice ";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            Statement stmt_mysql = conn_mysql.createStatement();

            ResultSet rs = stmt_mysql.executeQuery(WhereDefault);

            while(rs.next()){
               int wkNoticeno = rs.getInt(1);
               String wkNoticetitle = rs.getString(2);
               String wkNoticetime = rs.getString(3);
               String wkNoticeUpdatetime = rs.getString(4);
            	
               // Bean class에서 생성자 생성하여 bean에 한번에 저장되게한다.
               BeanAdminNotice bean = new BeanAdminNotice(wkNoticeno, wkNoticetitle, wkNoticetime, wkNoticeUpdatetime);
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
	// 공지사항 작성
	public boolean noticeInsertAction() {
	     PreparedStatement ps = null;
	      
	      try{
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	          @SuppressWarnings("unused")
				Statement stmt_mysql = conn_mysql.createStatement();

	          String A = "insert into notice (noticetitle, noticetext, noticetime, userinfo_userno";
	          String B = ") values (?,?,now(),1)";

	          ps = conn_mysql.prepareStatement(A+B);
	          ps.setString(1, noticetitle);
	          ps.setString(2, noticetext);
	          ps.executeUpdate();

	           conn_mysql.close();
	           
	      } catch (Exception e){
	    	  System.out.println(e);
	    	  // 오류
	          return false;
	    	 
	      }
	      
	       return true;
		
	}
	
	
	//-------------------------------------
	// 공지사항 table click
	public BeanAdminNotice noticeTableClick() {
		// bean 을 쓸꺼라고 명시해주는 역할
		BeanAdminNotice bean = null;
		
	    String WhereDefault = "select noticeno, noticetitle, noticetime, noticetext, noticeupdatedate from notice "; 
	    // field에 seqno 선언해서 공통으로 쓸수 있다.
	    String WhereDefault2 = "where noticeno = " + noticeno ;
	    
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	        Statement stmt_mysql = conn_mysql.createStatement();
	
	        ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2);
	
	        while(rs.next()){
	         int wkNoticeno = rs.getInt(1);
	         String wkNoticeTitle = rs.getString(2);
	         String wkNoticeTime = rs.getString(3);
	         String wkNoticeText = rs.getString(4);
	         String wkNoticeUpdateTime = rs.getString(4);
	         
	         bean = new BeanAdminNotice(wkNoticeno, wkNoticeTitle, wkNoticeTime, wkNoticeText, wkNoticeUpdateTime);
	         
	       }
	        conn_mysql.close();
	     }
	      catch (Exception e){
	          e.printStackTrace();
	      }
	    
	    return bean;
	}
	
	//-------------------------------------
	// 공지사항 table click 삭제
	public boolean noticeDeleteAction(int num) {
        PreparedStatement ps = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            @SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();

            String A = "delete from notice where noticeno = " + num;

            ps = conn_mysql.prepareStatement(A);
            
            ps.executeUpdate();

            conn_mysql.close();
        } catch (Exception e){
        	return false;
        }
        return true;             				
	
	}
	
	
	//-------------------------------------
	// 공지사항 table click 수정
	public boolean noticeUpdateAction(int num,String title, String text) {
		PreparedStatement ps = null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			@SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();
			
            String A = "update notice set noticetitle = ?, noticetext = ?, noticeupdatedate = now() ";
            String B = " where noticeno = " + num;

            
			
			ps = conn_mysql.prepareStatement(A+B);
			ps.setString(1, title);
			ps.setString(2, text);
			ps.executeUpdate();
			
			conn_mysql.close();
			
		} catch (Exception e){
			// 오류
			return false;
			
		}
		
		return true;
	}
	
	
		//-------------------------------------
		// 공지사항 table 조건 검색
		public ArrayList<BeanAdminNotice> selectSearch(String columnName, String search) {
			ArrayList<BeanAdminNotice> beanList = new ArrayList<BeanAdminNotice>();
			
			String WhereDefault = "select noticeno, noticetitle, noticetime, noticeupdatedate from notice where " + columnName;
	        String WhereDefault2 = " like '%" + search + "%'";
	        
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();

	            ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2);

	            while(rs.next()){
	            	int wknoticeNo = rs.getInt(1);
			         String wknoticeTitle = rs.getString(2);
			         String wknoticeTime = rs.getString(3);
			         String wknoticeUpdateTime = rs.getString(4);
	            	
	               // Bean class에서 생성자 생성하여 bean에 한번에 저장되게한다.
	               BeanAdminNotice bean = new BeanAdminNotice(wknoticeNo, wknoticeTitle, wknoticeTime, wknoticeUpdateTime);
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
		
	
	
}
