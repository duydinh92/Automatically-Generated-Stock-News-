package group_sentences;


import data.*;
import pattern.*;
import rules.*;


/**
 * Áp lực mua tăng
 * @author Le Trong Dat
 */
public class VnindexGroup6 extends Group{
	
	{
		this.setTag("áp lực mua tăng");
		this.setSentences("Trước lực long đẩy vào mạnh mẽ, giá các hợp đồng tương lai bứt phá chạm ngưỡng cao nhất phiên sáng quanh vùng <maxPoint> điểm.");
		this.setSentences("Ngay sau đó vị thế long đã đẩy vào đỡ giá và khiến hợp đồng tăng mạnh chạm ngưỡng <maxPoint> điểm - giá cao nhất trong ngày.");
		this.setSentences("Thời gian sau đó các hợp đồng đều bị giằng co và tăng lên ngưỡng <morningPoint> duy trì đến hết phiên sáng. Biên độ trong suốt buổi sáng giao động quanh <cv> điểm.");
		this.setSentences("Một lần nữa vị thế mua phát huy ưu thế ngay sau khi chạm hỗ trợ đã đẩy giá các hợp đồng lên ngưỡng gần khu vực <maxPoint> điểm.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
