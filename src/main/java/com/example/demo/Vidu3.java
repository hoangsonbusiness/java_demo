package com.example.demo;

class Vidu3 extends Vidu2 implements GiaoDien2 {
	public final int a = 2;

	public static void Tong(int a, String b) {
		System.out.println(a + b);
		
	}

	public final static void main(String[] args) {
		Vidu3 Vidu3A = new Vidu3();
		String c = "d";
		Vidu3A.TinhTong(1, 2, "d");
		 Vidu3.A();
		 
		 
	}

	@Override
	public void TinhTong(int a, int b) {
		System.out.println(a + b);
		super.Tong(1);
	
	}

    public static void A() {
    	System.out.println("day-la-pt-static");

	
        }
	public void TinhTong(int a, int b, String c) {
		System.out.println("day_la_Pt_overload");
	}

	// Override : Nếu lớp con có cùng phương thức như đã được khai báo
	// trong lớp cha, thì đó gọi là Ghi đè phương thức trong Java

	// Vi du : Class Vidu2 co phuong thuc TinhTong(int a)
	// Class Vidu3 ke thua class Vidu2 va cung co phuong thuc TinhTong(int a)

}