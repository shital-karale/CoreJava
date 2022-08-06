package test;

public class Exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {3,4,5};
		
		//int num = 10;
	try {
			 System.out.println("Insider the catch block");

		System.out.println(array[5]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			
			 System.out.println("Insider the catch block");
		}
		
		System.out.println("after exception");
	}

}
