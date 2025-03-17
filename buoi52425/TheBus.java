package buoi5;

import java.util.Scanner;

public class TheBus {
	private String maThe, nph;
	private char loai;
	private KHang k;
	public TheBus() {
		maThe = new String();
		nph = new String();
		loai = 'a';
		k = new KHang();
	}
	public TheBus(TheBus tb) {
		maThe = new String(tb.maThe);
		nph = new String(tb.nph);
		loai = tb.loai;
		k = new KHang(tb.k);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin khach hang: ");
		k.nhapKH();
		System.out.println("Nhap ma the: ");
		maThe = sc.nextLine();
		System.out.println("Nhap ngay phat hanh (dd/mm/yy):");
		nph = sc.nextLine();
		System.out.println("Nhap loai the (H, D, M, Y)");
		loai = sc.nextLine().charAt(0);
	}
	public void in() {
		k.inKH();
		System.out.println("Ma the: " + maThe + " | Ngay phat hanh: " + nph + " | Loai the: " + loai);
	}
	public String toString() {
		return k.toString() + (" Ma the: " + maThe + " | Ngay phat hanh: " + nph + " | Loai the: " + loai);
	}
	public char layLoai() {
		return loai;
	}
	public String layNPH() {
		return nph;
	}
}
