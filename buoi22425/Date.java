package buoi22425;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date() {
		ngay = 1;
		thang = 1;
		nam = 1;
	}
	public Date(int day, int month, int year) {
		ngay = day;
		thang = month;
		nam = year;
	}
	public Date(Date s) {
		ngay = s.ngay;
		thang = s.thang;
		nam = s.nam;
	}
	public boolean hopLe() {
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
			max[2] = 29;
		}
		boolean h = false;
		if(ngay > 0 && (thang > 0 && thang < 13) && nam > 0 && ngay <= max[thang]) {
			h = true;
		}
		return h;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("Nhap thang: ");
			thang = sc.nextInt();
			System.out.println("Nhap nam: ");
			nam = sc.nextInt();
			if(!hopLe()) {
				System.out.println("Nhap sai, vui long nhap lai");
			}
		} while(!hopLe());
	}
	public void hienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	public Date ngayHomSau() {
		Date ketQua = new Date(ngay, thang, nam);
		ketQua.ngay += 1;
		if(!ketQua.hopLe()) {
			ketQua.ngay = 1;
			ketQua.thang += 1;
			if(!ketQua.hopLe()) {
				ketQua.thang = 1;
				ketQua.nam += 1;
			}
		}
		return ketQua;
	}
	public Date congNgay(int n) {
		Date d = new Date(ngay, thang, nam);
		for(int i = 0; i < n; i++) {
			d = d.ngayHomSau();
		}
		return d;
	}
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
}
