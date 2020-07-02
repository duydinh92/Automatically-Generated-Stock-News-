package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về nhóm ngành dầu khí.
 * @author LƯơng Cường Thịnh
 */
public class Group6_1 extends Group{
	
	{
		this.setTag("Nhóm cổ phiếu dầu khí");
		this.setSentences("Nhóm cổ phiếu dầu khí <verb> điểm với <code1> <verb1> <adverb1> <valueChange1> đồng, <code2> <verb2> <valueChange2> đồng, <code3> <verb3> <valueChange3> đồng và <code4> <verb4> <valueChange4> đồng.");
		this.setSentences("Bên cạnh đó, nhóm cổ phiếu dầu khí <verb> <adverb> với <code1> <verb1> <adverb1> <valueChange1> đồng, <code2> <verb2> <valueChange2> đồng, <code3> <verb3> <valueChange3> đồng và <code4> <verb4> <valueChange4> đồng.");
		this.setSentences("Tại nhóm dầu khí, <code1> <verb1> <adverb1> <valueChange1> đồng, <code2> <verb2> <valueChange2> đồng, <code3> <verb3> <valueChange3> đồng và <code4> <verb4> <valueChange4> đồng.");
		
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule6()).applyRule(new GroupStock("Nhóm dầu khí",data.getInputs()),data);
	}
}
