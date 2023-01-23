package org.multipleinheritance;

public class SbiChildClass implements RbiParentClass1, WbParentClass2{

	@Override
	public void carLoan() {
      System.out.println("Car Loan 19.5%");		
	}

	@Override
	public void homeLoan() {
      System.out.println("Home Loan 9.3%");		
	}

	@Override
	public void currentAccount() {
      System.out.println("Current Account 7.2%");		
	}

	@Override
	public void fixedDeposit() {
      System.out.println("fixed Deposit 11%");		
	}

	@Override
	public void ccDept() {
		System.out.println("Cc Dept 14%");
		
	}

	@Override
	public void savingAccount() {
		System.out.println("Saving Account 11%");
	}
	public static void main(String[] args) {
		SbiChildClass s = new SbiChildClass();
		s.carLoan();
		s.ccDept();
		s.currentAccount();
		s.homeLoan();
		s.savingAccount();
		s.fixedDeposit();
	
	}

}
