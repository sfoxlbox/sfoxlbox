package Array_list;

import java.util.ArrayList;

public class Exercise_3_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apples");
		fruits.add("Apricot");
		fruits.add("Banana");
		fruits.add("Blackberry");
		fruits.add("Blueberry");
		fruits.add("Cherry");
		fruits.add("Coconut");
		
		System.out.println(fruits);
		
		fruits.add(0, "Mango");
		fruits.add(5, "Pear");
		
		System.out.println(fruits);
		
		
		
		
		
	}

}
