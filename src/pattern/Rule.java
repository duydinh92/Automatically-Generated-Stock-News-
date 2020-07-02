package pattern;


import java.util.*;
import data.*;


/**
 * Lớp trừu tượng dùng chứa các phương thức mặc định
 * dùng để xây dựng các rule cụ thể cho từng nhóm câu sau này
 * @author Dinh Cong Duy
 */
public abstract class Rule {
	protected Map<String,String> map;
	
	/* Constructor */
	public Rule() {
		map = new HashMap<String,String>();
	}
	
	
	/* Method */
	protected Map<String, String> applyRule(List<Input> inputs) {
		return null;
	}
	
	protected Map<String, String> applyRule(Input[] inputs){
		return null;
	}
	
	protected Map<String, String> applyRule(Input input){
		return null;
	}

	protected Map<String, String> applyRule(Vinput[] todays) {
		return null;
	}
	
	public Map<String, String> applyRule(GroupStock groupStock, Data data) {
		return null;
	}
	
	
	/**
	 * @param x 1 số Float.
	 * @return 1 xâu biểu diễn số Float nhập vào.
	 */
	protected String toString(float x) {
		return Float.toString(Math.abs(x)).replace(".",",");
	}
	
	/**
	 * @param x 1 số nguyên.
	 * @return 1 xâu biểu diễn số nguyên nhập vào
	 * có các phần ngăn cách bởi dấu chấm.
	 */
	protected String toString(int x) {
		StringBuffer str = new StringBuffer(Integer.toString(Math.abs(x)));
		int i = str.length() - 3;
		for(; i > 0; i -= 3) {
			str.insert(i,".");
		}
		return str.toString();
	}
	
	/**
	 * @param change Sự thay đổi về tiêu chí nào đó của mã cổ phiếu.
	 * @return 1 xâu có nội dung là một động từ thích hợp miêu tả sự thay
	 * đổi đó (tăng, giảm, đứng giá).
	 */
	protected String verb(int change) {
		if(change > 0) {
			return "tăng";
		}
		else if (change < 0){
			return "giảm";
		}
		else return "đứng giá";
	}
	
	/**
	 * @param change Sự thay đổi về tiêu chí nào đó của mã cổ phiếu.
	 * @return 1 xâu có nội dung là một trạng từ miêu tả sự thay đổi
	 * đó (nhẹ, khá mạnh, mạnh).
	 */
	protected String adverb(int change) {
		int temp = Math.abs(change);
		if(temp >= 1000)  {
			return "mạnh";
		}
		else if(temp >= 500) {
			return "khá mạnh";
		}
		else return "nhẹ";
	}
	
	/**
	 * @param change Sự thay đổi về tiêu chí nào đó của mã cổ phiếu
	 * @return 1 xâu có nội dung là một giới từ miêu tả sự thay đổi
	 * đó (lên, ở, về).
	 */
	protected String prep(int change) {
		if (change > 0) {
			return "lên";
		}
		else if (change == 0) {
			return "ở";
		}
		else return "về";
	}
}
