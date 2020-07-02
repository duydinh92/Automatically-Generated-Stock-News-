package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về nhóm ngành hàng không.
 * @author LƯơng Cường Thịnh
 */
public class Group6_2 extends Group{
	
	{
		this.setTag("Nhóm cổ phiếu hàng không");
		this.setSentences("Ở nhóm hàng không, <code1> của <corp1> <verb1> đến <percentageChange1>% <prep1> mức <closingPrice1> đồng/cp. <Linkword>, <code2> của <corp2> <verb2> <percentageChange2>% <prep2> mức <closingPrice2> đồng/cp.");
		this.setSentences("Nhóm cổ phiếu hàng không đáng chú ý có mã <code1> của <corp1> <verb1> đến <percentageChange1>% <prep1> mức giá <closingPrice1> đồng. <Linkword>, cổ phiếu của <corp2> (mã <code2>) <verb2> <percentageChange2>% <prep2> mức giá <closingPrice2> đồng/cổ phiếu.");
		this.setSentences("Tại nhóm cổ phiếu hàng không, cổ phiếu <code1> đã <verb1> <valueChange1> đồng (tương ứng <percentageChange1>%) trên mỗi cổ phiếu, <prep1> mức giá <closingPrice1> đồng. <Linkword>, cổ phiếu <code2> của <corp2> phiên hôm nay <verb2> đến <percentageChange2>%, giá hiện tại <closingPrice2> đồng/cổ phiếu.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule6()).applyRule(new GroupStock("Nhóm hàng không",data.getInputs()),data);
	}
}
