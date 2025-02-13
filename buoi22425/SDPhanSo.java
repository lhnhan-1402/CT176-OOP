package buoi22425;

import java.util.Arrays;
import java.util.Scanner;

import Buoi2.PhanSo;

public class SDPhanSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        System.out.println("Phân số a:");
        a.hienThi();
        System.out.println();
        System.out.println("Phân số b:");
        b.hienThi();
        System.out.println();
        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        System.out.println("Nhập phân số x:");
        x.nhap();
        System.out.println("Nhập phân số y:");
        y.nhap();
        System.out.println("Nghịch đảo của x: ");
        x.giaTriNghichDao().hienThi();
        System.out.println();
        System.out.println("Tổng x + y: ");
        x.cong(y).hienThi();
        System.out.println();
        System.out.println("Nhập số lượng phân số: ");
        int n = sc.nextInt();
        PhanSo[] dsPhanSo = new PhanSo[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phân số thứ " + (i + 1) + ":");
            dsPhanSo[i] = new PhanSo();
            dsPhanSo[i].nhap();
        }
        PhanSo tong = new PhanSo(0, 1);
        for (int i = 0; i < dsPhanSo.length; i++) {
            tong = tong.cong(dsPhanSo[i]);
        }
        System.out.print("Tổng các phân số: ");
        tong.hienThi();
        PhanSo max = dsPhanSo[0];
        for (int i = 1; i < dsPhanSo.length; i++) {
            if (dsPhanSo[i].lonHon(max)) {
                max = dsPhanSo[i];
            }
        }
        System.out.print("Phân số lớn nhất: ");
        max.hienThi();
        for(int i = 0; i < n; i++) {
        	for(int j = i + 1; j < n; j++) {
        		if(dsPhanSo[i].lonHon(dsPhanSo[j])) {
        			PhanSo tmp = dsPhanSo[i];
        			dsPhanSo[i] = dsPhanSo[j];
        			dsPhanSo[j] = tmp;
        		}
        	}
        }
        System.out.println("Danh sach sau khi sap xep la: ");
        for(int i = 0; i < dsPhanSo.length; i++) {
        	dsPhanSo[i].hienThi();
        	System.out.println();
        }
	}
}
