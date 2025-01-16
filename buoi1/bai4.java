package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai4 {
	public static int tong(int a, int b) {
		return a + b;
	}
	public static int nhapSo() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.MAX_VALUE;
		while(true) {
			try {
				System.out.println("Nhap vao 1 so: ");
				n = sc.nextInt();
				break;
			}
			catch(InputMismatchException e){
				System.out.println("Nhap sai, vui long nhap lai");
				sc.nextLine();
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int a = nhapSo();
		int b = nhapSo();
		System.out.println("Tong cua 2 so la: " + (a + b));
	}
}
