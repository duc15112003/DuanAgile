package framequanlikho;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.*;
import javax.swing.JSpinner;

public class framekho {
	
	public JFrame fr;
	private JLabel clock; 
	private JTextField ma;
	private JTextField ten;
	private JTextField date;
	private JTextField gianhap;
	private JTextField textField_5;
	private JTable table;
	private JTable table1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	public framekho() {
		init();
		
		clock();
	}
	private void init() {
		fr = new JFrame("Quản Lí Kho Hàng");
		fr.setSize(635,784);
		fr.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new TitledBorder(new LineBorder(Color.black),"Nhập sản phẩm"));		
		
		
		

		panel.setBounds(10, 79, 599, 143);
		fr.getContentPane().add(panel);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		panel.setLayout(null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã SP");
		lblNewLabel_1.setBounds(10, 22, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tên SP");
		lblNewLabel_2.setBounds(10, 67, 46, 14);
		panel.add(lblNewLabel_2);
		
		ma = new JTextField();
		ma.setBounds(86, 19, 86, 20);
		panel.add(ma);
		ma.setColumns(10);
		
		ten = new JTextField();
		ten.setBounds(86, 64, 86, 20);
		panel.add(ten);
		ten.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ngày Nhập");
		lblNewLabel_3.setBounds(10, 108, 69, 14);
		panel.add(lblNewLabel_3);
		
		date = new JTextField();
		date.setBounds(86, 105, 86, 20);
		panel.add(date);
		date.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Loại SP");
		lblNewLabel_4.setBounds(189, 22, 46, 14);
		panel.add(lblNewLabel_4);
		
		JRadioButton rdodonam = new JRadioButton("Đồ nam");
		rdodonam.setBounds(303, 18, 69, 23);
		buttonGroup.add(rdodonam);
		rdodonam.setBackground(new Color(135, 206, 235));
		panel.add(rdodonam);
		
		JRadioButton rdodonu = new JRadioButton("Đồ ăn sống");
		rdodonu.setBounds(391, 18, 103, 23);
		buttonGroup.add(rdodonu);
		rdodonu.setBackground(new Color(135, 206, 235));
		panel.add(rdodonu);
		
		JLabel lblNewLabel_5 = new JLabel("Giá Nhập");
		lblNewLabel_5.setBounds(189, 67, 60, 14);
		panel.add(lblNewLabel_5);
		
		gianhap = new JTextField();
		gianhap.setBounds(303, 64, 86, 20);
		panel.add(gianhap);
		gianhap.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Số lượng nhập");
		lblNewLabel_6.setBounds(189, 108, 104, 14);
		panel.add(lblNewLabel_6);
		
		clock = new JLabel("99:99");
		clock.setBounds(452, 67, 107, 34);
		panel.add(clock);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(303, 105, 86, 20);
		panel.add(spinner);
		
		JLabel lblNewLabel = new JLabel("FROM QUẢN LÍ KHO CỦA KHO HÀNG");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(158, 11, 337, 33);
		fr.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(222, 184, 135));
		panel_1.setBounds(10, 269, 599, 74);
		fr.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Còn Hàng");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(21, 23, 109, 23);
		panel_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Hết Hàng");
		buttonGroup_1.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(171, 23, 109, 23);
		panel_1.add(rdbtnNewRadioButton_5);
		
		textField_5 = new JTextField("0");
		textField_5.setBounds(462, 24, 86, 20);
		textField_5.setEnabled(false);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Số Lượng");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setForeground(new Color(47, 79, 79));
		lblNewLabel_9.setBounds(370, 24, 71, 19);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("1.Nhập Sản Phẩm");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(10, 43, 166, 25);
		fr.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("2.Kiểm Tra Số Lượng Toàn Kho");
		lblNewLabel_8_1.setForeground(Color.RED);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8_1.setBounds(10, 233, 236, 25);
		fr.getContentPane().add(lblNewLabel_8_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(10, 394, 599, 263);
		fr.getContentPane().add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Còn hàng", null, panel_2, null);
		panel_2.setLayout(null);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"MÃ SP", "Tên SP","Ngày Nhập kho","Giá nhập","Số Lượng","Loại Sản phẩm"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				
			},
			new String[] {
				"MASP", "TENSP", "NGAYNHAP", "GIANHAP", "SOLUONG", "LOAISP"
			}
		));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setEnabled(false);
		table.setBounds(0,0, 587, 227);
		panel_2.add(table);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Hết Hàng", null, panel_3, null);
		panel_3.setLayout(null);
		
		table1 = new JTable();
		table1.setModel(new DefaultTableModel(
			new Object[][] {
				{"MÃ SP", "Tên SP","Ngày Nhập kho","Giá nhập","Số Lượng","Loại Sản phẩm"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				
			},
			new String[] {
				"MASP", "TENSP", "NGAYNHAP", "GIANHAP", "SOLUONG", "LOAISP"
			}
		));
		table1.setColumnSelectionAllowed(true);
		table1.setCellSelectionEnabled(true);
		table1.setEnabled(false);
		table1.setBounds(0,0, 587, 227);
		
		panel_3.add(table1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("3.Bảng Thống Kê");
		lblNewLabel_8_1_1.setForeground(Color.RED);
		lblNewLabel_8_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8_1_1.setBounds(10, 355, 236, 25);
		fr.getContentPane().add(lblNewLabel_8_1_1);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setBounds(10, 684, 89, 23);
		fr.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cập Nhật");
		btnNewButton_1.setBounds(131, 684, 89, 23);
		fr.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setBounds(259, 684, 89, 23);
		fr.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.setBounds(387, 684, 89, 23);
		fr.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Close");
		btnNewButton_4.setBounds(509, 684, 89, 23);
		fr.getContentPane().add(btnNewButton_4);
		
			}
	public void clock() {
		framedongho gio = new framedongho(clock);
        Thread t1 = new Thread(gio);
        t1.start();
	}
}
	

