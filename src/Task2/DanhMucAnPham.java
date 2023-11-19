package Task2;

import java.util.Collections;
import java.util.List;

public class DanhMucAnPham {
	private List<AnPham> dsAnPham;

	public DanhMucAnPham(List<AnPham> dsAnPham) {
		this.dsAnPham = dsAnPham;
	}
	public double tongTien() {
		double tongTien=0;
		for (AnPham anPham : dsAnPham) {
			tongTien+=anPham.getGiaTien();
		}
		return tongTien;
	}
	public SachThamKhao nhieuCHuongNhat() {
		for (AnPham anPham : dsAnPham) {
			if(anPham instanceof SachThamKhao) {
				return (SachThamKhao) anPham;
			}
		}
		return null;
	}
}
