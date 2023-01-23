package org.inheritance;

public class Login extends SignUp {   //sub class
	public void btnLogin() {
		System.out.println("Btn Login");
	}
public static void main(String[] args) {
	Login l = new Login();
	l.userName();
	l.passWord();
	l.btnLogin();
	
}
}
