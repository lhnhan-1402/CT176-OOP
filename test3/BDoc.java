package test3;

import java.util.Scanner;

public class BDoc {
	private int msbd;
	private String tenbd, ngsinh;
	private boolean VIP;
	public BDoc() {
		msbd = 0;
		tenbd = new String();
		ngsinh = new String();
		VIP = true;
	}
	public BDoc(BDoc bd) {
		msbd = bd.msbd;
		tenbd = new String(bd.tenbd);
		ngsinh = new String(bd.ngsinh);
		VIP = bd.VIP;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so ban doc sach: ");
		msbd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten ban doc sach:");
		tenbd = sc.nextLine();
		System.out.println("Nhap ngay sinh (dd/mm/yyyy): ");
		ngsinh = sc.nextLine();
		System.out.println("Nhap ban doc lau nam (true - co / false - khong)");
		VIP = sc.nextBoolean();
	}
	public void in() {
		System.out.print("Ma so ban doc sach: " + msbd + " - Ten ban doc sach: " + tenbd + " - Ngay sinh: " + ngsinh + " - Ban doc lau nam: ");
		if(VIP == true) {
			 System.out.print("Co");
		}
		else System.out.print("Khong");
	}
	public int layMaSoBanDoc() {
		return msbd;
	}
	public static void main(String[] args) {
		BDoc bd1 = new BDoc();
		bd1.nhap();
		System.out.println("Thong tin ban doc 1 la: ");
		bd1.in();
		BDoc bd2 = new BDoc(bd1);
		System.out.println("Thong tin ban doc 2 sao chep tu ban doc 1 la: ");
		bd2.in();
	}
}
