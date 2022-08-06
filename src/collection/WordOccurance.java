package collection;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World Love World";
		
			String [] words = str.split(" ");
			
			 HashMap<String,Integer> map1 = new HashMap<String,Integer> ();
			 
			 for(String word: words) {
				 
				 if(map1.get(word)== null) {
					 
					 map1.put(word,1);
				 }else {
					 
					 int oldoccu =  map1.get(word);
					 
					 map1.put(word,oldoccu+1);
				 }
					 
			 }
			 
			 System.out.println(map1);
				
	}

}
