package org.inheritance; //Multilevel inheritance 

public class AccountMaintenance extends Login { //extends subclass
	public void profilePhoto() {
		System.out.println("Profile Photo");
	}
	public static void main(String[] args) {
		AccountMaintenance m = new AccountMaintenance();
		m.userName();
		m.passWord();
		m.btnLogin();
		m.profilePhoto();
	}
	
}
