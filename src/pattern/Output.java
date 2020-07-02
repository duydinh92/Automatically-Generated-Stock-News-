package pattern;


import java.util.*;

import gui.GUI;
import data.*;
import group_sentences.*;


/**
 * Lớp chứa các phương thức để tổng hợp các nhóm câu cùng với các tag
 * tương ứng lại, tạo ra format cho việc in ra kết quả trên màn hình.
 * @author Lê Ngọc Anh
 */
public class Output {
	public static String text = "";
	
	/**
	 * Đưa các nhóm câu vào thành một List dùng để duyệt tất cả nhóm câu.
	 */
	public static List<Group> groupList(){
		List<Group> list = new ArrayList<Group>();
		list.add(new VnindexGroup11());
		list.add(new VnindexGroup12());
		list.add(new VnindexGroup13());
		list.add(new VnindexGroup14());
		list.add(new Group2_0());
		list.add(new Group4_0());
		list.add(new Group1_0());
		list.add(new Group1_1());
		list.add(new Group1_2());
		list.add(new Group3_0());
		list.add(new Group3_1());
		list.add(new Group5_0());
		list.add(new Group6_0());
		list.add(new Group6_1());
		list.add(new Group6_2());
		list.add(new Group6_3());
		list.add(new Group6_4());
		list.add(new Group7_0());
		list.add(new Group8_0());
		list.add(new Group8_1());
		list.add(new Group8_2());
		list.add(new Group8_3());
		list.add(new Group8_4());
		list.add(new Group8_5());
		return list;
	}
	
	
	/**
	 * Tạo ra 1 List các nhóm câu được người dùng chọn ra từ các tag
	 * tương ứng với các nhóm câu đó.
	 * @param chosenTags 1 List các tag được người sử dụng chọn để in ra 
	 * câu tương ứng.
	 */
	public static List<Group> chosenGroupList(List<String> chosenTags){
		List<Group> chosenGroupList = new ArrayList<>();
		for(Group each : groupList()){
			if(chosenTags.contains(each.getTag())){
				chosenGroupList.add(each);
			}
		}
		return chosenGroupList;
	}

	
	/**
	 * Từ dữ liệu đầu vào cùng các nhóm câu được lựa chọn, in ra một
	 * xâu gồm tất cả các câu đã được xử lí từ các nhóm đã chọn.
	 * @param chosenGroupList Các nhóm câu được người dùng lựa chọn
	 * @param data Đối tượng dữ liệu đầu vào
	 */
	private static String buildTemplate(List<Group> chosenGroupList, Data data) {
		StringBuilder template = new StringBuilder();
		chosenGroupList.forEach( group ->{
			group.init(data);
			template.append(group.getOutput()+"\n\n");
			//template.append(group.getOutput()+" ");
		});
		return template.toString();
	}
	
	/**
	 * In ra xâu với giới hạn độ dài trên một dòng cho trước.
	 * @param s 		Xâu được nhập vào.
	 * @param lineWidth Độ dài của một câu trên một dòng .
	 */
	
	private static void printOut(String s, int lineWidth){
		int charsWritten = 0;
		for(String w : s.split("\\s+")){
			if (charsWritten + w.length() > lineWidth){
				text = text + "\n";
				charsWritten = 0;
			}
			text = text + w + " ";
			charsWritten += w.length() + 1;

		}
		text = text + "\n\n";
	}
	
	/**
	 * In ra các câu được xử lí theo nhóm câu được người dùng chọn
	 * theo một format mỗi câu giãn cách 2 dòng, độ dài mỗi dòng cho trước.
	 * @param data Đối tượng dữ liệu đầu vào.
	 */
	public static void printPaper(Data data) {
		int lineWidth		= 105;
		String template		= buildTemplate(chosenGroupList(GUI.choosenList), data);
		String[] sentences 	= template.split("\n\n");
		for(String sentence : sentences) {
			printOut(sentence, lineWidth);
			System.out.println("\n\n");
		}
	}
}
