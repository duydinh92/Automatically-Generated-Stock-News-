package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về cổ phiếu giảm giá mạnh nhất.
 * @author Dinh Cong Duy
 */
public class Group3_1 extends Group{
	
	{
		this.setTag("Giảm giá mạnh nhất");
		this.setSentences("Ngược lại, cổ phiếu <code> của <corp> giảm mạnh nhất sàn với mức giảm <percentageChange>% xuống còn <closingPrice> đồng/CP (giảm <valueChange> đồng).");
		this.setSentences("Dẫn đầu nhóm giảm giá trong ngày là <code> của <corp> với mức giảm <percentageChange>%, tương ứng giảm <valueChange> đồng xuống còn <closingPrice> đồng/CP.");
		this.setSentences("Trong khi đó dẫn đầu danh sách giảm giá sàn HOSE là <code> của <corp> với mức giảm <percentageChange>%, tương ứng giảm từ <referencePrice> đồng/CP xuống còn <closingPrice> đồng/CP.");
	}
	
	@Override
	public void init(Data data) {
		Input top = data.getProcessor().topValueChangeDecrease();
		this.myMap = (new Rule3()).applyRule(top);
	}
}
