/*
 * Chứa các class để so sánh các tiêu chí trong một mã cổ phiếu.
 */

package data;


import java.util.*;


/**
 * Class dùng để sắp xếp sự gia tăng theo giá trị.
 * @author Dinh Cong Duy
 */
class SortByValueChange implements Comparator<Input>{
	@Override
	public int compare(Input input1,Input input2) {
		if(input1.getValueChange() != input2.getValueChange()) {
			return input1.getValueChange() - input2.getValueChange();
		}
		else return ((Float)input1.getPercentageChange()).compareTo((Float) input2.getPercentageChange());
	}
}


/**
 * Class dùng để sắp xếp sự gia tăng về tỉ lệ.
 * @author Dinh Cong Duy
 */
class SortByPercentageChange implements Comparator<Input>{
	@Override
	public int compare(Input input1,Input input2) {
		if(input1.getPercentageChange() != input2.getPercentageChange()) {
			return ((Float)input1.getPercentageChange()).compareTo((Float) input2.getPercentageChange());
		}
		else return input1.getValueChange() - input2.getValueChange();
	}
}


/**
 * Class dùng để sắp xếp độ lớn về khối lượng khớp lệnh.
 * @author Dinh Cong Duy
 */
class SortByCallOptionsVolume implements Comparator<Input>{
	@Override
	public int compare(Input input1,Input input2) {
		return ((Float)input1.getCallOptionsVolume()).compareTo((Float) input2.getCallOptionsVolume());
	}
}

/**
 * Class dùng để sắp xếp độ lớn về giá trị khớp lệnh.
 * @author Dinh Cong Duy
 */
class SortByCallOptionsValue implements Comparator<Input>{
	@Override
	public int compare(Input input1,Input input2) {
		return input1.getCallOptionsValue() - input2.getCallOptionsValue();
	}
}


/**
 * Class dùng để sắp xếp độ lớn về giá trị vốn hóa thị trường.
 * @author Luong Cuong Thinh
 */
class SortByMarketValue implements Comparator<Input>{
	@Override
	public int compare(Input input1,Input input2) {
		return input1.getMarketValue() - input2.getMarketValue();
	}
}
