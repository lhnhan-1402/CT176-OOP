package buoi42425;

import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so con vat: ");
		int n = sc.nextInt();
		int c;
		ConVat ds[] = new ConVat[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap vao thong tin con vat thu " + (i + 1));
			System.out.println("Bo nhap 1\nHeo nhap 2\nDe nhap 3\n");
			System.out.println("Nhap lua chon cua ban: ");
			c = sc.nextInt();
			if(c == 1) {
				ds[i] = new Bo();
			}
			else if(c == 2) {
				ds[i] = new Heo();
			}
			else if(c == 3) {
				ds[i] = new De();
			}
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin dong vat thu " + (i + 1));
			ds[i].in();
			ds[i].keu();
		}
	}
}
