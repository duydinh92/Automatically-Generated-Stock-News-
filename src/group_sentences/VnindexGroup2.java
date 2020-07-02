package group_sentences;


import data.*;
import pattern.*;
import rules.*;


/**
 * Chỉ số Vn-index buổi sáng tăng
 * @author Le Trong Dat
 */
public class VnindexGroup2 extends Group{
	
	{
		this.setTag("chỉ số Vn-index buổi sáng tăng");
		this.setSentences("Vn-Index khởi đầu phiên giao dịch trong không khí hứng khởi, giành được thêm <changePointMorning> điểm, tương đương <percentChangeMorning>%, chốt phiên giao dịch sáng ở <morningPoint> điểm."); 
		this.setSentences("Vn-Index có khởi đầu thuận lợi trong phiên hôm nay khi tăng <changePointMorning> điểm, tương đương <percentChangeMorning>%, lên <morningPoint> điểm trong đợt 1.");
		this.setSentences("Thị trường phái sinh mở cửa phiên hôm nay tăng <changePointMorning> điểm (tương đương <percentChangeMorning>%) lên <morningPoint> điểm ngay từ những phút đầu tiên mở cửa.");
		this.setSentences("Nối dài tín hiệu khởi sắc trong những phiên vừa qua, mở đầu giao dịch hôm nay, Vn-Index tăng <changePointMorning> điểm, tương đương <percentChangeMorning>%, lên <morningPoint> điểm.");
		this.setSentences("Sáng nay, giao dịch các loại cổ phiếu diễn ra sôi động, VN-Index tăng <changePointMorning> điểm, chốt phiên giao dịch sáng với <morningPoint> điểm.");
		this.setSentences("Đóng cửa phiên sáng, Vn-Index tăng <changePointMorning> điểm , tương đương <percentChangeMorning>% lên <morningPoint> điểm.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
