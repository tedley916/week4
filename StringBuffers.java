package com.weekly.week4;

public class StringBuffers {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		if (!isCommandLineValid(args)) {
			return;
		}
	
		// append, charAt, delete deleteCharAt, indexOf, replace, reverse
	
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
		default:
			System.out.print("Invalid command line argument.  Valid arguments are example1, example2, example3, example4");
		}
	}
	
	public static void example1() {
		StringBuilder sb = new StringBuilder();
		sb.append("My Name is Fred and my wife is Wilma.");
		System.out.println ("1. " + sb);
		System.out.println ("2. length is : " + sb.length());
		System.out.println ("3. capacity is : " + sb.capacity() );
		sb.insert(16, "Flintstone ");
		System.out.println ("4. " + sb);
		sb.replace(11,15, "Fredrick xJosef");  // start, end-1
		System.out.println ("5. " + sb);
		
		// no more array ma nipulations to reverse strings.  
		String backwards = sb.reverse().toString();
		System.out.println ("6. " + backwards);
		
		// put it back
		sb.reverse();

		int index = sb.indexOf("Fredrick");
		
		String firstName = sb.substring(index, index + "Fredrick".length());
		System.out.println ("7. " + firstName + ", index = " + index);
		
		index = sb.indexOf("xJosef");
		sb.deleteCharAt(index);
		System.out.println ("8. " + sb);
		
		firstName = sb.substring(index, index + "Joseph".length());
		sb.replace(index, index+"Joseph".length(), "Joseph ");
		System.out.println ("9. " + sb);
	}

	/*
	 * StringBuilder equality
	 */
	public static void example2() {
		StringBuilder car1 = new StringBuilder("Dodge Hellcat");
		StringBuilder car2 = new StringBuilder("Dodge Hellcat");
		
		System.out.format("1. %s\n", car1 == car2);
		System.out.format ("2. %s\n", car1.equals(car2));  // Huh?!?, WHy???  -- Does not overrice Object.equals()
		
		System.out.format ("3. %d\n", car1.compareTo(car2));
		System.out.format ("4. %s\n", car1.toString().equals(car2.toString()));
	}
	
	public static void example3() {
		
		// immutable
		String cars = "Mustang";
		System.out.println (cars.concat(" GT"));
		cars.concat(", goes very fast!!!");
		System.out.println(cars);
		
		// mutable
		StringBuffer dogs = new StringBuffer("German Shepherds");
		dogs.append(" and Rottweilers");
		dogs.reverse();
		dogs.append(" require much exercise.");
		System.out.println(dogs);		
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
	
}  // END class
