package com.example.demo;

class Vidu2 {

	public static int a = 1;
	public int b = 1;

	// Overload la truong hop 1 doi tuong - object - class co tu 2
	// hoac nhieu hon cac phuong thuc co cung ten nhung
	// + khac nhau ve so luong tham so cua phuong thuc
	// + hoac khac nhau ve kieu du lieu cua cac tham so

	// Ung dung cua static
	// + doi voi bien static : - tiet kiem bo nho
	// vi du ve tiet kiem bo nho : Gia su tao 3 doi tuong Vidu2
	// Trong do a la bien static . b khong phai la bien static
	// Thi may tinh chi ton bo nho de luu bien static a 1 lan duy nhat
	// Nhung doi voi bien b thi may tinh phai ton bo nho 3 lan de luu gia tri vi
	// co 3 doi tuong Vidu2 duoc tao ra
	// Vidu2 1 = new Vidu2(); a, b
	// Vidu2 2 = new Vidu2(); b
	// Vidu2 3 = new Vidu2(); b
	// Bien static thuong chi dung cho cac bien khong co su thay doi
	// Vi du : class SinhVienBachKhoa co bien static la :
	// public final String truong = "Dai hoc Bach Khoa";
	// Tac hai khi dung bien static : - Vi du nhu o truong hop tren , chung ta
	// tao ra 3 doi tuong Vidu2 nhung neu co 1 doi tuong thay doi gia tri cua
	// bien static a thi su thay doi gia tri cua bien static a do co the se
	// anh huong den 2 doi tuong con lai

	// + doi voi phuong thuc static : - co the goi phuong thuc static ma khong
	// can phai khoi tao doi tuong. Vi du :
	// cach binh thuong : LopDoiTuong tenDoiTuong = new LopDoiTuong();
	// tenDoiTuong.tenPhuongThuc();
	// nhung doi voi phuong thuc static. Ta co the goi phuong thuc ma khong can
	// phai khoi tao doi tuong nhu ben duoi:
	// LopDoiTuong.tenPhuongThuc();

	public void Tong(int a) {
		System.out.println(a);
	}

	public void Tong(int a, int b) {
	}

	public static void Tong(int a, String b) {
	}

	public static void main(String[] args) {
		Vidu2 a1 = new Vidu2();
		Vidu2 a2 = new Vidu2();
		Vidu2 a3 = new Vidu2();

		Vidu2 a = new Vidu2();
		a.Tong(1, "b");

		Vidu2.Tong(1, "b");

	}

}