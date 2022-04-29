package org.task;

public class KarurVishyaBank extends IbBank {

	@Override
	public void clientInfo(String name, int id) {
		System.out.println("Client name is:" + name + "\t" + "Client id is:" + id);

	}
	
	@Override
	public void empInfo(String name, int id) {
		this.clientInfo("Rex", 67);
		System.out.println("Employee Name is:"+ name+"\t"+"Employee id is:"+ id);
		super.empInfo("Anilamma", 78);
		
	}

	public static void main(String[] args) {
		 KarurVishyaBank k= new  KarurVishyaBank();
		 k.empInfo("Muniyamma", 56);
	}
}
