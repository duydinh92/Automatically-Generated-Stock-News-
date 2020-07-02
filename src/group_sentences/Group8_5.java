package group_sentences;

import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về một vài cổ phiếu trong top 20 công ti có giá trị vốn hóa thị trường cao nhất bị đứng giá.
 * @author Luong Cuong Thinh
 */
public class Group8_5 extends Group{
	
	{
		this.setTag("Top 20 công ti có giá trị vốn hóa thị trường cao nhất đứng giá");
		this.setSentences("Kết thúc phiên giao dịch hôm nay, trong top 20 công ti có giá trị vốn hóa thị trường cao nhất, cổ phiếu của vài công ti <prep1> điển hình như: <code1> của <corp1>, <code2> của <corp2>, <code3> của <corp3>") ;
		this.setSentences("Những cổ phiếu <prep3> trong top 20 công ti có giá trị vốn hóa thị trường cao nhất là <code1> của <corp1>, <code2> của <corp2>, <code3> của <corp3>,...");
		this.setSentences("Ngoài ra cổ phiếu của vài công ti trong top 20 công ti có giá trị vốn hóa thị trường cao nhất <prep2> điểm như <code1> của <corp1>, <code2> của <corp2>, <code3> của <corp3>");
	}	
	
	@Override
	public void init(Data data) {
		Input[] input = data.getProcessor().ValueChange();
		this.myMap = (new Rule8()).applyRule(input,"đứng giá");

	}

}
