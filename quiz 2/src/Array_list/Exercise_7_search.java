package Array_list;

import java.util.ArrayList;

public class Exercise_7_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> season = new ArrayList<String>();
		
		season.add("Spring");
		season.add("Summer");
		season.add("Winter");
		season.add("Fall");
		season.add("Autmn");
		
		System.out.println(season);
		
		if (season.contains("Spring")){
			System.out.println("Spring is is part of the list");
		
		}
		else { System.out.println("Spring is not on the list");
		}
		
		
	}

}
