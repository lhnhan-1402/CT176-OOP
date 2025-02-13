package buoi22425;

import java.util.Scanner;

public class SDDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date(14, 2, 2005);
		System.out.println("Ngay la : ");
		d.hienThi();
		Date d1 = new Date();
		d1.nhap();
		System.out.println("Ngay vua moi nhap la: ");
		d1.hienThi();
		System.out.println("Ngay hom sau ngay vua nhap la: ");
		d1.ngayHomSau().hienThi();
		System.out.println("So ngay cong them la: ");
		int n = sc.nextInt();
		System.out.println("Ngay sau khi cong them la: ");
		d1.congNgay(n).hienThi();
	}
}
