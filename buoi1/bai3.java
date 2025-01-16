package baitap;

import java.util.Scanner;

public class bai3 {
	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Nhap vao 1 ky tu: ");
			char kyTu = sc.nextLine().charAt(0);
			if(kyTu == 'q') {
				System.out.println("Chuong trinh ket thuc");
				break;
			}
			System.out.println("Ky tu vua nhap la: " + kyTu);
		}
	}
	public static void main(String[] args) {
		nhap();
	}
}
