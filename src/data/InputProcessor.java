package data;


import java.util.*;



/**
 * Đối tượng cung cấp các phương thức dùng để sắp xếp, lọc
 * các đối tượng Input, Vinput theo các tiêu chí với thự tự mong muốn.
 * @author Dinh Cong Duy
 */
public class InputProcessor {
	
	/**
	 * Trả về một mảng Input đã được sắp theo 1 tiêu chí với thứ tự mong muốn.
	 * @param inputs	 List chứa các đối tượng dữ liệu mã cổ phiếu
	 * @param status	 Trạng thái tiêu chí (tăng hoặc giảm)
	 * @param n			 Số lượng kết quả đầu ra sau khi đã sắp xếp
	 * @param comparator Đối tượng Comparator theo chỉ tiêu cần sắp xếp.
	 */
	private List<Input> inputs;
	
	public InputProcessor(List<Input> inputs) {
		this.inputs = inputs;
	}
	
	/**
	 * @param inputs	 List các phần tử Input đầu vào.
	 * @param status	 Trạng thái tiêu chí cần đánh giá (tăng hoặc giảm)
	 * @param n			 Số lượng cổ phiếu nằm trong top n cổ phiếu
	 * @param comparator Đối tượng Comparator theo tiêu chí cần đánh giá.
	 * @return			 Trả về một mảng gồm top n cổ phiếu theo tiêu chí được đánh giá.
	 */
	private Input[] top(List<Input> inputs, String status, int n, Comparator<Input> comparator) {
		Input[] result = new Input[Math.min(n, inputs.size())];
		ArrayList<Input> temp1 = (ArrayList<Input>) inputs;
		@SuppressWarnings("unchecked")
		ArrayList<Input> temp = (ArrayList<Input>) temp1.clone() ;
		if(n <= inputs.size()) {
			Collections.sort(temp, comparator);
		}
		for(int i = 0; i < Math.min(n,inputs.size()); i++) {
			if(n > inputs.size()) {
				result[i] = temp.get(i);
			}
			else {
				if(status.equals("increase")) {
					result[i] = temp.get(temp.size()-1-i);
				}
				else if(status.equals("decrease")) {
					result[i] = temp.get(i);
				}
				else result[i] = null;
			}
		}
		return result;
	}
	
	private Input[] top(String status, int n, Comparator<Input> comparator) {
		return this.top(inputs, status, n, comparator);
	}

	/**
	 * Trả về mảng Input đã được sắp xếp theo thứ tự giảm
	 * dần về sự tăng giá.
	 */
	public Input[] ValueChange(){
		return top("increase", inputs.size(), new SortByValueChange());
	}
	
	/**
	 * Trả về mảng có 60 đối tượng Input có sự tăng giá lớn nhất
	 * được sắp xếp theo chiều giảm dần.
	 */
	public Input[] top60ValueChangeIncrease(){
		return top("increase", 60, new SortByValueChange());
	}
	
	/**
	 * Trả về mảng có 60 đối tượng Input có sự giảm giá lớn nhất
	 * được sắp xếp theo chiều giảm dần.
	 */
	public Input[] top60ValueChangeDecrease(){
		return top("decrease", 60, new SortByValueChange());
	}
	
	/**
	 * Trả về mảng có 5 đối tượng Input có sự tăng giá lớn nhất
	 * được sắp xếp theo chiều giảm dần.
	 */
	public Input[] top5ValueChangeIncrease(){
		return top("increase", 5, new SortByValueChange());
	}
	
	/**
	 * Trả về mảng có 60 đối tượng Input có sự giảm giá lớn nhất
	 * được sắp xếp theo chiều giảm dần.
	 */
	public Input[] top5ValueChangeDecrease(){
		return top("decrease", 5, new SortByValueChange());
	}
	
	/**
	 * Trả về đối tượng Input tăng giá mạnh nhất.
	 */
	public Input topValueChangeIncrease() {
		Input result = top("increase", 1, new SortByValueChange())[0];
		return result;
	}
	
	/**
	 * Trả về đối tượng Input giảm giá mạnh nhất.
	 */
	public Input topValueChangeDecrease() {
		Input result = top("decrease", 1, new SortByValueChange())[0];
		return result;
	}
	
	
	/**
	 * Trả về mảng 3 đối tượng Input có khối lượng
	 * khớp lệnh lớn nhất sắp xếp theo thứ tự giảm dần.
	 */
	public Input[] top3CallOptionsVolume(){
		return top("increase", 3, new SortByCallOptionsVolume());
	}
	
	/**
	 * Trả về mảng 3 đối tượng Input có khối lượng
	 * khớp lệnh nhỏ nhất sắp xếp theo thứ tự giảm dần.
	 */
	public Input topCallOptionsValue(){
		Input result = top("increase", 1, new SortByCallOptionsValue())[0];
		return result;
	}
	
	/**
	 * Trả về mảng 20 đối tượng Input có giá trị vốn hóa
	 * thị trường lớn nhất theo thứ tự giảm dần.
	 */
	public Input[] top20MarketValue(){
		return top("increase", 20, new SortByMarketValue());
	}
	
	/**
	 * Trả về vị trí của đối tượng Input cần xét nằm trong
	 * dãy đã sắp xếp có nó theo 1 tiêu chí nào đó.
	 */
	public int indexOfTopCallOptionsValue() {
		ArrayList<Input> temp1 = (ArrayList<Input>) inputs;
		@SuppressWarnings("unchecked")
		ArrayList<Input> temp = (ArrayList<Input>) temp1.clone() ;
		Input top = topCallOptionsValue();
		Collections.sort(temp, new SortByCallOptionsVolume());
		return inputs.size()- temp.indexOf(top);
	}
	
	
	/**
	 * Trả về tỉ lệ gia tăng giá trị trong nhóm ngành.
	 * @param groupStock Nhóm ngành cần tính toán.
	 */
	public int changeValueOfGroup(GroupStock groupStock) {
		long a = 0,b = 0;
		List<Input> members = groupStock.getMembers();
		for (Input member : members) {
			a += member.getValueChange()*member.getMarketValue();
			b += member.getMarketValue();
		}
 		return (int) (a/b);
	}
	
	/**
	 * Trả về mảng 4 Input có sự gia tăng giá trị lớn nhất trong nhóm ngành
	 * theo thứ tự giảm dần.
	 * @param groupStock Nhóm ngành cần xét.
	 */
	public Input[] top4ValueChangeIncreaseInGroup(GroupStock groupStock) {
		return top(groupStock.getMembers(), "increase", 4, new SortByValueChange());
	}
	
	/**
	 * Trả về mảng 4 Input có sự sụt giảm giá trị lớn nhất trong nhóm ngành
	 * theo thứ tự giảm dần.
	 * @param groupStock Nhóm ngành cần xét.
	 */
	public Input[] top4ValueChangeDecreaseInGroup(GroupStock groupStock) {
		return top(groupStock.getMembers(), "decrease", 4, new SortByValueChange());
	}

	//Test
	/*public static void main(String[] args) {
		String path = "C:\\Users\\Phong Vu\\eclipse-workspace\\Project\\data\\stock_code_07-04-2020.csv";
		List<Input> inputs = ReadFile.readInput(path);
		System.out.println(InputProcessor.top5ValueChangeDecrease(inputs)[1].getClosingPrice());
		GroupStock groupStock = new GroupStock("Bluechip VN30", inputs);
		System.out.println(changeValueOfGroup(groupStock));*/
		
	
}


