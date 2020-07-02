package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về cổ phiếu tăng giá mạnh nhất.
 * @author Dinh Cong Duy
 */
public class Group3_0 extends Group{
	
	{
		this.setTag("Tăng giá mạnh nhất");
		this.setSentences("Dẫn đầu về tăng giá tại sàn là cổ phiếu <code> của <corp> với mức tăng <percentageChange>%, tương ứng tăng từ <referencePrice> đồng lên <closingPrice> đồng.");
		this.setSentences("Đứng vị trí đầu tiên nhóm tăng giá là mã <code> của <corp> với mức tăng <percentageChange>%, tương ứng tăng từ <referencePrice> đồng lên <closingPrice> đồng.");
		this.setSentences("Giữ vị trí quán quân về tăng giá tại HoSE là <code> của <corp> với mức tăng <percentageChange>%, tương ứng tăng từ <referencePrice> lên <closingPrice> đồng.");
	}
	
	@Override
	public void init(Data data) {
		Input top = data.getProcessor().topValueChangeIncrease();
		this.myMap = (new Rule3()).applyRule(top);
	}
}
