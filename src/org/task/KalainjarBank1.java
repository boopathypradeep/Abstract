package org.task;

public class KalainjarBank1 implements AmmaBank1{

	@Override
	public void cusInfo() {
		System.out.println("customer name is: Vellayan");
		
	}

	@Override
	public void clientInfo() {
		System.out.println("Client name: Ambani");
		
	}
	public static void main(String[] args) {
		KalainjarBank1 k=new KalainjarBank1();
		k.cusInfo();
		k.clientInfo();
	}

}
