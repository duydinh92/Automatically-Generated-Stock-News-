package rules;


import java.util.*;
import data.*;


/**
 * Rule dành cho nhóm câu nói về top giá trị khớp lệnh.
 * @author LƯơng Cường Thịnh
 */
public class Rule5 extends Rule3{
	@Override
	public Map<String, String> applyRule(List<Input> inputs){
		InputProcessor processor = new InputProcessor(inputs);
		Input top = processor.topCallOptionsValue();
		map.put("index",toString(processor.indexOfTopCallOptionsValue()));
		super.applyRule(top); // rule infor của một cổ phiếu
		return map;
	}
}
