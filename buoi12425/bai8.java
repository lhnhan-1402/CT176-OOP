package buoi12425;

import java.util.Scanner;

public class bai8 {
	static int a[], n;
	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
	}
	public static int dem(int k) {
		int tmp = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == k) {
				tmp++;
			}
		}
		return tmp;
	}
	public static void sort() {
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		nhap();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("So luong so " + x + " trong danh sach la " + dem(x));
		sort();
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
