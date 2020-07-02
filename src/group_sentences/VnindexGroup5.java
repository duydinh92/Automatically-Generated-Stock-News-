package group_sentences;


import data.*;
import pattern.*;
import rules.*;

/**
 * Áp lực bán tăng
 * @author Le Trong Dat
 */
public class VnindexGroup5 extends Group{
	
	{
		this.setTag("áp lực bán tăng");
		this.setSentences("Trước áp lực short, giá các hợp đồng tiếp tục lình xình đi ngang quanh vùng giá <minPoint> điểm.");
		this.setSentences("Vị thế short ồ ạt khớp lệnh khiến chỉ số Vn-Index rơi chạm ngưỡng <minPoint> điểm.");
		this.setSentences("Thị trường chứng khoán bắt đầu chịu áp lực bán mạnh tiếp từ các cổ phiếu bluechips. Hàng loạt cổ phiếu vốn hoá lớn như MWG, GAS, ROS, MSN...giảm sâu đã khiến VnIndex mất hơn <cv> điểm.");
		this.setSentences("Một loạt đầu tàu như FPT, GMD, SAM, VNM, PVD giảm giá kéo Vn-Index giảm <cv> điểm, còn <minPoint> điểm.");
		this.setSentences("Lệnh short đẩy vào ngày một mạnh dần đã kéo giá hợp đồng về mức thấp nhất khu vực <minPoint> điểm trong phiên buổi sáng. Biên độ giao động trong suốt phiên sáng khoảng <cv> điểm.");
		this.setSentences("Tuy nhiên ngay sau đó vị thế short đã đẩy vào khiến giá lình xình rơi với gia tốc đều. Giữa mức điểm cao nhất và thấp nhất trong phiên ghi nhận độ chênh <cv> điểm.");
		this.setSentences("Các vị thế mua đuối thế, lệnh bán được đẩy vào thị trường khiến các hợp đồng điều chỉnh tiếp tục trong phiên và bị điều chỉnh về vùng giá thấp nhất trong ngày tại khu vực <minPoint> điểm.");
		this.setSentences("Sau khi chạm ngưỡng <morningPoint> điểm, lực long bị đuối sức khiến giá đi ngang quanh biên độ <minPoint> điểm.");
		this.setSentences("Áp lực bán mạnh dần ở nhóm bất động sản khiến VN-Index mất hơn <cv> điểm, lùi về ngưỡng <minPoint> điểm.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
