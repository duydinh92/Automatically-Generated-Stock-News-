package group_sentences;


import data.*;
import pattern.*;


/**
 * Áp lực mua hoặc bán
 * @author Le Trong Dat.
 */
public class VnindexGroup13 extends Group{
	
	{
		this.setTag("Áp lực mua hoặc bán");
	}
	
	@Override
	public void init(Data data) {
		float change = data.getVinput()[0].getPointChange();
		if (change > 0) {
            VnindexGroup6 group6 = new VnindexGroup6();group6.init(data);
            this.setSentences(group6.getOutput());
		}
		else {
            VnindexGroup5 group5 = new VnindexGroup5();group5.init(data);
            this.setSentences(group5.getOutput());
		}
		//this.myMap = (new Rule9()).applyRule(data.getVinput());
	}
}
