package com.javalec.base;

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

import javax.swing.JLayeredPane;
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

public class MiniGame extends JDialog {
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	private JPanel sideBar;
	private JPanel homeMenu;
	private JLabel lblNewLabel_2;
	private JLabel lblBrandLogo;
	private JLabel lblHome;
	private JPanel noticeMenu;
	private JLabel lblHome_1;
	private JPanel recipeMenu;
	private JLabel RecipeTab;
	private JPanel recipeMenu_1;
	private JLabel lblHome_1_1_1;
	private JPanel miniGameMenu;
	private JLabel MiniGameTab;
	private JPanel adminMenu;
	private JLabel label;
	private JPanel panel;
	private JPanel noticePanel;
	private JPanel homePanel;
	private JLabel label_1;
	private JLabel label_2;
	private JPanel RecipeListPanel;
	private JTabbedPane tabbedPane;
	private JPanel Best;
	private JPanel Update;
	private JScrollPane scrollPane;
	private JTable inner_table1;
	private JTextField textField;
	private JButton btnOk_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
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
	private JPanel MiniGamePanel;
	private JPanel panel_1;
	private JLabel label_4;
	private JLabel label_1_1;
	private JLabel lblNewLabel_5;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniGame dialog = new MiniGame();
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
	public MiniGame() {
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석 all rights reserved.");
		setBounds(100, 100, 664, 484);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getSideBar());
		getContentPane().add(getPanel_1());

	}
	private JPanel getSideBar() {
		if (sideBar == null) {
			sideBar = new JPanel();
			sideBar.setBackground(SystemColor.activeCaptionBorder);
			sideBar.setBounds(0, 0, 224, 523);
			sideBar.setLayout(null);
			sideBar.add(getLblNewLabel_2());
			sideBar.add(getLblBrandLogo());
			sideBar.add(getHomeMenu());
			sideBar.add(getNoticeMenu());
			sideBar.add(getRecipeMenu());
			sideBar.add(getRecipeMenu_1());
			sideBar.add(getMiniGameMenu());
			sideBar.add(getAdminMenu());
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
					MiniGamePanel.setVisible(false);
					getHomeMenu().setBackground(Color.white);				
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					getRecipeMenu().setBackground(new Color(221, 160, 221));
					
					
				}
			});
			homeMenu.setBackground(new Color(221, 160, 221));
			homeMenu.setBounds(0, 134, 224, 44);
			homeMenu.setLayout(null);
			homeMenu.add(getLblHome());
		}
		return homeMenu;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("로그아웃");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(146, 429, 61, 16);
		}
		return lblNewLabel_2;
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
					
					homePanel.setVisible(false);
					noticePanel.setVisible(true);
					RecipeListPanel.setVisible(false);
					MiniGamePanel.setVisible(false);
					getNoticeMenu().setBackground(Color.white);
					getHomeMenu().setBackground(new Color(221, 160, 221));
					getRecipeMenu().setBackground(new Color(221, 160, 221));
					
				}
			});
			noticeMenu.setLayout(null);
			noticeMenu.setBackground(new Color(221, 160, 221));
			noticeMenu.setBounds(0, 179, 224, 44);
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
					MiniGamePanel.setVisible(false);
					getRecipeMenu().setBackground(Color.white);
					getHomeMenu().setBackground(new Color(221, 160, 221));
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					
					
					
				}
			});
			recipeMenu.setLayout(null);
			recipeMenu.setBackground(new Color(221, 160, 221));
			recipeMenu.setBounds(0, 224, 224, 44);
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
	private JPanel getRecipeMenu_1() {
		if (recipeMenu_1 == null) {
			recipeMenu_1 = new JPanel();
			recipeMenu_1.setLayout(null);
			recipeMenu_1.setBackground(new Color(221, 160, 221));
			recipeMenu_1.setBounds(0, 269, 224, 44);
			recipeMenu_1.add(getLblHome_1_1_1());
		}
		return recipeMenu_1;
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
			miniGameMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					homePanel.setVisible(false);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(false);
					MiniGamePanel.setVisible(true);
					getMiniGameMenu().setBackground(Color.white);
					getRecipeMenu().setBackground(new Color(221, 160, 221));
					getHomeMenu().setBackground(new Color(221, 160, 221));
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					
				}
			});
			miniGameMenu.setLayout(null);
			miniGameMenu.setBackground(new Color(221, 160, 221));
			miniGameMenu.setBounds(0, 314, 224, 44);
			miniGameMenu.add(getMiniGameTab());
		}
		return miniGameMenu;
	}
	private JLabel getMiniGameTab() {
		if (MiniGameTab == null) {
			MiniGameTab = new JLabel("miniGame\n");
			MiniGameTab.setHorizontalAlignment(SwingConstants.CENTER);
			MiniGameTab.setBounds(67, 0, 89, 44);
		}
		return MiniGameTab;
	}
	private JPanel getAdminMenu() {
		if (adminMenu == null) {
			adminMenu = new JPanel();
			adminMenu.setLayout(null);
			adminMenu.setBackground(new Color(221, 160, 221));
			adminMenu.setBounds(0, 359, 224, 44);
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
			panel.add(getNoticePanel(), "name_11746695439519");
			panel.add(getRecipeListPanel(), "name_13098176263849");
			panel.add(getMiniGamePanel(), "name_187313085265300");
		}
		return panel;
	}
	private JPanel getNoticePanel() {
		if (noticePanel == null) {
			noticePanel = new JPanel();
			noticePanel.setBackground(new Color(0, 255, 0));
			noticePanel.setLayout(null);
			noticePanel.add(getLabel_1());
		}
		return noticePanel;
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
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("공지사항");
			label_1.setBounds(159, 81, 61, 16);
		}
		return label_1;
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
			Best.add(getComboBox());
			Best.add(getComboBox_1());
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
						
			inner_table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_table1.setModel(Outer_Table);
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
			btnOk_1.setBounds(289, 34, 68, 40);
		}
		return btnOk_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"전체", "밥 요리", "면 요리", "기타"}));
			comboBox.setBounds(91, 10, 93, 27);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"전체", "10분 이내", "20분 이내", "30분 이내"}));
			comboBox_1.setBounds(243, 10, 93, 27);
		}
		return comboBox_1;
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
			btnNewButton = new JButton("🎁 11월 빼빼로데이 이벤트 당첨자 발표 🎉🎉🎉");
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




	
	


	private JPanel getMiniGamePanel() {
		if (MiniGamePanel == null) {
			MiniGamePanel = new JPanel();
			MiniGamePanel.setBackground(Color.WHITE);
			MiniGamePanel.setLayout(null);
			MiniGamePanel.add(getLabel_4());
			MiniGamePanel.add(getLabel_1_1());
			MiniGamePanel.add(getLblNewLabel_5());
		}
		return MiniGamePanel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(225, 0, 423, 445);
		}
		return panel_1;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("그림을 클릭하세요!");
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setFont(new Font("배달의민족 도현", Font.PLAIN, 20));
			label_4.setBounds(53, 349, 310, 60);
		}
		return label_4;
	}
	private JLabel getLabel_1_1() {
		if (label_1_1 == null) {
			label_1_1 = new JLabel("오늘 뭐먹지? 메뉴 랜덤 추천★");
			label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1_1.setFont(new Font("배달의민족 도현", Font.BOLD, 26));
			label_1_1.setBounds(27, 39, 373, 60);
		}
		return label_1_1;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					GameMenu gameMenu = new GameMenu();
					gameMenu.setVisible(true); // 메뉴 출력 화면
					gameMenu.randomMenu(); // 랜덤 메뉴 정하기
					gameMenu.getMenu(); // 랜덤에 맞는 이미지 출력
				}
				
			});
			lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\2bbee\\Desktop\\Coding\\프로젝트\\1. Swing+DB\\픽토그램\\flaticon\\serve.png"));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(63, 119, 275, 223);
		}
		return lblNewLabel_5;
	}
	
	
	
	
	
	
	
} // 끝 --------------------------------------------------------------------
