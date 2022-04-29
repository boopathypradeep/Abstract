package org.task;

public class IobBank extends SyndicateBank {

	@Override
	public void savings(String intrest) {
	System.out.println("IOB bank savings intrest rate is:"+intrest);
	this.deposits(8);	
	}

	@Override
	public void deposits(int intrest) {
		System.out.println("IOB bank deposite intrest rate is:"+intrest);
		
	}
	public static void main(String[] args) {
		IobBank i =  new IobBank();
		i.savings("7");
	}
	
	

}
