package org.javabasics.diffpackage.sameclass;

import org.javabasics.Login;
import org.javabasics.SignUp;

public class DiffPackageSameClass {
	public void dpPhoto() {
		System.out.println("Dp Photo");
	}
	public void marriedStatus() {
		System.out.println("married");
	}
	public static void main(String[] args) {
		SignUp s = new SignUp();
		s.emailId();
		s.passWord();
		Login l = new Login();
		l.btnLogin();
		DiffPackageSameClass d = new DiffPackageSameClass();
		d.dpPhoto();
		d.marriedStatus();	
	}

}
