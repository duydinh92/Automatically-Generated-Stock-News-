package pattern;


import java.util.*;
import data.*;


/**
 * Một lớp trừu tượng chứa các thuộc tính và phương thức mặc định
 * đùng để xây dựng các nhóm câu cụ thể sau này.
 * @author Dinh Cong Duy
 */
public abstract class Group{

	protected Map<String,String> myMap;
	private List<String> sentences;
	private String output;
	private Random myRandom;
	private String tag;
	
	
	/* Constructor */
	public Group() {
		myMap	 	= new HashMap<String,String>();
		sentences 	= new ArrayList<String>();
		myRandom 	= new Random();
	}
	
	/**
	 * Phương thức trừu tượng dùng để khởi tạo dữ liệu.
	 * @param data Đối tượng dữ liệu đầu vào
	 */
	protected abstract void init(Data data);
	
	/**
	 * Thêm một câu vào nhóm câu của nhóm câu.
	 * @param s 1 xâu chứa nội dung của câu cần thêm.
	 */
	protected void setSentences(String s) {
		this.sentences.add(s);
	}
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	/* Sub methods use in the order shown below to get output */
	
	/**
	 * Lấy xâu value từ xâu nhãn nhập vào.
	 * @param label 1 xâu có chức năng là nhãn được 
	 * sử dụng trong mẫu câu tổng quát.
	 * @return 1 xâu là value ứng với key là nhãn nhập vào.
	 */
	private String getSubstitute(String label) {
		return myMap.get(label);
	}
	
	/**
	 * Xử lí từ trong 1 mẫu câu tổng quát.
	 * @param word Từ trong mẫu câu tổng quát cần được xử lí.
	 * @return Nếu đó là 1 từ bình thường thì trả về xâu
	 * có nội dung là từ đó. Nếu đó là 1 nhãn thì trả về xâu value
	 * tương ứng với key là nhãn đó.
	 */
	private String processWord(String word){
		int first = word.indexOf("<");
		int last  = word.indexOf(">", first);
		if ((first == -1) || (last == -1)){
			return word;
		}
		String prefix = word.substring(0, first);
		String suffix = word.substring(last+1);
		String sub 	  = getSubstitute(word.substring(first+1, last));
		return prefix + sub + suffix;
	}
	
	/**
	 * Xử lí một câu tổng quát bằng cách xử lí từng từ.
	 * @param sentence Câu tổng quát cần được xử lí
	 * @return Câu với các từ đã qua xử lí.
	 */
	private String processSentence(String sentence){
		StringBuilder result = new StringBuilder();
		String[] words 		 = sentence.split("\\s+");
		for(String word : words){
			result.append(processWord(word)).append(" ");
		}
		return result.toString();
	}
	
	/**
	 * Chọn một câu ngẫu nhiên từ nhóm câu tổng quát để xử lí câu.
	 * @param sentences 1 List có các phần tử là các câu tổng quát
	 * trong cùng 1 nhóm câu.
	 * @return 1 câu ngẫu nhiên được chọn từ nhóm câu.
	 */
	private String randomFrom(List<String> sentences){
		int index = myRandom.nextInt(sentences.size());
		return sentences.get(index);
	}
	
	/**
	 * Xử lí câu ngẫu nhiên đã được chọn.
	 * @return Câu ngẫu nhiên đã được xử lí
	 */
	public String getOutput() {
		this.output = processSentence(randomFrom(this.sentences));
		return this.output;
	}

}
