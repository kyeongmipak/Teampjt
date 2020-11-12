package com.javalec.recipelist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.function.BeanRecipe;
import com.javalec.function.ShareVar;

public class DbActionRecipe {

	// Field
		private final String url_mysql = ShareVar.url_mysql;
		private final String id_mysql = ShareVar.id_mysql;
		private final String pw_mysql = ShareVar.pw_mysql;
		
		int postno;
		String userno;
		String title;
		String userid;
		String postinsertdate;
		String like;
		String ConditionQueryColumn;
		String str;
		
	// constructor
		
		
		public DbActionRecipe() {
			
		}
		
		
		public DbActionRecipe(int postno, String title, String userid, String postinsertdate) {
			super();
			this.postno = postno;
			this.title = title;
			this.userid = userid;
			this.postinsertdate = postinsertdate;
		}
		
		
		public DbActionRecipe(int postno) {
			super();
			this.postno = postno;
		}
		
		public DbActionRecipe(int postno, String title, String userid) {
			super();
			this.postno = postno;
			this.title = title;
			this.userid = userid;
		}
		
		
		
		
		
	// method
		
	





		// 검색 결과를 Table로 
		public ArrayList<BeanRecipe> SearchAction(){
			
			ArrayList<BeanRecipe> BeanRecipe = new ArrayList<BeanRecipe>();
			
			String A = "select postno, title, userid from post, userinfo ";
			String B = "where postno in (select post_seqno from writetable ";
			String C = "where userinfo_userno = userno)";
	      
			try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();

	            ResultSet rs = stmt_mysql.executeQuery(A+B+C);

	            while(rs.next()){
	            	
	            	int wkpostno = rs.getInt(1);
	            	String wktitle = rs.getString(2);
	            	String wkuserid = rs.getString(3);
//	            	String wkpostinsertdarte = rs.getString(4);
	            	
	            	BeanRecipe bean = new BeanRecipe(wkpostno, wktitle, wkuserid);
	            	BeanRecipe.add(bean);
	            }
	            
	            conn_mysql.close();
	        }
	        catch (Exception e){
	            System.out.println(e);
	        }
			return BeanRecipe;
		}
		


		// 조건 검색
		public ArrayList<BeanRecipe> checkKeword() {
			
			ArrayList<BeanRecipe> beanList = new ArrayList<BeanRecipe>();
			
			 String A = "select seqno, name, telno, relation from userinfo where " + str;
			 String B = " like '%" + ConditionQueryColumn + "%'";
	         
			 	try{
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		            Statement stmt_mysql = conn_mysql.createStatement();

		            ResultSet rs = stmt_mysql.executeQuery(A + B);

		            while(rs.next()){
		            	int wkpostno = rs.getInt(1);
		            	String wktitle = rs.getString(2);
		            	String wkuserid = rs.getString(3);
		            	String wkpostinsertdarte = rs.getString(4);
		            	
		            	BeanRecipe bean = new BeanRecipe(wkpostno, wktitle, wkuserid);
		            	beanList.add(bean);
		            }
		            conn_mysql.close();
		        }
		        catch (Exception e){
		            e.printStackTrace();
		        }
		        return beanList; // 쌓여있는 beanList가 노출됨.
			}
		
		//조건 검색 결과를 Table로 
//		public ArrayList<BeanRecipe> ConditionList(){
//			
//			ArrayList<BeanRecipe> BeanList = new ArrayList<BeanRecipe>();
//			
//			String A = "select postno, title, userid from post, userinfo ";
//			String B = "where " + conname + " like '%" + condata + "%'";
//			
//	        try{
//	            Class.forName("com.mysql.cj.jdbc.Driver");
//	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
//	            Statement stmt_mysql = conn_mysql.createStatement();
//
//	            ResultSet rs = stmt_mysql.executeQuery(A + B);
//
//	            while(rs.next()){
//	            	
//	            	int wkpostno = rs.getInt(1);
//	            	String wktitle = rs.getString(2);
//	            	String wkuserid = rs.getString(3);
//	            	String wkpostinsertdarte = rs.getString(4);
//	            	
//	            	BeanRecipe bean = new BeanRecipe(wkpostno, wktitle, wkuserid, wkpostinsertdarte);
//	            	BeanList.add(bean);
//	            }
//	            
//	            conn_mysql.close();
//	        }
//	        catch (Exception e){
//	            e.printStackTrace();
//	        }
//			return BeanList;
//		}

		
		// table을 클릭했을 경우
		public BeanRecipe TableClick() {
			BeanRecipe bean = null;
			String A = "select postno, title, userid from post, userinfo ";
			String B = "where postno = " + postno;
			
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();

	            ResultSet rs = stmt_mysql.executeQuery(A+B);
	            
	            

	            if(rs.next()){
	            	
	            	while(rs.next()){
		            	int wkpostno = rs.getInt(1);
		            	String wktitle = rs.getString(2);
		            	String wkuserid = rs.getString(3);
		            	String wkpostinsertdarte = rs.getString(4);
		            	
		            	BeanRecipe beanRecipe = new BeanRecipe(wkpostno, wktitle, wkuserid);
//		            	Beecipe.add(bean);
	            	// File
//	            	ShareVar.filename = ShareVar.filename + 1;
//	            	File file = new File(Integer.toString(ShareVar.filename));
//	            	FileOutputStream output = new FileOutputStream(file);
//	            	InputStream input = rs.getBinaryStream(7);
//	                byte[] buffer = new byte[1024];
//	                while (input.read(buffer) > 0) {
//	                    output.write(buffer);
//	                }
		            	bean = new BeanRecipe(wkpostno, wktitle, wkuserid);
	            	}
	            }
	            
	            conn_mysql.close();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
			
			return bean;
		}
		




}// 끝 ---------------------------------------------
