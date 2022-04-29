package org.task;

public abstract class IbBank {
	public abstract void clientInfo(String name, int id);
	public void empInfo(String name, int id) {
		System.out.println("Employee name is:"+ name+"\t"+"Employee id is:"+ id);

	} 

}
