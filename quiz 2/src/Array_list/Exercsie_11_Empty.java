package Array_list;

import java.util.HashSet;

public class Exercsie_11_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String> sports = new HashSet<String>();
	
	sports.add("Basketball");
	sports.add("Football");
	sports.add("Soccer");
	sports.add("Vollyball");
	sports.add("Wrestling");
	sports.add("Tennis");
	
	System.out.println("Hash Set contains: " + sports);
	
	sports.removeAll(sports);
	
	System.out.println("after removeAll: " + sports);
	
	
	
		
	}

}
