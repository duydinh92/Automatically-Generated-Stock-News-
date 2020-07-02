package group_sentences;

import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về một vài công ti trong top 20 công ti có giá trị vốn hóa thị trường cao nhất tăng giá.
 * @author Luong Cuong Thinh
 */
public class Group8_3 extends Group{

	{
		this.setTag("Top 20 công ti có giá trị vốn hóa thị trường cao nhất tăng giá");
		this.setSentences("Đến cuối phiên, dòng tiền có vẻ đã <prep1> với các cổ phiếu của top 20 công ti có giá trị vốn hóa thị trường cao nhất như: <code1> của <corp1>, <code2> của <corp2>, <code3> của <corp3>, <code4> của <corp4>, <code5> của <corp5>,... Trong đó các <code1> <verb1> <adverb1> (<valueChange1> đ tương ứng <percentageChange1> %), <code2> <verb2> <adverb2> (<valueChange2> đ tương ứng <percentageChange2> %), <code3> <verb3> <adverb3> (<valueChange3> đ tương ứng <percentageChange3> %)");
		this.setSentences("Cổ phiếu của những công ti trong top 20 công ti có giá trị vốn hóa thị trường cao nhất đã <prep3> là <code1> của <corp1> (<verb1> <adverb1> <valueChange1> tương ứng <percentageChange1> %), <code2> của <corp2> (<verb2> <adverb2> <valueChange2> tương ứng <percentageChange2> %), <code3> của <corp3> (<verb3> <adverb3> <valueChange3> tương ứng <percentageChange3> %),...");
		this.setSentences("Ngoài ra một loạt các cổ phiếu của top 20 công ti có giá trị vốn hóa thị trường cao nhất <prep2> điểm như <code1> của <corp1> (<verb1> <adverb1> <valueChange1> tương ứng <percentageChange1> %), <code2> của <corp2> (<verb2> <adverb2> <valueChange2> tương ứng <percentageChange2> %), <code3> của <corp3> (<verb3> <adverb3> <valueChange3> tương ứng <percentageChange3> %), ...");
	}	
	
	@Override
	public void init(Data data) {
		Input[] inc = data.getProcessor().top20MarketValue();
		this.myMap = (new Rule8()).applyRule(inc,"tăng");
	}
	
}
