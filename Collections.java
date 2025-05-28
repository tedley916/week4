package com.weekly.week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
			if (!isCommandLineValid(args)) {
				return;
			}
			
			final String clArg = args[0];
			switch (clArg) {
			case "example1" :   // sets
				example1();
				break;
			case "example2" :   //lists
				example2();
				break;
			case "example3" :   // Maps
				example3();
				break;
			default:
				System.out.print("Invalid command line argument.  Valid arguments are example1, example2, example3, example4");
			}
		}


	@SuppressWarnings("unused")
	public static void example1() {
		System.out.println("SETS");
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
		trees.add("Pretty flowers");
		trees.add("Chocolate cake");
		
		trees.remove("Pretty flowers");
		
		
		boolean crash = false;
		if (crash) {
			System.out.println ("\n----- WHY DOESN'T THIS WORK? -----");
			System.out.flush();
			for (String tree: trees) {
				if (tree != null && tree.equals("Elm")) {
					trees.remove("Elm");
	          }
				System.out.println (tree);
			}
		}
	
		System.out.println ("\n----- Enhanced for loop ----");
		
		for (String tree: trees) {
			System.out.println (tree);
		}
		
		System.out.println ("\n---- Loop with iterator -----");
		
		Iterator<String> iter = trees.iterator();		
		String str = "";
		while (iter.hasNext())   // while there's another object in the collection
		{
			str = iter.next();   // fetch the next object in the collection
			if (str != null && str.equals("Chocolate cake"))
			{
				iter.remove();
				continue;
			}
			System.out.println (str);
		}
		
	}	
	
	public static void example2() {
		System.out.println("LISTS\n");
		List<String> mountainRanges = new ArrayList<>();
		
		mountainRanges.add("Rocky Mountains");
		mountainRanges.add("Appalachian Mountains");
		mountainRanges.add("Andes");
		mountainRanges.add("Alps");
		mountainRanges.add("Alaska Range");
		mountainRanges.add("Cascade Range");
		mountainRanges.add(0, "Himalayas");		  // advantage of lists over arrays
		mountainRanges.add("Sierra Nevada");
		mountainRanges.add("Ural Mountains");
		mountainRanges.add("Chocolate cake");
	
		// adds index to string for outoput
		for (String mountainRange : mountainRanges) {
			System.out.println (mountainRanges.indexOf(mountainRange) + " " + mountainRange);		
		}
		
		// remove chocolate cake :(
		System.out.println("\nsize = " + mountainRanges.size());
		System.out.print ("removing Chocolate cake )-;");
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
	
	public static void example3() {
		System.out.println("MAPS\n");
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
		stateCapitals.put("CA", "Los Angeles");        
		stateCapitals.put("CA", "San Fransisco");      // note the duplicate key
		stateCapitals.put("CA", "Sacramento");         // note the duplicate key
		stateCapitals.put("OR", "Salem");		
		stateCapitals.put("MN", null);	
		
		stateCapitals.remove("DC");
		System.out.println (stateCapitals.get("DC"));
		System.out.println (stateCapitals.get("MN"));
		System.out.println (stateCapitals.get("OR"));
		System.out.println (stateCapitals.get("UT"));
		
		System.out.println ("\nIterate like the video\nIterates over values:");
		Set<String> stateCapitalsKeys = stateCapitals.keySet();
		for (String key : stateCapitalsKeys) {
			System.out.println (key + " : " + stateCapitals.get(key));
		}
		
		System.out.println ("\nThen iterate over keyset");
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
