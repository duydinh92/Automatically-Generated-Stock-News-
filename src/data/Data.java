package data;


import java.util.*;


/**
 * Một lớp để chứa toàn bộ các dối tượng dữ liệu về các mã cổ phiếu, VN-Index
 * và đối tượng dùng để xử lí các dữ liệu trong các đối tượng dữ liệu.
 * @author Dinh Cong Duy
 */
public class Data {
	private List<Input> inputs;
	private Vinput[] todays;
	private InputProcessor processor;
	
	public Data(List<Input> inputs, Vinput[] todays) {
		this.inputs = inputs;
		this.todays = todays;
		processor = new InputProcessor(inputs);
	}
	
	public List<Input> getInputs() {
		return this.inputs;
	}
	
	public Vinput[] getVinput() {
		return this.todays;
	}
	
	public InputProcessor getProcessor() {
		return processor;
	}
}
