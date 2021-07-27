package com.general.problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
		Map<String, String> isleLookup =  new HashMap<String, String>();
		BufferedReader br = null;
		File file = new File("C:\\Users\\anagpurk\\Desktop\\Help\\lookup.txt");
		
		try {
			br = new BufferedReader( new FileReader(file));
		
		
		String line = null;
		
		while ((line = br.readLine()) != null) {
			
			// split the line by
			String[] parts = line.split(":");
			
			String itm = parts[0].trim();
			String ile = parts[1].trim();
			
			if(!itm.equals("") && !ile.equals(""))
				isleLookup.put(itm,ile);
			
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isleLookup.get(item);
	}

}
