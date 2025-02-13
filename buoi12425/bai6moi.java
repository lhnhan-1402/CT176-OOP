package buoi12425;

import java.util.Scanner;

public class bai6moi {
	public static boolean nt(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void np(int n) {
		String tmp = "";
		int thuong = n, soDu;
		while(thuong != 0) {
			soDu = thuong % 2;
			tmp += soDu;
			thuong /= 2;
		}
		for(int i = tmp.length() - 1; i >= 0; i--) {
			System.out.print(tmp.charAt(i));
		}
	}
	public static int tongChuSo(int n) {
		int s = 0;
		while(n > 0) {
			s += n % 10;
			n /= 10;
		}
		return s;
	}
	public static void uocSo(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0 && nt(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(nt(n)) {
			System.out.printf("%d la so nguyen to\n", n);
		}
		else System.out.printf("%d khong la so nguyen to\n", n);
		System.out.printf("Dang nhi phan cua %d la: ", n);
		np(n);
		System.out.println();
		System.out.printf("Tong cac chu so cua %d la: %d\n", n, tongChuSo(n));
		System.out.printf("Cac uoc so cua %d la: \n", n);
		uocSo(n);
	}
}
