package com.example.demo;

public class Vidu7 {
	// Mang - Array
	// Cach khai bao 1 mang
	// kieu[] ten = {}; 
	
	// Array index out of bounds - loi vuot qua do dai cua mang
	
	int [] a = {1,2,3,4,5,6};

	int b = 1;
	
	
	public void inRaC(String[] c) {
		for ( int i = 0; i< c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	public static void main(String... args) {
//		String[] c = {"a", "b", "c"};

		String[] c = new String[5];
		c[0] = "1";
		c[1] = "2";
		
		//Cach 1 
		int [] a = {1,2,3,4,5,6};
		int b[] = {1,2,3,4,5,6};
		
		//Cach 2
		int[] d = new int[5];
		d[0] = 1;
		
		//Kieu[] ten = new Kieu[soluong];
		//ten[0] = 1;
		//ten[1] = 2;
 		
		
//		c = null;
//		c.length; // -> null pointer exception
		Vidu7 vidu7 = new Vidu7();
		vidu7.inRaC(c);
	}

}