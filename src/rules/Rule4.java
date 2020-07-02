package rules;


import java.util.*;
import data.*;
import pattern.*;


/**
 * Rule dành cho nhóm câu nói về VN-Index.
 * @author LƯơng Cường Thịnh
 */
public class Rule4 extends Rule{
	@Override
	public Map<String, String> applyRule(Vinput[] todays) {
		int volumeChange = Math.round((todays[0].getTotalTradingVolume()/todays[1].getTotalTradingVolume()-1)*100);
		int valueChange = Math.round(((float) todays[0].getTotalTradingValue()/todays[1].getTotalTradingValue()-1)*100);
		String verb1 = verb(volumeChange);
		String verb2 = verb(valueChange);
		String linkword = null;
		if(verb1.equals(verb2)) {
			linkword = "và";
		}
		else linkword = "nhưng";
		
		map.put("callOptionsVolume", toString(todays[0].getCallOptionsVolume()));
		map.put("callOptionsValue", toString(todays[0].getCallOptionsValue()));
		map.put("putOptionsVolume", toString(todays[0].getPutOptionsVolume()));
		map.put("putOptionsValue", toString(todays[0].getPutOptionsValue()));
		map.put("totalTradingVolume", toString(todays[0].getTotalTradingVolume()));
		map.put("totalTradingValue", toString(todays[0].getTotalTradingValue()));
		map.put("volumeChange", toString(volumeChange));
		map.put("valueChange", toString(valueChange));
		map.put("linkword", linkword);
		map.put("verb1", verb1);
		map.put("verb2", verb2);
		return map;
	}
}
