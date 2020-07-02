package csvparsers;


import java.util.*;


/**
 * Lấy số liệu từ mỗi dòng trong bảng số liệu
 * @author Nguyễn Thành Long
 */
public class GetContent {
	
	/**
	 * Trả về một List có các phần tử tương ứng là các số liệu từ từng cột
	 * của bảng số liệu được lấy ra từ mỗi dòng.
	 * @param line 1 String chứa dữ liệu từ bảng số liệu cần được phân tách ra 
	 * thành các số liệu theo cột tương ứng. 
	 */
	static List<String> getContent(String line) {
		
		/* List<String> kết quả */
	    List<String> result = new ArrayList<>();
	    
	    /* 1 stack để chứa dấu mở ngoặc câu */
	    Stack<Character> stack = new Stack<>();
	    
	    /* 1 StringBuilder tạm thời dùng để xếp các kí tự của từng số liệu */
	    StringBuilder str = new StringBuilder();
	    
	    
	    for (int i = 0; i < line.length(); i++) {
	        char ch = line.charAt(i);
	        if (ch == '\"') {
	            if ((str.length() > 0) && (stack.size() % 2 == 0)) {
	            	str.append(ch);   
	            }
	            stack.push(ch);
	        } else if ((ch == ',') && (stack.size() % 2 == 0)) {
	            result.add(str.toString().trim());
	            stack.clear();
	            str = new StringBuilder();
	        } else if ((ch == ',') && (stack.size() % 2 != 0)) {
	            str.append(ch);
	        } else {
	           str.append(ch);
	        }
	    }
	    result.add(str.toString());
	    return result;
	}
}

