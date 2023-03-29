package framequanlikho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class framevechungtoi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framevechungtoi frame = new framevechungtoi();
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
	public framevechungtoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông Tin Về Bộ Phận Phát Triển");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(126, 11, 255, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Group 4: ");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 60, 91, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gồm các thành viên");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(93, 62, 164, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("+Lê Ngọc Khánh(Tester + Thiết kế layout phần mềm)");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setBounds(10, 284, 394, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("+ Trịnh Phùng Hồng Phúc(Thiết kế xây dựng database)");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setForeground(Color.BLUE);
		lblNewLabel_1_3.setBounds(10, 106, 410, 26);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("+Phạm Minh Đức(Thiết Kế Xây Dựng Phần Mềm)");
		lblNewLabel_1_4.setForeground(Color.BLUE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(10, 156, 410, 16);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("+Huỳnh Tấn Phát(Thiết kế xây dựng chức năng phần mềm)");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_5.setForeground(Color.BLUE);
		lblNewLabel_1_5.setBounds(10, 197, 442, 21);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("+Lê Tấn Đạt(Scrum master + product owner)");
		lblNewLabel_1_6.setForeground(Color.BLUE);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(10, 242, 432, 21);
		contentPane.add(lblNewLabel_1_6);
		
		JButton btnNewButton = new JButton("Trở lại màn hình cài đặt");
		btnNewButton.setBounds(281, 352, 185, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7_1 = new JLabel("Phiên Bản Thử Nghiệm: 1.00.00 Server test");
		lblNewLabel_7_1.setBounds(10, 356, 247, 14);
		contentPane.add(lblNewLabel_7_1);
	}

}
