package com.example.demo;

public class Bai1 {

	// Khai bao 1 chuoi coa gia tri la "Chao cac ban"

	public String Chao = "Chao cac ban";
	

	// Viet 1 phuong thuc khong co tra ve. In ra chu chuoi khai bao o tren
	// System.out.println();
	

	
	public void in() {
		System.out.println("hom nay troi khong mua");
	}


//1 file java la 1 Object - doi tuong - class - lop
//1 doi tuong thi se co thuoc tinh - property va cac phuong thuc - method
//Vi du : Object ConNguoi .
//		Con Nguoi co property : tay, chan, mat, mui, mieng ...
//		COn nguoi co method : an , ngu , hoc, choi, di lam ...

	public static void main(String[] args) {
		Bai1 A = new Bai1();
			A.in();	
	}
	
	// Cach tao 1 doi tuong
	// Kieu doi tuong + ten duoi tuong = new + Kieu doi tuong + () + ;

	// Cach goi 1 phuong thuc - hanh dong - method
	// doituong + . + phuongthuc + () + ;

}
