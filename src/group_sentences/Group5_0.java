package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu về một mã phiếu nằm trong top khối lượng khớp lệnh lớn nhất.
 * @author LƯơng Cường Thịnh
 */
public class Group5_0 extends Group{
	
	{
		this.setTag("Mã top gtgd");
		this.setSentences("Với gần <callOptionsVolume> triệu cổ phiếu được khớp lệnh trong phiên này, <code> của <corp> nằm trong top <index> cổ phiếu có khối lượng khớp lệnh nhiều nhất và dẫn đầu toàn sàn về giá trị giao dịch khớp lệnh với <callOptionsValue> tỷ đồng.");
		this.setSentences("Trong phiên này, <code> của <corp> dẫn đầu toàn sàn về giá trị giao dịch khớp lệnh với <callOptionsValue> tỷ đồng và nằm trong top <index> cổ phiếu có khối lượng khớp lệnh nhiều nhất với gần <callOptionsVolume> triệu cổ phiếu được khớp lệnh.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule5()).applyRule(data.getInputs());
	}
}
