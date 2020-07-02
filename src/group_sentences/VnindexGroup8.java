package group_sentences;


import rules.*;
import data.*;
import pattern.*;

/**
 * Dự đoán tương lai Vn-index tăng
 * @author Le Trong Dat.
 */
public class VnindexGroup8 extends Group{
	
	{
		this.setTag("dự đoán tương lai Vn-index tăng");
		this.setSentences("Nhiều chuyên gia dự đoán, sau tuần điều chỉnh vừa qua, VN-Index đã lấy lại được cân bằng và đang trên đường đến <maxPoint>.");
		this.setSentences("Tuần này, Vn-Index được dự báo sẽ có diễn biến tích cực hơn."); 
		this.setSentences("Chia sẻ quan điểm trên, một chuyên gia trong ngành cũng dự đoán VN-Index có khả năng tăng lên đến <maxPoint> điểm.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
