package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Thị trường phát sinh
 * @author Le Trong Dat
 */
public class VnindexGroup11 extends Group{
	
	{
		this.setTag("Thị trường phát sinh");
		this.setSentences("Đối với thị trường CK phái sinh, 4 hợp đồng đều tăng mạnh về thanh khoản trong các phiên giao dịch trong tuần hơn so với tuần trước. Hiện nay tổng khối lượng khớp lệnh trung bình của thị trường giao dịch hợp đồng tương lai đạt mức cao, tương ứng đạt <klgd> triệu hợp đồng."); 
		this.setSentences("Thanh khoản trên thị trường phái sinh cũng có xu hướng bình ổn trong những phiên giao dịch trong tuần này, tổng khối lượng khớp lệnh của toàn thị trường giao dịch hợp đồng tương lai đạt <klgd> triệu hợp đồng.");
		this.setSentences("Thanh khoản trên thị trường phái sinh cũng có xu hướng tăng mạnh trong những phiên giao dịch biến động như hôm nay, tổng khối lượng khớp lệnh của toàn thị trường giao dịch hợp đồng tương lai đạt <klgd> triệu hợp đồng.");
		this.setSentences("Thanh khoản trên thị trường phái sinh cũng có xu hướng cải thiện đáng kể trong những phiên giao dịch tuần này. Trong ngày hôm nay, tổng khối lượng khớp lệnh của toàn thị trường giao dịch hợp đồng tương lai đạt <klgd> triệu hợp đồng.");
		this.setSentences("Thanh khoản trên thị trường phái sinh cũng có xu hướng tăng trong những phiên giao dịch tuần này khi mà xu hướng giữa 2 vị thế mua và bán liên tục giằng co với biên độ nới rộng. Trong ngày hôm nay, tổng khối lượng khớp lệnh của toàn thị trường giao dịch hợp đồng tương lai đạt <klgd> triệu hợp đồng.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
