package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về top 5 cổ phiếu giảm giá mạnh nhất.
 * @author Dinh Cong Duy
 */
public class Group1_1 extends Group{
	
	{	
		this.setTag("Top 5 giảm giá");
		this.setSentences("Ở chiều ngược lại, các mã giảm giá mạnh nhất là <code1> (giảm <valueChange1> đồng), <code2> (giảm <valueChange2> đồng), <code3> (giảm <valueChange3> đồng), <code4> (giảm <valueChange4> đồng) và <code5> (giảm <valueChange5> đồng).");
		this.setSentences("Bên cạnh đó, top các cổ phiếu giảm giá mạnh nhất sàn phiên này có <code1> (giảm <valueChange1> đồng), <code2> (giảm <valueChange2> đồng), <code3> (giảm <valueChange3> đồng), <code4> (giảm <valueChange4> đồng) và <code5> (giảm <valueChange5> đồng).");
	}
	
	@Override
	public void init(Data data) {
		Input[] top = data.getProcessor().top5ValueChangeDecrease();
		this.myMap = (new Rule1()).applyRule(top);
	}
}
