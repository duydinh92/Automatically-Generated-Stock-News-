package group_sentences;


import rules.*;
import data.*;
import pattern.*;

/**
 * Chốt phiên chỉ số Vn-index tăng
 * @author Le Trong Dat
 */
public class VnindexGroup7 extends Group{
	
	{
		this.setTag("chốt phiên chỉ số Vn-index tăng");
		this.setSentences("Chốt phiên giao dịch, một số cổ phiếu chủ chốt có mặt trong nhóm tăng giá đã góp phần kéo VN-Index tăng <changePointAfternoon> điểm lên mức <closePoint> điểm.");
		this.setSentences("Nếu xét theo tính chu kỳ thì động thái hình thành khuynh hướng phục hồi có thể bắt đầu từ giữa tháng 7, song trên thực tế trong tháng 5 đã xuất hiện"
				+ " những chuyển biến tích cực, với nhiều phiên giao dịch liên tiếp tăng điểm và chỉ số VN-Index vượt qua mốc <closePoint> điểm."); 
		this.setSentences("Hơn nửa triệu cổ phiếu khớp lệnh thuộc nhóm ngân hàng đã góp phần kéo VN-Index tăng <changePointAfternoon> điểm đóng cửa ở <closePoint> điểm.");
		this.setSentences("Nhờ lực đẩy của các trụ cột, Vn-Index tăng tốc dần trong phiên để đóng cửa tại <closePoint> điểm, tăng tổng cộng <changePointAfternoon> điểm - "
				+ "mức cao nhất kể trong vòng một tháng qua.");
		this.setSentences("Hơn nửa triệu cổ phiếu khớp lệnh thuộc nhóm ngân hàng đã góp phần kéo VN-Index tăng <changePointAfternoon> điểm đóng cửa ở <closePoint> điểm.");
		this.setSentences("Chốt phiên giao dịch, một số cổ phiếu chủ chốt có mặt trong nhóm tăng giá đã góp phần kéo VN-Index tăng <changePointAfternoon> điểm lên mức <closePoint> điểm.");
		this.setSentences("Cuối ngày Vn-Index tăng <changePointAfternoon> điểm, dừng ở <closePoint> điểm, chuyển nhượng <klgd> triệu chứng khoán, tương đương <gtgd> tỷ đồng.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
