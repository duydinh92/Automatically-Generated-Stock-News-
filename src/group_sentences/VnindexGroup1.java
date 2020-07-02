package group_sentences;


import data.*;
import pattern.*;
import rules.*;


/**
 * Vn-index hôm nay tăng
 * @author Le Trong Dat.
 */
public class VnindexGroup1 extends Group{
	
	{
		this.setTag("Vn-index hôm nay tăng");
		this.setSentences("Kết thúc phiên giao dịch hôm nay, Vnindex chính thức đã có lại được màu xanh sau 3 phiên điều chỉnh.");
		this.setSentences("Sau 3 phiên điều chỉnh nhẹ thì VnIndex đã đảo chiều tăng trở lại. Nhiều nhà đầu tư nhận định phiên tăng hôm nay sẽ khởi đầu cho chu kỳ tăng mới.");
		this.setSentences("Những gì diễn ra trên bảng điện cho thấy thị trường chứng khoán đang có dấu hiệu hồi phục.");
		this.setSentences("Nhiều cổ phiếu đã có sự hồi phục mạnh mẽ trong phiên giao dịch hôm nay.");
		
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
