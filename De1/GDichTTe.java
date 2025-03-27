package De1;

import java.util.Scanner;

public class GDichTTe extends GDich {
	private double dgia;
	private int sluong;
	private char loai;
	private double tgia;
	public GDichTTe() {
		super();
		dgia = 0.0;
		sluong = 0;
		loai = 'a';
		tgia = 0.0;
	}
	public GDichTTe(GDichTTe gdtt) {
		super(gdtt);
		dgia = gdtt.dgia;
		sluong = gdtt.sluong;
		loai = gdtt.loai;
		tgia = gdtt.tgia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap don gia: ");
		dgia = sc.nextDouble();
		System.out.println("Nhap so luong: ");
		sluong = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap loai tien te:");
		loai = sc.nextLine().charAt(0);
		System.out.println("Nhap ti gia: ");
		tgia = sc.nextDouble();
	}
	public void in() {
		super.in();
		System.out.println(" - Don gia: " + dgia + " - So luong: " + sluong + " - Loai tien te: " + loai + " - Ti gia: " + tgia);
	}
	public double tinhTien() {
		return sluong * dgia * tgia;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong giao dich");
		int n = sc.nextInt();
		GDich ds[] = new GDich[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap loai giao dich (1-gdthuong / 2-gdtiente)");
			int gt = sc.nextInt();
			if(gt == 1) ds[i] = new GDich();
			else ds[i] = new GDichTTe();
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			if (ds[i] instanceof GDichTTe) {
				GDichTTe gdtt = (GDichTTe) ds[i];
				if(gdtt.tinhTien() > 100000) {
					gdtt.in();
				}
			}
		}
	}
}
