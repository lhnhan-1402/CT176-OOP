package test4;

import java.util.Scanner;

public class HHoa {
	private int mhh;
	private String ten;
	private double dgia;
	private int slg;
	public HHoa() {
		mhh = 0;
		ten = new String();
		dgia = 0.0;
		slg = 0;
	}
	public HHoa(int m, String t, double dg, int s) {
		mhh = m;
		ten = t;
		dgia = dg;
		slg = s;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so hang hoa: ");
		mhh = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten hang hoa: ");
		ten = sc.nextLine();
		System.out.println("Nhap don gia: ");
		dgia = sc.nextDouble();
		System.out.println("Nhap so luong hang: ");
		slg = sc.nextInt();
	}
	public void in() {
		System.out.print("Ma so hang hoa: " + mhh + " - Ten hang hoa: " + ten + " - Don gia: " + dgia + " - So luong: " + slg);
	}
	public double layDonGia() {
		return dgia;
	}
	public String layTen() {
		return ten;
	}
	public static void main(String[] args) {
		HHoa hh1 = new HHoa();
		hh1.nhap();
		System.out.println("Thong tin hang hoa 1 la: ");
		hh1.in();
		HHoa hh2 = new HHoa(hh1.mhh, hh1.ten, hh1.dgia, hh1.slg);
		System.out.println("Thong tin hang hoa hh2 la: ");
		hh2.in();
	}
}
