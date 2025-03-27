package De01;

import java.util.Scanner;

public class CThu extends CNguoi {
	private int so;
	private String vtri;
	private long bthang;
	private String mua, clbo;
	public CThu() {
		super();
		so = 1;
		vtri = new String();
		bthang = 0;
		mua = new String();
		clbo = new String();
	}
	public CThu(CThu ct) {
		super(ct);
		so = ct.so;
		vtri = ct.vtri;
		bthang = ct.bthang;
		mua = ct.mua;
		clbo = ct.clbo;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap so ao: ");
		so = sc.nextInt();
		System.out.println("Nhap vi tri:");
		vtri = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap so ban thang: ");
		bthang = sc.nextLong();
		sc.nextLine();
		System.out.println("Nhap mua giai:");
		mua = sc.nextLine();
		System.out.println("Nhap ten cau lac bo: ");
		clbo = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println(" - So ao: " + so + " - Vi tri: " + vtri + " - So ban thang: " + bthang + " - Mua giai: " + mua + " - Ten cau lac bo: " + clbo);
	}
	public long luongCoBan() {
		long luongCoBan = 7000000;
		long luongBanThang = 500000 * bthang;
		if(vtri.equals("Tien dao")) luongCoBan += 7000000;
		else if(vtri.equals("Tien ve")) luongCoBan += 5000000;
		else if(vtri.equals("Trung ve")) luongCoBan += 4500000;
		else if(vtri.equals("Hau ve")) luongCoBan += 4000000;
		else if(vtri.equals("Thu mon")) luongCoBan += 3000000;
		return (long) ((luongCoBan + luongBanThang) - (0.1 * (luongCoBan + luongBanThang)));
	}
	public long layBanThang() {
		return bthang;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong: ");
		int n = sc.nextInt();
		CNguoi ds[] = new CNguoi[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap con nguoi hoac cau thu (1-con nguoi / 2-cauthu)");
			int idx = sc.nextInt();
			if(idx == 1) {
				ds[i] = new CNguoi();
			}
			else ds[i] = new CThu();
			ds[i].nhap();
		}
		System.out.println("Danh sach vua nhap la: ");
		for(int i = 0; i < n; i++) {
			ds[i].in();
		}
		int banthang1824 = 0, banthang2528 = 0, banthang28 = 0;
		System.out.println("Tien luong cua cau thu la: ");
		for(int i = 0; i < n; i++) {
			if (ds[i] instanceof CThu) {
				CThu cauThu = (CThu) ds[i];
				int tuoi = cauThu.tinhTuoi();
				if(tuoi >= 18 && tuoi <= 24) {
					banthang1824 += cauThu.layBanThang();
				}
				else if(tuoi >= 25 && tuoi <= 28) {
					banthang2528 += cauThu.layBanThang();
				}
				else if(tuoi > 28) {
					banthang28 += cauThu.layBanThang();
				}
				System.out.println("Cau thu: " + cauThu.layHoTen() + " - Luong: " + cauThu.luongCoBan());
			}
		}
		System.out.println("Ban thang lua tuoi 18 - 24 la: " + banthang1824);
		System.out.println("Ban thang lua tuoi 25 - 28 la: " + banthang2528);
		System.out.println("Ban thang lua tuoi tren 28 la: " + banthang28);
	}
}