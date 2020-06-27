package com.example.demo;

public class Vidu9 {
	public static String[] a = { "x", "y", "z" };
	
	public void inY(String[] a) {

		System.out.println(a[1]);
	}

	public static void main(String[] args) {
		Vidu9 Vd8 = new Vidu9();
		Vd8.inY(a);
		
		ConNguoi[] connguoi = new ConNguoi[2];
		connguoi[0] = new ConNguoi();
		connguoi[0].setTay("con nguoi 1 co 2 tay");
		connguoi[0].setChan("con nguoi 1 co 2 chan");
		
		connguoi[1] = new ConNguoi();
		connguoi[1].setTay("con nguoi 2 co 4 tay");
		connguoi[1].setChan("con nguoi 2 co 4 chan");
		
		for (int i = 0; i < connguoi.length ; i++) {
			System.out.println(connguoi[i].getTay());
			System.out.println(connguoi[i].getChan());
		}
	}

}
