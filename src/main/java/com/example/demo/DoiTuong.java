package com.example.demo;

class DoiTuong {
	public int a = 1;
	public String tay = "2 tay";
	public String chan = "2 chan";

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getTay() {
		return tay;
	}

	public void setTay(String tay) {
		this.tay = tay;
	}

	public String getChan() {
		return chan;
	}

	public void setChan(String chan) {
		this.chan = chan;
	}

	public void xinChao() {
		System.out.println("Xin chao cac ban");
		this.chan = "2 chan";
	}

}