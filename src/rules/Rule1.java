package rules;


import java.util.*;
import data.*;
import pattern.*;


/**
 * Rule dành cho các nhóm câu nói về các top cổ phiếu.
 * @author Dinh Cong Duy
 */
public class Rule1 extends Rule{
	@Override
	public Map<String, String> applyRule(Input[] top) {
		String adverb = null;
		for(int i = 0; i < top.length; i++) {
			if(Math.round(top[i].getPercentageChange()) == 7) {
				adverb = "trần";
			}
			else if(Math.round(top[i].getPercentageChange()) == -7) {
				adverb = "sàn";
			}
			else adverb = adverb(top[i].getValueChange());
			
			map.put("code" + (i+1), top[i].getCode());
			map.put("corp" + (i+1), StockInfor.search(top[i].getCode()));
			map.put("verb" + (i+1), verb(top[i].getValueChange()));
			map.put("adverb" + (i+1), adverb);
			map.put("prep" +(i+1), prep(top[i].getValueChange()));
			map.put("percentageChange" +(i+1), toString(top[i].getPercentageChange()));
			map.put("valueChange" +(i+1), toString(top[i].getValueChange()));
			map.put("closingPrice" +(i+1), toString(top[i].getClosingPrice()));
			map.put("callOptionsVolume" + (i+1), toString(top[i].getCallOptionsVolume()));
		}
		return map;
	}
}
