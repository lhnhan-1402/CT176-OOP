package buoi12425;

import java.util.Scanner;

public class bai5 {
	public static void ptBac1(int a, int b) {
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else {
			System.out.printf("Nghiem cua phuong trinh la %.2f\n", (double)-b / a);
		}
	}
	public static void ptBac2(int a, int b, int c) {
		if(a == 0) {
			ptBac1(b, c);
		}
		else {
			double delta = (b * b) - (4 * a * c);
			if(delta > 0) {
				System.out.printf("x1 = %.2f\n", ((-b + Math.sqrt(delta)) / (2 * a)));
				System.out.printf("x2 = %.2f\n", ((-b - Math.sqrt(delta)) / (2 * a)));
			}
			else if(delta == 0) {
				System.out.printf("Phuong trinh co nghiem kep la: %.2f\n", (double)-b / (2 * a));
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri cua a: ");
		int a = sc.nextInt();
		System.out.println("Nhap gia tri cua b: ");
		int b = sc.nextInt();
		System.out.println("Nhap gia tri cua c: ");
		int c = sc.nextInt();
		ptBac2(a, b, c);
	}

}
