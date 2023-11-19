package Task2;

import java.util.List;

public class SachThamKhao extends AnPham implements Comparable<SachThamKhao>{
	private String linhVuc;
	private List<Chuong> chuong;
	public SachThamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien, String linhVuc, List<Chuong> chuong) {
		super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
		this.linhVuc = linhVuc;
		this.chuong = chuong;
	}
	public List<Chuong> getChuong() {
		return chuong;
	}
	@Override
	public int compareTo(SachThamKhao o) {
		// TODO Auto-generated method stub
		return -(chuong.size()-o.getChuong().size());
	}
	
}
