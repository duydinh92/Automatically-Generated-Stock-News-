package group_sentences;

import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu về các mã bất kì có sự tăng giá.
 * @author Luong Cuong Thinh
 */
public class Group8_1 extends Group{
	
	{
		this.setTag("Tăng giá");
		this.setSentences("Bên cạnh đó, dòng tiền có vẻ đã <prep1> các cổ phiếu <code1>, <code2>, <code3>, <code4>, <code5>,... Trong đó các <code1> <verb1> <adverb1> (<valueChange1> đ tương ứng <percentageChange1> %), <code2> <verb2> <adverb2> (<valueChange2> đ tương ứng <percentageChange2> %), <code3> <verb3> <adverb3> (<valueChange3> đ tương ứng <percentageChange3> %), <code4> <verb4> <adverb4> (<valueChange4> đ tương ứng <percentageChange4> %), <code5> <verb5> <adverb5> (<valueChange5> đ tương ứng <percentageChange5> %)");
		this.setSentences("Những cổ phiếu <prep3> là <code1> (<verb1> <adverb1> <valueChange1> tương ứng <percentageChange1> %), <code2> (<verb2> <adverb2> <valueChange2> tương ứng <percentageChange2> %), <code3> (<verb3> <adverb3> <valueChange3> tương ứng <percentageChange3> %), <code4> (<verb4> <adverb4> <valueChange4> tương ứng <percentageChange4> %), <code5> (<verb5> <adverb5> <valueChange5> tương ứng <percentageChange5> %),...");
		this.setSentences("Ngoài ra một loạt các cổ phiếu khác <prep2> điểm như <code1> (<verb1> <adverb1> <valueChange1> tương ứng <percentageChange1> %), <code2> (<verb2> <adverb2> <valueChange2> tương ứng <percentageChange2> %), <code3> (<verb3> <adverb3> <valueChange3> tương ứng <percentageChange3> %), <code4> (<verb4> <adverb4> <valueChange4> tương ứng <percentageChange4> %), <code5> (<verb5> <adverb5> <valueChange5> tương ứng <percentageChange5> %),...");
	}	
	
	@Override
	public void init(Data data) {
		Input[] inc = data.getProcessor().top60ValueChangeIncrease();
		this.myMap = (new Rule8()).applyRule(inc,"tăng");
	}
}
