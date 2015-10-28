import java.io.*;
import java.util.*;


public class HelloUser {
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String greetUser(){
		
		return "Hello " + this.userName + "!";
	}
	
	public String getBenutzereingabe (String prompt) {
		String eingabeZeile = null;
		System.out.print(prompt+" ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			eingabeZeile = is.readLine();
			if (eingabeZeile.length() == 0) return null;
		}catch (IOException e){
			System.out.println("IOException: "+e);
		}return eingabeZeile;

	}
	
	

}
