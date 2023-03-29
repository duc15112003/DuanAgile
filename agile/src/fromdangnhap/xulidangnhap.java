package fromdangnhap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import framequanlikho.*;
import fromdangnhap.login;
public class xulidangnhap {

	String userName ;
    String password ;
    String capcha;
	public void dangnhap() {
		userName = login.user.getText();
        password = login.pass.getText();
        capcha = login.dienma.getText();
        if(userName.equals("")) {
        	JOptionPane.showMessageDialog(null, "Đang trống User");
        }else if(password.equals("")){
        	JOptionPane.showMessageDialog(null, "Đang trống pass");
        }else if(capcha.equals("")){
        	JOptionPane.showMessageDialog(null, "Đang trống mã xác nhận");
        }else{
        	 try {
     			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     			Connection cn = null;
     			cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseNames=QLK_Demo;username=duc;password=123");
     			PreparedStatement st = cn.prepareStatement("use QLK_Demo;Select username, password from banguser where username=? and password=?;");
     			 st.setString(1, userName);
                  st.setString(2, password);
                  ResultSet rs = st.executeQuery();
                  if (rs.next()) {
                      JOptionPane.showMessageDialog(null, "Ban da dang nhap thanh cong");
                  } else {
                      JOptionPane.showMessageDialog(null, "User hoac password sai!");
                  }
                  
                  PreparedStatement st1 = cn.prepareStatement("use QLK_Demo; Select loaitk from banguser where username=? and password=?;");// câu lệnh đang trả về bảng
                  st1.setString(1, userName);
                  st1.setString(2, password);
                  ResultSet kq = st1.executeQuery();
                  while(kq.next()) {
      				String loai = kq.getString("loaitk");
      				if(loai.equals("user")) {
      					JOptionPane.showMessageDialog(null,"bạn đang đăng nhập với tư cách người dùng");
      					login.frame.setVisible(false);
      				}else if(loai.equals("adminchinhanh")) {
      					JOptionPane.showMessageDialog(null,"bạn đang đăng nhập với tư cách admin của chi nhánh bán hàng");
      					login.frame.setVisible(false);
      				}else if(loai.equals("admin")) {
      					JOptionPane.showMessageDialog(null,"bạn đang đăng nhập với tư cách admin quản trị");
      					login.frame.setVisible(false);
      					new framekho().fr.setVisible(true);
      				}
      				
      			}
     		} catch (Exception e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
        }
        
       
      
	}
	public void capcha() {
		 int so1 =(int) (Math.random() * 999999);
		 login.maxacnhan.setText(String.valueOf(so1));
	}

}
