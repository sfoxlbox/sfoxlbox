package Array_list;

import java.util.ArrayList;

public class Exercise_6_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList<String> name = new ArrayList<String>();
	
	name.add("Smith");
	name.add("John");
	name.add("Thomas");
	name.add("Erick");
	name.add("Larry");
	name.add("Mike");
	
	System.out.println(name);
	
	name.remove(3);
	
	System.out.println("the third index will be removed: " + name);
	
	
	
	
	}

}
