package De02;

import java.util.Scanner;

public class Xe {
	private String soxe, loai, ngay;
	private char tthai;
	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai = 'C';
	}
	public Xe(Xe x) {
		soxe = new String(x.soxe);
		loai = new String(x.loai);
		ngay = new String(x.ngay);
		tthai = x.tthai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so xe: ");
		soxe = sc.nextLine();
		System.out.println("Nhap loai xe: ");
		loai = sc.nextLine();
		System.out.println("Nhap ngay dang kiem (dd/mm/yyyy):");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai (C - duoc phep / K - Khong duoc phep):");
		tthai = sc.nextLine().charAt(0);
	}
	public void in() {
		System.out.println("So xe: " + soxe + " - Loai xe: " + loai + " - Ngay dang kiem: " + ngay + " - Trang thai: " + tthai);
	}
	public char getTrangThai() {
		return tthai;
	}
	public static void main(String[] args) {
		Xe x1 = new Xe();
		x1.nhap();
		System.out.println("Thong tin cua xe x1 la: ");
		x1.in();
		Xe x2 = new Xe(x1);
		System.out.println("Thong tin cua xe x2 sao chep tu x1 la: ");
		x2.in();
	}
}
