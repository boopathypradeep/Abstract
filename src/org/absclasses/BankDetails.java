package org.absclasses;



public class BankDetails extends VishvasBank {

	@Override
	public void cusFor() {
		System.out.println("Foreign Customer: Milinda ");
	}

	@Override
	public void cusAge() {
		System.out.println("Customer age:62");
	}

	@Override
	public void empName() {
		System.out.println("Employee Name is: Yaroo");
	}

	@Override
	public void empQua() {
		System.out.println("employee qualification: SSLC pass");
	}

	@Override
	public void clientName() {
		System.out.println("clientName is: Jack power ranger");
	}

	@Override
	public void clientId() {
		System.out.println("lient id:  SPD empergency");
	}

	@Override
	public void cusName1() {
		System.out.println("Customer name: Antartica");
	}

	@Override
	public void cusId1() {
		System.out.println("Customer id:9053");
	}

	@Override
	public void cusKyc() {
		System.out.println("Customer KYC:93590");
	}

	@Override
	public void cusPhone() {
		System.out.println("Customer Phone:9052940382");
	}
	public static void main(String[] args) {
	BankDetails b=new 	BankDetails();
	b.cusName();
	b.cusId();
	b.savings();
	b.deposits();
	b.branch();
	b.acNo();
	b.empName();
	b.empQua();
	b.clientName();
	b.clientId();
	b.cusFor();
	b.cusAge();
	b.cusName1();
	b.cusId1();
	b.cusPhone();
	b.cusName1();
	b.cusId1();
	b.cusName1();
	b.cusId1();
	b.cusKyc();
	}

}
