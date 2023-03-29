package fromdangki;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import OOP.User;

import fromdangnhap.login;

public class xulidangki {
	String user;
	String pass;
	String checkpass;
	String email;
	String loai = "user";
	String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
	        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

	public void xuli() {
		user = RegisterJFrame.Fullname.getText();
		pass = RegisterJFrame.password.getText();
		checkpass = RegisterJFrame.Repassword.getText();
		email = RegisterJFrame.contact.getText();
		
    	
		if(validate.battronguser(user)== false) {
			JOptionPane.showMessageDialog(null, "user đang trống vui lòng nhập");
			
			
		}else if(validate.battrongpass(checkpass)==false) {
			JOptionPane.showMessageDialog(null, "pass đang trống vui lòng nhập");
			
		}else if(validate.battrongcheckpass(checkpass) == false) {
			JOptionPane.showMessageDialog(null, "Check pass đang trống vui lòng nhập");
			
		}else if(validate.checkpass(pass,checkpass)==false) {
			JOptionPane.showMessageDialog(null, "Pass đang khooong trùng checkpass vui lòng nhập lại");
			
		}else if(validate.battrongemail(email) == false) {
			JOptionPane.showMessageDialog(null, "Email đang trống vui lòng nhập");
			
		}else if(validate.patternMatches(email, regexPattern) == false) {
			JOptionPane.showMessageDialog(null, "Email không hợp lệ");
			
		}else {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection cn = null;
			cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLK_Demo;username=duc;password=123");
			PreparedStatement st = cn.prepareStatement("use QLK_Demo;Insert into banguser values(?,?,?,?)");
			st.setString(1,user);
			st.setString(2,pass);
			st.setString(3,email);
			st.setString(4,loai);
			st.executeUpdate();
			int ret = JOptionPane.showConfirmDialog(null,"Đăng kí thành công bạn có muốn đăng nhập ngay?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(ret == JOptionPane.YES_OPTION) {
				new login().frame.setVisible(true);
				new RegisterJFrame().frame.setVisible(false);
			}else {
				RegisterJFrame.Fullname.setText("");
				RegisterJFrame.password.setText("");
				RegisterJFrame.Repassword.setText("");
				RegisterJFrame.contact.setText("");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi code");
			}		
		}
	}
}
