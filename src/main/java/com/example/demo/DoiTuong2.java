package com.example.demo;

class DoiTuong2 {
	public void hello() {
		DoiTuong doituong = new DoiTuong();
		doituong.xinChao();
		System.out.println(doituong.chan);
		System.out.println(doituong.getChan()); // Getter : lay gia tri cua thuoc tinh
		
		doituong.chan = "3 chan";
		//Setter : gan gia tri cho bien
		doituong.setChan("4 chan");
		System.out.println(doituong.getChan()); 
	}
	
	public void inBaiViet (String tieuDe, String noiDung) {
		DoiTuong3 doituong3 = new DoiTuong3();
		doituong3.setTieuDe(tieuDe);
		doituong3.setNoiDung(noiDung);
		System.out.println("Tieu de: " + doituong3.getTieuDe() + " - Noi dung : "+ doituong3.getNoiDung());
		
	}
	
	public static void main(String[] args) {
		DoiTuong2 doituong2 = new DoiTuong2();
		doituong2.hello();	
		doituong2.inBaiViet("hello Hiep", "Xin chao ban Hiep");
		doituong2.inBaiViet("hello Son", "Xin chao ban SOn");
		
		
	}
}