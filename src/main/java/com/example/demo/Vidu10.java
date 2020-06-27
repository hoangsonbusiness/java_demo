package com.example.demo;

public class Vidu10 {

	public void inra(ConNguoi[] a) {
		a[0] = new ConNguoi();
		a[0].setChan("2chan");
		a[0].setTay("2tay");
		a[1] = new ConNguoi();
		a[1].setChan("4chan");
		a[1].setTay("tay");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].getTay());
			System.out.println(a[i].getChan());

		}

	}
	
	public static void main(String[] args) {
		Vidu10 Vd10 = new Vidu10();
		ConNguoi[] b = new ConNguoi[2];
		Vd10.inra(b);
	}
}