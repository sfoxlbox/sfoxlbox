package Array_list;

import java.util.HashSet;

public class Exercise_13_Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String>girlsName = new HashSet<String>();
	
	girlsName.add("Kate");
	girlsName.add("Jessica");
	girlsName.add("Michelle");
	girlsName.add("Amber");
	girlsName.add("Maria");
	girlsName.add("Christina");
	
	System.out.println(girlsName);
	
	String[] girlsName_array = new String[girlsName.size()];
	girlsName.toArray(girlsName_array);
	
	System.out.println("converted to Array : ");
	for(String element: girlsName_array) 
	{
		System.out.println(element);
	
	}
	
	
	
	
		
	}

}
