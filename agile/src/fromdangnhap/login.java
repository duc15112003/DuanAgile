package fromdangnhap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fromdangki.RegisterJFrame;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField; 
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import fromdangnhap.xulidangnhap;
import javax.swing.JSpinner;
public class login {
	public static JFrame frame;
	public static  JPanel contentPane;
	public static  JTextField user;
	public static  JPasswordField pass;
	public static  JTextField dienma;
	public static  JTextField maxacnhan;
	public static  JButton login;
	public static  JButton close;
	public static  JButton signup;
	public static  JButton getcapchabutton;
	boolean ret = true;
	xulidangnhap cl = new xulidangnhap();
	
	public login() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 758, 376);
		frame.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,255));
		panel.setBounds(269, 11, 463, 315);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(138, 34, 58, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\Icons\\Icons\\user.png"));
		lblNewLabel_1.setBounds(10, 98, 46, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\Icons\\Icons\\lock.png"));
		lblNewLabel_2.setBounds(10, 143, 33, 30);
		panel.add(lblNewLabel_2);
		
		user = new JTextField();
		user.setBounds(85, 105, 332, 20);
		panel.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(85, 147, 257, 20);
		panel.add(pass);
		
		JButton btnNewButton = new JButton("Hiện");
		btnNewButton.setBounds(352, 147, 65, 21);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
						if(ret==true) {
							pass.setEchoChar((char)0);
							ret = false;
						}else {
							pass.setEchoChar('*');
							ret = true;
						}
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("Mã xác nhận");
		lblNewLabel_3.setBounds(10, 191, 78, 14);
		panel.add(lblNewLabel_3);
		
		dienma = new JTextField();
		dienma.setBounds(85, 188, 237, 20);
		panel.add(dienma);
		dienma.setColumns(10);
		
		maxacnhan = new JTextField();
		maxacnhan.setEnabled(false);
		maxacnhan.setBounds(352, 188, 68, 20);
		panel.add(maxacnhan);
		maxacnhan.setColumns(10);
		
		getcapchabutton	 = new JButton("Lấy");
		getcapchabutton.setIcon(new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\Icons\\Icons\\Refresh.ico"));
		getcapchabutton.setBounds(352, 219, 68, 18);
		panel.add(getcapchabutton);
		
		getcapchabutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.capcha();
			}
		});
		
		login = new JButton("Login");
		login.setBounds(85, 265, 89, 23);
		panel.add(login);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.dangnhap();
			}
		});
		
		close = new JButton("Close");
		close.setBounds(190, 265, 89, 23);
		panel.add(close);
		
		signup = new JButton("Sign Up");
		signup.setBounds(300, 265, 89, 23);
		panel.add(signup);
		signup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new RegisterJFrame().frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("Build By Dev Group 4");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(85, 332, 177, 23);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 259, 315);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel logo = new JLabel(new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\anh0.png"));
		logo.setBounds(-6, 0, 297, 315);
		panel_1.add(logo);
	}
}
