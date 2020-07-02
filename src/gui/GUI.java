/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;

import main.Run;
import pattern.Output;

import javax.swing.GroupLayout;

import java.awt.event.ActionEvent;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Frame;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.SystemColor;


/**
 * GUI.
 * @author Le Ngoc Anh
 */
public class GUI extends JFrame {
	public static List<String>choosenList = new ArrayList<String>();
	private static String day;

	// Variables declaration - do not modify
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JComboBox<String> jComboBox1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JList<String> jList1;
	private JList<String> jList2;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JTextArea jTextArea1;
	// End of variables declaration
	
	public static String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}


	public GUI() {
		setResizable(true);
		setBackground(SystemColor.control);
		getContentPane().setBackground(SystemColor.control);
		setFocusTraversalPolicyProvider(true);
		setState(Frame.ICONIFIED);
//		try {
//			setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("C:\\Users\\ANH.LN180008\\Pictures\\Saved Pictures\\jpg")))));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new JPanel();
		jPanel1.setBackground(SystemColor.control);
		jLabel1 = new JLabel();
		jComboBox1 = new JComboBox<>();
		jComboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDay(jComboBox1.getSelectedItem().toString());
			}
		});
		jPanel2 = new JPanel();
		jPanel2.setBackground(SystemColor.control);
		jScrollPane2 = new JScrollPane();
		jList2 = new JList<>();
		jList2.setSize(new Dimension(0, 6));
		jList2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		jLabel3 = new JLabel();
		jPanel3 = new JPanel();
		jScrollPane3 = new JScrollPane();
		jTextArea1 = new JTextArea();
		jTextArea1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		jTextArea1.setFocusCycleRoot(true);
		jTextArea1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jPanel4 = new JPanel();
		jPanel4.setBackground(SystemColor.control);
		jScrollPane1 = new JScrollPane();
		jList1 = new JList<>();
		jList1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		jLabel2 = new JLabel();
		jButton1 = new JButton();
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choosenList.clear();
				Output.text = "";
				jTextArea1.setText("");
				List<String> listItem = new ArrayList<String>();
				for (int i = 0; i < jList2.getModel().getSize(); i++) {
					listItem.add(jList2.getModel().getElementAt(i));
				}
				List<String> listSelectedItem = jList2.getSelectedValuesList();
				for (int k = 0; k < listSelectedItem.size(); k++) {
					if (listItem.contains(listSelectedItem.get(k))) {
						listItem.remove(listSelectedItem.get(k));
					}
				}
				
				int size = listItem.size();
				String[] values = new String[size];
				for (int i = 0; i < size; i++) {
					values[i] = listItem.get(i);
					choosenList.add(listItem.get(i));
				}
				
				jList2.setListData(values);
			}
		});
		jButton2 = new JButton();
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextArea1.setText("");
				Output.text = "";
				choosenList.clear();
				jList2.setListData(new String[0]);
			}
		});
		jButton3 = new JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextArea1.setText("");
				Output.text = "";
				Run.run();
				
				jTextArea1.setText(Output.text + "\n");

			}
		});
		jButton4 = new JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> list = jList1.getSelectedValuesList();
				int size = list.size();
				String[] values = new String[size];
				for (int i = 0; i < size; i++) {
					values[i] = list.get(i);
					choosenList.add(list.get(i));
				}
				jList2.setListData(values);
			}

		});

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Chọn Ngày");

		jComboBox1.setModel(new DefaultComboBoxModel<>(
				new String[] { "04/05/2020", "05/05/2020", "06/05/2020", "07/05/2020", "08/05/2020" }));


		javax.swing.GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addGap(18, 18, 18).addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(31, Short.MAX_VALUE)));

		jList2.setToolTipText("Các Tag đã được chọn");
		jList2.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {};

			public int getSize() {
				return values.length;
			}

			public String getElementAt(int index) {
				return values[index];
			}
		});
		jScrollPane2.setViewportView(jList2);

		jLabel3.setText("Tag đã chọn");

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3).addGap(0, 0,
										Short.MAX_VALUE)))));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(29, Short.MAX_VALUE)));

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.setToolTipText("");
		jScrollPane3.setViewportView(jTextArea1);

		jList1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Chỉ số Vn-index buổi sáng", "Áp lực mua hoặc bán", "Chỉ số Vn-index chốt phiên", "Thị trường phát sinh",
											"Tổng quan số mã tăng giảm", "Klgd, gtgd của sàn hose", "Top 5 tăng giá", "Top 5 giảm giá", 
											"Top 3 khối lượng khớp lệnh", "Tăng giá mạnh nhất", "Giảm giá mạnh nhất",  "Mã top gtgd", "Nhóm cổ phiếu ngân hàng", 
											"Nhóm cổ phiếu dầu khí", "Đứng giá", "Tăng giá", "Giảm giá", "Nhóm cổ phiếu bluechip VN30", "Nhóm cổ phiếu họ VinGroup", 
											"Nhóm cổ phiếu thủy sản", "Nhóm cổ phiếu hàng không", "Top 20 công ti có giá trị vốn hóa thị trường cao nhất tăng giá", 
											"Top 20 công ti có giá trị vốn hóa thị trường cao nhất giảm giá", "Top 20 công ti có giá trị vốn hóa thị trường cao nhất đứng giá",
											};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		jList1.setToolTipText("Xin chọn Tag");
		jScrollPane1.setViewportView(jList1);

		jLabel2.setText("Danh sách Tag");

		GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
								.addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel2).addGap(0, 0,
										Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel4Layout.createSequentialGroup().addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)));

		jButton1.setText("Remove");

		jButton2.setText("Clear all");
		jButton3.setText("OK");
		jButton4.setText("Add");

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jButton1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
							.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(layout.createSequentialGroup()
							.addGap(140)
							.addComponent(jButton4)
							.addContainerGap(296, Short.MAX_VALUE))))
				.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jPanel4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
									.addGap(22)
									.addComponent(jButton1)
									.addGap(29)
									.addComponent(jButton2)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jButton3)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(jButton4)))
					.addGap(35)
					.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
		);
		jPanel3.setLayout(new BorderLayout(0, 0));
		jPanel3.add(jScrollPane3);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI().setVisible(true);
			}
		});
	}

}
