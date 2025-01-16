package baitap;

import java.util.Scanner;

public class bai6 {
	public static boolean nguyenTo(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void nhiPhan(int n) {
		String tmp = "";
		while(n != 0) {
			tmp += n % 2;
			n /= 2;
		}
		for(int i = tmp.length() - 1; i >= 0; i--) {
			System.out.print(tmp.charAt(i));
		}
	}
	public static int tongChuSo(int n) {
		int tong = 0;
		while(n != 0) {
			tong += n % 10;
			n /= 10;
		}
		return tong;
	}
	public static void uocSoNguyenTo(int n) {
		for(int i = 2; i <= n; i++) {
			if(nguyenTo(i) && (n % i == 0)) {
				System.out.println(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen: ");
		int n = sc.nextInt();
		if(nguyenTo(n)) {
			System.out.println("So la so nguyen to");
		}
		else {
			System.out.println("So khong phai la so nguyen to");
		}
		System.out.println("Dang so nhi phan cua so vua nhap la: ");
		nhiPhan(n);
		System.out.println();
		System.out.println("Tong cac chu so cua so vua nhap la: " + tongChuSo(n));
		System.out.println("Uoc so nguyen to cua so vua nhap la: ");
		uocSoNguyenTo(n);
		
	}
}
