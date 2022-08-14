package Array_list;

import java.util.HashSet;

public class Exercise_12_HashSet_empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> names = new HashSet();
		
		names.add("David");
		names.add("Peter");
		names.add("Drew");
		names.add("Dustin");
		names.add("Bob");
		
		System.out.println(names);
		
		System.out.println(names.isEmpty());
		
		names.removeAll(names);
		
		System.out.println(names);
		
		System.out.println(names.isEmpty());
		
		
		
		
		
	}

}
