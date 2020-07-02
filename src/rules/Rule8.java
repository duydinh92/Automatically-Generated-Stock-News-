package rules;


import java.util.*;
import data.*;
import pattern.*;


/**
 * Rule dành cho nhóm câu nói về nhóm cổ phiếu có sự thay đổi về các mặt.
 * @author LƯơng Cường Thịnh
 */
public class Rule8 extends Rule {
	public Map<String, String> applyRule(Input[] input, String status){
		List<Integer> j = new ArrayList<Integer>();
		for(int i = 0; i < input.length; i++) j.add(i,i);
		Collections.shuffle(j);
		int count = 0;
		for(int i = 0; i < input.length; i++) {
				int index = j.get(i);
				while (!( verb(input[index].getValueChange()).equals(status) ) && (i<input.length-1) ) index = j.get(++i);
				if (i == input.length) break;
				map.put("code" + (count+1), input[index].getCode());
				map.put("corp" + (count+1), StockInfor.search(input[index].getCode()));
				map.put("verb" + (count+1), verb(input[index].getValueChange())); 
				map.put("adverb" + (count+1), adverb(input[index].getValueChange()));
				map.put("percentageChange" +(count+1), toString(input[index].getPercentageChange()));
				map.put("valueChange" +(count+1), toString(input[index].getValueChange()));
				map.put("closingPrice" +(count+1), toString(input[index].getClosingPrice()));
				map.put("callOptionsVolume" + (count+1), toString(input[index].getCallOptionsVolume()));
				count ++;
		}
		if (status.equals("tăng")) {
			map.put("prep1", "quay trở lại");
			map.put("prep2", "tăng");
			map.put("prep3", "tăng giá");
		}
		else if (status.equals("giảm")) {
			map.put("prep1", "rời khỏi");
			map.put("prep2", "mất");
			map.put("prep3", "mất giá");
		}else if (status.equals("đứng giá")) {
			map.put("prep1", "đã đứng giá");
			map.put("prep2", "mất");
			map.put("prep3", "đứng giá");
		}
		return map;
	}
	
}
