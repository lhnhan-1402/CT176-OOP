package De02;

import java.util.Scanner;

public class ChuyenXe {
	private int msc;
	private String tenlx, nden;
	private double dthu;
	private Xe x;
	public ChuyenXe() {
		msc = 0;
		tenlx = new String();
		nden = new String();
		dthu = 0.0;
		x = new Xe();
	}
	public ChuyenXe(ChuyenXe cx) {
		msc = cx.msc;
		tenlx = new String(cx.tenlx);
		nden = new String(cx.nden);
		dthu = cx.dthu;
		x = new Xe(cx.x);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so chuyen xe: ");
		msc = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten nguoi lai xe: ");
		tenlx = sc.nextLine();
		System.out.println("Nhap noi den: ");
		nden = sc.nextLine();
		System.out.println("Nhap doanh thu: ");
		dthu = sc.nextDouble();
		x.nhap();
	}
	public void in() {
		System.out.println("Ma so chuyen xe: " + msc + " - Ten nguoi lai xe: " + tenlx + " - Noi den: " + nden + " - Doanh thu: " + dthu);
		x.in();
	}
	public boolean xeCoTheLuuHanh() {
		return x.getTrangThai() == 'C';
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong chuyen xe: ");
		int n = sc.nextInt();
		ChuyenXe ds[] = new ChuyenXe[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin chuyen xe thu " + (i + 1) + ":");
			ds[i] = new ChuyenXe();
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin chuyen xe thu " + (i + 1) + "la: ");
			ds[i].in();
		}
		System.out.println("Danh sach chuyen xe bi huy: ");
		for(int i = 0; i < n; i++) {
			if(!ds[i].xeCoTheLuuHanh() || ds[i].dthu < 100000.0) {
				ds[i].in();
			}
		}
	}
}
