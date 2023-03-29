package OOP;

public class User {
	
	String name;
	String pass;
	String email;
	String loaitaikhoan;
	

	public User(String name, String pass, String loaitaikhoan,String email) {
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.loaitaikhoan = loaitaikhoan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getLoaitaikhoan() {
		return loaitaikhoan;
	}

	public void setLoaitaikhoan(String loaitaikhoan) {
		this.loaitaikhoan = loaitaikhoan;
	}
	
}
