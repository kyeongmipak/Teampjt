package com.javalec.recipelist;


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

import com.javalec.admin.AdminNoticeWrite;
import com.javalec.base.ShareVar;
import com.javalec.function.BeanRecipe;
import com.javalec.function.DbActionRecipe;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RecipeList extends JDialog {
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
	private JLabel lblHome_1_1_1_1;
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
	private JTextField tfSearch;
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
	private JTable inner_table2;
	private JButton btnNewButton_1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeList dialog = new RecipeList();
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
	public RecipeList() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				TableInit();
				SearchAction();
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
					getRecipeMenu().setBackground(Color.white);
					getHomeMenu().setBackground(new Color(221, 160, 221));
					getNoticeMenu().setBackground(new Color(221, 160, 221));
					
					TableInit();
					SearchAction();
					
					
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
			miniGameMenu.setLayout(null);
			miniGameMenu.setBackground(new Color(221, 160, 221));
			miniGameMenu.setBounds(0, 314, 224, 44);
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
			RecipeListPanel.add(getBtnNewButton_1());
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
			Best.add(getTfSearch());
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
			scrollPane.setBounds(6, 72, 361, 202);
			scrollPane.setViewportView(getInner_table1());
		}
		return scrollPane;
	}
	private JTable getInner_table1() {
		if (inner_table1 == null) {
			inner_table1 = new JTable();
			inner_table1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1){
//						TableClick();
					}
				}
			});
						
			inner_table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_table1.setModel(Outer_Table);
		}
		return inner_table1;
	}

	
	
	
	private JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBounds(16, 36, 266, 27);
			tfSearch.setColumns(10);
			tfSearch.setBorder(LineBorder.createGrayLineBorder());
		}
		return tfSearch;
	}
	private JButton getBtnOk_1() {
		if (btnOk_1 == null) {
			btnOk_1 = new JButton("검색");
			btnOk_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnOk_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {	
					ConditionQuery();
					SearchAction();
				}
			});
			btnOk_1.setBounds(287, 30, 68, 40);
		}
		return btnOk_1;
	}
	private JComboBox getCbMenu() {
		if (cbMenu == null) {
			cbMenu = new JComboBox();
			cbMenu.setModel(new DefaultComboBoxModel(new String[] {"전체", "밥요리", "면요리", "기타"}));
			cbMenu.setBounds(89, 6, 93, 27);
		}
		return cbMenu;
	}
	private JComboBox getCbCookTime() {
		if (cbCookTime == null) {
			cbCookTime = new JComboBox();
			cbCookTime.setModel(new DefaultComboBoxModel(new String[] {"전체", "10분이내", "20분이내", "30분이내"}));
			cbCookTime.setBounds(241, 6, 93, 27);
		}
		return cbCookTime;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("카테고리 : ");
			lblNewLabel.setBounds(36, 10, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("요리시간 :");
			lblNewLabel_1.setBounds(189, 10, 61, 16);
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
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"전체", "밥요리", "면요리", "기타"}));
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
			comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"전체", "10분이내", "20분이내", "30분이내"}));
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
			scrollPane_1.setViewportView(getInner_table2());
		}
		return scrollPane_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("🎁 11월 빼빼로데이 이벤트 당첨자 발표 🎉🎉🎉");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					goToNoticeWrite();
				}
			});
			btnNewButton.setBounds(80, 54, 332, 23);
		}
		return btnNewButton;
	}
	private JLabel getLabel_3_1() {
		if (label_3 == null) {
			label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon("C:\\Users\\2bbee\\Desktop\\Coding\\프로젝트\\1. Swing+DB\\픽토그램\\flaticon\\[크기변환]megapppphone.png"));
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBounds(20, 37, 57, 53);
		}
		return label_3;
	}
	
	
	//전체 검색결과를 Table로 
	private void SearchAction(){
		DbActionRecipe dbActionLecipe = new DbActionRecipe();
		ArrayList<BeanRecipe> BeanRecipe = dbActionLecipe.SearchAction(); 
		
		int Count = BeanRecipe.size();
		
		for (int index = 0; index < Count; index++) {
			String temp = Integer.toString(BeanRecipe.get(index).getPostno());
			String[] qTxt = {temp, BeanRecipe.get(index).getTitle(), BeanRecipe.get(index).getUserid()};
			Outer_Table.addRow(qTxt);
		}

	}
	
	

	// Table 초기화
	@SuppressWarnings("static-access")
	private void TableInit(){
        int i = Outer_Table.getRowCount();
        
        Outer_Table.addColumn("No");
        Outer_Table.addColumn("제목");
        Outer_Table.addColumn("작성자");
//        Outer_Table.addColumn("개시일");
//        Outer_Table.addColumn("추천수");
        Outer_Table.setColumnCount(3);

        for(int j = 0 ; j < i ; j++){
            Outer_Table.removeRow(0);
        }

        inner_table1.setAutoResizeMode(inner_table1.AUTO_RESIZE_OFF);
        
        int vColIndex = 0;
        TableColumn col = inner_table1.getColumnModel().getColumn(vColIndex);
        int width = 40;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = inner_table1.getColumnModel().getColumn(vColIndex);
        width = 150;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = inner_table1.getColumnModel().getColumn(vColIndex);
        width = 100;
        col.setPreferredWidth(width);

//        vColIndex = 3;
//        col = inner_table1.getColumnModel().getColumn(vColIndex);
//        width = 200;
//        col.setPreferredWidth(width);

	}   

	public void tableclick() {
		 int i = inner_table1.getSelectedRow();
	        String tkposterno = (String)inner_table1.getValueAt(ShareVar.postno);
	        int wkposterno = Integer.parseInt(tkposterno);
	        
	        DbActionRecipe dbAction = new DbActionRecipe(wkposterno);
	        BeanRecipe bean = dbAction.TableClick();
	        
//	        tfSeqno.setText(Integer.toString(bean.getSeqno()));
//	        tfName.setText(bean.getName());
//	        tfTelno.setText(bean.getTelno());
//	        tfAddress.setText(bean.getAddress());
//	        tfEmail.setText(bean.getEmail());
//	        tfRelation.setText(bean.getRelation());
	        
//	        // Image처리
//	        // File name이 틀려야 즉각 보여주기가 가능하여   
//	        // ShareVar에서 int값으로 정의하여 계속 증가하게 하여 file name으로 사용후 삭제
//	        
//			String filePath = Integer.toString(ShareVar.filename);
//			tfFilePath.setText(filePath);
//			
//			lblImage.setIcon(new ImageIcon(filePath));
//			lblImage.setHorizontalAlignment(SwingConstants.CENTER);
//			
//			File file = new File(filePath);
//			file.delete();
//			
//			tfFilePath.setText("");
	}
	
	
	
		// 조건 검색 항목 결정 
		private void ConditionQuery() {
			int i = cbMenu.getSelectedIndex() + cbCookTime.getSelectedIndex();
			String ConditionQueryColumn = "";
			switch (i) {
			case 0:
				ConditionQueryColumn = "밥요리" + "10분이내";
				break;
			case 1:
				ConditionQueryColumn = "밥요리" + "20분이내";
				break;
			case 2:
				ConditionQueryColumn = "밥요리" + "30분이내";
				break;
			case 3:
				ConditionQueryColumn = "면요리" + "10분이내";
				break;
			case 4:
				ConditionQueryColumn = "면요리" + "20분이내";
				break;
			case 5:
				ConditionQueryColumn = "면요리" + "30분이내";
				break;
			default:
				break;
			}
			
			TableInit();
//			ConditionQueryAction(ConditionQueryColumn);
		}
		
		// 조건검색 실행 
		private void ConditionQueryAction(String ConditionQueryColumn) {
			
			String str = tfSearch.getText().trim();
			DbActionRecipe dbActionRecipe = new DbActionRecipe();
			
			// dbAction의 selectlist를 실행해서 검색값이 beanList에 쌓이게 됨! (데이터가 많으니까 arraylist사용해서 넘겨줄게!)
			ArrayList<BeanRecipe> beanList = dbActionRecipe.checkKeword();
			
			// beanlist에 몇개나 들어와있는지 확인해보는 것.
			int listCount = beanList.size();
			
			for(int i = 0; i < listCount; i++) {
				// seqno가 int기 때문에 String으로 변환해서 받아줘야 함! i번째 줄의 getSeqno를 가져오기!
				String seqString = Integer.toString(beanList.get(i).getPostno());
				// 배열 잡은 것 
				String[] qTxt = {seqString, beanList.get(i).getTitle(), beanList.get(i).getUserid(), beanList.get(i).getPostinsertdate()};
				Outer_Table.addRow(qTxt);
			}
		}
		
		
		
		
	private JTable getInner_table2() {
		if (inner_table2 == null) {
			inner_table2 = new JTable();
		}
		return inner_table2;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("글 작성");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableclick();
//					goToWrite();
				}
			});
			btnNewButton_1.setForeground(new Color(30, 144, 255));
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			btnNewButton_1.setBounds(315, 87, 86, 39);
		}
		return btnNewButton_1;
	}
	
//	public void goToPostWrite() {
//		 PostWrite write = new PostWrite();
//		 write.setLocationRelativeTo(null);
//		 write.setVisible(true); //  창 보여주는 역할
//	}
	
	public void goToNoticeWrite() {
		AdminNoticeWrite adminNoticeWrite = new AdminNoticeWrite();
		adminNoticeWrite.setLocationRelativeTo(null);
		adminNoticeWrite.setVisible(true);
	}
	
	
	
	
} // 끝 --------------------------------------------------------------------
