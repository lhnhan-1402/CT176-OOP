package buoi42425;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10, "Trang");
		System.out.println("Toa do diem A la: " + A);
		DiemMau B = new DiemMau();
		System.out.println("Nhap toa do diem B: ");
		B.nhap();
		System.out.println("Toa do diem B la: " + B);
		B.doiDiem(10, 8);
		System.out.println("Toa do diem B sau khi doi la: " + B);
		B.ganMau("Vang");
		System.out.println("Toa do diem B sau khi gan mau la: " + B);
	}
}
