package buoi5;

import java.util.Scanner;

public class SDDichVu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong the buyt: ");
		int n = sc.nextInt();
		TheBus ds[] = new TheBus[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin the buyt thu " + (i + 1) + ":");
			ds[i] = new TheBus();
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin the buyt thu " + (i + 1) + ":" + ds[i]);
		}
		System.out.println("Thong tin cac loai the co gia tri su dung 1 nam: ");
		for(int i = 0; i < n; i++) {
			if(ds[i].layLoai() == 'Y') {
				ds[i].in();
			}
		}
		System.out.println("Thong tin cac khach hang co the xe duoc phat hanh ngay 20/05/22");
		for(int i = 0; i < n; i++) {
			if(ds[i].layNPH().equals("20/05/22")) {
				ds[i].in();
			}
		}
	}
}
