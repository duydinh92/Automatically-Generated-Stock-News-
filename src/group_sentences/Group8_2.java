package group_sentences;

import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu về các mã bất kì có sự đứng giá.
 * @author Luong Cuong Thinh
 */
public class Group8_2 extends Group{
	
	{
		this.setTag("Đứng giá");
		this.setSentences("Bên cạnh đó, dòng tiền có vẻ đã <prep1> các cổ phiếu <code1>, <code2>, <code3>, <code4>, <code5>,...") ;
		this.setSentences("Những cổ phiếu <prep3> là <code1> của <corp1>, <code2> của <corp2>, <code3> của <corp3>, <code4> của <corp4>, <code5> của <corp5>,...");
		this.setSentences("Ngoài ra một loạt các cổ phiếu khác <prep2> điểm như <code1> của <corp1>, <code2> của <corp2>, <code3> của <corp3>, <code4> của <corp4>, <code5> của <corp5>,...");
	}	
	
	@Override
	public void init(Data data) {
		Input[] input = data.getProcessor().ValueChange();
		this.myMap = (new Rule8()).applyRule(input,"đứng giá");

	}

}
