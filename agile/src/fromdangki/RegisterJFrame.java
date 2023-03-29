package fromdangki;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class RegisterJFrame {

   public static JFrame frame;
   public static JPanel jPanel1;
   public static JPanel logo;
   public static JLabel title;
   public static JLabel Name;
   public static JLabel Pass;
   public static JLabel checkpass;
   public static JLabel email;
   public static JLabel account;
   public static JCheckBox hienpass;
   public static JTextField Fullname;
   public static JPasswordField password;
   public static JPasswordField Repassword;
   public static JTextField contact;
   public static JButton SignIn;
   public static JButton SignUp;
   // register rs = new register();
   validate v = new validate();
   xulidangki x = new xulidangki();
    public RegisterJFrame() {
        inputData();
    }
    
    ImageIcon i = new ImageIcon("C:\\Users\\DUC CODER\\Desktop\\anh3.png");
    private JLabel logo2;

    private void inputData() {
        frame = new JFrame("");
        frame.setSize(620, 440);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        logo = new JPanel();
        logo.setSize(300, 400);
        logo.setBackground(new Color(255,255,255));
        frame.getContentPane().add(logo);
        logo.setLayout(null);
        
        logo2 = new JLabel(i);
        logo2.setBounds(0, 0, 300, 400);
        logo.add(logo2);

        jPanel1 = new JPanel();
        jPanel1.setBackground(Color.white);
        jPanel1.setSize(620, 440);
        jPanel1.setLayout(null);
        frame.getContentPane().add(jPanel1);

        title = new JLabel();
        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("Sign Up");
        title.setForeground(Color.black);
        title.setBounds(410, 1, 100, 40);
        jPanel1.add(title);

        Name = new JLabel("Full name");
        Name.setForeground(Color.black);
        Name.setBounds(315, 30, 100, 40);
        Name.setFont(new java.awt.Font("Segoe UI Black", 1, 14));
        jPanel1.add(Name);

        Fullname = new JTextField();
        Fullname.setBounds(315, 65, 285, 31);
        jPanel1.add(Fullname);

        Pass = new JLabel("Password");
        Pass.setForeground(Color.black);
        Pass.setFont(new java.awt.Font("Segoe UI Black", 1, 14));
        Pass.setBounds(315, 93, 100, 40);
        jPanel1.add(Pass);

        password = new JPasswordField();
        password.setBounds(315, 130, 285, 31);
        jPanel1.add(password);

        checkpass = new JLabel("Re-Password");
        checkpass.setForeground(Color.black);
        checkpass.setFont(new java.awt.Font("Segoe UI Black", 1, 14));
        checkpass.setBounds(315, 160, 100, 40);
        jPanel1.add(checkpass);

        Repassword = new JPasswordField();
        Repassword.setBounds(315, 195, 285, 31);
        jPanel1.add(Repassword);

        email = new JLabel("Email");
        email.setForeground(Color.black);
        email.setFont(new java.awt.Font("Segoe UI Black", 1, 14));
        email.setBounds(315, 220, 100, 40);
        jPanel1.add(email);

        contact = new JTextField();
        contact.setBounds(315, 255, 285, 31);
        jPanel1.add(contact);

        account = new JLabel("I've an account");
        account.setBackground(Color.black);
        account.setBounds(315, 355, 100, 40);
        jPanel1.add(account);

        SignUp = new JButton("Đăng kí");
        SignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	x.xuli();
            }
        });
        SignUp.setBounds(315, 300, 80, 35);
        SignUp.setForeground(Color.white);
        SignUp.setBackground(Color.blue);
        jPanel1.add(SignUp);
        SignIn = new JButton("Sign In");
        SignIn.setBounds(410, 360, 80, 35);
        SignIn.setForeground(Color.red);
        SignIn.setBackground(Color.white);
        jPanel1.add(SignIn);
        SignIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
        
        hienpass = new JCheckBox("Hiện mật khẩu");
        hienpass.setBackground(Color.WHITE);
        hienpass.setForeground(Color.BLACK);
        hienpass.setBounds(470, 306, 120, 23);
        jPanel1.add(hienpass);
        
        hienpass.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(hienpass.isSelected()) {
					password.setEchoChar((char)0);
					Repassword.setEchoChar((char)0);
				}else {
					password.setEchoChar('*');
					Repassword.setEchoChar('*');
				}
			}
		});

    }

    public static void main(String[] args) {
        new RegisterJFrame().frame.setVisible(true);
    }
}

