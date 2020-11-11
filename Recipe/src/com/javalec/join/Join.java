package com.javalec.join;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.login.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Join extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel label;
	private JTextField tfName;
	private JLabel lblId;
	private JTextField tfID;
	private JButton btnIDCheck;
	private JPasswordField tfPW;
	private JLabel label_1;
	private JLabel label_1_1;
	private JPasswordField tfPWCheck;
	private JLabel label_1_1_1;
	private JTextField tfEmail;
	private JButton btnJoinCancel;
	private JButton btnJoinFinish;
	private JLabel lblNewLabel;
	private JTextField pwMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Join dialog = new Join();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Join() {
		setBounds(100, 100, 555, 361);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getLabel());
		contentPanel.add(getTfName());
		contentPanel.add(getLblId());
		contentPanel.add(getTfID());
		contentPanel.add(getBtnIDCheck());
		contentPanel.add(getTfPW());
		contentPanel.add(getLabel_1());
		contentPanel.add(getLabel_1_1());
		contentPanel.add(getTfPWCheck());
		contentPanel.add(getLabel_1_1_1());
		contentPanel.add(getTfEmail());
		contentPanel.add(getLblNewLabel());
		contentPanel.add(getPwMessage());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.add(getBtnJoinFinish());
			buttonPane.add(getBtnJoinCancel());
		}
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("이름 :");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			label.setBounds(78, 46, 82, 25);
		}
		return label;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setHorizontalAlignment(SwingConstants.CENTER);
			tfName.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfName.setColumns(10);
			tfName.setBounds(172, 42, 157, 32);
		}
		return tfName;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("아이디 :");
			lblId.setHorizontalAlignment(SwingConstants.CENTER);
			lblId.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			lblId.setBounds(78, 101, 81, 25);
		}
		return lblId;
	}
	private JTextField getTfID() {
		if (tfID == null) {
			tfID = new JTextField();
			tfID.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfID.setColumns(10);
			tfID.setBounds(172, 97, 157, 32);
		}
		return tfID;
	}
	private JButton getBtnIDCheck() {
		if (btnIDCheck == null) {
			btnIDCheck = new JButton("✓중복체크");
//			btnIDCheck.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mouseEntered(MouseEvent e) {
//					idCheck();
//				}
//			});
			btnIDCheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					idCheck();
				}
			});
			btnIDCheck.setForeground(UIManager.getColor("Button.select"));
			btnIDCheck.setBackground(SystemColor.window);
			btnIDCheck.setBounds(360, 96, 69, 42);
		}
		return btnIDCheck;
	}
	private JPasswordField getTfPW() {
		if (tfPW == null) {
			tfPW = new JPasswordField();
			tfPW.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfPW.setBounds(172, 141, 157, 33);
		}
		return tfPW;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("비밀번호 :");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			label_1.setBounds(78, 145, 89, 25);
		}
		return label_1;
	}
	private JLabel getLabel_1_1() {
		if (label_1_1 == null) {
			label_1_1 = new JLabel("비밀번호 확인 : ");
			label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			label_1_1.setBounds(61, 186, 132, 25);
		}
		return label_1_1;
	}
	private JPasswordField getTfPWCheck() {
		if (tfPWCheck == null) {
			tfPWCheck = new JPasswordField();
//			tfPWCheck.addKeyListener(new KeyAdapter() {
//				@Override
//				public void keyTyped(KeyEvent e) {
//					pwCheck();	 ////다시 수정 해야함. 
//					
//					}
//			});
			tfPWCheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pwCheck();
				}
			});
			tfPWCheck.setHorizontalAlignment(SwingConstants.CENTER);
			tfPWCheck.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfPWCheck.setBounds(182, 182, 147, 33);
		}
		return tfPWCheck;
	}
	private JLabel getLabel_1_1_1() {
		if (label_1_1_1 == null) {
			label_1_1_1 = new JLabel("Email  : ");
			label_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			label_1_1_1.setBounds(61, 223, 132, 25);
		}
		return label_1_1_1;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
			tfEmail.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfEmail.setColumns(10);
			tfEmail.setBounds(172, 223, 157, 32);
		}
		return tfEmail;
	}
	private JButton getBtnJoinCancel() {
		if (btnJoinCancel == null) {
			btnJoinCancel = new JButton("취소");
			btnJoinCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					gotoLogin();
					Join.this.dispose();
				}
			});
			btnJoinCancel.setForeground(Color.RED);
			btnJoinCancel.setActionCommand("Cancel");
		}
		return btnJoinCancel;
	}
	private JButton getBtnJoinFinish() {
		if (btnJoinFinish == null) {
			btnJoinFinish = new JButton("가입");
			btnJoinFinish.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					joinAction();

//					TableInit();
//					clearColumn();
				}
			});
			btnJoinFinish.setForeground(Color.BLUE);
			btnJoinFinish.setActionCommand("OK");
		}
		return btnJoinFinish;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("©copyright 2020 all rights reserved_1조_김태현 박경미 송예진 최지석");
			lblNewLabel.setBounds(18, 6, 410, 16);
		}
		return lblNewLabel;
	}
	private JTextField getPwMessage() {
		if (pwMessage == null) {
			pwMessage = new JTextField();
			pwMessage.setFont(new Font("Arial", Font.BOLD, 12));
			pwMessage.setBorder(null);
			pwMessage.setHorizontalAlignment(SwingConstants.CENTER);
			pwMessage.setForeground(Color.RED);
			pwMessage.setEditable(false);
			pwMessage.setColumns(10);
			pwMessage.setBackground(SystemColor.window);
			pwMessage.setBounds(337, 188, 191, 26);
		}
		return pwMessage;
	}
	
	//ID 체크.
	 private void idCheck() {
//		 String username = tfName.getText().trim();
		 String idUser = tfID.getText().trim();
//		 String pwUser = tfPW.getText().trim();
		 
	        
	        DbActionJoin dbActionJoin = new DbActionJoin(idUser);
	        BeanJoin bean = dbActionJoin.idCheck();
	        
	        	if(idUser.equals(bean.getUserid())) {
	        		
	        		JOptionPane.showMessageDialog(null, "중복된 ID입니다.");
	        	} else {
	        		JOptionPane.showMessageDialog(null, "사용할 수 있는 ID입니다." );
	        	}
	 }
	 
	//비밀번호 체크 
	private void pwCheck() {
		 
		
		String pW = new String(tfPW.getPassword()).trim();
	    String pwCheck = new String(tfPWCheck.getPassword()).trim();
	    
	    
	    if(pW.equals(pwCheck)){
	    	pwMessage.setText("패스워드가 서로 일치합니다.");
	    } else {
	    	pwMessage.setText("패스워드가 서로 다릅니다.");


//	    	tfPWCheck.requestFocus();
	    }
	   
	}	
	
	//문자 길이 체크. 
	private int insertFieldCheck(){
		
		char[] pass = tfPW.getPassword();
		String pwUser = new String(pass);
		
		int i = 0;
		if(tfName.getText().length() == 0){
			i++;
			tfName.requestFocus();
		}
		if(tfID.getText().length() == 0){
			i++;
			tfID.requestFocus();
		}
		if(pwUser.length() == 0){
			i++;
			tfPW.requestFocus();
		}
	
		return i;
	}
	private void joinAction() {
		
		int i_chk = insertFieldCheck();
		
		if(i_chk == 0){
			insertAction();
//			TableInit();
//			SearchAction();
//			ClearColumn();
			gotoLogin();
			Join.this.dispose();
			
		} else {
			JOptionPane.showMessageDialog(null, "정보를 모두 작성해주세요!");
					     			
			
		}			
	}
	
	private void insertAction(){
			
			// DbAction 너가 insert한 정보 DB에 넣어줘!
			String username = tfName.getText().trim();
			String idUser= tfID.getText().trim();
			String useremail = tfEmail.getText().trim();
			
			//Password
			char[] pass = tfPW.getPassword();
			String pwUser = new String(pass);
			
			// DbAction에 위 name~Relation까지 들어갈 생성자 필요 
			DbActionJoin dbActionJoin = new DbActionJoin(username, idUser, pwUser, useremail);
			boolean msg = dbActionJoin.insertAction();
			
			if(msg == true) {
				JOptionPane.showMessageDialog(null, username + "님 가입이 완료되었습니다!");
			} else {
				JOptionPane.showMessageDialog(null, "입력을 다시해주세요!");
			}
		}
	
	
//	Login 화면으로 넘어가기. 
	 private void gotoLogin() {
			Login login = new Login();
			
			login.setLocationRelativeTo(null);
			login.setVisible(true);
			
		}
}///---END
