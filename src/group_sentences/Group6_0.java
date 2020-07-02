package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về nhóm ngành ngân hàng.
 * @author LƯơng Cường Thịnh
 */
public class Group6_0 extends Group{
	
	{
		this.setTag("Nhóm cổ phiếu ngân hàng");
		this.setSentences("Trong số các cổ phiếu ngân hàng, <code1> <verb1> <adverb1> <valueChange1> đồng, <code2> <verb2> <valueChange2> đồng, <code3> <verb3> <valueChange3> đồng và <code4> <verb4> <valueChange4> đồng.");
		this.setSentences("Nhóm ngân hàng đáng chú ý có <code1> <verb1> <adverb1> <valueChange1> đồng, <code2> <verb2> <valueChange2> đồng, <code3> <verb3> <valueChange3> đồng và <code4> <verb4> <valueChange4> đồng.");
		this.setSentences("Trong nhóm ngân hàng, <code1> <verb1> <adverb1> <valueChange1> đồng, <code2> <verb2> <valueChange2> đồng, <code3> <verb3> <valueChange3> đồng và <code4> <verb4> <valueChange4> đồng.");
		this.setSentences("Trong khi đó các cổ phiếu ngân hàng <verb> <adverb>: <code1> <verb1> <valueChange1> đồng, <code2> <verb2> <valueChange2> đồng, <code3> <verb3> <valueChange3> đồng và <code4> <verb4> <valueChange4> đồng.");
		this.setSentences("Nhóm cổ phiếu ngân hàng <verb> <adverb> trong hôm nay, <code1> <verb1> <valueChange1> đồng, <code2> <verb2> <valueChange2> đồng, <code3> <verb3> <valueChange3> đồng và <code4> <verb4> <valueChange4> đồng.");		
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule6()).applyRule(new GroupStock("Nhóm ngân hàng",data.getInputs()),data);
	}
}
