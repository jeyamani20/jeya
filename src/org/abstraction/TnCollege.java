package org.abstraction;
  //child class
	public class TnCollege extends CollegeAdmission {

		@Override
		public void communityCertificate() {
		System.out.println("Community Certificate");	
		}
		 public static void main(String[] args) {
			TnCollege t= new TnCollege();
			t.aadharCard();
			t.communityCertificate();
			t.passPort();
		}
	}


