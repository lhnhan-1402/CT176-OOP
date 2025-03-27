package test2;

import java.util.Scanner;

public class QuocGiaPT extends QuocGia{
	private double ttho;
	private char chluc;
	private double dtich;
	public QuocGiaPT() {
		super();
		ttho = 0.0;
		chluc = 'a';
		dtich = 0.0;
	}
	public QuocGiaPT(QuocGiaPT qgpt) {
		super(qgpt);
		ttho = qgpt.ttho;
		chluc = qgpt.chluc;
		dtich = qgpt.dtich;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap tuoi tho: ");
		ttho = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhap chau luc (A - Chau A / W - Chau Au / U - Chau Uc / P - Chau Phi):");
		chluc = sc.nextLine().charAt(0);
		System.out.println("Nhap dien tich: ");
		dtich = sc.nextDouble();
	}
	public void in() {
		super.in();
		System.out.print(" - Tuoi tho:" + ttho + " - Chau luc: ");
		if(chluc == 'A') {
			System.out.print("Chau A");
		}
		else if(chluc == 'W') {
			System.out.print("Chau Au");
		}
		else if(chluc == 'M') {
			System.out.print("Chau My");
		}
		else System.out.print("Chau Phi");
		System.out.println(" - Dien tich: " + dtich);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong quoc gia: ");
		int n = sc.nextInt();
		QuocGia ds[] = new QuocGia[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin quoc gia hay quoc gia phat trien (0 - quoc gia / 1 - quoc gia phat trien):");
			int index = sc.nextInt();
			if(index == 0) {
				ds[i] = new QuocGia();
			}
			else ds[i] = new QuocGiaPT();
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin quoc gia thu " + (i + 1) + " la:");
			ds[i].in();
		}
		System.out.println("Ten quoc gia co GDP tren 500 den tu chau Phi la: ");
		for(int i = 0; i < n; i++) {
			if (ds[i] instanceof QuocGiaPT) {
				QuocGiaPT qg = (QuocGiaPT) ds[i];
				if(qg.layGDP() > 500 && qg.chluc == 'P') {
					System.out.println("Ten quoc gia: " + qg.layTenQG() + " - GDP: " + qg.layGDP());
				}
			}
		}
	}
}
