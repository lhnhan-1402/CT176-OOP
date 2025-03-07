package buoi32425;

import java.util.Scanner;

import buoi22425.Date;

public class SinhVien {
	private String mssv, hoten;
	private Date ngaysinh;
	private int soluonghp;
	private String tenhp[], diemhp[];
	public SinhVien() {
		mssv = new String();
		hoten = new String();
		ngaysinh = new Date();
		soluonghp = 1;
		tenhp = new String[20];
		diemhp = new String[20];
		for(int i = 0; i < 20; i++) {
			tenhp[i] = new String();
			diemhp[i] = new String();
		}
	}
	public SinhVien(String m, String h, Date n) {
		mssv = new String(m);
		hoten = new String(h);
		ngaysinh = new Date(n);
		soluonghp = 1;
		tenhp = new String[20];
		diemhp = new String[20];
		for(int i = 0; i < 20; i++) {
			tenhp[i] = new String();
			diemhp[i] = new String();
		}
	}
	public SinhVien(SinhVien s){
		mssv	= new String(s.mssv);
		hoten	= new String(s.hoten);
		ngaysinh	= new Date(s.ngaysinh);
		soluonghp	= s.soluonghp;
		tenhp	= new String[20]; 
		diemhp	= new String[20];
		for(int i = 0; i < soluonghp; i++){
			tenhp[i]  = new String(s.tenhp[i]);
			diemhp[i] = new String(s.diemhp[i]);
		}
    }
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("MSSV: "); 	 mssv = sc.nextLine();
		System.out.print("Ho va ten: "); hoten = sc.nextLine();
		System.out.print("Ngay sinh: "); ngaysinh.nhap();
		System.out.print("So luong hoc phan dang ky:"); soluonghp = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < soluonghp; i++){	    
			System.out.print("Ten hoc phan thu " + (i+1) + ": ");
			tenhp[i] = sc.nextLine();
		}
    }
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < soluonghp; i++) {
			System.out.println("Nhap diem cho hoc phan " + tenhp[i] + ":");
			diemhp[i] = sc.nextLine();
		}
	}
	public String toString() {
		String kq = new String();
		kq = "\n" + "Thong tin\n";
		kq += "MSSV: " + mssv + "\n";
		kq += "Ho ten: " + hoten + "\n";
		kq += "Ngay sinh: " + ngaysinh.toString() + "\n";
		kq += "So luong hoc phan dang ky: " + soluonghp + "\n";
		for(int i = 0; i < soluonghp; i++) {
			kq += "Diem cua hoc phan " + tenhp[i] + " la: " + diemhp[i] + "\n";
		}
		return kq;
	}
	public float diemTB(){
		float sum = 0;
		for(int i = 0; i < soluonghp; i++){
			switch (diemhp[i]){
			case "A":
				sum += 4;
				break;
			case "B+":
				sum += 3.5;
				break;
			case "B":
				sum += 3;
				break;
			case "C+":
				sum += 2.5;
				break;
			case "C":
				sum += 2.0;
				break;
			case "D+":
				sum += 1.5;
				break;
			case "D":
				sum += 1.0;
				break;
			default: break;
			}
		}
		return sum / soluonghp;	
    }

    public void themHP(String HP){
		if(soluonghp == 20)
			System.out.println("Qua so luong hoc phan toi da");
		else{
			for(int i = 0; i < soluonghp; i++){
				if(tenhp[i].equals(HP)){
					System.out.println("Hoc phan da ton tai");
					return;
				}		    
			}
			tenhp[soluonghp] = new String(HP);
			soluonghp++;
		}
    }

    public void xoaHP(String HP){
		for(int i = 0; i < soluonghp; i++){
			if(tenhp[i].equals(HP)){
				for(int j = i; j < soluonghp-1; j++){
					tenhp[j] = new String(tenhp[j+1]);
				}
				soluonghp--;
				return;
			}
		}
		System.out.print("Chua dang ky hoc phan");
    }
    
    public String ten() {
		hoten = hoten.trim();
		return hoten.substring(hoten.lastIndexOf(" ") + 1);
    }
}

