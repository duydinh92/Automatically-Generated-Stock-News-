package rules;


import java.util.*;
import data.*;
import pattern.*;


/**
 * Rule dành cho nhóm câu nói về thông tin cổ phiếu.
 * @author Dinh Cong Duy 
 */
public class Rule3 extends Rule{
	@Override
	public Map<String, String> applyRule(Input input) {
		map.put("code", input.getCode());
		map.put("corp", StockInfor.search(input.getCode()));
		map.put("percentageChange", toString(input.getPercentageChange()));
		map.put("valueChange", toString(input.getValueChange()));
		map.put("referencePrice", toString(input.getReferencePrice()));
		map.put("closingPrice", toString(input.getClosingPrice()));
		map.put("callOptionsVolume", toString(input.getCallOptionsVolume()));
		map.put("callOptionsValue", toString(input.getCallOptionsValue()));
		return map;
	}
}
