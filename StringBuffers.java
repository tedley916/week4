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
		sb.replace(11,15, "Fredrick xJosef");  // start, end+1
		System.out.println ("5. " + sb);
		
		// no more array ma nipulations to reverse strings.  
		String backwards = sb.reverse().toString();
		System.out.println ("6. " + backwards);
		
		// put it back
		sb.reverse();

		// get the starting index of Fredrick
		int index = sb.indexOf("Fredrick");
		
		String firstName = sb.substring(index, index + "Fredrick".length());
		System.out.println ("7. " + firstName + ", index = " + index);
		
		// remove the x from xJosef
		index = sb.indexOf("xJosef");
		sb.deleteCharAt(index);
		System.out.println ("8. " + sb);
		
		// change Josef to Joseph
		firstName = sb.substring(index, index + "Joseph".length());
		sb.replace(index, index+"Joseph".length(), "Joseph ");
		System.out.println ("9. " + sb);
	}

	/*
	 * StringBuilder equality
	 */
	public static void example2() {
		System.out.println("String");
		String car5 = new String("Dodge Hellcat");
		String car6 = new String("Dodge Hellcat");
		
		System.out.format("1. %s\n", car5 == car6);
		System.out.format ("2. %s\n", car5.equals(car6));  
		
		System.out.format ("3. %d\n", car5.compareTo(car6));
		System.out.format ("4. %s\n", car5.equals(car6.toString()));		
		
		
		System.out.println("\nStringBuilder");
		StringBuilder car1 = new StringBuilder("Dodge Hellcat");
		StringBuilder car2 = new StringBuilder("Dodge Hellcat");
		
		System.out.format("1. %s\n", car1 == car2);
		System.out.format ("2. %s\n", car1.equals(car2));  // Huh?!?, WHy???  -- Does not overrice Object.equals()
		
		System.out.format ("3. %d\n", car1.compareTo(car2));
		System.out.format ("4. %s\n", car1.toString().equals(car2.toString()));
		
		
		System.out.println("\nStringBuffer");
		StringBuffer car3 = new StringBuffer("Dodge Hellcat");
		StringBuffer car4 = new StringBuffer("Dodge Hellcat");
		
		System.out.format("1. %s\n", car3 == car4);
		System.out.format ("2. %s\n", car3.equals(car4));  // Huh?!?, WHy???  -- Does not overrice Object.equals()
		
		System.out.format ("3. %d\n", car3.compareTo(car4));
		System.out.format ("4. %s\n", car3.toString().equals(car4.toString()));
	
		
		System.out.println("\ncompareTo() DON\'T TRY TO FIGURE IT OUT!!!");
		System.out.println ("compare '1' to 3' = " + "0".compareTo("3"));
		System.out.println ("compare '1' to 3' = " + "1".compareTo("3"));
		System.out.println ("compare '2' to 3' = " + "2".compareTo("3"));
		System.out.println ("compare '3' to 3' = " + "3".compareTo("3"));
		System.out.println ("compare '4' to 3' = " + "4".compareTo("3"));
		System.out.println ("compare '5' to 3' = " + "5".compareTo("3"));
		System.out.println ("compare '5' to 3' = " + "6".compareTo("3"));
		System.out.println ("compare 'Dodge Hellcat' to 'Ford Mustang' = " + "Dodge hellcat".compareTo("Ford Mustang"));
		System.out.println ("compare 'Dodge Hellcat' to 'Ford-150' = " + "Dodge hellcat".compareTo("Ford F-150"));

		System.out.println(
		 """
		 Just know that..
		 a.compareTo(b) where a < b,  the result will be < 0
		 a.compareTo(b) where a > b,  the result will be > 0
		 a.compareTo(b) where a == b, the result will be = 0;
		 """);

	}
	
	public static void example3() {
		
		// immutable
		String cars = "Mustang";
		cars.concat("GT");          // immutable
		System.out.println(cars);
		cars = cars.concat(" GT");  // reassigned what the string points to
		System.out.println(cars);
		
		System.out.println ();
		
		// mutable
		StringBuilder dogs = new StringBuilder("German Shepherds");
		dogs.append(" and Rottweilers");
		dogs.append(" require much exercise.");
		dogs.reverse();
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
