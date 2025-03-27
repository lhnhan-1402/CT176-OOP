package De01;

import java.util.Scanner;

public class CNguoi {
	private String id, hten, ngay;
	private char phai;
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 'M';
	}
	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hten = new String(cn.hten);
		ngay = new String(cn.ngay);
		phai = cn.phai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id: ");
		id = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh (dd/mm/yyyy):");
		ngay = sc.nextLine();
		System.out.println("Nhap phai (M-nam / F-nu):");
		phai = sc.nextLine().charAt(0);
	}
	public void in() {
		System.out.println("ID: " + id + " - Ho va ten: " + hten + " - Ngay thang nam sinh: " + ngay + " - Phai: " + phai);
	}
	public int tinhTuoi() {
		int namSinh = Integer.parseInt(ngay.split("/")[2]);
		return 2025 - namSinh;
	}
	public String layHoTen() {
		return hten;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CNguoi c1 = new CNguoi();
		c1.nhap();
		System.out.println("Thong tin cua c1 la: ");
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		System.out.println("Thong tin cua c2 sao chep tu c1 la: ");
		c2.in();
	}
}
