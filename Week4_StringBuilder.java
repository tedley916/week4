package com.weekly.week4;


public class Week4_StringBuilder {

	public static void main (String[] args) {
		if (!isCommandLineValid(args)) {
			return;
		}
	
		// append, charAt, delete deleteCharAt, indexOf, replace, reverse
	
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
	
	public static void task1() {
		StringBuilder sb = new StringBuilder();
		sb.append("My Name is Fred and my wife is Wilma.");
		System.out.println ("1. " + sb);
		System.out.println ("2. length is : " + sb.length());
		System.out.println ("3. capacity is : " + sb.capacity() );
		sb.insert(16, "Flintstone ");
		System.out.println ("4. " + sb);
		sb.replace(11,15, "Fredrick xJosef");
		System.out.println ("5. " + sb);
		
		// no more array ma nipulations to reverse strings.  
		String backwards = sb.reverse().toString();
		System.out.println ("6. " + backwards);
		
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
	
	public static void task2() {
			
	}
	
	public static void task3() {
		
	}
	
	public static void task4() {
		
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
