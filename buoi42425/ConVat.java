package buoi42425;

import java.util.Scanner;

public abstract class ConVat {
	private String giong, mau;
	private float cannang;
	public abstract void keu();
	public ConVat() {
		giong = new String();
		mau = new String();
		cannang = 0;
	}
	public ConVat(String g, String m, float cn) {
		giong = new String(g);
		mau = new String(m);
		cannang = cn;
	}
	public ConVat(ConVat c) {
		giong = new String(c.giong);
		mau = new String(c.mau);
		cannang = c.cannang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong: ");
		giong = sc.nextLine();
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
		System.out.println("Nhap can nang: ");
		cannang = sc.nextFloat();
	}
	public void in() {
		System.out.println("[" + giong + ", " + mau + ", " + cannang + "]");
	}
}
