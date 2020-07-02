package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về cổ phiếu thủy sản.
 * @author LƯơng Cường Thịnh
 */
public class Group6_3 extends Group{
	
	{
		this.setTag("Nhóm cổ phiếu thủy sản");
		this.setSentences("Nhóm cổ phiếu thủy sản <verb> <adverb> với <code1> <verb1> <adverb1> <valueChange1> đồng, <code2> <verb2> <adverb2> <valueChange2> đồng, <code3> <verb3> <adverb3> <valueChange3> đồng.");
		this.setSentences("Một số doanh nghiệp thủy sản đang <verb> giá <adverb> như <code1> <verb1> <adverb1> <valueChange1> đồng, <code2> <verb2> <adverb2> <valueChange2> đồng, <code3> <verb3> <adverb3> <valueChange3> đồng.");
		
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule6()).applyRule(new GroupStock("Nhóm thủy sản",data.getInputs()),data);
	}
}
