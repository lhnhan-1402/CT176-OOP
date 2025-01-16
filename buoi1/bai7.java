package baitap;

import java.util.Scanner;

public class bai7 {
	public static String tachTen(String hoTen){
		int p = hoTen.lastIndexOf(" ");
		String ten = hoTen.substring(p + 1);
		return ten;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten: ");
		String hoTen = sc.nextLine();
		System.out.println("Ten la: " + tachTen(hoTen));
	}
}
