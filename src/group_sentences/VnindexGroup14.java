package group_sentences;


import data.*;
import pattern.*;


/**
 * Chỉ số Vn-index chốt phiên
 * @author Le Trong Dat
 */
public class VnindexGroup14 extends Group{
	
	{
		this.setTag("Chỉ số Vn-index chốt phiên");
	}
	
	@Override
	public void init(Data data) {
		float change = data.getVinput()[0].getTodayPoint() - data.getVinput()[0].getOpenPrice();
		if (change > 0) {
            VnindexGroup7 group7 = new VnindexGroup7();group7.init(data);
            this.setSentences(group7.getOutput());
		}
		else {
            VnindexGroup9 group9 = new VnindexGroup9();group9.init(data);
            VnindexGroup10 group10 = new VnindexGroup10();group10.init(data);
            this.setSentences(group10.getOutput() + "\n" + group9.getOutput());
		}
		//this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
