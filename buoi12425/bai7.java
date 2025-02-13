package buoi12425;

import java.util.Scanner;

public class bai7 {
	public static String tachTen(String hoTen) {
		int p = hoTen.lastIndexOf(" ");
		String ten = hoTen.substring(p + 1);
		return ten;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten: ");
		String ten = sc.nextLine();
		System.out.println(bai7.tachTen(ten));
	}
}
