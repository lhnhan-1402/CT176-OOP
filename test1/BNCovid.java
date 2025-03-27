package test1;

import java.util.Scanner;

public class BNCovid extends BNhan {
	private String ngay;
	private char loai;
	private String odich, noi;
	public BNCovid() {
		super();
		ngay = new String();
		loai = 'a';
		odich = new String();
		noi = new String();
	}
	public BNCovid(BNCovid bnc) {
		super(bnc);
		ngay = new String(bnc.ngay);
		loai = bnc.loai;
		odich = new String(bnc.odich);
		noi = new String(bnc.noi);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap ngay thang nam cach ly:");
		ngay = sc.nextLine();
		System.out.println("Nhap loai nguoi nhiem (0 - F0 / 1 - F1 / 2 - F2):");
		loai = sc.nextLine().charAt(0);
		System.out.println("Nhap o dich: ");
		odich = sc.nextLine();
		System.out.println("Nhap noi cach ly: ");
		noi = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.print(" - Ngay cach ly: " + ngay + " - Loai nhiem: "); 
		if(loai == '0') {
			System.out.print("F0");
		}
		else if(loai == '1') {
			System.out.print("F1");
		}
		else System.out.print("F2");
		System.out.println(" - O dich: " + odich + " - Noi cach ly: " + noi);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong benh nhan: ");
		int n = sc.nextInt();
		BNhan bn[] = new BNhan[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap benh nhan thuong hoac benh nhan Covid-19 (0 - Benh nhan thuong / 1 - Benh nhan Covid-19):");
			int index = sc.nextInt();
			if(index == 0) {
				bn[i] = new BNhan();
			}
			else if(index == 1) {
				bn[i] = new BNCovid();
			}
			bn[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin benh nhan thu " + (i + 1) + " la:");
			bn[i].in();
		}
		System.out.println("Ho ten benh nhan covid-19 F1 tai o dich " + "Cong ty Hosiden" + " la:");
		for(int i = 0; i < n; i++) {
			if (bn[i] instanceof BNCovid) {
				BNCovid ds = (BNCovid) bn[i];
				if(ds.loai == '1' &&  ds.odich.equals("cong ty hosiden")) {
					System.out.println("Benh nhan: " + ds.layHoTen() + " - O dich: " + ds.odich);
				}
			}
		}
	}
}
