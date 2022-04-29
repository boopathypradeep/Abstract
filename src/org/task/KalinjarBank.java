package org.task;

public class KalinjarBank extends AmmaBank{

	@Override
	public void customerInfo(int id, String name) {
	System.out.println("customer id is:"+id+"\n"+"customer name is:"+name);	
		
	}
	@Override
	public void kycNorms() {
		System.out.println("kyc norms becoming mandatory");
		super.kycNorms();
	}
	public static void main(String[] args) {
		KalinjarBank k=new KalinjarBank();
		k.customerInfo(787, "Bayangaram Bank");
		k.kycNorms();
	}

}
