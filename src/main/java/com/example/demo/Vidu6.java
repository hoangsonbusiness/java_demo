package com.example.demo;

public class Vidu6 {
	public void inracn(String tay, String chan) {
		ConNguoi cn = new ConNguoi();
		cn.setChan(chan);
		cn.setTay(tay); 
		System.out.println(cn.getChan());
		System.out.println(cn.getTay());

	}

	// String la 1 object - doi tuong nen co the tao String nhu sau

	// Khi doi tuong duoc tao ra thi se xay ra :
	// Chiem 1 vung nho cua may tinh - dia chi luu tru cua bien do
	// va chiem 1 vung nho - gia tri

	// String thi co tinh chat la ko thay doi dc gia tri

	// StringBuffer va StringBuilder
	public static void main(String[] args) {
		Vidu6 vd6 = new Vidu6();
		vd6.inracn("26tay", "1chan");

	}

}