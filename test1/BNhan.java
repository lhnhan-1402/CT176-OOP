package test1;

import java.util.Scanner;

public class BNhan {
	private String hten;
	private boolean gtinh;
	private int nsinh;
	private double cnang;
	public BNhan() {
		hten = new String();
		gtinh = true;
		nsinh = 0;
		cnang = 0.0;
	}
	public BNhan(BNhan bn) {
		hten = new String(bn.hten);
		gtinh = bn.gtinh;
		nsinh = bn.nsinh;
		cnang = bn.cnang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten benh nhan:");
		hten = sc.nextLine();
		System.out.println("Nhap gioi tinh (true - nam / false - nu):");
		gtinh = sc.nextBoolean();
		System.out.println("Nhap nam sinh: ");
		nsinh = sc.nextInt();
		System.out.println("Nhap can nang (kg):");
		cnang = sc.nextDouble();
	}
	public void in() {
		System.out.print("Ho ten benh nhan: " + hten + " - Gioi tinh: ");
		if(gtinh == true) {
			System.out.print("Nam");
		}
		else System.out.print("Nu");
		System.out.print(" - Nam sinh: " + nsinh + " - Can nang: " + cnang);
	}
	public String layHoTen() {
		return hten;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BNhan bn1 = new BNhan();
		bn1.nhap();
		System.out.println("Thong tin cua benh nhan 1 la: ");
		bn1.in();
		BNhan bn2 = new BNhan(bn1);
		System.out.println("Thong tin cua benh nhan 2 sao chep tu benh nhan 1 la: ");
		bn2.in();
	}
}
