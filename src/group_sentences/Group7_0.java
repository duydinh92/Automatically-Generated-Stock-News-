package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về nhóm cổ phiếu bluechip VN30.
 * @author LƯơng Cường Thịnh
 */
public class Group7_0 extends Group{
	
	{
		this.setTag("Nhóm cổ phiếu bluechip VN30");
		this.setSentences("Nhóm cổ phiếu VN30 <gverb1> hơn <tang> mã, chỉ còn <giam> mã <gverb2>. "
				+ "Các bluechips đáng chú ý kéo VN-Index <gverb3> điểm là <code1> <verb1> <valueChange1> đồng/cp, <code2> <verb2> <valueChange2> đồng/cp, <code3> <verb3> <valueChange3> đồng/cp và <code4> <verb4> <valueChange4> đồng/cp. "
				+ "Trong khi đó, nhóm các cổ phiếu khác trong VN30 <gverb4> giá như <code5> <verb5> <valueChange5> đồng, <code6> <verb6> <valueChange6> đồng, <code7> <verb7> <valueChange7> đồng và <code8> <verb8> <valueChange8> đồng,...");
		this.setSentences("Nhóm cổ phiếu VN30 giao dịch <gadverb> khi có tới <tang> mã <gverb1> và chỉ <giam> mã <gverb2>. "
				+ "Các bluechips đáng chú ý kéo VN-Index <gverb3> điểm là <code1> <verb1> <valueChange1> đồng/cp, <code2> <verb2> <valueChange2> đồng/cp, <code3> <verb3> <valueChange3> đồng/cp và <code4> <verb4> <valueChange4> đồng/cp. "
				+ "Ở diễn biến ngược lại trong nhóm, <code5> <verb5> <valueChange5> đồng, <code6> <verb6> <valueChange6> đồng, <code7> <verb7> <valueChange7> đồng và <code8> <verb8> <valueChange8> đồng,...");
		this.setSentences("Rổ VN30 có đến <tang> mã <gverb1>, <dung> mã đứng và chỉ có <giam> mã <gverb2> giá. "
				+ "Các bluechips đáng chú ý kéo VN-Index <gverb3> điểm là <code1> <verb1> <valueChange1> đồng/cp, <code2> <verb2> <valueChange2> đồng/cp, <code3> <verb3> <valueChange3> đồng/cp và <code4> <verb4> <valueChange4> đồng/cp. "
				+ "Các cổ phiếu bluechips khác trong nhóm <gverb4> giá là <code5> <verb5> <valueChange5> đồng, <code6> <verb6> <valueChange6> đồng, <code7> <verb7> <valueChange7> đồng và <code8> <verb8> <valueChange8> đồng,...");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule7()).applyRule(new GroupStock("Bluechip VN30",data.getInputs()), data);
	}
}
