package buoi12425;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai4 {
	public static int tong2So(int a, int b) {
		return a + b;
	}
	public static int nhapSoNguyen() {
		Scanner sc = new Scanner(System.in);
		int soNguyen = Integer.MAX_VALUE;
		while(true) {
			try {
				System.out.println("Nhap 1 so nguyen: ");
				soNguyen = sc.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("Nhap sai, vui long nhap lai !");
				sc.nextLine();
			}
		}
		return soNguyen;
	}
	public static void main(String[] args) {
		int a = nhapSoNguyen();
		int b = nhapSoNguyen();
		System.out.println("Tong 2 so nguyen la: "+tong2So(a, b));
	}

}
