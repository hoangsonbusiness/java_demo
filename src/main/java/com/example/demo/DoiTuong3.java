package com.example.demo;

class DoiTuong3 {
	public String tieuDe;
	public String noiDung;
	
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	
	public static void main(String[] args) {
		Vidu5 vd5 = new Vidu5();
		vd5.InRa("3 tay", "4 chan");
	}
}