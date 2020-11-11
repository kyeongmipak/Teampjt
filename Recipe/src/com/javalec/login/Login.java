package com.javalec.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.javalec.base.ShareVar;
import com.javalec.join.Join;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panelUserID;
	private JPanel panelPW;
	private JTextField tfUserID;
	private JPasswordField tfPW;
	private JPanel panelBtnLogin;
	private JLabel lblLogin;
	private JLabel lblX;
	private JLabel MainLogo;

	//Image Icon 설정.
	public Image imageLogo = new ImageIcon(Login.class.getResource("/image/UserImage.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);//아이콘 넣기위해 생성자 선언.  
	public Image imageUserID = new ImageIcon(Login.class.getResource("/image/Batman User Login Icon.png")).getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);//여기서 아이콘 크기들 조절 해줘야함   
	public Image imagePW = new ImageIcon(Login.class.getResource("/image/Gun Icon.png")).getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH);//여기서 아이콘 크기들 조절 해줘야함 
	public Image imageLogin = new ImageIcon(Login.class.getResource("/image/Login Key Icon.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);//아이콘 넣기위해 생성자 선언.  
	//

	public static final String id_mysql = ShareVar.idUser;
    public static final String pw_mysql = ShareVar.pwUser;
	//
	
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel loginMessage;
	private JLabel label;
	private JLabel lblId;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new LineBorder(SystemColor.activeCaptionText, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanelUserID());
		contentPane.add(getPanelPW());
		contentPane.add(getPanelBtnLogin());
		contentPane.add(getLblX());
		contentPane.add(getMainLogo());
		contentPane.add(getLoginMessage());
		contentPane.add(getLabel());
		contentPane.add(getLblId());
		
		setLocationRelativeTo(null);//위치 선정.
		
	}
	private JPanel getPanelUserID() {
		if (panelUserID == null) {
			panelUserID = new JPanel();
			panelUserID.setBackground(Color.WHITE);
			panelUserID.setBounds(184, 155, 250, 40);
			panelUserID.setLayout(null);
			panelUserID.add(getTfUserID());
			panelUserID.add(getLblNewLabel());
			
		}
		return panelUserID;
	}
	private JPanel getPanelPW() {
		if (panelPW == null) {
			panelPW = new JPanel();
			panelPW.setBackground(Color.WHITE);
			panelPW.setBounds(184, 219, 250, 40);
			panelPW.setLayout(null);
			panelPW.add(getTfPW());
			panelPW.add(getLblNewLabel_1());
		}
		return panelPW;
	}
	private JTextField getTfUserID() {
		if (tfUserID == null) {
			tfUserID = new JTextField();
			tfUserID.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					if(tfUserID.getText().equals("UserID")) {
						tfUserID.setText("");
					}
					else {
						tfUserID.selectAll();//ID 만드는 구간.
					}
				}
				@Override
				public void focusLost(FocusEvent e) {
					if(tfUserID.getText().equals("")){
						tfUserID.setText("UserID");
					}
				}
			});
			tfUserID.setBorder(null);
			tfUserID.setFont(new Font("Arial", Font.BOLD, 14));
			tfUserID.setText("UserID");
			tfUserID.setBounds(6, 6, 170, 26);
			tfUserID.setColumns(10);
		}
		return tfUserID; 
	}
	private JPasswordField getTfPW() {
		if (tfPW == null) {
			tfPW = new JPasswordField();
			tfPW.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			tfPW.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					
					if(tfPW.getText().equals("Password")) {
						
						tfPW.setEchoChar('●');//비밀 번호 
						tfPW.setText("");
					}
					else {
						tfPW.selectAll();
					}
				}
				@Override
				public void focusLost(FocusEvent e) {
					if(tfPW.getText().equals("")) {
						tfPW.setText("Password" );
						tfPW.setEchoChar((char)0); 
					}
				}
			});
			tfPW.setEchoChar((char)0);// 비번 칸에 내가 친 텍스트글들 사라짐.
			tfPW.setBorder(null);
			tfPW.setText("Password");
			tfPW.setBounds(6, 6, 170, 26);
		}
		return tfPW;
	}
	private JPanel getPanelBtnLogin() {
		if (panelBtnLogin == null) {
			panelBtnLogin = new JPanel();
			panelBtnLogin.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(tfUserID.getText().equals("admin") && tfPW.getText().equals("admin123")) {
						//if user inputs are correct
						getLoginMessage().setText("");
						JOptionPane.showMessageDialog(null, "로그인 하였습니다");
					}
					else if(tfUserID.getText().equals("") ||tfUserID.getText().equals("UserID ")
							|| tfPW.getText().equals("") || tfPW.getText().equals("Password")){
					getLoginMessage().setText("빈칸을 모두 작성해 주세요.");//로그인 버튼 위에 메세지 띄우기.
						
					}
					else {
						getLoginMessage().setText("ID 혹은 PW가 다릅니다.");//로그인 버튼 위에 메세지 띄우기.

					}
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					panelBtnLogin.setBackground(new Color(70, 80, 80));

				}
				@Override
				public void mouseExited(MouseEvent e) {
					panelBtnLogin.setBackground(new Color(87 , 87, 87));

				}
				@Override  
				public void mousePressed(MouseEvent e) {
					panelBtnLogin.setBackground(new Color(100, 100, 100));
					
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					panelBtnLogin.setBackground(new Color(70, 80, 80));

				}
			});
			panelBtnLogin.setBounds(446, 219, 132, 40);
			panelBtnLogin.setBackground(new Color(112, 128, 144));
			panelBtnLogin.setLayout(null);
			panelBtnLogin.add(getLblNewLabel_2());
			panelBtnLogin.add(getLblLogin());
		}
		return panelBtnLogin;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("Login");
			lblLogin.setBounds(21, 6, 147, 28);
			lblLogin.setForeground(Color.WHITE);
			lblLogin.setFont(new Font("Arial Black", Font.BOLD, 14));
		}
		return lblLogin;
	}
	private JLabel getLblX() {
		if (lblX == null) {
			lblX = new JLabel("X");
			lblX.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null, "종료하시기를 원하십니까?","Confirmation", JOptionPane.YES_NO_OPTION) ==0) {
						Login.this.dispose();
					}
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblX.setForeground(Color.red);
				}
				public void mouseExited(MouseEvent e) { 
					lblX.setForeground(Color.white);
				}
			});
			lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblX.setHorizontalAlignment(SwingConstants.CENTER);
			lblX.setBounds(574, 6, 20, 20);
		}
		return lblX;
	}
	private JLabel getMainLogo() {
		if (MainLogo == null) {
			MainLogo = new JLabel("");
			MainLogo.setIcon(new ImageIcon(imageLogo));
			MainLogo.setBounds(249, 28, 90, 115);
			setLocationRelativeTo(null);//왜있는지는 몰겟다.
			
		}
		
		return MainLogo;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(202, -1, 48, 40);
			lblNewLabel.setIcon(new ImageIcon(imageUserID));
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(202, 0, 48, 40);
			lblNewLabel_1.setIcon(new ImageIcon(imagePW));
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBounds(92, 0, 40, 40);
			lblNewLabel_2.setIcon(new ImageIcon(imageLogin));
		}
		return lblNewLabel_2;
	}
	private JLabel getLoginMessage() {
		if (loginMessage == null) {
			loginMessage = new JLabel("");
			loginMessage.setForeground(new Color(250, 240, 230));
			loginMessage.setBackground(new Color(253, 245, 230));
			loginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
			loginMessage.setBounds(184, 267, 250, 16);
		}
		return loginMessage;
	}

	private void setLoginMessage(JLabel loginMessage) {
		this.loginMessage = loginMessage;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("회원가입/");
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					gotoJoin();
				}
			});
			label.setBounds(244, 283, 61, 16);
		}
		return label;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID,PW찾기");
			lblId.setBounds(299, 283, 61, 16);
		}
		return lblId;
	}
	 private void gotoJoin() {
		 	Join join = new Join();
			
		 	join.setLocationRelativeTo(null);
		 	join.setVisible(true);
			
		}
}///----END
