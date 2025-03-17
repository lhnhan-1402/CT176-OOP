package buoi5;

import java.util.Scanner;

public class KHang {
	private String ten;
	private boolean gtinh;
	private int nsinh;
	public KHang() {
		ten = new String();
		gtinh = true;
		nsinh = 0;
	}
	public KHang(KHang kh) {
		ten = new String(kh.ten);
		gtinh = kh.gtinh;
		nsinh = kh.nsinh;
	}
	public void nhapKH() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten khach hang: ");
		ten = sc.nextLine();
		System.out.println("Nhap gioi tinh: (true - Nam / false - Nu)");
		gtinh = sc.nextBoolean();
		System.out.println("Nhap nam sinh: ");
		nsinh = sc.nextInt();
	}
	public void inKH() {
		System.out.print("Ten khach hang : " + ten + " | Gioi tinh: ");
		if(gtinh == true) {
			System.out.print("Nam");
		}
		else System.out.print("Nu");
		System.out.println(" | " + "Nam sinh: " + nsinh);
	}
	public String toString() {
		String kq = "";
		kq += ("Ten khach hang : " + ten + " | Gioi tinh: ");
		if(gtinh == true) {
			kq += "Nam";
		}
		else kq += "Nu";
		kq += (" | " + "Nam sinh: " + nsinh);
		return kq;
	}
}
