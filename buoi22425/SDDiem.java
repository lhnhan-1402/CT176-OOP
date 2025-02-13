package buoi22425;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3, 4);
		System.out.println("Toa do diem A la: ");
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		System.out.println("Toa do diem B la: ");
		B.hienThi();
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		System.out.println("Toa do diem C la: ");
		C.hienThi();
		System.out.printf("Khoang cach tu B dem tam O la: %.2f\n", B.khoangCach());
		System.out.printf("Khoang cach tu A den B la: %.2f", B.khoangCach(A));
	}
}
