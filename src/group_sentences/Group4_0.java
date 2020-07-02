package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về khối lượng khớp lệnh, giá trị khớp lệnh của sàn HOSE.
 * @author LƯơng Cường Thịnh
 */
public class Group4_0 extends Group{
	
	{
		this.setTag("Klgd, gtgd của sàn hose");
		this.setSentences("Tổng KLGD trên sàn HoSE hôm nay <verb1> với <totalTradingVolume> triệu cổ phiếu, tương đương <totalTradingValue> tỷ đồng, trong đó giao dịch thỏa thuận đã lên tới <putOptionsVolume> triệu cổ phiếu, tương đương <putOptionsValue> tỷ đồng. Như vậy, nếu tính riêng lượng khớp lệnh trên sàn trong ngày, KLGD đạt <callOptionsVolume> triệu đơn vị, đạt giá trị <callOptionsValue> tỷ đồng.");
		this.setSentences("Trên sàn HoSE hôm nay, tổng KLGD đạt <totalTradingVolume> triệu cổ phiếu, tương đương <totalTradingValue> tỷ đồng, <verb1>  khoảng <volumeChange>% về khối lượng <linkword> <verb2> gần <valueChange>% về giá trị so với ngày hôm trước.");
		this.setSentences("Tổng khối lượng giao dịch trong ngày đạt hơn <totalTradingVolume> triệu cổ phiếu tương đương <totalTradingValue> tỷ đồng, trong đó, giao dịch thỏa thuận đã đóng góp khoảng <putOptionsValue> tỷ đồng với <putOptionsVolume> triệu cổ phiếu được giao dịch.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule4()).applyRule(data.getVinput());
	}
}
