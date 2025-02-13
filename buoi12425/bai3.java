package buoi12425;

import java.util.Scanner;

public class bai3 {
	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		char kyTu;
		while(true) {
			System.out.println("Nhap vao 1 ky tu: ");
			kyTu = sc.nextLine().charAt(0);
			if(kyTu == 'q') {
				System.out.println("Chuong trinh ket thuc");
				break;
			}
			System.out.println("Ki tu vua nhap la : " + kyTu);
		}
	}
	public static void main(String[] args) {
		nhap();
	}
}
