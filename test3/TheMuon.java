package test3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TheMuon {
	private BDoc bdoc;
	private int mst;
	private String nmuon, ntra;
	public TheMuon() {
		bdoc = new BDoc();
		mst = 0;
		nmuon = new String();
		ntra = new String();
	}
	public TheMuon(TheMuon tm) {
		bdoc = new BDoc(tm.bdoc);
		mst = tm.mst;
		nmuon = new String(tm.nmuon);
		ntra = new String(tm.ntra);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		bdoc.nhap();
		System.out.println("Nhap ma so the: ");
		mst = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ngay muon (dd/mm/yyyy): ");
		nmuon = sc.nextLine();
		System.out.println("Nhap ngay tra (dd/mm/yyyy): ");
		ntra = sc.nextLine();
	}
	public void in() {
		bdoc.in();
		System.out.println(" - Ma so the: " + mst + " - Ngay muon: " + nmuon + " - Ngay tra: " + ntra);
	}
	public long tinhSoNgayMuon() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayMuon = LocalDate.parse(nmuon, formatter);
        LocalDate ngayTra = LocalDate.parse(ntra, formatter);
        return ChronoUnit.DAYS.between(ngayMuon, ngayTra);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so the muon: ");
		int n = sc.nextInt();
		TheMuon ds[] = new TheMuon[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin the muon thu " + (i +1) + ":");
			ds[i] = new TheMuon();
			ds[i].nhap();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin the muon thu " + (i + 1) + " la:");
			ds[i].in();
		}
		System.out.println("Ma so ban doc co so ngay muon hon 36 ngay la: ");
		for(int i = 0; i < n; i++) {
			if(ds[i].tinhSoNgayMuon() > 36) {
				System.out.println("Ma so ban doc: " + ds[i].bdoc.layMaSoBanDoc());
			}
		}
	}
}
