package baitap;

import java.util.Scanner;

public class bai8 {
	public static int[] nhapDanhSach() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhap phan tu thu %d:\n", i + 1);
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static void hienThi(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static int dem(int x, int a[]) {
		int s = 0;
		for(int i = 0; i < a.length; i++) {
			if(x == a[i]) {
				s++;
			}
		}
		return s;
	}
	public static void sort(int a[]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	public static int[] chen(int x, int a[]) {
		int []tmp = new int[a.length + 1];
		int index = 0;
		boolean check = false;
		for(int i = 0; i < a.length; i++) {
			if(!check && a[i] >= x) {
				tmp[index++] = x;
				check = true;
			}
			tmp[index++] = a[i];
		}
		if(!check) {
			tmp[index] = x;
		}
		return tmp;
	}
	public static int[] xoa(int x, int a[]) {
		int dem = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= x) {
				dem++;
			}
		}
		int tmp[] = new int[dem];
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= x) {
				tmp[index++] = a[i];
			}
		}
		return tmp;
	}
	public static void main(String[] args) {
		int a[] = nhapDanhSach();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen x: ");
		int x = sc.nextInt();
		System.out.println("So luong so x trong danh sach la: " + dem(x, a));
		sort(a);
		System.out.println("Danh sach sau khi sap xep la: ");
		hienThi(a);
		a = chen(x, a);
		System.out.printf("Danh sach sau khi chen %d vao la: ", x);
		hienThi(a);
		a = xoa(x, a);
		System.out.printf("Danh sach sau khi xoa cac phan tu nho hon %d la: ", x);
		hienThi(a);
	}
}
