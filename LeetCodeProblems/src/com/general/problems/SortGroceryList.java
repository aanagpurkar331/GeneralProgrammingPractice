package com.general.problems;

import java.util.HashMap;

public class SortGroceryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] grocery = {"Tomato", "Cabbage","Cherry","Ketchup","Onion","Grapes","Chilli Powder"};
		HashMap<String,String> sortedList = new HashMap<String,String>();
		for (int i = 0; i < grocery.length; i++) {
			sortedList.put(grocery[i], getIsle(grocery[i]));			
		}
		System.out.println(sortedList);
	}
	
	public static String getIsle(String item) {
		switch (item) {
		
		case "Tomato":
			return "Vegetables";
		
		case "Cherry":
			return "Fruits";

		case "Cabbage":
			return "Vegetables";

		case "Chilli Powder":
			return "Spices";

		case "Onion":
			return "Vegetables";

		case "Grapes":
			return "Fruits";

		case "Ketchup":
			return "Spices";
			
			
		default:
			break;
		}
		return "";
	}

}
