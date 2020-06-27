package com.example.demo;

public class TinhTong {
	
	Hello hello;
	
	int ten = 1; 
	
	boolean a = false;
	
	char b = '1';
	
	byte c = -128;
	
	short d = 1;
	
	float e = 1.5F;
	
	String f = "Hiep";
	
	
	public void xxx() {
		//System.out.println("Hello");
	} 
	
	
	
	
	
	
	
	
	
	
	public static int tong;
	
	public static int tinhTongHaiSo (String a, String b) {
		
//		Neu a  hoac b la chu
//			thi bao loi
		
		 try
		    {
		        Integer.parseInt(a);
		    } catch (NumberFormatException ex)
		    {
		    	System.out.println("Nhap a khong phai so");
		    }
		
		 try
		    {
		        Integer.parseInt(b);
		    } catch (NumberFormatException ex)
		    {
		    	System.out.println("Nhap b khong phai so");
		    }
		 
		 Integer.parseInt(b);
		
		
//		Neu a va b deu la so
//			thi tinh tong
			tong = Integer.valueOf(a) + Integer.valueOf(b);
			
			
		
		return tong;
	}
	
	public static void main(String[] args) {
		System.out.println(tinhTongHaiSo("1", "2x"));
	}
	
}
