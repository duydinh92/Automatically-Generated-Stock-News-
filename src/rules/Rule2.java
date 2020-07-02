package rules;


import java.util.*;
import data.*;
import pattern.*;


/**
 * Rule dành cho nhóm câu nói về số lượng cổ phiếu tăng giảm.
 * @author Dinh Cong Duy
 */
public class Rule2 extends Rule{
	@Override
	public Map<String, String> applyRule(List<Input> inputs) {
		int tang = 0, dung = 0, giam = 0, tangTran = 0, giamSan = 0;
		String verb = null;
		for(Input input : inputs) {
			if(input.getPercentageChange() > 0) {
				tang ++;
				if (Math.round(input.getPercentageChange()) == 7) {
					tangTran ++;
				}
			}
			else if(input.getPercentageChange() == 0) {
				dung ++;
			}
			else {
				giam ++;
				if(Math.round(input.getPercentageChange()) == -7) {
					giamSan ++;
				}
			}
		}
		if(tang > giam ) {
			verb = "nhiều";
		}
		else if(tang < giam) {
			verb = "ít";
		}
		map.put("verb", verb);
		map.put("tang", toString(tang));
		map.put("giam", toString(giam));
		map.put("tong", toString(inputs.size()));
		map.put("tang-giam", toString(tang - giam));
		map.put("dung", toString(dung));
		map.put("tangTran", toString(tangTran));
		map.put("giamSan", toString(giamSan));
		return map;
	}
}
