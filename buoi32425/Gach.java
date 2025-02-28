package buoi32425;

import java.util.Scanner;

public class Gach {
	private String maso, mau;
	private int soluong, chieudai, chieungang;
	private long giaban;
	public Gach(){
		maso = new String();
		mau = new String();
		soluong = chieudai = chieungang = 0;
		giaban = 0;
	}
	public Gach(String ms, String m, int sl, int cd, int cn, long gb) {
		maso = new String(ms);
		mau = new String(m);
		soluong = sl;
		chieudai = cd;
		chieungang = cn;
		giaban = gb;
	}
	public Gach(Gach g) {
		maso = new String(g.maso);
		mau = new String(g.mau);
		soluong = g.soluong;
		chieudai = g.chieudai;
		chieungang = g.chieungang;
		giaban = g.giaban;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so:");
		maso = sc.nextLine();
		System.out.println("Nhap mau:");
		mau = sc.nextLine();
		System.out.println("Nhap so luong: ");
		soluong = sc.nextInt();
		System.out.println("Nhap chieu dai: ");
		chieudai = sc.nextInt();
		System.out.println("Nhap chieu ngang: ");
		chieungang = sc.nextInt();
		System.out.println("Nhap gia ban: ");
		giaban = sc.nextLong();
	}
	public void hienThi() {
		System.out.print("Ma so: " + maso + "\n");
		System.out.print("Mau: " + mau + "\n");
		System.out.print("So luong: " + soluong + "\n");
		System.out.print("Chieu dai: " + chieudai + "\n");
		System.out.print("Chieu ngang: " + chieungang + "\n");
		System.out.print("Gia ban: " + giaban + "\n");
	}
	public float giaBanLe() {
		return (float) (giaban / soluong * 1.2);
	}
	public int dienTich() {
		return  chieudai * chieungang * soluong;
	}
	public int soLuongHop(int D, int N) {
		double svd = Math.ceil((double)D / chieudai);
		double svn = Math.ceil((double)N / chieungang);
		return (int)Math.ceil((svd * svn) / soluong);
	}
	public long getGiaBan() {
		return giaban;
	}
	public long giaBan() {
		return giaban / dienTich();
	}
	public long chiPhiLot(int D, int N) {
		return soLuongHop(D, N) * giaban;
	}
}
