package rules;


import java.util.*;
import data.*;
import pattern.*;


/**
 * Rule dành cho nhóm câu nói về VN-Index.
 * @author Le Trong Dat
 */
public class Rule9 extends Rule{
	@Override
	public Map<String, String> applyRule(Vinput[] today) {
		int i = 0;
		float changePointMorning = today[i].getOpenPrice() - today[i].getYesterdayPoint();
		float changePointAfternoon = today[i].getTodayPoint() - today[i].getOpenPrice();
		float percentChangeMorning = changePointMorning/today[i].getYesterdayPoint()*100;
		float percentChangeAfternoon = changePointAfternoon/today[i].getOpenPrice()*100;
		map.put("changePointMorning", toString(round(changePointMorning)));
		map.put("changePointAfternoon", toString(round(changePointAfternoon)));
		map.put("percentChangeMorning", toString(round(percentChangeMorning)));
		map.put("percentChangeAfternoon", toString(round(percentChangeAfternoon)));
		map.put("morningPoint", toString(today[i].getOpenPrice()));
		map.put("cv", toString(today[i].getPointChange()));
		map.put("klkl", toString(today[i].getCallOptionsVolume()));
		map.put("gtkl", toString(today[i].getCallOptionsValue()));
		map.put("klgd", toString(today[i].getPutOptionsVolume()));
		map.put("gtgd", toString(today[i].getPutOptionsValue()));
		map.put("minPoint", toString(today[i].getMinPrice()));
		map.put("maxPoint", toString(today[i].getMaxPrice()));
		map.put("closePoint", toString(today[i].getTodayPoint()));
		map.put("date", today[i].getDate());
		map.put("cp", toString(today[i].getPercentageChange()));
		return map;
	}
	public float round(float point) {
		return (float)Math.round(point*100)/100;
	}
}
