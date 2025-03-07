package buoi42425;

import java.util.Scanner;
import buoi22425.Date;
import buoi32425.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String taikhoan, matkhau, email;
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(String m, String h, Date n, String tkhoan, String mkhau, String e) {
		super(m, h, n);
		taikhoan = new String(tkhoan);
		matkhau = new String(mkhau);
		email = new String(e);
	}
	public SinhVienCNTT(SinhVienCNTT sv) {
		super((SinhVien)sv);
		taikhoan = new String(sv.taikhoan);
		matkhau = new String(sv.matkhau);
		email = new String(sv.email);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap tai khoan: ");
		taikhoan = sc.nextLine();
		System.out.println("Nhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.println("Nhap email: ");
		email = sc.nextLine();
	}
	public String toString() {
		return super.toString() + "Tai khoan la: " + taikhoan + ", Mat khau la: " + email;
	}
	public void doiMatKhau(String matkhaumoi) {
		matkhaumoi = new String(matkhaumoi);
	}
	public String getEmail() {
		return email;
	}
	public String layTaiKhoan() {
		return taikhoan;
	}
}
