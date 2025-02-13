package buoi22425;

import java.util.Scanner;

import Buoi2.PhanSo;

public class PhanSo {
	private int tu, mau;
	public PhanSo() {
		tu = 0;
		mau = 1;
	}
	public PhanSo(int tuso, int mauso) {
		tu = tuso;
		mau = mauso;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu so: ");
		tu = sc.nextInt();
		do {
			System.out.println("Nhap mau so: ");
			mau = sc.nextInt();
			if(mau == 0) {
				System.out.println("Mau bang 0, vui long nhap lai");
			}
		} while(mau == 0)
	}
	public void hienThi() {
		if(tu == 0) {
			System.out.println("0");
		}
		else if(mau == 1) {
			System.out.println(tu);
		}
		else {
			System.out.println(tu + "/" + mau);
		}
	}
	public void nghichDao() {
		if(tu == 0) {
			System.out.println("Khong the nghich dao");
		}
		else {
			int tmp = tu;
			tu = mau;
			mau = tmp;
		}
	}
	public PhanSo giaTriNghichDao() {
		if(tu == 0) {
			return new PhanSo(tu, mau);
		}
		else {
			return new PhanSo(mau, tu);
		}
	}
	public double giaTriThuc() {
		return tu / mau;
	}
	public PhanSo cong(PhanSo a) {
		int t = tu * a.mau + mau * a.tu;
		int m = mau * a.mau;
		return new PhanSo(tu, mau);
	}
	public PhanSo tru(PhanSo a) {
		int t = tu * a.mau - mau * a.tu;
		int m = mau * a.mau;
		return new PhanSo(tu, mau);
	}
	public PhanSo nhan(PhanSo a) {
	    return new PhanSo(tu * a.tu, mau * a.mau);
	}

	public PhanSo chia(PhanSo a) {
	    return new PhanSo(tu * a.mau, mau * a.tu);
	}
	public PhanSo cong(int n) {
		return new PhanSo(tu + n * mau, mau);
	}
	public int gcd(int a, int b) {
		while(b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	public void rutGon() {
		int gcd = gcd(Math.abs(tu), Math.abs(mau));
		tu /= gcd;
		mau /= gcd;
		if(mau < 0) {
			tu-= tu;
			mau -= mau;
		}
	}
}
