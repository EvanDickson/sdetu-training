package oop;

public class loanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase rate");
		
	}

}
