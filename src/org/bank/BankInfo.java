package org.bank;

public class BankInfo extends AxisBank {
 public void saving(int sno) {
	System.out.println("saving SB:"+sno);
}  
 public void fixed(String rupee) {
	System.out.println("fixedPermanent:"+rupee);
}
 public static void main(String[] args) {
	BankInfo a=new BankInfo();
	a.deposit(5000);
	a.saving(10000);
	a.fixed("rupees");
}
}