package org.abstraction;

public abstract class CollegeAdmission {  //parent class
	//non abstract
	public void aadharCard() {
		System.out.println("aadhar card");
	}
	public void passPort() {
		System.out.println("passport");
	}
	//abstract
	public abstract  void communityCertificate();

}
