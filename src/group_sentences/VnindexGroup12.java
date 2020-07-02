package group_sentences;


import data.*;
import pattern.*;


/**
 * Chỉ số Vn-index buổi sáng
 * @author Le Trong Dat
 */
public class VnindexGroup12 extends Group{
	
	{
		this.setTag("Chỉ số Vn-index buổi sáng");
	}
	
	@Override
	public void init(Data data) {
        float change = data.getVinput()[0].getOpenPrice() - data.getVinput()[0].getYesterdayPoint();
		if (change > 0) {
            VnindexGroup1 group1 = new VnindexGroup1();group1.init(data);
            VnindexGroup2 group2 = new VnindexGroup2();group2.init(data);
            this.setSentences(group1.getOutput() + "\n" + group2.getOutput());
		}
		else {
            VnindexGroup3 group3 = new VnindexGroup3();group3.init(data);
            VnindexGroup4 group4 = new VnindexGroup4();group4.init(data);
            this.setSentences(group3.getOutput() + "\n" + group4.getOutput());
		}
		//this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
