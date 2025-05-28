package com.weekly.week4;

public class TestMe {

// test 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare with new
		Integer oldWay = new Integer(45);
		System.out.println (oldWay);

		// AutoBoxing
		Integer newWay = 45;
		System.out.println(newWay);
		
		// retrieve primitive with wrapper method
		int int1 = newWay.intValue();
		System.out.println(newWay);
		
		// unboxing
		int int2 = int1;
		System.out.println(int1);
		
		
		// for -128 - 127 a1.valueOf(127) = a2.valueOf(127)
		// -128 - 127 aere pooled
		Integer a1 = 127;
		Integer a2 = 127;
		System.out.println (a1 == a2);
		
		// Same as Integer = new Integer (128);
		Integer a3 = 128;
		Integer a4 = 128;
		System.out.println (a3 == a4);

		
	}

}
