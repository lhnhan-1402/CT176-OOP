package buoi42425;

import java.util.Scanner;

import buoi22425.Diem;

public class DiemMau extends Diem{
	private String mau;
	public DiemMau() {
		super();
		mau = new String();
	}
	public DiemMau(int x1, int y1, String m) {
		super(x1, y1);
		mau = new String(m);
	}
	public DiemMau(DiemMau dmau) {
		super((DiemMau)dmau);
		mau = new String(dmau.mau);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapDiem();
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
	}
	public void in() {
		super.hienThi();
		System.out.print(" voi mau" + mau);
	}
	public String toString() {
		return super.toString() + " voi mau: " + mau;
	}
	public void ganMau(String maumoi) {
		mau = new String(maumoi);
	}
}
