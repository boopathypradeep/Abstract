package org.task;

public class IbBank1 implements IobBank1 {

	@Override
	public void empId(int id) {
		System.out.println("Employee id is:"+ id);
		this.empName("Alagesh");
	}

	@Override
	public void empName(String name) {
		System.out.println("emp name is:"+ name);
		
	}
	public static void main(String[] args) {
		IbBank1 i= new IbBank1();
		i.empId(89);
	}
	
	
	

}
