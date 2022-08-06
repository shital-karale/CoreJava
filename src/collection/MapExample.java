package collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "shiv");
		map1.put(2, "Jhon");
		map1.put(3, "Varsha");
		map1.put(4, "Avinash");
		map1.put(5, "Babita");
		map1.put(2, "Arpita"); //replace value shiv by arpita
		map1.put(100,"shiv");
		
		System.out.println(map1);
		System.out.println("Data at 4th position is  " + map1.get(4));
		System.out.println("Data at 100th position is  " + map1.get(100));
		
		map1.remove(100);
		System.out.println("After remove data list is  " + map1);
		
		for (Integer key: map1.keySet()) {
			
			System.out.println("key is : " + key);
			System.out.println("value is:  " + map1.get(key));
		}
	}

}
