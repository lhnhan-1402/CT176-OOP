package test4;

import java.util.Scanner;

public class TPham extends HHoa {
	private String ngaysx, hansd;
	private char dd;
	public TPham() {
		super();
		ngaysx = new String();
		hansd = new String();
		dd = 'A';
	}
	public TPham(int m, String t, double d, int s, String n, String h, char dduong) {
		super(m, t, d, s);
		ngaysx = new String(n);
		hansd = new String(h);
		dd = dduong;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap ngay san xuat (dd/mm/yyyy): ");
		ngaysx = sc.nextLine();
		System.out.println("Nhap han su dung (dd/mm/yyyy):");
		hansd = sc.nextLine();
		System.out.println("Nhap luong dinh duong: ");
		dd = sc.nextLine().charAt(0);
	}
	public void in() {
		super.in();
		System.out.println(" - Ngay san xuat: " + ngaysx + " - Han su dung: " + hansd + " - Ham luong dinh duong: " + dd);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong hang hoa: ");
		int n = sc.nextInt();
		HHoa ds[] = new HHoa[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap hang hoa hoac thuc pham (0 - Hang hoa / 1 - Thuc pham):");
			int index = sc.nextInt();
			if(index == 0) {
				ds[i] = new HHoa();
			}
			else ds[i] = new TPham();
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin hang hoa thu " + (i + 1) + " la:");
			ds[i].in();
		}
		System.out.println("Ten thuc pham co gia duoi 1000000 va ham luong dinh duong o muc A hoac B la: ");
		for(int i = 0; i < n; i++) {
			if (ds[i] instanceof TPham) {
				TPham tp = (TPham) ds[i];
				if(tp.layDonGia() < 1000000 && (tp.dd == 'A' || tp.dd == 'B')) {
					System.out.println("Ten thuc pham: " + tp.layTen() + " - Don gia: " + tp.layDonGia() + " - Ham luong dinh duong: " + tp.dd);
				}
			}
		}
	}
}
