package com.weekly.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicLists {

	public static void main (String[] args) {

		if (!isCommandLineValid(args)) {
			return;
		}
		
		final String clArg = args[0];
		switch (clArg) {

		case "example1" :   
			example1();
			break;
		case "example2" :
			example2();
			break;
		case "example3" :
			example3();
			break;
		case "example4" :
			example3();
			break;
		default:
			System.out.print("Invalid command line argument. legal arguments: example0 - example6");
		}
	}

	static void example1()
	{
		/*
		add(): A method used to add an element to a List. 
		clear(): A method used to remove all elements from a List. 
		contains(): returns true if the List contains the specified element, otherwise false. 
		get(): A method used to retrieve an element from a List at a specified index. 
		indexOf(): A method used to retrieve the index of a specified element in a List. 
		isEmpty(): A method used to check if a List is empty. 
		remove(): A method used to remove an element from a List. 
		set(): A method used to replace an element in a List at a specified index. 
		size(): returns the number of elements in the List.']
		*/
		
		List<String> mStates = new ArrayList<String>();
		mStates.add("Maine");
		mStates.add("Maryland");
		mStates.add("Massachusetts");		
		mStates.add("Michigan");
		mStates.add("Minnesota");
		mStates.add("Mississippi");
		mStates.add("Missouri");
		mStates.add("Montana");
		
		
		System.out.println (mStates);
	
		System.out.println ("Add a state");
		mStates.add("Florida");
		System.out.println (mStates);
		
		System.out.println("clear the list");
		mStates.clear();
		System.out.println (mStates);
		
		mStates.add("Maine");
		mStates.add("Maryland");
		mStates.add("Massachusetts");		
		mStates.add("Michigan");
		mStates.add("Minnesota");
		mStates.add("Mississippi");
		mStates.add("Missouri");
		mStates.add("Montana");
		
		System.out.println("contains \"California\" : " + mStates.contains("California"));
		
		System.out.println("Get second state in the list : " + mStates.get(1));
		
		System.out.println("Get the index of Mississippi : " + mStates.indexOf(new String("Mississippi")));
		System.out.println("Get the index of Alabama : " + mStates.indexOf(new String("Alabama")));
	
		System.out.println("Is the list empty : " + mStates.isEmpty());
		
		System.out.print ("change state at index 4 to Alabama : "); 
		mStates.set(4, "Alabama");
		System.out.println(mStates);
		
		System.out.println ("list size = " + mStates.size());
		
	}
	
	// problem 5, factors
	public static void example2() {
     // Interface                   Implementation
		List<Integer> factors = new ArrayList<>();
		int product = 0;
		do {
			System.out.println ("Find factors for x>0 :");
			Scanner scanner = new Scanner (System.in);
			product = scanner.nextInt();
			if ( product < 0) {
				System.out.println ("product must be > 0");
			}
			// find the factors, if div by 0, add to list
			for (int idx = 1; idx <= product; idx++) {
				if (product % idx == 0) {
					factors.add(idx);
				}
			}
		} while (product < 0);
		// print the list
		for (Integer factor : factors) {
			System.out.println (factor);
		}
		if (factors.size() == 2) {
			System.out.println (product + " is a a prime number!");
		}
	}

	
	// problem 8 word count  // enter 5 print out every other word
	public static void example3() {
		List<String> words = new ArrayList<>();
		Scanner scanner = new Scanner (System.in);
		int wordCount = 0;
		String currentWord = "";
		do {
			System.out.println ("Enter word " + ++wordCount);
			currentWord = scanner.next();
			if (wordCount % 2 != 0) {
				words.add(currentWord);
			}
		} while (wordCount < 5);
		for (String word : words) {
			System.out.println (word);
		}
	}
	
	// problem 4, ten words
	public static void example4() {
		List<String> tenWords = new ArrayList<String>();
		tenWords.add("The");
		tenWords.add("quick");
		tenWords.add("brown");
		tenWords.add("fox");		
		tenWords.add("jumps");		
		tenWords.add("over");		
		tenWords.add("the");
		tenWords.add("big");		
		tenWords.add("lazy");		
		tenWords.add("dog");		
		
		int num1 = 0, num2 = 0, num3 = 0;
		do {
			System.out.println ("Enter 3 integers");
			Scanner scanner = new Scanner (System.in);
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			num3 = scanner.nextInt();
			if ( (num1 < 0 || num1 > 9) || 
				 (num2 < 0 || num2 > 9) || 
				 (num3 < 0 || num3 > 9)) {
				System.out.println ("All values must be be between 0 and 9");
			}
		} while ((num1 < 0 || num1 > 9) || (num2 < 0 || num2 > 9) || (num3 < 0 || num3 > 9));
		List<String> threeWords = new ArrayList<>();
		threeWords.add(tenWords.get(num1));
		threeWords.add(tenWords.get(num2));
		threeWords.add(tenWords.get(num3));
		System.out.println (threeWords);
	}

	
	static boolean isCommandLineValid(String[] clArgs) {
		boolean isValid = true;

		if (clArgs.length  == 0) {
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
