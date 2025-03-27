package test2;

import java.util.Scanner;

public class QuocGia {
	private String msqg, tenqg, tenthudo;
	private double GDP;
	public QuocGia() {
		msqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 0.0;
	}
	public QuocGia(QuocGia qg) {
		msqg = new String(qg.msqg);
		tenqg = new String(qg.tenqg);
		tenthudo = new String(qg.tenthudo);
		GDP = qg.GDP;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so quoc gia: ");
		msqg = sc.nextLine();
		System.out.println("Nhap ten quoc gia: ");
		tenqg = sc.nextLine();
		System.out.println("Nhap ten thu do: ");
		tenthudo = sc.nextLine();
		System.out.println("Nhap tong san pham quoc noi: ");
		GDP = sc.nextDouble();
	}
	public double layGDP() { 
		return GDP;
	}
	public String layTenQG() {
		return tenqg;
	}
	public void in() {
		System.out.println("Ma so quoc gia: " + msqg + " - Ten quoc gia: " + tenqg + " - Ten thu do: " + tenthudo + " - GDP: " + GDP);
	}
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		qg1.nhap();
		System.out.println("Thong tin cua quoc gia 1 la: ");
		qg1.in();
		QuocGia qg2 = new QuocGia(qg1);
		System.out.println("Thong tin cua quoc gia 2 sao chep tu quoc gia 1 la: ");
		qg2.in();
	}
}
