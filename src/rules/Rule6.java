package rules;


import java.util.*;
import data.*;


/**
 * Rule dành cho nhóm câu nói về một nhóm cổ phiếu.
 * @author LƯơng Cường Thịnh
 */
public class Rule6 extends Rule1{
	@Override
	public Map<String, String> applyRule(GroupStock groupStock, Data data) {
		Input[] top;
		InputProcessor processor = new InputProcessor(data.getInputs());
		int change = processor.changeValueOfGroup(groupStock);
		if(change > 0) {
			top = processor.top4ValueChangeIncreaseInGroup(groupStock);
		}
		else top = processor.top4ValueChangeDecreaseInGroup(groupStock);
		map.put("verb",verb(change));
		map.put("adverb", adverb(change));
		super.applyRule(top);
		
		if(groupStock.getName().equals("Nhóm hàng không")) {
			String linkword = null;
			if(top[0].getValueChange()*top[1].getValueChange() >= 0) {
				linkword = "Tương tự";
			}
			else linkword = "Trong khi đó";
			map.put("Linkword", linkword);
		}
		
		if(groupStock.getName().equals("Họ VinGroup")){
			String statement = null, linkword = null;
			if(top[0].getValueChange()*top[1].getValueChange() > 0) {
				statement = "đồng loạt" + verb(top[0].getValueChange());
			}
			else {
				statement = ": " + top[0].getCode() + " " + verb(top[0].getValueChange()) + " trong khi " + top[1].getCode() + " " + verb(top[1].getValueChange());
			}
			if(top[1].getValueChange()*top[2].getValueChange() > 0) {
				linkword = "cũng";
			}
			else {
				linkword = "thì";
			}
			
			map.put("statement", statement);	
			map.put("linkword",linkword);
		}
		
		return map;
	}
}
