package fromdangki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;

public class validate {
	
	public static boolean battronguser(String user) {
		if(user.equals("")) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public static boolean battrongpass(String pass) {
		if(pass.equals("")) {
			return false;
		}else {
			return true;
		}

	}
	
	public static boolean battrongcheckpass(String checkpass) {
		if(checkpass.equals("")) {
			return false;
		}else {
			return true;
		}

	}
	
	public static boolean battrongemail(String email) {
		if(email.equals("")) {
			return false;
		}else {
			return true;
		}

	}
	public static boolean checkpass(String pass,String checkpass) {
		if(!pass.equals(checkpass)) {
			return false;
		}else {
			return true;
		}
	}
			
	public static boolean patternMatches(String emailAddress, String regexPattern) {
	    return Pattern.compile(regexPattern).matcher(emailAddress).matches();
	}
	
}
