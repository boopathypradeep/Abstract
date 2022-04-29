package org.task;

public class KarurVaishyaBank implements SyndicateBank1{

	@Override
	public void savings(int interest) {
		System.out.println("savings interest:"+interest);
		this.deposits(11l);
	}

	@Override
	public void deposits(long interest) {
		System.out.println("deposits interest:"+ interest);
	}
	public static void main(String[] args) {
		KarurVaishyaBank k = new KarurVaishyaBank();
		k.savings(8);
	}
	

}
