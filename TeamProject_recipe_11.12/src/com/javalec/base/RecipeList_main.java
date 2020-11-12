package com.javalec.base;

import com.javalec.admin.AdminNoticeWrite;
import com.javalec.admin.BeanAdminNotice;
import com.javalec.admin.BeanAdminUser;
import com.javalec.admin.DBadminNoitceAction;
import com.javalec.admin.DBadminUserAction;
import com.javalec.join.*;

import java.awt.EventQueue;


import javax.swing.JDialog;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextPane;

public class RecipeList_main extends JDialog {
	private JPanel sideBar;
	private JPanel homeMenu;
	private JLabel lblBrandLogo;
	private JLabel lblHome;
	private JPanel noticeMenu;
	private JLabel lblHome_1;
	private JPanel recipeMenu;
	private JLabel RecipeTab;
	private JPanel myPageMenu;
	private JLabel lblHome_1_1_1;
	private JPanel miniGameMenu;
	private JLabel lblHome_1_1_1_1;
	private JPanel adminMenu;
	private JLabel label;
	private JPanel panel;
	private JPanel homePanel;
	private JLabel label_2;
	private JPanel RecipeListPanel;
	private JTabbedPane tabbedPane;
	private JPanel Best;
	private JPanel Update;
	private JScrollPane scrollPane;
	private JTable inner_table1;
	private JTextField textField;
	private JButton btnOk_1;
	private JComboBox cbMenu;
	private JComboBox cbCookTime;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_1_1;
	private JComboBox comboBox_1_1;
	private JTextField textField_1;
	private JButton btnOk_1_1;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton;
	private JLabel label_3;
	private JLabel lblNewLabel_3_1;
	private JPanel mypagePanel;
	private JLabel logout;
	private JLabel lblMyHome;
	private JTabbedPane tabbedPane_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JScrollPane myStroyPane;
	private JTextField textField_2;
	private JLabel lblId;
	private JTextField tfIdUser;
	private JLabel lblPw;
	private JTextField tfpwUser;
	private JTextField tfPwCheck;
	private JLabel lblPw_1;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JButton btnSecession;
	private JButton btnOK;
	private JLabel label_4_1;
	private JPanel AdminPanel;
	private JTabbedPane tabbedPane_1_1;
	private JPanel usermanage;
	private JLabel lblNewLabel_1_2;
	private JPanel panel_1_1;
	private JLabel lblNewLabel_2_1;
	private JTextField tfUserNum;
	private JLabel lblNewLabel_2_1_1;
	private JTextField tfUserName;
	private JLabel lblNewLabel_2_2;
	private JTextField tfUserID;
	private JLabel lblNewLabel_2_4;
	private JTextField tfUserState;
	private JLabel lblNewLabel_2_4_1;
	private JTextField tfPostNum;
	private JLabel lblNewLabel_2_4_1_1;
	private JTextField tfLikeNum;
	private JLabel lblNewLabel_2_1_1_1;
	private JTextField tfUserInsertDate;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JTextField tfUserDeleteDate;
	private JLabel lblNewLabel_4;
	private JComboBox cbUserSelectSearch;
	private JTextField tfUserSearch;
	private JButton btnUserSearch;
	private JScrollPane scrollPane_2;
	private JPanel noticemanage;
	private JLabel lblNewLabel_3_1_1;
	private JScrollPane scrollPane_1_1;
	private JComboBox cbNoticeSelectSearch;
	private JTextField tfNoitceSelect;
	private JButton btnNoticeSearch;
	private JLabel lblNewLabel_4_1_2;
	private JButton btnNoticeDelete;
	private JButton btnNoticeWrite;
	private JLabel lblNewLabel_1_2_1;
	private JPanel panel_3;
	private JLabel lblNewLabel_4_1;
	private JTextField tfNoticeTitle;
	private JLabel lblNewLabel_4_1_1;
	private JTextField tfNoticeDate;
	private JTable NoticeInner_Table;
	
	private JButton btnNoticeRevise_1;
	private JTextPane tfNoticeText;
	private JTable UserInner_Table;
	
	//--------admin menu table format--------------------
	private final DefaultTableModel UserOuter_Table = new DefaultTableModel(); // ################
	private final DefaultTableModel NoticeOuter_Table = new DefaultTableModel(); // ################
	private final DefaultTableModel UserNoticeOuter_Table = new DefaultTableModel(); // ################
	private JLabel lblNewLabel_2_1_1_2;
	private JTextField tfUserEmail;
	private JPanel noticePanel;
	private JComboBox cbUserNoticeSelectSearch;
	private JLabel lblNewLabel_3_1_1_1;
	private JTextField tfUserNoticeSearch;
	private JButton btnUserNoticeSearch;
	private JScrollPane scrollPane_1_1_1;
	private JTable UserNoticeInner_Table;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeList_main dialog = new RecipeList_main();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	//--------윈도우 open 시 admin menu 초기화면--------------------
	public RecipeList_main() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				clearColumn();
				UserTableInit();
				userSearchAction();
				NoticeTableInit();
				noticeSearchAction();
				userNoticeTableInit();
				userNoticeSearchAction();
				if(ShareVar.idUser.equals("Admin")) {
					getAdminMenu().setVisible(true);
				} else {
					getAdminMenu().setVisible(false);
					
				}
			
				
			}
			
//--------화면 전환 시 초기화면--------------------			
			@Override
			public void windowActivated(WindowEvent e) {
				clearColumn();
				userNoticeTableInit();
				userNoticeSearchAction();
				NoticeTableInit();
				noticeSearchAction();
			}
		});
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석 all rights reserved.");
		setBounds(100, 100, 664, 484);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getSideBar());

	}
	private JPanel getSideBar() {
		if (sideBar == null) {
			sideBar = new JPanel();
			sideBar.setBackground(SystemColor.activeCaptionBorder);
			sideBar.setBounds(0, 0, 224, 461);
			sideBar.setLayout(null);
			sideBar.add(getLblBrandLogo());
			sideBar.add(getHomeMenu());
			sideBar.add(getNoticeMenu());
			sideBar.add(getRecipeMenu());
			sideBar.add(getMyPageMenu());
			sideBar.add(getMiniGameMenu());
			sideBar.add(getAdminMenu());
			sideBar.add(getLblNewLabel_3_1_1());
			sideBar.add(getLogout());
		}
		return sideBar;
	}
	private JPanel getHomeMenu() {
		if (homeMenu == null) {
			homeMenu = new JPanel();
			homeMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// home menu click 시 menu 화면출력 및 버튼 흰색으로 변경
					homePanel.setVisible(true);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(false);
					AdminPanel.setVisible(false);
					getHomeMenu().setBackground(Color.white);				
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					getRecipeMenu().setBackground(new Color(221, 160, 221));
					getAdminMenu().setBackground(new Color(221, 160, 221));
					
					
				}
			});
			homeMenu.setBackground(new Color(221, 160, 221));
			homeMenu.setBounds(0, 118, 224, 44);
			homeMenu.setLayout(null);
			homeMenu.add(getLblHome());
		}
		return homeMenu;
	}
	private JLabel getLblBrandLogo() {
		if (lblBrandLogo == null) {
			lblBrandLogo = new JLabel();
			lblBrandLogo.setForeground(Color.WHITE);
			lblBrandLogo.setBackground(Color.WHITE);
			lblBrandLogo.setIcon(new ImageIcon("C:\\Users\\2bbee\\Desktop\\Coding\\프로젝트\\1. Swing+DB\\픽토그램\\brandlogo.png"));
			lblBrandLogo.setHorizontalAlignment(SwingConstants.CENTER);
//			setLocationRelativeTo(null);//왜있는지는 몰겟다.
			
			lblBrandLogo.setBounds(0, 0, 224, 133);
		}
		return lblBrandLogo;
	}
	private JLabel getLblHome() {
		if (lblHome == null) {
			lblHome = new JLabel("HOME");
			lblHome.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome.setBounds(67, 0, 89, 44);
		}
		return lblHome;
	}
	private JPanel getNoticeMenu() {
		if (noticeMenu == null) {
			noticeMenu = new JPanel();
			noticeMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton() == 1) {
					ShareVar.noticeMenuClick = 1;
					homePanel.setVisible(false);
					noticePanel.setVisible(true);
					RecipeListPanel.setVisible(false);
					AdminPanel.setVisible(false);
					getAdminMenu().setBackground(new Color(221, 160, 221));
					getNoticeMenu().setBackground(Color.white);
					getHomeMenu().setBackground(new Color(221, 160, 221));
					getRecipeMenu().setBackground(new Color(221, 160, 221));
					}
				}
			});
			noticeMenu.setLayout(null);
			noticeMenu.setBackground(new Color(221, 160, 221));
			noticeMenu.setBounds(0, 163, 224, 44);
			noticeMenu.add(getLblHome_1());
		}
		return noticeMenu;
	}
	private JLabel getLblHome_1() {
		if (lblHome_1 == null) {
			lblHome_1 = new JLabel("공지사항");
			lblHome_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1;
	}
	private JPanel getRecipeMenu() {
		if (recipeMenu == null) {
			recipeMenu = new JPanel();
			recipeMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					homePanel.setVisible(false);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(true);
					AdminPanel.setVisible(false);
					getHomeMenu().setBackground(new Color(221, 160, 221));
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					getRecipeMenu().setBackground(Color.white);
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					
					
					
				}
			});
			recipeMenu.setLayout(null);
			recipeMenu.setBackground(new Color(221, 160, 221));
			recipeMenu.setBounds(0, 208, 224, 44);
			recipeMenu.add(getRecipeTab());
		}
		return recipeMenu;
	}
	private JLabel getRecipeTab() {
		if (RecipeTab == null) {
			RecipeTab = new JLabel("Recipe");
			RecipeTab.setHorizontalAlignment(SwingConstants.CENTER);
			RecipeTab.setBounds(67, 0, 89, 44);
		}
		return RecipeTab;
	}
	private JPanel getMyPageMenu() {
		if (myPageMenu == null) {
			myPageMenu = new JPanel();
			myPageMenu.setLayout(null);
			myPageMenu.setBackground(new Color(221, 160, 221));
			myPageMenu.setBounds(0, 253, 224, 44);
			myPageMenu.add(getLblHome_1_1_1());
		}
		return myPageMenu;
	}
	private JLabel getLblHome_1_1_1() {
		if (lblHome_1_1_1 == null) {
			lblHome_1_1_1 = new JLabel("myPage");
			lblHome_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1_1_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1_1_1;
	}
	private JPanel getMiniGameMenu() {
		if (miniGameMenu == null) {
			miniGameMenu = new JPanel();
			miniGameMenu.setLayout(null);
			miniGameMenu.setBackground(new Color(221, 160, 221));
			miniGameMenu.setBounds(0, 298, 224, 44);
			miniGameMenu.add(getLblHome_1_1_1_1());
		}
		return miniGameMenu;
	}
	private JLabel getLblHome_1_1_1_1() {
		if (lblHome_1_1_1_1 == null) {
			lblHome_1_1_1_1 = new JLabel("miniGame\n");
			lblHome_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1_1_1_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1_1_1_1;
	}
	private JPanel getAdminMenu() {
		if (adminMenu == null) {
			adminMenu = new JPanel();
			adminMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton() == 1) {
					ShareVar.noticeMenuClick=0;
					homePanel.setVisible(false);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(false);
					AdminPanel.setVisible(true);
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					getAdminMenu().setBackground(Color.white);
					getHomeMenu().setBackground(new Color(221, 160, 221));
					getRecipeMenu().setBackground(new Color(221, 160, 221));
					
					}
					
				}
			});
			adminMenu.setLayout(null);
			adminMenu.setBackground(new Color(221, 160, 221));
			adminMenu.setBounds(0, 343, 224, 44);
			adminMenu.add(getLabel());
		}
		return adminMenu;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("관리자 메뉴");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(67, 0, 89, 44);
		}
		return label;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(225, 0, 439, 461);
			panel.setLayout(new CardLayout(0, 0));
			panel.add(getPanel_2_1(), "name_11753955479258");
			panel.add(getNoticePanel(), "name_10408455378388");
			panel.add(getAdminPanel(), "name_9739089202207");
			panel.add(getMypagePanel(), "name_9819590572768");
			panel.add(getRecipeListPanel(), "name_13098176263849");
		}
		return panel;
	}
	private JPanel getPanel_2_1() {
		if (homePanel == null) {
			homePanel = new JPanel();
			homePanel.setBackground(new Color(0, 255, 255));
			homePanel.setLayout(null);
			homePanel.add(getLabel_2());
		}
		return homePanel;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("환영합니다.");
			label_2.setBounds(186, 238, 61, 16);
		}
		return label_2;
	}
	private JPanel getRecipeListPanel() {
		if (RecipeListPanel == null) {
			RecipeListPanel = new JPanel();
			RecipeListPanel.setBackground(Color.WHITE);
			RecipeListPanel.setLayout(null);
			RecipeListPanel.add(getTabbedPane());
			RecipeListPanel.add(getBtnNewButton());
			RecipeListPanel.add(getLabel_3_1());
		}
		return RecipeListPanel;
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(20, 124, 393, 325);
			tabbedPane.addTab("Best", null, getBest(), null);
			tabbedPane.addTab("Update", null, getUpdate(), null);
		}
		return tabbedPane;
	}
	private JPanel getBest() {
		if (Best == null) {
			Best = new JPanel();
			Best.setLayout(null);
			Best.add(getScrollPane());
			Best.add(getTextField());
			Best.add(getBtnOk_1());
			Best.add(getCbMenu());
			Best.add(getCbCookTime());
			Best.add(getLblNewLabel());
			Best.add(getLblNewLabel_1());
		}
		return Best;
	}
	private JPanel getUpdate() {
		if (Update == null) {
			Update = new JPanel();
			Update.setLayout(null);
			Update.add(getLblNewLabel_3_1());
			Update.add(getComboBox_2());
			Update.add(getLblNewLabel_1_1());
			Update.add(getComboBox_1_1());
			Update.add(getTextField_1());
			Update.add(getBtnOk_1_1());
			Update.add(getScrollPane_1());
		}
		return Update;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(6, 77, 361, 198);
			scrollPane.setViewportView(getInner_table1());
		}
		return scrollPane;
	}
	private JTable getInner_table1() {
		if (inner_table1 == null) {
			inner_table1 = new JTable();
			inner_table1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
				}
			});
						
		}
		return inner_table1;
	}

	
	
	
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(18, 40, 266, 27);
			textField.setColumns(10);
			textField.setBorder(LineBorder.createGrayLineBorder());
		}
		return textField;
	}
	private JButton getBtnOk_1() {
		if (btnOk_1 == null) {
			btnOk_1 = new JButton("검색");
			btnOk_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//					conditionQuery();
				}
			});
			btnOk_1.setBounds(289, 34, 68, 40);
		}
		return btnOk_1;
	}
	private JComboBox getCbMenu() {
		if (cbMenu == null) {
			cbMenu = new JComboBox();
			cbMenu.setModel(new DefaultComboBoxModel(new String[] {"전체", "밥 요리", "면 요리", "기타"}));
			cbMenu.setBounds(91, 10, 93, 27);
		}
		return cbMenu;
	}
	private JComboBox getCbCookTime() {
		if (cbCookTime == null) {
			cbCookTime = new JComboBox();
			cbCookTime.setModel(new DefaultComboBoxModel(new String[] {"전체", "10분 이내", "20분 이내", "30분 이내"}));
			cbCookTime.setBounds(243, 10, 93, 27);
		}
		return cbCookTime;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("카테고리 : ");
			lblNewLabel.setBounds(38, 14, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("요리시간 :");
			lblNewLabel_1.setBounds(191, 14, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("카테고리 : ");
			lblNewLabel_3.setBounds(38, 12, 61, 16);
		}
		return lblNewLabel_3;
	}
	private JComboBox getComboBox_2() {
		if (comboBox_2 == null) {
			comboBox_2 = new JComboBox();
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"전체", "밥 요리", "면 요리", "기타"}));
			comboBox_2.setBounds(91, 8, 93, 27);
		}
		return comboBox_2;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("요리시간 :");
			lblNewLabel_1_1.setBounds(191, 12, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JComboBox getComboBox_1_1() {
		if (comboBox_1_1 == null) {
			comboBox_1_1 = new JComboBox();
			comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"전체", "10분 이내", "20분 이내", "30분 이내"}));
			comboBox_1_1.setBounds(243, 8, 93, 27);
		}
		return comboBox_1_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBorder(LineBorder.createGrayLineBorder());
			textField_1.setBounds(18, 38, 266, 27);
		}
		return textField_1;
	}
	private JButton getBtnOk_1_1() {
		if (btnOk_1_1 == null) {
			btnOk_1_1 = new JButton("검색");
			btnOk_1_1.setBounds(289, 32, 68, 40);
		}
		return btnOk_1_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(6, 75, 361, 198);
		}
		return scrollPane_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
//----------버튼에 최신 공지사항 제목 출력----------
			btnNewButton = new JButton("🎁" + updateNotice());
//			btnNewButton = new JButton("🎁 11월 빼빼로데이 이벤트 당첨자 발표 🎉🎉🎉");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//----------버튼 클릭 시 공지사항 목록으로 이동----------
					AdminNoticeWrite adminNoticeWrite = new AdminNoticeWrite();
					adminNoticeWrite.updatePrintAction();
					adminNoticeWrite.setVisible(true);

				}
			});
			btnNewButton.setBounds(81, 68, 332, 23);
		}
		return btnNewButton;
	}
	private JLabel getLabel_3_1() {
		if (label_3 == null) {
			label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon("C:\\Users\\2bbee\\Desktop\\Coding\\프로젝트\\1. Swing+DB\\픽토그램\\flaticon\\[크기변환]megapppphone.png"));
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBounds(21, 51, 57, 53);
		}
		return label_3;
	}

	private JLabel getLblNewLabel_3_1_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("혼밥생활");
			lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1.setBounds(24, 60, 170, 57);
		}
		return lblNewLabel_3_1;
	}
	private JPanel getMypagePanel() {
		if (mypagePanel == null) {
			mypagePanel = new JPanel();
			mypagePanel.setLayout(null);
			mypagePanel.add(getLblMyHome());
			mypagePanel.add(getTabbedPane_1());
		}
		return mypagePanel;
	}
	private JLabel getLogout() {
		if (logout == null) {
			logout = new JLabel("로그아웃");
			logout.setHorizontalAlignment(SwingConstants.CENTER);
			logout.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//					gotoJoin();
				}
			});
			logout.setBounds(141, 427, 61, 16);
		}
		return logout;
	}
	private JLabel getLblMyHome() {
		if (lblMyHome == null) {
			lblMyHome = new JLabel("MY PAGE");
			lblMyHome.setBounds(30, 30, 96, 22);
			lblMyHome.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		}
		return lblMyHome;
	}
	private JTabbedPane getTabbedPane_1() {
		if (tabbedPane_1 == null) {
			tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane_1.setBounds(6, 64, 427, 391);
			tabbedPane_1.addTab("My Story", null, getPanel_1(), null);
			tabbedPane_1.addTab("회원정보 수정", null, getPanel_2(), null);
		}
		return tabbedPane_1;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getMyStroyPane());
			panel_1.add(getTextField_2());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getLblId());
			panel_2.add(getTfIdUser());
			panel_2.add(getLblPw());
			panel_2.add(getTfpwUser());
			panel_2.add(getTfPwCheck());
			panel_2.add(getLblPw_1());
			panel_2.add(getLblEmail());
			panel_2.add(getTfEmail());
			panel_2.add(getBtnSecession());
			panel_2.add(getBtnOK());
			panel_2.add(getLabel_4_1());
		}
		return panel_2;
	}
	private JScrollPane getMyStroyPane() {
		if (myStroyPane == null) {
			myStroyPane = new JScrollPane();
			myStroyPane.setBounds(0, 79, 406, 266);
		}
		return myStroyPane;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setText("MY STORY LIST");
			textField_2.setHorizontalAlignment(SwingConstants.CENTER);
			textField_2.setColumns(10);
			textField_2.setBounds(0, 16, 406, 49);
		}
		return textField_2;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("아이디 :");
			lblId.setBounds(126, 93, 41, 16);
		}
		return lblId;
	}
	private JTextField getTfIdUser() {
		if (tfIdUser == null) {
			tfIdUser = new JTextField();
			tfIdUser.setColumns(10);
			tfIdUser.setBounds(174, 88, 130, 26);
		}
		return tfIdUser;
	}
	private JLabel getLblPw() {
		if (lblPw == null) {
			lblPw = new JLabel("비밀번호 :");
			lblPw.setBounds(115, 121, 52, 16);
		}
		return lblPw;
	}
	private JTextField getTfpwUser() {
		if (tfpwUser == null) {
			tfpwUser = new JTextField();
			tfpwUser.setColumns(10);
			tfpwUser.setBounds(174, 116, 130, 26);
		}
		return tfpwUser;
	}
	private JTextField getTfPwCheck() {
		if (tfPwCheck == null) {
			tfPwCheck = new JTextField();
			tfPwCheck.setColumns(10);
			tfPwCheck.setBounds(174, 149, 130, 26);
		}
		return tfPwCheck;
	}
	private JLabel getLblPw_1() {
		if (lblPw_1 == null) {
			lblPw_1 = new JLabel("비밀번호 확인 :");
			lblPw_1.setBounds(91, 149, 80, 16);
		}
		return lblPw_1;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email : ");
			lblEmail.setBounds(126, 177, 46, 16);
		}
		return lblEmail;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(174, 177, 130, 26);
		}
		return tfEmail;
	}
	private JButton getBtnSecession() {
		if (btnSecession == null) {
			btnSecession = new JButton("탈퇴");
			btnSecession.setBounds(207, 271, 78, 29);
		}
		return btnSecession;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("완료");
			btnOK.setBounds(293, 272, 78, 29);
		}
		return btnOK;
	}
	private JLabel getLabel_4_1() {
		if (label_4_1 == null) {
			label_4_1 = new JLabel("회원정보 수정");
			label_4_1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
			label_4_1.setBounds(19, 18, 102, 27);
		}
		return label_4_1;
	}
	 private void gotoJoin() {
			Join join = new Join();
			join.setLocationRelativeTo(null);
			join.setVisible(true);
			
		}
	private JPanel getAdminPanel() {
		if (AdminPanel == null) {
			AdminPanel = new JPanel();
			AdminPanel.setLayout(null);
			AdminPanel.add(getTabbedPane_1_1());
		}
		return AdminPanel;
	}
	private JTabbedPane getTabbedPane_1_1() {
		if (tabbedPane_1_1 == null) {
			tabbedPane_1_1 = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane_1_1.setBounds(0, 17, 439, 444);
			tabbedPane_1_1.addTab("회원 관리", null, getUsermanage(), null);
			tabbedPane_1_1.addTab("공지사항 관리", null, getNoticemanage(), null);
		}
		return tabbedPane_1_1;
	}
	private JPanel getUsermanage() {
		if (usermanage == null) {
			usermanage = new JPanel();
			usermanage.setLayout(null);
			usermanage.add(getLblNewLabel_1_2());
			usermanage.add(getPanel_1_1());
			usermanage.add(getLblNewLabel_4());
			usermanage.add(getCbUserSelectSearch());
			usermanage.add(getTfUserSearch());
			usermanage.add(getBtnUserSearch());
			usermanage.add(getScrollPane_2());
		}
		return usermanage;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("상세 정보");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(166, 205, 85, 28);
		}
		return lblNewLabel_1_2;
	}
	private JPanel getPanel_1_1() {
		if (panel_1_1 == null) {
			panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBorder(new LineBorder(new Color(128, 128, 128)));
			panel_1_1.setBackground(SystemColor.window);
			panel_1_1.setBounds(6, 233, 406, 165);
			panel_1_1.add(getLblNewLabel_2_1());
			panel_1_1.add(getTfUserNum());
			panel_1_1.add(getLblNewLabel_2_1_1());
			panel_1_1.add(getTfUserName());
			panel_1_1.add(getLblNewLabel_2_2());
			panel_1_1.add(getTfUserID());
			panel_1_1.add(getLblNewLabel_2_4());
			panel_1_1.add(getTfUserState());
			panel_1_1.add(getLblNewLabel_2_4_1());
			panel_1_1.add(getTfPostNum());
			panel_1_1.add(getLblNewLabel_2_4_1_1());
			panel_1_1.add(getTfLikeNum());
			panel_1_1.add(getLblNewLabel_2_1_1_1());
			panel_1_1.add(getTfUserInsertDate());
			panel_1_1.add(getLblNewLabel_2_1_1_1_1());
			panel_1_1.add(getTfUserDeleteDate());
			panel_1_1.add(getLblNewLabel_2_1_1_2());
			panel_1_1.add(getTfUserEmail());
		}
		return panel_1_1;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("회원 번호 :");
			lblNewLabel_2_1.setBounds(6, 44, 61, 16);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getTfUserNum() {
		if (tfUserNum == null) {
			tfUserNum = new JTextField();
			tfUserNum.setEditable(false);
			tfUserNum.setColumns(10);
			tfUserNum.setBounds(64, 39, 96, 26);
		}
		return tfUserNum;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("이      름 :");
			lblNewLabel_2_1_1.setBounds(6, 77, 61, 16);
		}
		return lblNewLabel_2_1_1;
	}
	private JTextField getTfUserName() {
		if (tfUserName == null) {
			tfUserName = new JTextField();
			tfUserName.setEditable(false);
			tfUserName.setColumns(10);
			tfUserName.setBounds(64, 72, 130, 26);
		}
		return tfUserName;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("I        D :");
			lblNewLabel_2_2.setBounds(6, 110, 61, 16);
		}
		return lblNewLabel_2_2;
	}
	private JTextField getTfUserID() {
		if (tfUserID == null) {
			tfUserID = new JTextField();
			tfUserID.setEditable(false);
			tfUserID.setColumns(10);
			tfUserID.setBounds(64, 105, 130, 26);
		}
		return tfUserID;
	}
	private JLabel getLblNewLabel_2_4() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel("회원 상태 :");
			lblNewLabel_2_4.setBounds(6, 11, 61, 16);
		}
		return lblNewLabel_2_4;
	}
	private JTextField getTfUserState() {
		if (tfUserState == null) {
			tfUserState = new JTextField();
			tfUserState.setEditable(false);
			tfUserState.setColumns(10);
			tfUserState.setBounds(64, 6, 96, 26);
		}
		return tfUserState;
	}
	private JLabel getLblNewLabel_2_4_1() {
		if (lblNewLabel_2_4_1 == null) {
			lblNewLabel_2_4_1 = new JLabel("게시글 수 :");
			lblNewLabel_2_4_1.setBounds(216, 11, 61, 16);
		}
		return lblNewLabel_2_4_1;
	}
	private JTextField getTfPostNum() {
		if (tfPostNum == null) {
			tfPostNum = new JTextField();
			tfPostNum.setEditable(false);
			tfPostNum.setColumns(10);
			tfPostNum.setBounds(276, 6, 54, 26);
		}
		return tfPostNum;
	}
	private JLabel getLblNewLabel_2_4_1_1() {
		if (lblNewLabel_2_4_1_1 == null) {
			lblNewLabel_2_4_1_1 = new JLabel("좋아요 수:");
			lblNewLabel_2_4_1_1.setBounds(216, 44, 61, 16);
		}
		return lblNewLabel_2_4_1_1;
	}
	private JTextField getTfLikeNum() {
		if (tfLikeNum == null) {
			tfLikeNum = new JTextField();
			tfLikeNum.setEditable(false);
			tfLikeNum.setColumns(10);
			tfLikeNum.setBounds(276, 39, 54, 26);
		}
		return tfLikeNum;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel("가입 일자 :");
			lblNewLabel_2_1_1_1.setBounds(216, 77, 61, 16);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JTextField getTfUserInsertDate() {
		if (tfUserInsertDate == null) {
			tfUserInsertDate = new JTextField();
			tfUserInsertDate.setEditable(false);
			tfUserInsertDate.setColumns(10);
			tfUserInsertDate.setBounds(276, 72, 124, 26);
		}
		return tfUserInsertDate;
	}
	private JLabel getLblNewLabel_2_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1 = new JLabel("탈퇴 일자 :");
			lblNewLabel_2_1_1_1_1.setBounds(216, 110, 61, 16);
		}
		return lblNewLabel_2_1_1_1_1;
	}
	private JTextField getTfUserDeleteDate() {
		if (tfUserDeleteDate == null) {
			tfUserDeleteDate = new JTextField();
			tfUserDeleteDate.setEditable(false);
			tfUserDeleteDate.setColumns(10);
			tfUserDeleteDate.setBounds(276, 105, 124, 26);
		}
		return tfUserDeleteDate;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("회원 목록");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_4.setBounds(166, 0, 85, 28);
		}
		return lblNewLabel_4;
	}
	private JComboBox getCbUserSelectSearch() {
		if (cbUserSelectSearch == null) {
			cbUserSelectSearch = new JComboBox();
			cbUserSelectSearch.setModel(new DefaultComboBoxModel(new String[] {"회원상태", "ID"}));
			cbUserSelectSearch.setBounds(6, 29, 102, 27);
		}
		return cbUserSelectSearch;
	}
	private JTextField getTfUserSearch() {
		if (tfUserSearch == null) {
			tfUserSearch = new JTextField();
			tfUserSearch.setColumns(10);
			tfUserSearch.setBounds(120, 28, 187, 26);
		}
		return tfUserSearch;
	}
	private JButton getBtnUserSearch() {
		if (btnUserSearch == null) {
			btnUserSearch = new JButton("검 색");
			btnUserSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//------------회원 조건 검색------------------	
					userSearchAction();
					userCondition();
					
				}
			});
			btnUserSearch.setBounds(319, 28, 85, 29);
		}
		return btnUserSearch;
	}
	private JScrollPane getScrollPane_2() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(6, 62, 406, 137);
			scrollPane_2.setViewportView(getUserInner_Table());
		}
		return scrollPane_2;
	}
	private JPanel getNoticemanage() {
		if (noticemanage == null) {
			noticemanage = new JPanel();
			noticemanage.setLayout(null);
			noticemanage.add(getLblNewLabel_3_1_1_1());
			noticemanage.add(getScrollPane_1_1());
			noticemanage.add(getCbNoticeSelectSearch());
			noticemanage.add(getTfNoitceSelect());
			noticemanage.add(getBtnNoticeSearch());
			noticemanage.add(getLblNewLabel_4_1_2());
			noticemanage.add(getBtnNoticeDelete());
			noticemanage.add(getBtnNoticeWrite());
			noticemanage.add(getLblNewLabel_1_2_1());
			noticemanage.add(getPanel_3());
		}
		return noticemanage;
	}
	private JLabel getLblNewLabel_3_1_1_1() {
		if (lblNewLabel_3_1_1 == null) {
			lblNewLabel_3_1_1 = new JLabel("공지사항 목록");
			lblNewLabel_3_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_3_1_1.setBounds(166, 28, 85, 28);
		}
		return lblNewLabel_3_1_1;
	}
	private JScrollPane getScrollPane_1_1() {
		if (scrollPane_1_1 == null) {
			scrollPane_1_1 = new JScrollPane();
			scrollPane_1_1.setBounds(12, 96, 379, 111);
			scrollPane_1_1.setViewportView(getNoticeInner_Table());
		}
		return scrollPane_1_1;
	}
	private JComboBox getCbNoticeSelectSearch() {
		if (cbNoticeSelectSearch == null) {
			cbNoticeSelectSearch = new JComboBox();
			cbNoticeSelectSearch.setModel(new DefaultComboBoxModel(new String[] {"제목", "내용"}));
			cbNoticeSelectSearch.setBounds(15, 57, 94, 27);
		}
		return cbNoticeSelectSearch;
	}
	private JTextField getTfNoitceSelect() {
		if (tfNoitceSelect == null) {
			tfNoitceSelect = new JTextField();
			tfNoitceSelect.setColumns(10);
			tfNoitceSelect.setBounds(111, 58, 210, 26);
		}
		return tfNoitceSelect;
	}
	private JButton getBtnNoticeSearch() {
		if (btnNoticeSearch == null) {
			btnNoticeSearch = new JButton("검 색");
			btnNoticeSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//-------------- 공지사항 조건검색-----------
					noticeCondition();
				}
			});
			btnNoticeSearch.setBounds(322, 56, 75, 29);
		}
		return btnNoticeSearch;
	}
	private JLabel getLblNewLabel_4_1_2() {
		if (lblNewLabel_4_1_2 == null) {
			lblNewLabel_4_1_2 = new JLabel("내    용 ");
			lblNewLabel_4_1_2.setBounds(12, 275, 61, 16);
		}
		return lblNewLabel_4_1_2;
	}
	private JButton getBtnNoticeDelete() {
		if (btnNoticeDelete == null) {
			btnNoticeDelete = new JButton("삭 제");
			btnNoticeDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//---------공지사항 삭제-----------------
					noticeDelete();
					NoticeTableInit();
					noticeSearchAction();
					clearColumn();
			
				}
			});
			btnNoticeDelete.setBounds(316, 363, 85, 29);
		}
		return btnNoticeDelete;
	}
	private JButton getBtnNoticeWrite() {
		if (btnNoticeWrite == null) {
			btnNoticeWrite = new JButton("글쓰기");
			btnNoticeWrite.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
//--------admin menu 공지사항 작성 이벤트--------------------
					AdminNoticeWrite adminNoticeWrite = new AdminNoticeWrite();
					adminNoticeWrite.setVisible(true);
					
				}
			});

			btnNoticeWrite.setBounds(327, 8, 85, 29);
		}
		return btnNoticeWrite;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("상세 내용");
			lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(166, 208, 85, 28);
		}
		return lblNewLabel_1_2_1;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_3.setBounds(6, 234, 406, 158);
			panel_3.add(getLblNewLabel_4_1());
			panel_3.add(getTfNoticeTitle());
			panel_3.add(getLblNewLabel_4_1_1());
			panel_3.add(getTfNoticeDate());
			panel_3.add(getBtnNoticeRevise_1());
			panel_3.add(getTfNoticeText());
		}
		return panel_3;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("제    목");
			lblNewLabel_4_1.setBounds(6, 21, 61, 16);
		}
		return lblNewLabel_4_1;
	}
	private JTextField getTfNoticeTitle() {
		if (tfNoticeTitle == null) {
			tfNoticeTitle = new JTextField();
			tfNoticeTitle.setColumns(10);
			tfNoticeTitle.setBounds(50, 16, 148, 26);
		}
		return tfNoticeTitle;
	}
	private JLabel getLblNewLabel_4_1_1() {
		if (lblNewLabel_4_1_1 == null) {
			lblNewLabel_4_1_1 = new JLabel("작성일자");
			lblNewLabel_4_1_1.setBounds(238, 21, 61, 16);
		}
		return lblNewLabel_4_1_1;
	}
	private JTextField getTfNoticeDate() {
		if (tfNoticeDate == null) {
			tfNoticeDate = new JTextField();
			tfNoticeDate.setEditable(false);
			tfNoticeDate.setColumns(10);
			tfNoticeDate.setBounds(289, 16, 102, 26);
		}
		return tfNoticeDate;
	}
	
	
	private JTable getNoticeInner_Table() {
		if (NoticeInner_Table == null) {
			NoticeInner_Table = new JTable();
			NoticeInner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//-------- 공지사항 table click 이벤트 --------------				
					if (e.getButton() == 1){
						noticeTableClick();
					}
					
				}
			});
//-------- 공지사항 outtable 추가 --------------
			NoticeInner_Table.setModel(NoticeOuter_Table); // <--***************************************************
			NoticeInner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		return NoticeInner_Table;
	}
	
	
	private JButton getBtnNoticeRevise_1() {
		if (btnNoticeRevise_1 == null) {
			btnNoticeRevise_1 = new JButton("수 정");
			btnNoticeRevise_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//-------- 공지사항 수정 클릭 시 이벤트 --------------
					noticeUpdate();
					NoticeTableInit();
					noticeSearchAction();
					clearColumn();
				}
			});
			btnNoticeRevise_1.setBounds(226, 129, 85, 29);
		}
		return btnNoticeRevise_1;
	}
	
	private JTextPane getTfNoticeText() {
		if (tfNoticeText == null) {
			tfNoticeText = new JTextPane();
			tfNoticeText.setBounds(50, 43, 341, 84);
		}
		return tfNoticeText;
	}
	
	
	private JTable getUserInner_Table() {
		if (UserInner_Table == null) {
			UserInner_Table = new JTable();
			UserInner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			UserInner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//-------- 회원 테이블 클릭 --------------------
					userTableClick();
				}
			});
//-------- 회원관리 outtable 추가 --------------
			UserInner_Table.setModel(UserOuter_Table); // <--***************************************************
		}
		return UserInner_Table;
	}
	
	private JLabel getLblNewLabel_2_1_1_2() {
		if (lblNewLabel_2_1_1_2 == null) {
			lblNewLabel_2_1_1_2 = new JLabel("E -Mail :");
			lblNewLabel_2_1_1_2.setBounds(6, 138, 61, 16);
		}
		return lblNewLabel_2_1_1_2;
	}
	private JTextField getTfUserEmail() {
		if (tfUserEmail == null) {
			tfUserEmail = new JTextField();
			tfUserEmail.setEditable(false);
			tfUserEmail.setColumns(10);
			tfUserEmail.setBounds(64, 133, 219, 26);
		}
		return tfUserEmail;
	}
	
	private JPanel getNoticePanel() {
		if (noticePanel == null) {
			noticePanel = new JPanel();
			noticePanel.setLayout(null);
			noticePanel.add(getCbUserNoticeSelectSearch());
			noticePanel.add(getLblNewLabel_3_1_1_1_1());
			noticePanel.add(getTfUserNoticeSearch());
			noticePanel.add(getBtnUserNoticeSearch());
			noticePanel.add(getScrollPane_1_1_1());
		}
		return noticePanel;
	}
	private JComboBox getCbUserNoticeSelectSearch() {
		if (cbUserNoticeSelectSearch == null) {
			cbUserNoticeSelectSearch = new JComboBox();
			cbUserNoticeSelectSearch.setModel(new DefaultComboBoxModel(new String[] {"제목", "내용"}));
			cbUserNoticeSelectSearch.setBounds(33, 79, 94, 27);
		}
		return cbUserNoticeSelectSearch;
	}
	private JLabel getLblNewLabel_3_1_1_1_1() {
		if (lblNewLabel_3_1_1_1 == null) {
			lblNewLabel_3_1_1_1 = new JLabel("공 지 사 항");
			lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
			lblNewLabel_3_1_1_1.setBounds(184, 50, 85, 28);
		}
		return lblNewLabel_3_1_1_1;
	}
	private JTextField getTfUserNoticeSearch() {
		if (tfUserNoticeSearch == null) {
			tfUserNoticeSearch = new JTextField();
			tfUserNoticeSearch.setColumns(10);
			tfUserNoticeSearch.setBounds(129, 80, 210, 26);
		}
		return tfUserNoticeSearch;
	}
	private JButton getBtnUserNoticeSearch() {
		if (btnUserNoticeSearch == null) {
			btnUserNoticeSearch = new JButton("검 색");
			btnUserNoticeSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//-------사용자 공지사항 조건별 검색----------
					userNoticeTableInit();
					userNoticeCondition();
				}
			});
			btnUserNoticeSearch.setBounds(340, 78, 75, 29);
		}
		return btnUserNoticeSearch;
	}
	private JScrollPane getScrollPane_1_1_1() {
		if (scrollPane_1_1_1 == null) {
			scrollPane_1_1_1 = new JScrollPane();
			scrollPane_1_1_1.setBounds(18, 118, 402, 309);
			scrollPane_1_1_1.setViewportView(getUserNoticeInner_Table());
		}
		return scrollPane_1_1_1;
	}
	private JTable getUserNoticeInner_Table() {
		if (UserNoticeInner_Table == null) {
			UserNoticeInner_Table = new JTable();
//----inner table 조건 추가-----------
			UserNoticeInner_Table.setModel(UserNoticeOuter_Table);
			UserNoticeInner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					AdminNoticeWrite adminNoticeWrite = new AdminNoticeWrite();
					adminNoticeWrite.setVisible(true);
					userNoticeTableClick();
					adminNoticeWrite.clickPrintAction();
				
					
				}
			});
			UserNoticeInner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		return UserNoticeInner_Table;
	}
	
	
	//---------------------------------------- Admin Menu ----------------------------------------
	// textfield 초기화
	private void clearColumn() {
		tfNoticeTitle.setText("");
		tfNoticeText.setText("");
		tfNoticeDate.setText("");
		tfUserState.setText("");
		tfUserNum.setText("");
		tfUserName.setText("");
		tfUserInsertDate.setText("");
		tfUserDeleteDate.setText("");
		tfLikeNum.setText("");
		tfPostNum.setText("");
		tfUserID.setText("");
		tfUserEmail.setText("");
	}
	
	//---------------------------------------- 회원 관리 ----------------------------------------
	// 회원관리 table init
	private void UserTableInit(){
        int i = UserOuter_Table.getRowCount();
        
        UserOuter_Table.addColumn("회원번호");
        UserOuter_Table.addColumn("회원상태");
        UserOuter_Table.addColumn("ID");
        UserOuter_Table.addColumn("이름");
        UserOuter_Table.addColumn("게시글 수");
        UserOuter_Table.setColumnCount(5);

        for(int j = 0 ; j < i ; j++){
        	UserOuter_Table.removeRow(0);
        }

        UserInner_Table.setAutoResizeMode(UserInner_Table.AUTO_RESIZE_OFF);

        int vColIndex = 0;
        TableColumn col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        int width = 70;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        width = 80;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        width = 90;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        width = 90;
        col.setPreferredWidth(width);
        
        vColIndex = 4;
        col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        width = 60;
        col.setPreferredWidth(width);

	}
	
	//-------------------------------------
	// 회원 목록 전체 불러오기
	public void userSearchAction(){
        
		DBadminUserAction dBadminUserAction = new DBadminUserAction();
		ArrayList<BeanAdminUser> beanList = dBadminUserAction.userList();
		
		// beanlist에 입력된 data 개수 listcount에 저장
		int listCount = beanList.size();
		for (int i = 0; i < listCount; i++) {
			// get(i)만 하면 beanlist에 저장된 한 열을 전부 가져오지만 getSeqno를 넣으면 해당 줄의 seqno만 가져온다.
			String seqString = Integer.toString(beanList.get(i).getUserno());
			String[] qTxt = {seqString, beanList.get(i).getUserstate(), beanList.get(i).getUserid(), beanList.get(i).getUsername(), beanList.get(i).getUserpostnum()};
			UserOuter_Table.addRow(qTxt);
		}
	}
	
	//-------------------------------------
	// 회원 table 클릭
	private void userTableClick() {
		
		DBadminUserAction dBadminUserAction = new DBadminUserAction();
		ArrayList<BeanAdminUser> beanList = dBadminUserAction.userList();
		
        int i = UserInner_Table.getSelectedRow();
        String wkUserno= (String)UserInner_Table.getValueAt(i, 0);
        int tsUserno = Integer.parseInt(wkUserno);
        
        // inner table 데이터 가져오기
        String wkpostnum= (String)UserInner_Table.getValueAt(i, 4);
        
        
        DBadminUserAction dbAction = new DBadminUserAction(tsUserno);
        BeanAdminUser bean = dbAction.userTableClick();
        String wklikenum = dbAction.userLikeSum();
        
        //클릭한 데이터값 출력
        
        tfUserNum.setText(Integer.toString(bean.getUserno()));
        tfUserState.setText(bean.getUserstate());
        tfUserID.setText(bean.getUserid());
        tfUserName.setText(bean.getUsername());
        tfUserEmail.setText(bean.getUseremail());
        tfPostNum.setText(wkpostnum);
        tfUserInsertDate.setText(bean.getUserinsertdate());
        tfUserDeleteDate.setText(bean.getUserdeletedate());
        tfLikeNum.setText(wklikenum);
        
	}
	
	//-------------------------------------
	// 회원검색 콤보 column명으로 변경
	// Condition Query
	private void userCondition() {
		int i = cbUserSelectSearch.getSelectedIndex();
		String ConditionColumn = "";
		
		switch (i) {
			case 0:
				ConditionColumn = "userstate";
				break;
				
			case 1:
				ConditionColumn = "userid";
				break;
				
				
			default:
				break;
		}
		UserTableInit();
		clearColumn();
		userConditionAction(ConditionColumn);
		
	}
	
	//-------------------------------------
	// 회원 목록 조건 검색 method
	private void userConditionAction(String ConditionColumn) {
	String search = tfUserSearch.getText().trim();
	
	DBadminUserAction dbAction = new DBadminUserAction();
	
	ArrayList<BeanAdminUser> beanList = dbAction.selectSearch(ConditionColumn, search);
	
	
	int listCount = beanList.size();
	for (int i = 0; i < listCount; i++) {
		String seqString = Integer.toString(beanList.get(i).getUserno());
		String[] qTxt = {seqString, beanList.get(i).getUserstate(), beanList.get(i).getUserid(), beanList.get(i).getUsername(), beanList.get(i).getUserpostnum()};
		UserOuter_Table.addRow(qTxt);
	}

	}

	
	//---------------------------------------- 공지사항 관리 ----------------------------------------
	// 공지사항 table init
	public void NoticeTableInit(){
        int i = NoticeOuter_Table.getRowCount();
        
        NoticeOuter_Table.addColumn("No");
        NoticeOuter_Table.addColumn("제목");
        NoticeOuter_Table.addColumn("게시일자");
        NoticeOuter_Table.addColumn("수정일자");
        NoticeOuter_Table.setColumnCount(4);

        for(int j = 0 ; j < i ; j++){
        	NoticeOuter_Table.removeRow(0);
        }

        NoticeInner_Table.setAutoResizeMode(NoticeInner_Table.AUTO_RESIZE_OFF);

        int vColIndex = 0;
        TableColumn col = NoticeInner_Table.getColumnModel().getColumn(vColIndex);
        int width = 25;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = NoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 180;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = NoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 85;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = NoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 85;
        col.setPreferredWidth(width);

	}
	
	//-------------------------------------
	// 공지사항 목록 전체 불러오기
	public void noticeSearchAction(){
        
		DBadminNoitceAction dBadminNoitceAction = new DBadminNoitceAction();

		ArrayList<BeanAdminNotice> beanList = dBadminNoitceAction.noticeList();
		
		// beanlist에 입력된 data 개수 listcount에 저장
		int listCount = beanList.size();
		for (int i = 0; i < listCount; i++) {
			// get(i)만 하면 beanlist에 저장된 한 열을 전부 가져오지만 getSeqno를 넣으면 해당 줄의 seqno만 가져온다.
			String seqString = Integer.toString(beanList.get(i).getNoticeno());
			String[] qTxt = {seqString, beanList.get(i).getNoticetitle(), beanList.get(i).getNoticetime(), beanList.get(i).getNoticeUpdatetime()};
			NoticeOuter_Table.addRow(qTxt);
		}
	}
	
	
	//-------------------------------------
	// 공지사항 table 클릭
	private void noticeTableClick() {
		
        int i = NoticeInner_Table.getSelectedRow();
        String wkNoticeno = (String)NoticeInner_Table.getValueAt(i, 0);
        
        int tsNoticeno = Integer.parseInt(wkNoticeno);
        
        DBadminNoitceAction dbAction = new DBadminNoitceAction(tsNoticeno);
        BeanAdminNotice bean = dbAction.noticeTableClick();
        
        ShareVar.noticeTableClickNum= bean.getNoticeno();
        tfNoticeTitle.setText(bean.getNoticetitle());
        tfNoticeText.setText(bean.getNoticetext());
        tfNoticeDate.setText(bean.getNoticetime());
        
	}
	
	//-------------------------------------
	// notice 목록 삭제 method
	private void noticeDelete() {
		
		DBadminNoitceAction dbAction = new DBadminNoitceAction();
		
		boolean msg = dbAction.noticeDeleteAction(ShareVar.noticeTableClickNum);
		
		if(msg == true) {
			JOptionPane.showMessageDialog(this, "삭제가 완료되었습니다.");
		} else {
			JOptionPane.showMessageDialog(null, "삭제가 불가합니다.");
			
		}
	}
	
	//-------------------------------------
	// notice 목록 수정 method
	private void noticeUpdate() {
	     	String noticeTitle = tfNoticeTitle.getText().trim();
	        String noticeText = tfNoticeText.getText().trim();
		
			DBadminNoitceAction dbAction = new DBadminNoitceAction();
			
			boolean msg = dbAction.noticeUpdateAction(ShareVar.noticeTableClickNum, noticeTitle, noticeText);
			
			if(msg == true) {
				JOptionPane.showMessageDialog(this, "수정이 완료되었습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "수정이 불가합니다.");
			}
			
	}

	//-------------------------------------
	// notice 콤보 column명으로 변경
	// Condition Query
	private void noticeCondition() {
		int i = cbNoticeSelectSearch.getSelectedIndex();
		String ConditionColumn = "";
		
		switch (i) {
			case 0:
				ConditionColumn = "noticetitle";
				break;
				
			case 1:
				ConditionColumn = "noticetext";
				break;
				
				
			default:
				break;
		}
		NoticeTableInit();
		clearColumn();
		noticeConditionAction(ConditionColumn);
		
	}
	
	//-------------------------------------
	// notice 목록 조건 검색 method
	private void noticeConditionAction(String ConditionColumn) {
	String search = tfNoitceSelect.getText().trim();
	
	DBadminNoitceAction dbAction = new DBadminNoitceAction();
	
	ArrayList<BeanAdminNotice> beanList = dbAction.selectSearch(ConditionColumn, search);
	
	
	int listCount = beanList.size();
	for (int i = 0; i < listCount; i++) {
		String seqString = Integer.toString(beanList.get(i).getNoticeno());
		String[] qTxt = {seqString, beanList.get(i).getNoticetitle(), beanList.get(i).getNoticetime(), beanList.get(i).getNoticeUpdatetime()};
		NoticeOuter_Table.addRow(qTxt);
	}

	}
	
	
	//-------------------------공지사항-----------------------------------------
	// 공지사항 table init
	public void userNoticeTableInit(){
        int i = UserNoticeOuter_Table.getRowCount();
        UserNoticeOuter_Table.addColumn("No");
        UserNoticeOuter_Table.addColumn("제목");
        UserNoticeOuter_Table.addColumn("게시일자");
        UserNoticeOuter_Table.addColumn("작성자");
        UserNoticeOuter_Table.setColumnCount(4);

        for(int j = 0 ; j < i ; j++){
        	UserNoticeOuter_Table.removeRow(0);
        }
        

        UserNoticeInner_Table.setAutoResizeMode(UserNoticeInner_Table.AUTO_RESIZE_OFF);

        int vColIndex = 0;
        TableColumn col = UserNoticeInner_Table.getColumnModel().getColumn(vColIndex);
        int width = 25;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = UserNoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 200;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = UserNoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 85;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = UserNoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 85;
        col.setPreferredWidth(width);
        
        

	}
	
	//-------------------------------------
	// 공지사항 목록 전체 불러오기
	public void userNoticeSearchAction(){
        
		DBadminNoitceAction dBadminNoitceAction = new DBadminNoitceAction();

		ArrayList<BeanAdminNotice> beanList = dBadminNoitceAction.noticeList();
		
		// beanlist에 입력된 data 개수 listcount에 저장
		int listCount = beanList.size();
		for (int i = 0; i < listCount; i++) {
			// get(i)만 하면 beanlist에 저장된 한 열을 전부 가져오지만 getSeqno를 넣으면 해당 줄의 seqno만 가져온다.
			String seqString = Integer.toString(beanList.get(i).getNoticeno());
			String[] qTxt = {seqString, beanList.get(i).getNoticetitle(), beanList.get(i).getNoticetime(), "관리자"};
			UserNoticeOuter_Table.addRow(qTxt);
		}
	}
	
	
	//-------------------------------------
	// 공지사항 table 클릭
	private void userNoticeTableClick() {
		
        int i = UserNoticeInner_Table.getSelectedRow();
        String wkNoticeno = (String)UserNoticeInner_Table.getValueAt(i, 0);
        
        int tsNoticeno = Integer.parseInt(wkNoticeno);
        
        DBadminNoitceAction dbAction = new DBadminNoitceAction(tsNoticeno);
        BeanAdminNotice bean = dbAction.noticeTableClick();
        
        ShareVar.userNoticeTableClickNum = bean.getNoticeno();
        ShareVar.noticeTitle = bean.getNoticetitle();
        ShareVar.noticeText = bean.getNoticetext();
        
	}
	
	
	//-------------------------------------
	// notice 콤보 column명으로 변경
	// Condition Query
	private void userNoticeCondition() {
		int i = cbUserNoticeSelectSearch.getSelectedIndex();
		String ConditionColumn = "";
		
		switch (i) {
			case 0:
				ConditionColumn = "noticetitle";
				break;
				
			case 1:
				ConditionColumn = "noticetext";
				break;
				
				
			default:
				break;
		}
		userNoticeTableInit();
		userNoticeConditionAction(ConditionColumn);
		
	}
	
	// notice 목록 조건 검색 method
	private void userNoticeConditionAction(String ConditionColumn) {
	String search = tfUserNoticeSearch.getText().trim();
	
	DBadminNoitceAction dbAction = new DBadminNoitceAction();
	
	ArrayList<BeanAdminNotice> beanList = dbAction.selectSearch(ConditionColumn, search);
	
	
	int listCount = beanList.size();
	for (int i = 0; i < listCount; i++) {
		String seqString = Integer.toString(beanList.get(i).getNoticeno());
		String[] qTxt = {seqString, beanList.get(i).getNoticetitle(), beanList.get(i).getNoticetime(), "관리자"};
		UserNoticeOuter_Table.addRow(qTxt);
	}

	}
	
	
	//-------------------------recipe list-----------------------------------------
	//-------------------------------------
	// recipe list  공지사항 버튼 최신 notice 제목 출력 
	private String updateNotice() {
		DBadminNoitceAction dBadminNoitceAction = new DBadminNoitceAction();
		BeanAdminNotice bean = dBadminNoitceAction.updateNotice();
		return bean.getNoticetitle();
	}


} // 끝 --------------------------------------------------------------------
