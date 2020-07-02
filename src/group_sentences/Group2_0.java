package group_sentences;


import rules.*;
import data.*;
import pattern.*;


/**
 * Nhóm câu nói về số lượng mã giảm giá.
 * @author Dinh Cong Duy
 */
public class Group2_0 extends Group{
	
	{
		this.setTag("Tổng quan số mã tăng giảm");
		this.setSentences("Trong tổng số <tong> mã niêm yết trên Hose, kết thúc phiên giao dịch có <dung> mã đứng giá, <giam> mã giảm giá với <giamSan> mã giảm sàn và <tang> mã tăng giá, trong đó có <tangTran> mã tăng trần.");
		this.setSentences("Theo thống kê, kết thúc phiên đã có <giam> trên tổng số <tong> mã giảm giá với <giamSan> mã giảm sàn, <tang> mã tăng giá trong đó có <tangTran> mã tăng trần, <dung> mã đứng giá.");
		this.setSentences("Trên sàn HoSE, đóng cửa phiên giao dịch có <tang> mã tăng giá với <tangTran> mã tăng trần, <verb> hơn số mã giảm giá <tang-giam> mã song trong số đó có <giamSan> mã giảm sàn, còn lại <dung> mã đứng giá.");
	}
	
	@Override
	public void init(Data data) {
		this.myMap = (new Rule2()).applyRule(data.getInputs());
	}
}
