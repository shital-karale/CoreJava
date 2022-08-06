package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("shiv");
		list1.add("shital");
		list1.add("vish");
		list1.add("priyanka");
		list1.add("vishal");
		
		System.out.println("List of Array is" + list1);
		System.out.println("Size of List of Array is" + list1.size());
		
		list1.remove(2);
		System.out.println("List of Array is aftar delete" + list1);
		System.out.println("Size of List of Array is" + list1.size());
		System.out.println("Data on 4th position" +   list1.get(3));
		list1.set(1, "shivani");
		
		System.out.println("After replacing data array is" + list1);
		
		list1.add(2,"raj");
		System.out.println("After adding data array is" + list1);
		
		Collections.sort(list1);
		
		System.out.println("After sorting data array is" + list1);
		
		for (int index=0;index<list1.size();index++) {
			
			
			
			System.out.println(list1.get(index));
		}
		
		for(String name:list1) {
			
			System.out.println(name);
		}
		
		for (int index=0;index<list1.size();index++) {
			
			if(list1.get(index).equals("priyanka")) {
				
				System.out.println(index);
				
				break;
			}
		}
	}

	
}
