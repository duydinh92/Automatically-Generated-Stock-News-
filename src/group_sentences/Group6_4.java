package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về cổ phiếu họ VinGroup.
 * @author LƯơng Cường Thịnh
 */
public class Group6_4 extends Group{
	
	{
		this.setTag("Nhóm cổ phiếu họ VinGroup");
		this.setSentences("Cùng \"họ Vingroup\" thì <code1> của <corp1>  <verb1> <percentageChange1>% <prep1> mức  <closingPrice1> đồng, <code2> của <corp2> <verb2> <percentageChange2>% <prep2> mức <closingPrice2>, còn <code3> của <corp3> <verb3> <percentageChange3>% <prep3> <closingPrice3> đồng.");
		this.setSentences("Đáng lưu ý, hai mã cổ phiếu có giá trị vốn hóa dẫn đầu thị trường chứng khoán Việt Nam là VIC của Tập đoàn Vingroup và VHM của Vinhomes <statement>. Mã cùng họ nhà Vin khác là VRE của Vincom Retail <linkword> <verb3>. Cụ thể, mã <code1> <verb1> <valueChange1> đồng, <prep1> mức <closingPrice1> đồng/cổ phiếu. Mã <code2> <verb2> <valueChange2> đồng, <prep2> <closingPrice2> đồng/cổ phiếu. Mã <code3> <verb3> <valueChange3> đồng, <prep3> <closingPrice3> đồng/cổ phiếu.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule6()).applyRule(new GroupStock("Họ VinGroup",data.getInputs()),data);
	}
}
