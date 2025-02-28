package buoi12425;

import java.util.Scanner;

public class bai6 {
	public static boolean nt(int n) {
		if(n < 2) return false;
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen: ");
		int n = sc.nextInt();
		if(nt(n)) {
			np(n);
		}
		else System.out.println("So vua nhap khong phai so nguyen to");
	}
}
