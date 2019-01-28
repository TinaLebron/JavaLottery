package lottery;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;


import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;

public class BigLottery extends JFrame {

	private JPanel contentPane;
	private JTextField tfPickNumber6;
	private JTextField tfPickNumber5;
	private JTextField tfPickNumber4;
	private JTextField tfPickNumber3;
	private JTextField tfPickNumber2;
	private JTextField tfPickNumber1;
	private JTextField tfWinningNumber1;
	private JTextField tfWinningNumber2;
	private JTextField tfWinningNumber3;
	private JTextField tfWinningNumber4;
	private JTextField tfWinningNumber5;
	private JTextField tfWinningNumber6;
	private JTextField tfWinningNumber7;
	private JList listnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BigLottery frame = new BigLottery();
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
	public BigLottery() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1113, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblTitle = new JLabel("$ 大樂透選號系統 $");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("PMingLiU", Font.PLAIN, 18));
		contentPane.add(lblTitle, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 408, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JPanel panelLeft = new JPanel();
		panelLeft.setForeground(new Color(255, 255, 255));
		panelLeft.setBackground(new Color(0, 0, 205));
		GridBagConstraints gbc_panelLeft = new GridBagConstraints();
		gbc_panelLeft.insets = new Insets(0, 0, 0, 5);
		gbc_panelLeft.fill = GridBagConstraints.BOTH;
		gbc_panelLeft.gridx = 0;
		gbc_panelLeft.gridy = 0;
		panel.add(panelLeft, gbc_panelLeft);
		GridBagLayout gbl_panelLeft = new GridBagLayout();
		gbl_panelLeft.columnWidths = new int[] { 428, 0 };
		gbl_panelLeft.rowHeights = new int[] { 36, 43, 179, 157, 0 };
		gbl_panelLeft.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelLeft.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelLeft.setLayout(gbl_panelLeft);

		JLabel lblfPick = new JLabel(" 投注");
		lblfPick.setForeground(new Color(255, 255, 255));
		lblfPick.setFont(new Font("PMingLiU", Font.PLAIN, 15));
		GridBagConstraints gbc_lblfPick = new GridBagConstraints();
		gbc_lblfPick.insets = new Insets(0, 0, 5, 0);
		gbc_lblfPick.gridx = 0;
		gbc_lblfPick.gridy = 0;
		panelLeft.add(lblfPick, gbc_lblfPick);

		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.anchor = GridBagConstraints.NORTH;
		gbc_panel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		panelLeft.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 205));
		panel_4.setPreferredSize(new Dimension(10, 50));
		panel_4.setAlignmentY(4.0f);
		panel_3.add(panel_4);

		tfPickNumber1 = new JTextField();
		pickNums.add(tfPickNumber1);
		tfPickNumber1.setEditable(false);
		tfPickNumber1.setPreferredSize(new Dimension(8, 37));
		tfPickNumber1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tfPickNumber1.setFont(new Font("PMingLiU", Font.PLAIN, 12));
		panel_4.add(tfPickNumber1);
		tfPickNumber1.setColumns(6);

		tfPickNumber2 = new JTextField();
		pickNums.add(tfPickNumber2);
		tfPickNumber2.setEditable(false);
		tfPickNumber2.setPreferredSize(new Dimension(8, 37));
		panel_4.add(tfPickNumber2);
		tfPickNumber2.setColumns(6);

		tfPickNumber3 = new JTextField();
		pickNums.add(tfPickNumber3);
		tfPickNumber3.setEditable(false);
		tfPickNumber3.setPreferredSize(new Dimension(8, 37));
		panel_4.add(tfPickNumber3);
		tfPickNumber3.setColumns(6);

		tfPickNumber4 = new JTextField();
		pickNums.add(tfPickNumber4);
		tfPickNumber4.setEditable(false);
		tfPickNumber4.setPreferredSize(new Dimension(8, 37));
		panel_4.add(tfPickNumber4);
		tfPickNumber4.setColumns(6);

		tfPickNumber5 = new JTextField();
		pickNums.add(tfPickNumber5);
		tfPickNumber5.setEditable(false);
		tfPickNumber5.setPreferredSize(new Dimension(8, 37));
		panel_4.add(tfPickNumber5);
		tfPickNumber5.setColumns(6);

		tfPickNumber6 = new JTextField();
		pickNums.add(tfPickNumber6);
		tfPickNumber6.setEditable(false);
		tfPickNumber6.setPreferredSize(new Dimension(8, 37));
		panel_4.add(tfPickNumber6);
		tfPickNumber6.setColumns(6);

		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 2;
		panelLeft.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] { 0, 0 };
		gbl_panel_5.rowHeights = new int[] { 20, 180, 0 };
		gbl_panel_5.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_5.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		panel_5.setLayout(gbl_panel_5);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 0, 205));
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 0;
		panel_5.add(panel_7, gbc_panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnPartialRandom = new JButton("\u90E8\u5206\u9078\u865F");
		btnPartialRandom.addActionListener(new ActionPartialRandom());
		btnPartialRandom.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPartialRandom.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPartialRandom.setPreferredSize(new Dimension(87, 40));
		panel_7.add(btnPartialRandom);

		JButton btnRandom = new JButton("全部快選");
		btnRandom.setActionCommand("");
		btnRandom.addActionListener(new ActionRandom());
		btnRandom.setHorizontalAlignment(SwingConstants.RIGHT);
		btnRandom.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRandom.setPreferredSize(new Dimension(87, 40));
		panel_7.add(btnRandom);

		JButton btnClear = new JButton("\u6E05\u9664\u9078\u865F");
		btnClear.setHorizontalAlignment(SwingConstants.RIGHT);
		btnClear.setHorizontalTextPosition(SwingConstants.CENTER);
		btnClear.setPreferredSize(new Dimension(87, 40));
		panel_7.add(btnClear);
		btnClear.addActionListener(new ActionClear());

		JButton btnAdd = new JButton("\u52A0\u5165\u865F\u78BC\u7D44");
		panel_7.add(btnAdd);
		btnAdd.addActionListener(new ActionToList());
		btnAdd.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAdd.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAdd.setPreferredSize(new Dimension(100, 40));

		JButton btnDelete = new JButton("\u522A\u9664\u865F\u78BC\u7D44");
		btnDelete.addActionListener(new ActionToDeleteJlist());
		panel_7.add(btnDelete);
		btnDelete.setPreferredSize(new Dimension(100, 40));
		btnDelete.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDelete.setHorizontalAlignment(SwingConstants.RIGHT);

		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 1;
		panel_5.add(panel_10, gbc_panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		JPanel panel_12 = new JPanel();
		panel_10.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(new BorderLayout(0, 0));

		listnumber = new JList();
		listnumber.setFont(new Font("Lucida Grande", Font.BOLD, 18));
//		listnumber.setModel(new AbstractListModel() {
//			String[] values = new String[] {};
//
//			public int getSize() {
//				return values.length;
//			}
//
//			public Object getElementAt(int index) {
//				return values[index];
//			}
//		});
		panel_12.add(listnumber, BorderLayout.CENTER);

		JList list_1 = new JList();
		panel_12.add(list_1, BorderLayout.WEST);
		panel_12.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { listnumber }));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 0, 205));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 3;
		panelLeft.add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_6.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_6.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_6.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_6.setLayout(gbl_panel_6);

		JButton btnNumber1 = new JButton("1");
		btnNumber1.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber1);
		GridBagConstraints gbc_btnNumber1 = new GridBagConstraints();
		gbc_btnNumber1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber1.gridx = 0;
		gbc_btnNumber1.gridy = 0;
		panel_6.add(btnNumber1, gbc_btnNumber1);

		JButton btnNumber2 = new JButton("2");
		btnNumber2.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber2);
		GridBagConstraints gbc_btnNumber2 = new GridBagConstraints();
		gbc_btnNumber2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber2.gridx = 1;
		gbc_btnNumber2.gridy = 0;
		panel_6.add(btnNumber2, gbc_btnNumber2);

		JButton btnNumber3 = new JButton("3");
		btnNumber3.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber3);
		GridBagConstraints gbc_btnNumber3 = new GridBagConstraints();
		gbc_btnNumber3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber3.gridx = 2;
		gbc_btnNumber3.gridy = 0;
		panel_6.add(btnNumber3, gbc_btnNumber3);

		JButton btnNumber4 = new JButton("4");
		btnNumber4.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber4);
		GridBagConstraints gbc_btnNumber4 = new GridBagConstraints();
		gbc_btnNumber4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber4.gridx = 3;
		gbc_btnNumber4.gridy = 0;
		panel_6.add(btnNumber4, gbc_btnNumber4);

		JButton btnNumber5 = new JButton("5");
		btnNumber5.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber5);
		GridBagConstraints gbc_btnNumber5 = new GridBagConstraints();
		gbc_btnNumber5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber5.gridx = 4;
		gbc_btnNumber5.gridy = 0;
		panel_6.add(btnNumber5, gbc_btnNumber5);

		JButton btnNumber6 = new JButton("6");
		btnNumber6.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber6);
		GridBagConstraints gbc_btnNumber6 = new GridBagConstraints();
		gbc_btnNumber6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber6.gridx = 5;
		gbc_btnNumber6.gridy = 0;
		panel_6.add(btnNumber6, gbc_btnNumber6);

		JButton btnNumber7 = new JButton("7");
		btnNumber7.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber7);
		GridBagConstraints gbc_btnNumber7 = new GridBagConstraints();
		gbc_btnNumber7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber7.gridx = 6;
		gbc_btnNumber7.gridy = 0;
		panel_6.add(btnNumber7, gbc_btnNumber7);

		JButton btnNumber8 = new JButton("8");
		btnNumber8.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber8);
		GridBagConstraints gbc_btnNumber8 = new GridBagConstraints();
		gbc_btnNumber8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber8.gridx = 7;
		gbc_btnNumber8.gridy = 0;
		panel_6.add(btnNumber8, gbc_btnNumber8);

		JButton btnNumber9 = new JButton("9");
		btnNumber9.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber9);
		GridBagConstraints gbc_btnNumber9 = new GridBagConstraints();
		gbc_btnNumber9.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber9.gridx = 8;
		gbc_btnNumber9.gridy = 0;
		panel_6.add(btnNumber9, gbc_btnNumber9);

		JButton btnNumber10 = new JButton("10");
		btnNumber10.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber10);
		GridBagConstraints gbc_btnNumber10 = new GridBagConstraints();
		gbc_btnNumber10.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNumber10.insets = new Insets(0, 0, 5, 0);
		gbc_btnNumber10.gridx = 9;
		gbc_btnNumber10.gridy = 0;
		panel_6.add(btnNumber10, gbc_btnNumber10);

		JButton btnNumber11 = new JButton("11");
		btnNumber11.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber11);
		GridBagConstraints gbc_btnNumber11 = new GridBagConstraints();
		gbc_btnNumber11.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber11.gridx = 0;
		gbc_btnNumber11.gridy = 1;
		panel_6.add(btnNumber11, gbc_btnNumber11);

		JButton btnNumber12 = new JButton("12");
		btnNumber12.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber12);
		GridBagConstraints gbc_btnNumber12 = new GridBagConstraints();
		gbc_btnNumber12.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber12.gridx = 1;
		gbc_btnNumber12.gridy = 1;
		panel_6.add(btnNumber12, gbc_btnNumber12);

		JButton btnNumber13 = new JButton("13");
		btnNumber13.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber13);
		GridBagConstraints gbc_btnNumber13 = new GridBagConstraints();
		gbc_btnNumber13.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber13.gridx = 2;
		gbc_btnNumber13.gridy = 1;
		panel_6.add(btnNumber13, gbc_btnNumber13);

		JButton btnNumber14 = new JButton("14");
		btnNumber14.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber14);
		GridBagConstraints gbc_btnNumber14 = new GridBagConstraints();
		gbc_btnNumber14.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber14.gridx = 3;
		gbc_btnNumber14.gridy = 1;
		panel_6.add(btnNumber14, gbc_btnNumber14);

		JButton btnNumber15 = new JButton("15");
		btnNumber15.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber15);
		GridBagConstraints gbc_btnNumber15 = new GridBagConstraints();
		gbc_btnNumber15.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber15.gridx = 4;
		gbc_btnNumber15.gridy = 1;
		panel_6.add(btnNumber15, gbc_btnNumber15);

		JButton btnNumber16 = new JButton("16");
		btnNumber16.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber16);
		GridBagConstraints gbc_btnNumber16 = new GridBagConstraints();
		gbc_btnNumber16.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber16.gridx = 5;
		gbc_btnNumber16.gridy = 1;
		panel_6.add(btnNumber16, gbc_btnNumber16);

		JButton btnNumber17 = new JButton("17");
		btnNumber17.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber17);
		GridBagConstraints gbc_btnNumber17 = new GridBagConstraints();
		gbc_btnNumber17.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber17.gridx = 6;
		gbc_btnNumber17.gridy = 1;
		panel_6.add(btnNumber17, gbc_btnNumber17);

		JButton btnNumber18 = new JButton("18");
		btnNumber18.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber18);
		GridBagConstraints gbc_btnNumber18 = new GridBagConstraints();
		gbc_btnNumber18.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber18.gridx = 7;
		gbc_btnNumber18.gridy = 1;
		panel_6.add(btnNumber18, gbc_btnNumber18);

		JButton btnNumber19 = new JButton("19");
		btnNumber19.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber19);
		GridBagConstraints gbc_btnNumber19 = new GridBagConstraints();
		gbc_btnNumber19.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber19.gridx = 8;
		gbc_btnNumber19.gridy = 1;
		panel_6.add(btnNumber19, gbc_btnNumber19);

		JButton btnNumber20 = new JButton("20");
		btnNumber20.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber20);
		GridBagConstraints gbc_btnNumber20 = new GridBagConstraints();
		gbc_btnNumber20.insets = new Insets(0, 0, 5, 0);
		gbc_btnNumber20.gridx = 9;
		gbc_btnNumber20.gridy = 1;
		panel_6.add(btnNumber20, gbc_btnNumber20);

		JButton btnNumber21 = new JButton("21");
		btnNumber21.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber21);
		GridBagConstraints gbc_btnNumber21 = new GridBagConstraints();
		gbc_btnNumber21.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber21.gridx = 0;
		gbc_btnNumber21.gridy = 2;
		panel_6.add(btnNumber21, gbc_btnNumber21);

		JButton btnNumber22 = new JButton("22");
		btnNumber22.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber22);
		GridBagConstraints gbc_btnNumber22 = new GridBagConstraints();
		gbc_btnNumber22.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber22.gridx = 1;
		gbc_btnNumber22.gridy = 2;
		panel_6.add(btnNumber22, gbc_btnNumber22);

		JButton btnNumber23 = new JButton("23");
		btnNumber23.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber23);
		GridBagConstraints gbc_btnNumber23 = new GridBagConstraints();
		gbc_btnNumber23.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber23.gridx = 2;
		gbc_btnNumber23.gridy = 2;
		panel_6.add(btnNumber23, gbc_btnNumber23);

		JButton btnNumber24 = new JButton("24");
		btnNumber24.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber24);
		GridBagConstraints gbc_btnNumber24 = new GridBagConstraints();
		gbc_btnNumber24.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber24.gridx = 3;
		gbc_btnNumber24.gridy = 2;
		panel_6.add(btnNumber24, gbc_btnNumber24);

		JButton btnNumber25 = new JButton("25");
		btnNumber25.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber25);
		GridBagConstraints gbc_btnNumber25 = new GridBagConstraints();
		gbc_btnNumber25.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber25.gridx = 4;
		gbc_btnNumber25.gridy = 2;
		panel_6.add(btnNumber25, gbc_btnNumber25);

		JButton btnNumber26 = new JButton("26");
		btnNumber26.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber26);
		GridBagConstraints gbc_btnNumber26 = new GridBagConstraints();
		gbc_btnNumber26.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber26.gridx = 5;
		gbc_btnNumber26.gridy = 2;
		panel_6.add(btnNumber26, gbc_btnNumber26);

		JButton btnNumber27 = new JButton("27");
		btnNumber27.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber27);
		GridBagConstraints gbc_btnNumber27 = new GridBagConstraints();
		gbc_btnNumber27.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber27.gridx = 6;
		gbc_btnNumber27.gridy = 2;
		panel_6.add(btnNumber27, gbc_btnNumber27);

		JButton btnNumber28 = new JButton("28");
		btnNumber28.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber28);
		GridBagConstraints gbc_btnNumber28 = new GridBagConstraints();
		gbc_btnNumber28.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber28.gridx = 7;
		gbc_btnNumber28.gridy = 2;
		panel_6.add(btnNumber28, gbc_btnNumber28);

		JButton btnNumber29 = new JButton("29");
		btnNumber29.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber29);
		GridBagConstraints gbc_btnNumber29 = new GridBagConstraints();
		gbc_btnNumber29.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber29.gridx = 8;
		gbc_btnNumber29.gridy = 2;
		panel_6.add(btnNumber29, gbc_btnNumber29);

		JButton btnNumber30 = new JButton("30");
		btnNumber30.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber30);
		GridBagConstraints gbc_btnNumber30 = new GridBagConstraints();
		gbc_btnNumber30.insets = new Insets(0, 0, 5, 0);
		gbc_btnNumber30.gridx = 9;
		gbc_btnNumber30.gridy = 2;
		panel_6.add(btnNumber30, gbc_btnNumber30);

		JButton btnNumber31 = new JButton("31");
		btnNumber31.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber31);
		GridBagConstraints gbc_btnNumber31 = new GridBagConstraints();
		gbc_btnNumber31.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber31.gridx = 0;
		gbc_btnNumber31.gridy = 3;
		panel_6.add(btnNumber31, gbc_btnNumber31);

		JButton btnNumber32 = new JButton("32");
		btnNumber32.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber32);
		GridBagConstraints gbc_btnNumber32 = new GridBagConstraints();
		gbc_btnNumber32.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber32.gridx = 1;
		gbc_btnNumber32.gridy = 3;
		panel_6.add(btnNumber32, gbc_btnNumber32);

		JButton btnNumber33 = new JButton("33");
		btnNumber33.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber33);
		GridBagConstraints gbc_btnNumber33 = new GridBagConstraints();
		gbc_btnNumber33.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber33.gridx = 2;
		gbc_btnNumber33.gridy = 3;
		panel_6.add(btnNumber33, gbc_btnNumber33);

		JButton btnNumber34 = new JButton("34");
		btnNumber34.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber34);
		GridBagConstraints gbc_btnNumber34 = new GridBagConstraints();
		gbc_btnNumber34.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber34.gridx = 3;
		gbc_btnNumber34.gridy = 3;
		panel_6.add(btnNumber34, gbc_btnNumber34);

		JButton btnNumber35 = new JButton("35");
		btnNumber35.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber35);
		GridBagConstraints gbc_btnNumber35 = new GridBagConstraints();
		gbc_btnNumber35.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber35.gridx = 4;
		gbc_btnNumber35.gridy = 3;
		panel_6.add(btnNumber35, gbc_btnNumber35);

		JButton btnNumber36 = new JButton("36");
		btnNumber36.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber36);
		GridBagConstraints gbc_btnNumber36 = new GridBagConstraints();
		gbc_btnNumber36.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber36.gridx = 5;
		gbc_btnNumber36.gridy = 3;
		panel_6.add(btnNumber36, gbc_btnNumber36);

		JButton btnNumber37 = new JButton("37");
		btnNumber37.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber37);
		GridBagConstraints gbc_btnNumber37 = new GridBagConstraints();
		gbc_btnNumber37.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber37.gridx = 6;
		gbc_btnNumber37.gridy = 3;
		panel_6.add(btnNumber37, gbc_btnNumber37);

		JButton btnNumber38 = new JButton("38");
		btnNumber38.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber38);
		GridBagConstraints gbc_btnNumber38 = new GridBagConstraints();
		gbc_btnNumber38.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber38.gridx = 7;
		gbc_btnNumber38.gridy = 3;
		panel_6.add(btnNumber38, gbc_btnNumber38);

		JButton btnNumber39 = new JButton("39");
		btnNumber39.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber39);
		GridBagConstraints gbc_btnNumber39 = new GridBagConstraints();
		gbc_btnNumber39.insets = new Insets(0, 0, 5, 5);
		gbc_btnNumber39.gridx = 8;
		gbc_btnNumber39.gridy = 3;
		panel_6.add(btnNumber39, gbc_btnNumber39);

		JButton btnNumber40 = new JButton("40");
		btnNumber40.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber40);
		GridBagConstraints gbc_btnNumber40 = new GridBagConstraints();
		gbc_btnNumber40.insets = new Insets(0, 0, 5, 0);
		gbc_btnNumber40.gridx = 9;
		gbc_btnNumber40.gridy = 3;
		panel_6.add(btnNumber40, gbc_btnNumber40);

		JButton btnNumber41 = new JButton("41");
		btnNumber41.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber41);
		GridBagConstraints gbc_btnNumber41 = new GridBagConstraints();
		gbc_btnNumber41.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber41.gridx = 0;
		gbc_btnNumber41.gridy = 4;
		panel_6.add(btnNumber41, gbc_btnNumber41);

		JButton btnNumber42 = new JButton("42");
		btnNumber42.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber42);
		GridBagConstraints gbc_btnNumber42 = new GridBagConstraints();
		gbc_btnNumber42.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber42.gridx = 1;
		gbc_btnNumber42.gridy = 4;
		panel_6.add(btnNumber42, gbc_btnNumber42);

		JButton btnNumber43 = new JButton("43");
		btnNumber43.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber43);
		GridBagConstraints gbc_btnNumber43 = new GridBagConstraints();
		gbc_btnNumber43.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber43.gridx = 2;
		gbc_btnNumber43.gridy = 4;
		panel_6.add(btnNumber43, gbc_btnNumber43);

		JButton btnNumber44 = new JButton("44");
		btnNumber44.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber44);
		GridBagConstraints gbc_btnNumber44 = new GridBagConstraints();
		gbc_btnNumber44.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber44.gridx = 3;
		gbc_btnNumber44.gridy = 4;
		panel_6.add(btnNumber44, gbc_btnNumber44);

		JButton btnNumber45 = new JButton("45");
		btnNumber45.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber45);
		GridBagConstraints gbc_btnNumber45 = new GridBagConstraints();
		gbc_btnNumber45.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber45.gridx = 4;
		gbc_btnNumber45.gridy = 4;
		panel_6.add(btnNumber45, gbc_btnNumber45);

		JButton btnNumber46 = new JButton("46");
		btnNumber46.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber46);
		GridBagConstraints gbc_btnNumber46 = new GridBagConstraints();
		gbc_btnNumber46.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber46.gridx = 5;
		gbc_btnNumber46.gridy = 4;
		panel_6.add(btnNumber46, gbc_btnNumber46);

		JButton btnNumber47 = new JButton("47");
		btnNumber47.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber47);
		GridBagConstraints gbc_btnNumber47 = new GridBagConstraints();
		gbc_btnNumber47.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber47.gridx = 6;
		gbc_btnNumber47.gridy = 4;
		panel_6.add(btnNumber47, gbc_btnNumber47);

		JButton btnNumber48 = new JButton("48");
		btnNumber48.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber48);
		GridBagConstraints gbc_btnNumber48 = new GridBagConstraints();
		gbc_btnNumber48.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber48.gridx = 7;
		gbc_btnNumber48.gridy = 4;
		panel_6.add(btnNumber48, gbc_btnNumber48);

		JButton btnNumber49 = new JButton("49");
		btnNumber49.addActionListener(new ActionToBtnNumber());
		_49btnNums.add(btnNumber49);
		GridBagConstraints gbc_btnNumber49 = new GridBagConstraints();
		gbc_btnNumber49.insets = new Insets(0, 0, 0, 5);
		gbc_btnNumber49.gridx = 8;
		gbc_btnNumber49.gridy = 4;
		panel_6.add(btnNumber49, gbc_btnNumber49);

		JPanel panelRight = new JPanel();
		panelRight.setBackground(new Color(220, 20, 60));
		GridBagConstraints gbc_panelRight = new GridBagConstraints();
		gbc_panelRight.fill = GridBagConstraints.BOTH;
		gbc_panelRight.gridx = 1;
		gbc_panelRight.gridy = 0;
		panel.add(panelRight, gbc_panelRight);
		GridBagLayout gbl_panelRight = new GridBagLayout();
		gbl_panelRight.columnWidths = new int[] { 177, 0 };
		gbl_panelRight.rowHeights = new int[] { 27, 0, 44, 0, 0 };
		gbl_panelRight.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelRight.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panelRight.setLayout(gbl_panelRight);

		JLabel lblWinning = new JLabel("中獎");
		lblWinning.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblWinning = new GridBagConstraints();
		gbc_lblWinning.insets = new Insets(0, 0, 5, 0);
		gbc_lblWinning.gridx = 0;
		gbc_lblWinning.gridy = 0;
		panelRight.add(lblWinning, gbc_lblWinning);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(220, 20, 60));
		panel_8.setPreferredSize(new Dimension(10, 50));
		panel_8.setAlignmentY(4.0f);
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 1;
		panelRight.add(panel_8, gbc_panel_8);

		tfWinningNumber1 = new JTextField();
		_UIWinNums.add(tfWinningNumber1);
		tfWinningNumber1.setEditable(false);
		tfWinningNumber1.setPreferredSize(new Dimension(8, 37));
		tfWinningNumber1.setFont(new Font("PMingLiU", Font.PLAIN, 12));
		tfWinningNumber1.setColumns(6);
		tfWinningNumber1.setAlignmentY(1.0f);
		panel_8.add(tfWinningNumber1);

		tfWinningNumber2 = new JTextField();
		_UIWinNums.add(tfWinningNumber2);
		tfWinningNumber2.setEditable(false);
		tfWinningNumber2.setPreferredSize(new Dimension(8, 37));
		tfWinningNumber2.setColumns(6);
		panel_8.add(tfWinningNumber2);

		tfWinningNumber3 = new JTextField();
		_UIWinNums.add(tfWinningNumber3);
		tfWinningNumber3.setEditable(false);
		tfWinningNumber3.setPreferredSize(new Dimension(8, 37));
		tfWinningNumber3.setColumns(6);
		panel_8.add(tfWinningNumber3);

		tfWinningNumber4 = new JTextField();
		_UIWinNums.add(tfWinningNumber4);
		tfWinningNumber4.setEditable(false);
		tfWinningNumber4.setPreferredSize(new Dimension(8, 37));
		tfWinningNumber4.setColumns(6);
		panel_8.add(tfWinningNumber4);

		tfWinningNumber5 = new JTextField();
		_UIWinNums.add(tfWinningNumber5);
		tfWinningNumber5.setEditable(false);
		tfWinningNumber5.setPreferredSize(new Dimension(8, 37));
		tfWinningNumber5.setColumns(6);
		panel_8.add(tfWinningNumber5);

		tfWinningNumber6 = new JTextField();
		_UIWinNums.add(tfWinningNumber6);
		tfWinningNumber6.setEditable(false);
		tfWinningNumber6.setPreferredSize(new Dimension(8, 37));
		tfWinningNumber6.setColumns(6);
		panel_8.add(tfWinningNumber6);

		tfWinningNumber7 = new JTextField();
		_UIWinNums.add(tfWinningNumber7);
		tfWinningNumber7.setEditable(false);
		tfWinningNumber7.setPreferredSize(new Dimension(8, 37));
		tfWinningNumber7.setColumns(6);
		panel_8.add(tfWinningNumber7);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(220, 20, 60));
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 0);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 2;
		panelRight.add(panel_9, gbc_panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnWin = new JButton("\u958B\u734E");
		btnWin.setPreferredSize(new Dimension(87, 40));
		btnWin.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_9.add(btnWin);
		btnWin.addActionListener(new ActionWin());

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(220, 20, 60));
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 3;
		panelRight.add(panel_11, gbc_panel_11);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[] { 0, 0, 0 };
		gbl_panel_11.rowHeights = new int[] { 0, 0 };
		gbl_panel_11.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_11.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_11.setLayout(gbl_panel_11);

		JTextArea taWinningMethod = new JTextArea();
		taWinningMethod.setForeground(new Color(0, 0, 128));
		taWinningMethod.setBackground(new Color(220, 20, 60));
		taWinningMethod.setText(
				"                                                \r\n                                                   中獎方式\r\n\r\n                          頭獎--與當期六個獎號完全相同者\r\n                          貳獎--對中當期獎號之任五碼＋特別號\r\n                          參獎--對中當期獎號之任五碼\r\n                          肆獎--對中當期獎號之任四碼＋特別號\r\n                          伍獎 --對中當期獎號之任四碼\r\n                          陸獎--對中當期獎號之任三碼＋特別號\r\n                          柒獎--對中當期獎號之任兩碼＋特別號\r\n                          普獎--對中當期獎號之任三碼\r\n");
		taWinningMethod.setEditable(false);
		GridBagConstraints gbc_taWinningMethod = new GridBagConstraints();
		gbc_taWinningMethod.gridwidth = 2;
		gbc_taWinningMethod.insets = new Insets(0, 0, 0, 5);
		gbc_taWinningMethod.fill = GridBagConstraints.BOTH;
		gbc_taWinningMethod.gridx = 0;
		gbc_taWinningMethod.gridy = 0;
		taWinningMethod.setFont(new Font("Dialog", Font.BOLD, 18));
		panel_11.add(taWinningMethod, gbc_taWinningMethod);
		
		
	}
	
	
	
	// Jlist的model
	DefaultListModel<String> dml = new DefaultListModel<String>();
	List<MyNumber> myNums = new ArrayList<MyNumber>();
	int[] _jListArray;
	
	
	
	
	
	
	
	// 加入號碼組事件
	class ActionToList implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (currentNums.size() < 6 ) {
				JOptionPane.showMessageDialog(null, "請先選完六個號碼");
				return;
			}
			if (dml.size() == 5) {
				JOptionPane.showMessageDialog(null, "號碼組最多五組");
				return;
			}

			String result = "";
			_jListArray = new int[6];
			int special = 0;
			
			for(int i = 0; i < pickNums.size(); i++) {
				result += pickNums.get(i).getText() + ",";
				String strPickNums = pickNums.get(i).getText();
				_jListArray[i] = Integer.parseInt(strPickNums);
			}
			myNums.add(new MyNumber(_jListArray,special));
			
			
			
			// 回傳新子字串物件,則字串裡的最後一個逗號沒有做選取
			result = result.substring(0, result.length() - 1);
			// 將要投注的號碼加進Jlist的model屬性
			dml.addElement(result);
			// 顯示投注號碼組
			listnumber.setModel(dml);

			// 清空投注號碼,清空開獎號碼
			currentNums.clear();
			if (winNums != null)
				winNums.clear();
			randomNums.clear();
			for (JTextField tf : pickNums)
				tf.setText("");
			for (JTextField tf : _UIWinNums)
				tf.setText("");
			for (JButton btn : _49btnNums) {
				btn.setBackground(UIManager.getColor("Button.background"));
				btn.setOpaque(false);
			}

		}
	};

	// 刪除號碼組事件
	class ActionToDeleteJlist implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			int selectedIndex = listnumber.getSelectedIndex();
			if (selectedIndex >= 0) {
				myNums.remove(selectedIndex);
				dml.remove(selectedIndex);
				
			}
			else if (selectedIndex == -1) {
		         JOptionPane.showMessageDialog(null, "請選擇一組號碼");
		    } 
			else {
		         JOptionPane.showMessageDialog(null, "未加入任何號碼");
		       }
		}
	};

	// 按鈕按下時的number
	private List<Integer> currentNums = new ArrayList<>();
	// 投注號碼
	private List<JTextField> pickNums = new ArrayList<>();
	// TextField上的中獎號碼
	private List<JTextField> _UIWinNums = new ArrayList<>();
	// 中獎號碼
	private List<Integer> winNums;
	// 49顆按鈕
	private List<JButton> _49btnNums = new ArrayList<>();
	// random號碼
	private List<Integer> randomNums;

	boolean isWinNumberOpened = false;

	// 49個按鈕的事件
	class ActionToBtnNumber implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object object = e.getSource();
			JButton jButton = (JButton) object; // 向下轉型
			String text = jButton.getText();

			// 指向btnNumber的text
			int myNum = Integer.parseInt(text);
			if (currentNums == null)
				currentNums = new ArrayList<>();

			// 開獎啟動後發生的狀態
			afterWinNumberOpenedState(currentNums);

			// 若按的按鈕是同一顆，從對照組中移除
			if (currentNums.contains(myNum)) {
				currentNums.removeIf(s -> s == myNum);

			} else {// 若對照組沒有此按鈕則加入

				// 若已達上限
				if (currentNums.size() == 6) {
					JOptionPane.showMessageDialog(null, "上限為6個號碼");
					return;
				}
				currentNums.add(myNum);
			}
			// 排序
			Collections.sort(currentNums);
			// 改變按鈕顏色
			changeBtnBackground(jButton);
			// 顯示投注號碼
			showPickNumber(pickNums, currentNums);

		}
	};

	// 清除事件
	class ActionClear implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			isWinNumberOpened = false;
			currentNums.clear();
			
			if (winNums != null)
				winNums.clear();
			if (randomNums != null)
				randomNums.clear();
			for (JTextField tf : pickNums)
				tf.setText("");
			for (JTextField tf : _UIWinNums)
				tf.setText("");
			for (JButton btn : _49btnNums) {
				btn.setBackground(UIManager.getColor("Button.background"));
				btn.setOpaque(false);
			}
			// set49ButtonsState(true);
		}
	};

	// 全部快選事件
	class ActionRandom implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 開獎啟動後發生的狀態
			 afterWinNumberOpenedState(randomNums);

			if (currentNums.size() > 0) {
				JOptionPane.showMessageDialog(null, "您已經有選號碼了,請按下清除選號按鈕,再重新選擇系統選號");
				return;
			}

			// 產生隨機號碼
			randomNums = genRandomNumber(6, 49);
			// 排序
			Collections.sort(randomNums);
			// 顯示號碼在UI上
			showPickNumber(pickNums, randomNums);

			// 全部選號後改變按鈕顏色
			changeColorByNumbers(randomNums, Color.orange);

			// 將系統選號數放進儲存按鈕的list裡
			currentNums = randomNums;

		}
	};

	// 部分選號事件
	class ActionPartialRandom implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 開獎啟動後發生的狀態
			afterWinNumberOpenedState(currentNums);

			if (currentNums.size() <= 0) {
				JOptionPane.showMessageDialog(null, "你未選部分號碼");
				return;
			}

			if (currentNums.size() >= pickNums.size()) {
				JOptionPane.showMessageDialog(null, "你已經選六個號碼了");
				return;
			}

			Random rand = new Random();
			while (currentNums.size() < pickNums.size()) {
				int num = rand.nextInt(49) + 1;

				if (!currentNums.contains(num)) {
					currentNums.add(num);
				}
			}

			// 排序
			Collections.sort(currentNums);
			// 顯示號碼在UI上
			showPickNumber(pickNums, currentNums);

			// 部分選號後改變按鈕顏色
			changeColorByNumbers(currentNums, Color.orange);

		}
	};

	// 中獎事件
	class ActionWin implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(listnumber.getModel().getSize() == 0) {
				JOptionPane.showMessageDialog(null, "請加入至少一組號碼組方能兌獎");
				return;
			}
			

			isWinNumberOpened = true;
			
			// 還原49個按鈕
			for (JButton btn : _49btnNums) {
				btn.setBackground(UIManager.getColor("Button.background"));
				btn.setOpaque(false);
			}

			// 產生開獎號碼
			winNums = genRandomNumber(7, 49);

			// 把winNums的第一個號碼當做特別號
			int special = winNums.get(0);
			// 在移除winNums的第一個號碼
			winNums.remove(0);
			// 排序
			Collections.sort(winNums);
			// 加上特別號
			winNums.add(special);

			// 顯示號碼在UI上
			showWinNumber();

			// 開獎後改變按鈕顏色
			changeColorByNumbers(winNums, Color.magenta);
			
			List<MyNumber> myWinningNums = checkWinningNumbers(myNums,winNums);
			
			
			
			System.out.println(myWinningNums.get(0).getSpecialNumber());
			
			JOptionPane.showMessageDialog(null,getPrize(myWinningNums));
			
		}
		
		//判斷每一組號碼選號是否有中獎
		private String getPrize(List<MyNumber> myWinningNums) {
			
			String str = "";
			
			for(int i = 0; i < myWinningNums.size(); i++) {
				int[] myWinningNumArray = myWinningNums.get(i).getMyNumber();
				int mySpecialNumber = myWinningNums.get(i).getSpecialNumber();
				int count = myWinningNumArray.length; 
				
				if(count == 6) {
					str += getPrizeResult(myWinningNumArray,mySpecialNumber,"頭獎");
					
		        }
		        else if(count == 5 && mySpecialNumber > 0){
		        	str += getPrizeResult(myWinningNumArray,mySpecialNumber,"貳獎");
		        	
		        }
		        else if(count == 5){
		        	str += getPrizeResult(myWinningNumArray,mySpecialNumber,"參獎");
		        }
		        else if(count == 4 && mySpecialNumber > 1){
		        	str += getPrizeResult(myWinningNumArray,mySpecialNumber,"肆獎");
		        	
		        }
		        else if(count == 4){
		        	str += getPrizeResult(myWinningNumArray,mySpecialNumber,"伍獎 NT$2,000獎");
		        	
		        }
		        else if(count == 3 && mySpecialNumber > 1){
		        	str += getPrizeResult(myWinningNumArray,mySpecialNumber,"陸獎 NT$1,000");
		        	
		        }
		        else if(count == 2 && mySpecialNumber > 1){
		        	str += getPrizeResult(myWinningNumArray,mySpecialNumber,"柒獎 NT$400");
		        	
		        }
		        else if(count == 3){
		        	str += getPrizeResult(myWinningNumArray,mySpecialNumber,"普獎 NT$400");
		        	
		        }
		        else {
		        	str += getPrizeResult(myWinningNumArray,mySpecialNumber,"無");
		        }
				str += "\n" ;
			}
			
			return str;
			
		}
		
		//中獎條件
		private String getPrizeResult(int[] myWinningNumArray,int mySpecialNumber,String prize) {
			String result = "您的中獎號碼: ";
			//int offset = 0;
			
//			if(mySpecialNumber != " ")
//				offset = 1;
			//for(int i = 0; i < (myWinningNumArray.length + offset); i++) {
			for(int i = 0; i < (myWinningNumArray.length); i++) {
				result += myWinningNumArray[i] + ",";
				
			}
			// 回傳新子字串物件,則字串裡的最後一個逗號沒有做選取
			result = result.substring(0, result.length() - 1);
			
			if(mySpecialNumber > 0)
				result += "  特別號: " + mySpecialNumber + "  獎金: " + prize;
			else
				result += "  特別號: " + " " + "  獎金: " + prize;
			
			return result;
			
		}

		private List<MyNumber> checkWinningNumbers(List<MyNumber> myNums, List<Integer> winNums) {
			List<MyNumber> myWinningNums = new ArrayList<MyNumber>();
			
			int specialNum = winNums.get(6);
			
			winNums.remove(6);
			
			int[]winNum = winNums.stream()
					.mapToInt(Integer::intValue)
					.toArray();
			
			
			for(MyNumber myNum : myNums) {
				List<Integer> myWin = new ArrayList<>();
				int mySpecialNum = 0;
				
				for(int i=0; i < 6; i++) {
					for(int j = 0; j < 6; j++) {
						
						int num = myNum.getMyNumber()[i];
						
						
						if(num == winNum[j]){
							myWin.add(num);
						} 
						if(num == specialNum){
							mySpecialNum = num;
						}
					}
				}
				
				
				myWinningNums.add(new MyNumber( 
						myWin.stream()
						.mapToInt(Integer::intValue)
						.toArray(),mySpecialNum));
			}
			return myWinningNums;
		}
	};
	
	
	private List<int[]> getAllWinNumber(List<int[]>_jListNums){
		
		return _jListNums;
	}

	// 開獎啟動後發生的狀態
	private void afterWinNumberOpenedState(List<Integer> numbers) {
		if (isWinNumberOpened) {
			isWinNumberOpened = false;

			if (winNums.size() > 0)
				winNums.clear();

			for (JTextField tf : _UIWinNums)
				tf.setText("");

			for (JButton btn : _49btnNums) {
				btn.setBackground(UIManager.getColor("Button.background"));
				btn.setOpaque(false);
			}
			if (currentNums.size() != 0 && numbers != null) {
				// 部分選號,全部快選,開獎後改變顏色
				changeColorByNumbers(numbers, Color.orange);
			}
		}
	}

	// 部分選號,全部快選,開獎後改變顏色
	private void changeColorByNumbers(List<Integer> numbers, Color color) {
		int pointer = 0;
		int rNum = numbers.get(0);
		for (int j = 0; j < _49btnNums.size(); j++) {
			JButton btn = _49btnNums.get(j);
			int num = Integer.parseInt(btn.getText());

			if (rNum == num) {
				btn.setBackground(color);
				btn.setOpaque(true);

				pointer++;

				if (pointer == numbers.size())
					break;
				rNum = numbers.get(pointer);
			}
		}
		if (isWinNumberOpened) {
			int specialNum = numbers.get(numbers.size() - 1);
			for (JButton btn : _49btnNums) {
				int num = Integer.parseInt(btn.getText());

				if (specialNum == num) {
					btn.setBackground(color.red);
					btn.setOpaque(true);
					break;
				}
			}
		}
	}

	// 49顆按鈕的Enable狀態
	private void set49ButtonsState(boolean isEnable) {
		for (JButton btn : _49btnNums) {
			btn.setEnabled(isEnable);
		}
	}

	// 顯示中獎號碼在UI上
	private void showWinNumber() {
		for (int i = 0; i < winNums.size(); i++) {
			JTextField tf = _UIWinNums.get(i);
			String num = winNums.get(i).toString();
			tf.setText(num);
		}
	}

	// 隨機產生號碼
	private List<Integer> genRandomNumber(int count, int total) {
		List<Integer> nums = new ArrayList<Integer>();
		Random rand = new Random();
		while (nums.size() < count) {
			int num = rand.nextInt(total) + 1;

			if (!nums.contains(num)) {
				nums.add(num);
			}
		}

		return nums;
	}

	// 改變按鈕顏色
	private void changeBtnBackground(JButton btn) {
		if (btn.getBackground().equals(UIManager.getColor("Button.background"))) {
			btn.setBackground(Color.orange);
//            	  btn.setBorderPainted(false);
			btn.setOpaque(true);
		} else {
			btn.setBackground(UIManager.getColor("Button.background"));
		}
	}

	// 顯示投注號碼
	private void showPickNumber(List<JTextField> tfNums, List<Integer> intNums) {
		// 將投注號碼清空
		for (JTextField t : tfNums) {
			t.setText("");
		}
		JTextField tf = null;
		String num;

		for (int i = 0; i < intNums.size(); i++) {
			tf = tfNums.get(i);
			num = intNums.get(i).toString();
			tf.setText(num);
		}
	}
}

//尚未完成
class PrizeNumber{
	private int[] _jListArray;
	private List<int[]> _jListNums;
	public PrizeNumber(int[]_jListArray,List<int[]> _jListNums) {
		this._jListArray = _jListArray;
		this._jListNums = _jListNums;
	}
	public void setJListArray(int[] _jListArray) {
		this._jListArray = _jListArray;
	}
	public int[] getJListArray() {
		return _jListArray;
	}
	public void setJListNums(List<int[]> _jListNums) {
		this._jListNums = _jListNums;
	}
	public List<int[]> getJListNums() {
		return _jListNums;
	}
	
}

//
class MyNumber{
	int[] myNum;
	int specialNumber;
	
	public MyNumber(int[] myNum,int specialNumber) {
		this.myNum = myNum;
		this.specialNumber = specialNumber;
	}
	
	public int[] getMyNumber() {
		return myNum;
	}
	
	public void setMyNumber(int[] myNum) {
		this.myNum = myNum;
	}
	
	public int getSpecialNumber() {
		return specialNumber;
	}
	public void setSpecialNumber(int specialNumber) {
		this.specialNumber = specialNumber;
	}
}














