package rules;


import java.util.*;
import data.*;


/**
 * Rule dành cho nhóm câu nói về nhóm cổ phiếu bluechip VN30.
 * @author LƯơng Cường Thịnh
 */
public class Rule7 extends Rule2{
	@Override
	// Câu 1
	public Map<String, String> applyRule(GroupStock groupStock, Data data) {
		Vinput[] todays = data.getVinput();
		InputProcessor processor = new InputProcessor(data.getInputs());
		String gverb1 = "tăng", gverb2 = "giảm";
		String gadverb = "khá tích cực";
		super.applyRule(groupStock.getMembers());
		if(Integer.parseInt(map.get("tang")) < Integer.parseInt(map.get("giam"))){
			String temp = map.get("tang");
			map.put("tang", map.get("giam"));
			map.put("giam",temp);
			temp = gverb2;
			gverb2 = gverb1;
			gverb1 = temp;
			gadverb = "khá tiêu cực";
		}
		map.put("gverb1", gverb1);
		map.put("gverb2", gverb2);
		map.put("gadverb", gadverb);
		//Câu 2
		map.put("gverb3", verb(todays[0].getValueChange()));
		Input[] top1 = processor.top4ValueChangeIncreaseInGroup(groupStock);
		Input[] top2 = processor.top4ValueChangeDecreaseInGroup(groupStock);
		if(todays[0].getValueChange() < 0) {
			Input[] temp = top1;
			top1 = top2;
			top2 = temp;
		}
		for(int i = 0; i < 4; i++) {
			map.put("code" + (i+1), top1[i].getCode());
			map.put("verb" + (i+1), verb(top1[i].getValueChange()));
			map.put("valueChange" + (i+1), toString(top1[i].getValueChange()));
		}
		//Câu 3
		map.put("gverb4", verb(-todays[0].getValueChange()));
		for(int i = 0; i < 4; i++) {
			map.put("code" + (i+5), top2[i].getCode());
			map.put("verb" + (i+5), verb(top2[i].getValueChange()));
			map.put("valueChange" + (i+5), toString(top2[i].getValueChange()));
		}
		return map;
	}
}
