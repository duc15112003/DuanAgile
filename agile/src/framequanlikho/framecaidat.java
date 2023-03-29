package framequanlikho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fromdangnhap.login;
import main.maintest;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;

public class framecaidat {
	public JFrame frame;
	private JPanel contentPane;
	JButton btndongcaidat;
	JLabel caidatchung;
	JLabel thongtintaikhoan;
	JLabel dangxuat;
	JLabel doipass;
	public static void main(String[] args) {
		new framecaidat().frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public framecaidat() {
		frame = new JFrame("Cài Đặt");
		frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 511, 460);
		frame.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cài Đặt");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(216, 11, 67, 27);
		contentPane.add(lblNewLabel);
		
		btndongcaidat = new JButton("Đóng cài đặt");
		btndongcaidat.setBounds(369, 387, 116, 23);
		contentPane.add(btndongcaidat);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\Icons\\Icons\\process.png"));
		lblNewLabel_1.setBounds(52, 67, 57, 48);
		contentPane.add(lblNewLabel_1);
		
		caidatchung = new JLabel("Cài Đặt Chung");
		caidatchung.setFont(new Font("Tahoma", Font.BOLD, 15));
		caidatchung.setBounds(181, 77, 202, 38);
		contentPane.add(caidatchung);
		
		thongtintaikhoan = new JLabel("Thông Tin Tài Khoản");
		thongtintaikhoan.setFont(new Font("Tahoma", Font.BOLD, 15));
		thongtintaikhoan.setBounds(179, 161, 171, 31);
		contentPane.add(thongtintaikhoan);
		
		dangxuat = new JLabel("Log out");
		dangxuat.setFont(new Font("Tahoma", Font.BOLD, 16));
		dangxuat.setBounds(181, 326, 109, 23);
		dangxuat.addMouseListener(new MouseAdapter() {
	
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new login().frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		contentPane.add(dangxuat);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\Icons\\Icons\\business_user.png"));
		lblNewLabel_1_1.setBounds(52, 144, 57, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\keyunlock.jpg"));
		lblNewLabel_1_2.setBounds(52, 238, 57, 48);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\Icons\\Icons\\icon\\logout.png"));
		lblNewLabel_1_3.setBounds(52, 312, 41, 48);
		contentPane.add(lblNewLabel_1_3);
		
		doipass = new JLabel("Đổi Mật Khẩu");
		doipass.setFont(new Font("Tahoma", Font.BOLD, 16));
		doipass.setBounds(181, 249, 139, 23);
		contentPane.add(doipass);
		
		JLabel lblNewLabel_7_1 = new JLabel("Phiên Bản Thử Nghiệm: 1.00.00 Server test");
		lblNewLabel_7_1.setBounds(22, 391, 247, 14);
		contentPane.add(lblNewLabel_7_1);
	}
}
