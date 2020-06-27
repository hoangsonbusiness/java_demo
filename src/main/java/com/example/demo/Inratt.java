package com.example.demo;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class Inratt {
	public Truyentranh[] Truyentranh = new Truyentranh[3];

	public void inrat() {
		Truyentranh[0] = new Truyentranh();
		Truyentranh[0].setChap("700");
		Truyentranh[0].setTen("naruto");
		Truyentranh[1] = new Truyentranh();
		Truyentranh[1].setChap("800");
		Truyentranh[1].setTen("onepice");
		Truyentranh[2] = new Truyentranh();
		Truyentranh[2].setChap("900");
		Truyentranh[2].setTen("HKGH");
		for (int i = 0; i < Truyentranh.length; i++) {
			System.out.println(Truyentranh[i].getChap());
			System.out.println(Truyentranh[i].getTen());
			
		}
		
		
	}
	public static void main(String[] args){
		Inratt inratt = new Inratt();
		inratt.inrat();
		
	}
}
