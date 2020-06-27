package com.example.demo;

public class Vidu8 {
	public static ConNguoi[] connguoi = new ConNguoi[2];
//	ConNguoi[0]=set

	public static void main(String[] args) {
		connguoi[0] = new ConNguoi();
		connguoi[0].setChan("2chan");
		connguoi[0].setTay("2tay");

		connguoi[1] = new ConNguoi();
		connguoi[1].setChan("2chan");
		connguoi[1].setTay("6tay");

		for (int i = 0; i < connguoi.length; i++) {
			System.out.println(connguoi[i].getTay());
			System.out.println(connguoi[i].getChan());
		}
		
		for (int i = 0; i < connguoi.length; i++) {
			connguoi[i].setTay("tay 1");
			connguoi[i].setChan("chan 2");
		}
		
		ConNguoi[][] a = new ConNguoi[2][2];
		
		a[0][0] = new ConNguoi();
		a[0][0].setTay("2 tay");
		a[0][0].setChan("2 chan");
		
	}
}
