package Array_list;

import java.util.ArrayList;

public class Exercise_4_retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stubA
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("toyota");
		cars.add("nissan");
		cars.add("honda");
		cars.add("mazda");
		cars.add("subaru");
		cars.add("kia");
		
		System.out.println(cars);
		
		String car_type = cars.get(0);
		System.out.println("First car type: " + car_type);
		
		car_type = cars.get(4);
		System.out.println("First car type: " + car_type);
		
		
		
		
	}

}
