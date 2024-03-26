package com.weekly.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		int pick = 1;
		if (pick == 1) {
			primitives();
		}
		if (pick == 2) {
			casting();
		}
		if (pick == 3) {
			asciiChart();
		}
	}
	
	// note the printf format string
	private static void primitives() {
		System.out.println ("\t\t--- Primitive Variable sizes in bytes ---\n");
		System.out.format ("%s%8s%25s%26s", "Primitive Type",  "bytes", "Min Size", "Max Size\n");
		System.out.printf ("%-8s%14d%25d%25d%n", "byte", Byte.SIZE / 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf ("%-8s%14d%25s%25s%n", "char", Character.SIZE / 8, "n/a", "n/a");
		System.out.printf ("%-8s%14d%25d%25d%n", "short", Short.SIZE / 8, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf ("%-8s%14d%25d%25d%n", "int", Integer.SIZE / 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf ("%-8s%14d%25d%25d%n", "long", Long.SIZE / 8, Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.printf ("%-8s%14d%25g%25g%n", "float", Float.SIZE / 8, -Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf ("%-8s%14d%25g%25g%n", "double", Double.SIZE / 8, -Double.MIN_VALUE, Double.MAX_VALUE);
	}

	
	// mastery question #16, lets talk about casting
	public static void casting() {
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
			alphabet.add((char)i);
		}
		alphabet.remove(0);
		System.out.println (alphabet);
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println ("1. implicit casting  Larger = smaller");
		short s1 = 33;
		int i1 = s1;
		System.out.println ("2.  i1 = " + i1);
		
		float f1 = 3.141592653589793238f; 
		double d1 = f1;
		System.out.println ("3.  d1 = " + d1);
		
		byte b1 = 65;
		long l1 = b1;
		System.out.println ("4.  l1 = " + l1);

		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println ("expllicit casting smaller = larger with acceptable values (NARROWING)");
		int i2 = 51;
		short s2 = (short)i2;
		System.out.println ("5. s2 = " + s2);
		
		
		
		double d2 = 3.141592653589793238;  // notice the difference!   Precision and rounding
		float f2 = (float)d2;
		System.out.println("6.  f2 = " + f2);  // Let's discuss currency.
		System.out.println("7.  d2 = " + d2);
		
		long l2 = 97;
		byte b2 = (byte)l2;
		System.out.println("8.  b2 = " + b2);
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println ("casting out of bounds");
		int i3 = 32789;
		short s3 = (short)i3;    // max short 32767
		System.out.println ("9.  s3 = " + s3);
		
		double d3 = 4.4028235E38;
		float f3 = (float)d3;    // max float 3.4028235E38
		System.out.println("10.  f3 = " + f3);
		
		long l3 = 139;   
		byte b3 = (byte)l3;   // max byte 127
		System.out.println("11.  b3 = " + b3);	
		
		double d4 = 44.4444;
		int i4 = (int)d4;
		System.out.println ("12.  i4 = " + i4);
		
		
	}
	
	public static void asciiChart()
	{
		System.out.println ("ASCII Table");
		System.out.println ("Character Value");
		for (short ascii = 32; ascii <= 127; ascii++) {
			System.out.println ((char)ascii + "   --->  " + ascii);
		}
		
		System.out.println("adding characters");
		char a = '2';  // binary value of '2' is 50
		char b = '2';
		System.out.println("2 + 2 = " + (char)(a+b));	
		System.out.println("2 + 2 = " + (int)(a+b));		
	}
	


}
