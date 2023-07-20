package com.weekly.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week4_List {

	public static void main (String[] args) {

		if (!isCommandLineValid(args)) {
			return;
		}
		
		final String clArg = args[0];
		switch (clArg) {
		case "task1" :   
			task1();
			break;
		case "task2" :
			task2();
			break;
		case "task3" :
			task3();
			break;
		case "task4" :
			task4();
			break;
		default:
			System.out.print("Invalid command line argument.  Valid arguments are task1, task2, task3, task4");
		}

	}

	
	// problem 5, factors
	public static void task1() {
     // Interface                   Implementation
		List<Integer> factors = new ArrayList<>();
		int product = 0;
		do {
			System.out.println ("Enter number of factors (>=0)");
			Scanner scanner = new Scanner (System.in);
			product = scanner.nextInt();
			if ( product < 0) {
				System.out.println ("product must be > 0");
			}
			for (int idx = 1; idx <= product; idx++) {
				if (product % idx == 0) {
					factors.add(idx);
				}
			}
		} while (product < 0);
		for (Integer factor : factors) {
			System.out.println (factor);
		}
	}

	
	// mastery question #1, lets talk about casting
	public static void task2() {
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
			alphabet.add((char)i);
		}
		alphabet.remove(0);
		System.out.println (alphabet);
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println ("casting  Larger = smaller");
		short s1 = 33;
		int i1 = s1;
		System.out.println ("i1 = " + i1);
		
		float f1 = 3.141592653589793238F;
		double d1 = f1;
		System.out.println ("d1 = " + d1);
		
		byte b1 = 65;
		long l1 = b1;
		System.out.println ("l1 = " + l1);

		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println ("expllicit casting smaller = larger with acceptable values (NARROWING)");
		int i2 = 51;
		short s2 = (short)i2;
		System.out.println ("s2 = " + s2);
		
		double d2 = 3.141592653589793238;  // notice the difference!   Precision and rounding
		float f2 = (float)d2;
		System.out.println("f2 = " + f2);  // Let's discuss currency.
		System.out.println("d2 = " + d2);
		
		long l2 = 97;
		byte b2 = (byte)l2;
		System.out.println("b2 = " + b2);
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println ("casting out of bounds");
		int i3 = 32789;
		short s3 = (short)i3;    // max short 32767
		System.out.println ("s3 = " + s3);
		
		double d3 = 4.4028235E38;
		float f3 = (float)d3;    // max float 3.4028235E38
		System.out.println("f3 = " + f3);
		
		long l3 = 139;   
		byte b3 = (byte)l3;   // max byte 127
		System.out.println("b3 = " + b3);	
		
	}
	
	// problem 4, ten words
	public static void task3() {
		List<String> tenWords = new ArrayList<>();
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
				System.out.println ("both values must be be between 0 and 9");
			}
		} while ((num1 < 0 || num1 > 9) || (num2 < 0 || num2 > 9) || (num3 < 0 || num3 > 9));
		List<String> threeWords = new ArrayList<>();
		threeWords.add(tenWords.get(num1));
		threeWords.add(tenWords.get(num2));
		threeWords.add(tenWords.get(num3));
		System.out.println (threeWords);
	}

	
	// problem 8 word count  // enter 5 print out every other word
	public static void task4() {
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
