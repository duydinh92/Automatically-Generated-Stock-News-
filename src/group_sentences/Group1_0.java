package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu về top 5 cổ phiếu tăng giá mạnh nhất.
 * @author Dinh Cong Duy
 */
public class Group1_0 extends Group{
	
	{
		this.setTag("Top 5 tăng giá");
		this.setSentences("Các cổ phiếu tăng giá mạnh nhất là <code1> (tăng <valueChange1> đồng), <code2> (tăng <valueChange2> đồng), <code3> (tăng <valueChange3> đồng), <code4> (tăng <valueChange4> đồng), <code5> (tăng <valueChange5> đồng).");
		this.setSentences("Top 5 các cổ phiếu tăng giá mạnh nhất sàn:  <code1> (tăng <valueChange1> đồng/CP) và <code2> (tăng <valueChange2> đồng/CP), <code3> (tăng <valueChange3> đồng/CP), <code4> (tăng <valueChange4> đồng/CP), <code5> (tăng <valueChange5> đồng/CP).");
		this.setSentences("Trên sàn HoSE, các cổ phiếu tăng giá nhiều nhất  là <code1> (tăng <valueChange1> đồng), <code2> (tăng <valueChange2> đồng), <code3>, <code4>, <code5> lần lượt tăng từ <valueChange5> – <valueChange3> đồng/CP.");
	}
	
	@Override
	public void init(Data data) {
		Input[] top = data.getProcessor().top5ValueChangeIncrease();
		this.myMap = (new Rule1()).applyRule(top);
	}
}
