package com.example.demo;

public class Vidu5 {
	public int a;

	public void InRa(String tay, String chan) {
		Con_nguoi con_nguoi = new Con_nguoi();

		// Gan gia tri cho thuoc tinh chan
		con_nguoi.setChan(chan);
		con_nguoi.setTay(tay);

		// Lay gia tri hien tai cua thuoc tinh chan
		System.out.println(con_nguoi.getChan());
		System.out.println(con_nguoi.getTay());
	}

	public static void main(String[] args) {
		// Tao doi tuong
		Vidu5 vd5 = new Vidu5();
		// Goi phuong thuc
		vd5.InRa("2 tay", "4 chan");
		vd5.InRa("3 tay", "5 chan");
	}

}
