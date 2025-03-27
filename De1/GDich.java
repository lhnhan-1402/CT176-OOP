package De1;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private String hten, ngay;
	private boolean tthai;
	public GDich() {
		mgd = 0;
		hten = new String();
		ngay = new String();
		tthai = true;
	}
	public GDich(GDich gd) {
		mgd = gd.mgd;
		hten = new String(gd.hten);
		ngay = new String(gd.ngay);
		tthai = gd.tthai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so giao dich: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten nguoi giao dich: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay thang nam (dd/mm/yyyy): ");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai giao dich (true-thanhcong/ false-thatbai)");
		tthai = sc.nextBoolean();
	}
	public void in() {
		System.out.print("Ma so giao dich: " + mgd + " - Ho ten: " + hten + " - Ngay: " + ngay + " - Trang thai: ");
		if(tthai == true) {
			System.out.println("thanh cong");
		}
		else System.out.println("that bai");
	}
	public static void main(String[] args) {
		GDich g1 = new GDich();
		g1.nhap();
		g1.in();
		GDich g2 = new GDich(g1);
		g2.in();
	}
}
