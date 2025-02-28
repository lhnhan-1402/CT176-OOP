package buoi32425;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong gach:");
		int n = sc.nextInt();
		Gach ds[];
		ds = new Gach[n];
		for(int i = 0; i < n; i++) {
			ds[i] = new Gach();
			System.out.println("Nhap thong tin gach thu " + (i + 1));
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin vien gach thu " + (i + 1) + " la:");
			ds[i].hienThi();
		}
		Gach min = new Gach(ds[0]);
		for(int i = 0; i < n; i++) {
			if(ds[i].giaBan() < min.giaBan()) {
				min = new Gach(ds[i]);
			}
		}
		System.out.println("Loai gach co chi phi lot thap nhat la: ");
		min.hienThi();
		for(int i = 0; i < n; i++) {
			//ds[i].hienThi();
			int soHop  = ds[i].soLuongHop(1500, 500);
			System.out.println("Chi phi lot dien tich 15x5 la: " + soHop * ds[i].getGiaBan());
		}
	}
}
