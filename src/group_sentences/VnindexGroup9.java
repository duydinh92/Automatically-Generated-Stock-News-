package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Chốt phiên chỉ số Vnindex giảm
 * @author Le Trong Dat
 */
public class VnindexGroup9 extends Group{
	
	{	
		this.setTag("chốt phiên chỉ số Vnindex giảm");
		this.setSentences("Chốt phiên giao dịch ngày <date>, VN-Index giảm <changePointAfternoon> điểm, tương đương gần <percentChangeAfternoon>% còn <closePoint> điểm."); 
		this.setSentences("Vn-Index giảm một mạch <changePointAfternoon> điểm, tương đương <percentChangeAfternoon>%, chốt phiên giao dịch chỉ còn <closePoint>."); 
		this.setSentences("Vn-Index sau 30 phút giao dịch định kỳ đầu tiên đã giảm tới <percentChangeAfternoon>%, tương đương <changePointAfternoon> điểm, xuống <closePoint> điểm và kéo dài cho đến cuối phiên.");
		this.setSentences("Chốt phiên giao dịch, Vn-Index mất <changePointAfternoon> điểm tương đương <percentChangeAfternoon>%, xuống còn <closePoint> điểm."); 
		this.setSentences("Đến cuối ngày giao dịch, Vn-Index chỉ còn <closePoint> điểm, sau khi bị trừ <changePointAfternoon> điểm (<percentChangeAfternoon>%).");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
