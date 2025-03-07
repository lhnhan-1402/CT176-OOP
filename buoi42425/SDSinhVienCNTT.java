package buoi42425;

import java.util.Scanner;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien: ");
		int n = sc.nextInt();
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap sinh vien thu " + (i + 1) + ": ");
			ds[i] = new SinhVienCNTT();
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap diem sinh vien thu " + (i + 1) + ": ");
			ds[i].nhapDiem();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin sinh vien thu " + (i + 1) + ": " + ds[i]);
		}
		sc.nextLine();
		System.out.println("Nhap dia chi email sinh vien can tim: ");
		String email = sc.nextLine();
		boolean check = false;
		for(int i = 0; i < n; i++) {
			if(ds[i].getEmail().compareTo(email) == 0) {
				System.out.println("Tai khoan sinh vien vua tim thay la: " + ds[i].layTaiKhoan() + " ket qua hoc tap: " + ds[i].diemTB());
				check = true;
				break;
			}
		}
		if(!check) {
			System.out.println("Khong tim thay");
		}
	}
}
