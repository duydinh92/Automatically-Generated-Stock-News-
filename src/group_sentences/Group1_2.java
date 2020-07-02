package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về top 3 cổ phiếu có khối lượng khớp lệnh lớn nhất.
 * @author Dinh Cong Duy
 */
public class Group1_2 extends Group{
	
	{	
		this.setTag("Top 3 khối lượng khớp lệnh");
		this.setSentences("Về khối lượng giao dịch, <code1>, <code2> và <code3> nằm trong Top các cổ phiếu giao dịch nhiều nhất sàn, trong đó mức cao nhất thuộc về <code1> của <corp1> với <callOptionsVolume1> đơn vị được chuyển nhượng.");
		this.setSentences("Giao dịch tăng mạnh tại các mã thanh khoản nhất thị trường như <code1> (cả phiên có gần <callOptionsVolume1> triệu cổ phiếu được khớp), <code2> và <code3> cũng có lượng khớp lệnh hơn <callOptionsVolume3> triệu đơn vị/mã.");
		this.setSentences("Về khối lượng khớp lệnh, <code1> của <corp1> vẫn tiếp tục duy trì tính thanh khoản của mình với <callOptionsVolume1> triệu cổ phiếu được chuyển nhượng thành công, cũng trong phiên này <code2> của <corp2> được giao dịch mạnh với <callOptionsVolume2> triệu, tiếp đến là <code3> của <corp3> với <callOptionsVolume3> triệu đơn vị được chuyển nhượng.");
	}
	
	@Override
	public void init(Data data) {
		Input[] top = data.getProcessor().top3CallOptionsVolume();
		this.myMap = (new Rule1()).applyRule(top);
	}
}
