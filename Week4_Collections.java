package com.weekly.week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4_Collections {

	public static void main(String[] args) {
			if (!isCommandLineValid(args)) {
				return;
			}
			
			final String clArg = args[0];
			switch (clArg) {
			case "task1" :   
				task1();
				break;
			case "task2" :   // sets
				task2();
				break;
			case "task3" :   //lists
				task3();
				break;
			case "task4" :   // Maps
				task4();
				break;
			default:
				System.out.print("Invalid command line argument.  Valid arguments are task1, task2, task3, task4");
			}
		}

	
	
	public static void task1() {
		// old way
		//@SuppressWarnings("removal")
		Integer x1 = new Integer (2345678);     
		
		// new way
		// autoboxing value of primitive class assigned to wrapper class
		Integer x2 = 2345678;					
		
		System.out.println ("1. " + x1.equals(x2));
		System.out.println ("2. " + (x1 == x2));
		
		// unboxing - value of the wrapper class assigned to a primitive
		int x3 = x1;							
		
		System.out.println ("3. " + x1.equals(x3));
		System.out.println ("4. " + (x1 == x3));
		
		// useful tip   parseInt
		String milesToSunStr = "93,000,000";
		int milesToSunInt = Integer.parseInt(milesToSunStr.replace(",", ""));
		System.out.println (milesToSunInt);
		
		
		/**
		 * Wrapper classes
		 * Primitive      Wrapper
		 * ---------      --------
         * boolean        Boolean
		 * char           Character
		 * byte           Byte
		 * short          Short
		 * int            Integer
		 * long           Long
		 * float          Float
		 * double         Dz`ouble
		 */
		
	}

	public static void task2() {
		System.out.println("SETS\n");
		Set<String> trees = new HashSet<>();
		trees.add("Birch");
		trees.add("Birch");
		trees.add("Sequioa");
		trees.add("Willow");
		trees.add("Banyan");
		trees.add(null);
		trees.add(null);
		trees.add("Poplar");
		trees.add("Oak");
		trees.add("Pine");
		trees.add("Elm");
		trees.add("Chocolate cake");
		
		Iterator<String> iter = trees.iterator();		

		for (String tree: trees) {
//     WHY WON"T THIS WORK?
//			if (tree != null && tree.equals("Elm")) {
//				trees.remove("Elm");
//          }
			System.out.println (tree);
		}
		
		
		System.out.println ("---------");
		
		String str = "";
		while (iter.hasNext())   // while ther's another object in the collection
		{
			str = iter.next();   // fetch the next object in the collection
			if (str != null && str.equals("Chocolate cake"))
			{
				iter.remove();
				continue;
			}
			System.out.println (str);
		}
		
		System.out.println ("---------");
		
		for (String tree: trees) {
			System.out.println (tree);
		}
	}	
	
	public static void task3() {
		System.out.println("LISTS\n");
		List<String> mountainRanges = new ArrayList<>();
		
		mountainRanges.add("Rocky Mountains");
		mountainRanges.add("Appalachian Mountains");
		mountainRanges.add("Andes");
		mountainRanges.add("Alps");
		mountainRanges.add("Alaska Range");
		mountainRanges.add("Cascade Range");
		mountainRanges.add("Himalayas");		
		mountainRanges.add("Sierra Nevada");
		mountainRanges.add("Ural Mountains");
		mountainRanges.add("Chocolate cake");
	
		for (String mountainRange : mountainRanges) {
			System.out.println (mountainRanges.indexOf(mountainRange) + " " + mountainRange);		
		}
		
		System.out.println("\nsize = " + mountainRanges.size());
		System.out.print ("removing Chocolate cake");
		mountainRanges.remove("Chocolate cake");
		System.out.println("\nsize = " + mountainRanges.size()+"\n");
		
		System.out.println ("show by for loop");
		for (String mountainRange : mountainRanges) {
			System.out.println (mountainRanges.indexOf(mountainRange) + " " + mountainRange);	
		}
		
		Iterator<String> iter = mountainRanges.iterator();

		System.out.println("\nshow by iterator");
		while (iter.hasNext()) {
			System.out.println (iter.next());
		}
	}
	
	public static void task4() {
		System.out.println("MAPS");
		Map<String, String> stateCapitals = new HashMap<String, String>();
		stateCapitals.put("AZ", "Phoenix");
		stateCapitals.put("CO", "Denver");		
		stateCapitals.put("FL", "Tallahassee");
		stateCapitals.put("UT", "Salt Lake City");
		stateCapitals.put("NV", "Carson City");
		stateCapitals.put("WI", "Madison");
		stateCapitals.put("ID", "Boise");
		stateCapitals.put("DC", "The White House???");
		stateCapitals.put("TX", "Austin");
		stateCapitals.put("CA", "Los Angeles");        // note the duplicate
		stateCapitals.put("CA", "San Fransisco");      // note the duplicate
		stateCapitals.put("CA", "Sacramento");         // note the duplicate
		stateCapitals.put("OR", "Salem");		
		stateCapitals.put("MN", null);	
		
		stateCapitals.remove("DC");
		System.out.println (stateCapitals.get("DC"));
		System.out.println (stateCapitals.get("MN"));
		System.out.println (stateCapitals.get("OR"));
		
		System.out.println ("\nIterate like the video");
		Set<String> stateCapitalsKeys = stateCapitals.keySet();
		for (String key : stateCapitalsKeys) {
			System.out.println (key + " : " + stateCapitals.get(key));
		}
		
		Collection<String> states = stateCapitals.values();
		for (String state : states) {
			System.out.println (state);
		}

		// consolidates what the video does into one simpler loop
		System.out.println ("\nIterate with Map.Entry");
		for (Map.Entry<String,String> entry : stateCapitals.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	
	static boolean isCommandLineValid(String[] clArgs) {
	boolean isValid = true;

	if (clArgs.length == 0) {
		System.out.println ("Please run again and enter a command line argument!");
		isValid = false;
	}
	if (clArgs.length > 1) {
		System.out.println ("Command line Arguments");
		for (String clArg: clArgs) {
			System.out.println (clArg);
		}
		isValid = false;
	}
	return isValid;
}

} // END class
