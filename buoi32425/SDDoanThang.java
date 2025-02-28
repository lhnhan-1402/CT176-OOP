package buoi32425;

import buoi22425.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);
		DoanThang AB = new DoanThang(A, B);
		AB.tinhTien(5, 3);
		DoanThang CD = new DoanThang();
		CD.nhapToaDo();
		CD.hienThi();
		System.out.println("Do dai cua CD la: " + CD.doDai());
		System.out.println("Goc CD voi truc hoanh la: " + CD.tinhGoc());
	}
}
