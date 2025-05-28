package com.weekly.week4;

public class Box {

	public static void main(String[] args) {
		/**
		 * @see https://www.baeldung.com/java-suppresswarnings-valid-names
		 */
		@SuppressWarnings("removal")

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
			// x3 = x1.intValue(); // Old way
			
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
			 * double         Double
			 */
			// Autoboxing is wrapper class = primitive
			// unboxing is primitive = wrapper class
			System.out.println("autoboxing and unboxing");
			// Byte b1 = new Byte((byte) 64);
			Byte b1 = 64;             // autoboxing
			byte b2;
			//b2 = b1.byteValue();
			b2 = b1;                 // unboxing 
			System.out.println("5.  " + b2);
			
			Boolean boo1 = true;
			boolean boo2;
			// boo2 = boo1.booleanValue();
			boo2 = boo1;
			System.out.println ("6.  " + boo2);
			
			Character c1 = 'a';
			char c2;
			// c2 = c1.charValue();
			c2 = c1;
			System.out.println("7.  " + c2);
			
			Short s1 = 64;
			short s2;
			// s2 = s1.shortValue();
			s2 = s1;
			System.out.println ("8.  " + s2);
			
			Double d1 = 3.1415;
			double d2;
			// d2 = d1.doubleValue();
			d2 = d1;
			System.out.println ("9.  " + d2);
			
			// !!! CAVEAT !!!
			// for -128 - 127 a1.valueOf(127) == a2.valueOf(127)
			// -128 - 127 aere pooled
			Integer a1 = 127;
			Integer a2 = 127;
			System.out.println ("10. " + (a1 == a2));
			
			// Same as Integer = new Integer (128);
			Integer a3 = 128;
			Integer a4 = 128;
			System.out.println ("11. " + (a3 == a4));

	}

}
