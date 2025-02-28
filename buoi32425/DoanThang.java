package buoi32425;

import buoi22425.Diem;

public class DoanThang {
	private Diem d1, d2;
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem x, Diem y) {
		d1 = new Diem(x);
		d2 = new Diem(y);
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public void nhapToaDo() {
		System.out.println("Nhap toa do diem dau: ");
		d1.nhapDiem();
		System.out.println("Nhap toa do diem cuoi: ");
		d2.nhapDiem();
	}
	public void hienThi() {
		d1.hienThi();
		d2.hienThi();
	}
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	public float tinhGoc() {
		return (float)Math.acos((Math.abs(d1.giaTriX() - d2.giaTriX()) / this.doDai()));
	}
}
