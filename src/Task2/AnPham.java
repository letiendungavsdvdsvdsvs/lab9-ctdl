package Task2;

import java.util.Date;
import java.util.Objects;

public abstract class AnPham {
	private String tieuDe;
	private int soTrang;
	private int namXuatBan;
	private String tacGia;
	private double giaTien;
	public AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien) {
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
		this.giaTien = giaTien;
	}
	public AnPham loaiAnPham(AnPham ap) {
		if(ap instanceof TapCHi || ap instanceof SachThamKhao) return ap;
		return null;
	}
	
	public String getTacGia() {
		return tacGia;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public boolean check(AnPham ap1, AnPham ap2) {
		if(ap1 instanceof TapCHi && ap1 instanceof TapCHi && ap1.getTacGia().equals(ap2.getTacGia())) {
			return true;
		}
		return false;
	}
	public boolean check1(AnPham ap) {
		Date date = new Date();
		if(ap instanceof TapCHi && date.getYear()-namXuatBan==10) return true;
		return false;
	}
}
