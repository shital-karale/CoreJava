package OOPS;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee();
		
		E1.Name ="Mike";
		E1.Empid = 1000;
		E1.Department = "HR";
		
		 E1.Display();
		 
		 Employee E2 = new Employee("shital",2000,"HR");
			
			
			E2.Display();
			
			Bank B = new Bank();
		B.Displaybalance();
		int bal = B.Getbalnce();
		System.out.println("the balnce is" + bal);
		
		Overloading obj = new Overloading();
		
		int RecArea = obj.GetArea(3, 4);
		
		int SqArea = obj.GetArea(4);
		
		System.out.println("Rectangle are is" +  RecArea);
		System.out.println("Squre Area are is" + SqArea);
		
		//B1.CloseAccount(12345);
		//B.CloseAccount(1258);
		
		Chrom ch = new Chrom();
		ch.OpenBreowser();
		ch.Show();
		
		Browser Br = new Chrom();
		Br.OpenBreowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
		       HondaCar car1 = new HondaCar();
		CarInterface car2 = new HondaCar();
		
		Encapsulation En = new Encapsulation();
		En.setBalance(3000);
		
	}

}
