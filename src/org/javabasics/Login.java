package org.javabasics;

public class Login {
	public void btnLogin() {
		System.out.println("btn login");
	}
	public static void main(String[] args) {
		SignUp s = new SignUp();
		s.emailId();
		s.passWord();
		
		Login l = new Login();
		l.btnLogin();
	}

}
