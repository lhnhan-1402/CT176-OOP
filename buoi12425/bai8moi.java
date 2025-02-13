package buoi12425;

import java.util.Scanner;

public class bai8moi {
	public static int[] nhap() {
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
			System.out.printf("Phan tu thu %d la: %d\n", i + 1, a[i]);
		}
	}
	public static int dem(int x, int a[]) {
		int tmp = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				tmp++;
			}
		}
		return tmp;
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
        int[] tmp = new int[a.length + 1];
        int index = 0;
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (!check && a[i] >= x) {
                tmp[index++] = x;
                check = true;
            }
            tmp[index++] = a[i];
        }
        if (!check) {
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
		int []tmp = new int[dem];
		int giaTri = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= x) {
				tmp[giaTri++] = a[i];
			}
		}
		return tmp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = nhap();
		System.out.println("Nhap gia tri cua x: ");
		int x = sc.nextInt();
		System.out.printf("So luong so %d trong mang la: %d\n", x, dem(x, a));
		sort(a);
		System.out.println("Mang sau khi sap xep la: ");
		hienThi(a);
		int []b = chen(x, a);
		System.out.println("Mang sau khi chen la: ");
		hienThi(b);
		int[] c = xoa(x, a);
		System.out.println("Mang sau khi xoa la: ");
		hienThi(c);
	}
	
}
