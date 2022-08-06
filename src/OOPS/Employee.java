package OOPS;

public class Employee {
	
	public String Name;
	public int Empid;
	public String Department;
	
	public Employee() {
		
		System.out.println("default contructor");
	}
	public Employee(String p1,int p2,String p3) {
		
		Name=p1;
		Empid=p2;
		Department=p3;
	}
	 
	public void Display() {
		
		System.out.println(Name);
		System.out.println(Empid);
	    System.out.println(Department);		
	}
}
