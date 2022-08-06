package OOPS;

public class BOAbank extends Bank {
	public int creditcardnum;
	public void CCbalance() {
		System.out.println("Inside CC balance");
		this.creditcardnum = 102778;
		super.Accountno = 25887;
	}
	
   public void CloseAccount(int CCnumber) {
	   System.out.println("Inside BOA Close account");
   }
   
}
