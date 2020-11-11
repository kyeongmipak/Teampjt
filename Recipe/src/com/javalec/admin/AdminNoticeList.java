package com.javalec.admin;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class AdminNoticeList {
	
	
	
	public AdminNoticeList() {
		// TODO Auto-generated constructor stub
	}
	
	
	//-------------------------------------
	// 공지사항 삭제 method
	public void noticeDeleteAction(int deleteNum) {
		
		DBadminNoitceAction dbAction = new DBadminNoitceAction();
		
		boolean msg = dbAction.noticeDeleteAction(deleteNum);
		
		if(msg == true) {
			JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.");
		} else {
			JOptionPane.showMessageDialog(null, "삭제가 불가합니다.");
			
		}

	}
	
	
	//-------------------------------------
	// 공지사항 업데이트 method
	public void noticeUpdateAction(int updateNum, String title, String text) {
		
		DBadminNoitceAction dbAction = new DBadminNoitceAction();
		
		boolean msg = dbAction.noticeUpdateAction(updateNum, title, text);
		
		if(msg == true) {
			JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
		} else {
			JOptionPane.showMessageDialog(null, "수정이 불가합니다.");
			
		}
		
	}
	
	

	

}
