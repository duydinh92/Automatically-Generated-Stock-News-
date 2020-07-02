package group_sentences;


import data.*;
import pattern.*;
import rules.*;


/**
 * Chỉ số Vn-index sáng giảm.
 * @author Le Trong Dat.
 */
public class VnindexGroup3 extends Group{
	
	{
		this.setTag("chỉ số Vn-index sáng giảm");
		this.setSentences("Đến hết phiên giao dịch sáng, 2 sàn chứng khoán không có nhiều câu chuyện lớn để nói khi mà "
				+ "thị trường vẫn lình xình đi ngang trong biên độ hẹp.");
		this.setSentences("Thị trường tiếp tục giữ xu hướng \"xanh vỏ, đỏ lòng\" khi các chỉ số chính giằng co gần tham chiếu"
				+ " nhưng sắc đỏ chiếm áp đảo trên thị trường");
		this.setSentences("Nhiều cổ phiếu đã có sự hồi phục mạnh mẽ trong phiên giao dịch hôm nay."
				+ " Tuy nhiên, sự hồi phục không diễn ra trên diện rộng nên VnIndex vẫn mất điểm cùng dòng tiền bắt đáy mạnh.");
		this.setSentences("Thị trường chứng khoán giảm sâu với hàng loạt cổ phiếu bị bán sàn do áp lực giải chấp"
				+ " nhưng dòng tiền mạnh đổ vào bắt đáy khiến nhiều nhà đầu tư vẫn kỳ vọng có sự đảo chiếu, bật ngược thế cờ.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
