package data;

/**
 * Lớp về đối tượng dữ liệu của mã cổ phiếu.
 * @author Dinh Cong Duy
 */
public class Input {
	
	protected String code; 
	private float referencePrice ; 
	private float closingPrice; 
	//private int valueChange; 
	//private float percentageChange;
	protected int callOptionsVolume; 
	protected int callOptionsValue; 
	protected int putOptionsVolume; 
	protected int putOptionsValue; 
	//private int totalTradingVolume; 
	//private float totalTradingValue; 
	protected int marketValue; 
	
	
	/* Constructor */
	public Input() {
		
	}
	
	public Input(String code, float referencePrice, float closingPrice,
				 int callOptionsVolume, int callOptionsValue,
				 int putOptionsVolume,  int putOptionsValue) {
		this.code			 	= code;
		this.referencePrice		= referencePrice;
		this.closingPrice 		= closingPrice;
		this.callOptionsVolume  = callOptionsVolume;
		this.callOptionsValue	= callOptionsValue;
		this.putOptionsVolume 	= putOptionsVolume;
		this.putOptionsValue 	= putOptionsValue;
	}
	
	public Input(String code, float referencePrice, float closingPrice,
				 int callOptionsVolume, int callOptionsValue,
				 int putOptionsVolume,  int putOptionsValue, int marketValue) {
		this(code, referencePrice, closingPrice, callOptionsVolume,
			 callOptionsValue, putOptionsVolume, putOptionsValue);
		this.marketValue = marketValue;
	}
	
	
	/* Getter */
	public String getCode() {
		return code;
	}

	public int getReferencePrice() {				// VND
		return (int) (referencePrice * 1000);
	}

	public int getClosingPrice() { 					// VND
		return (int) (closingPrice * 1000);
	}

	public int getValueChange() {					// VND
		return getClosingPrice() - getReferencePrice();
	}

	public float getPercentageChange() { 
		return ((float) Math.round((closingPrice / referencePrice - 1) * 10000) / 100);
	}
	
	public float getCallOptionsVolume() {			// million shares
		return convertVolume(this.callOptionsVolume);
	}
	
	public int getCallOptionsValue() {				// billion VND
		return convertValue(this.callOptionsValue);
	}
	
	public float getPutOptionsVolume() {			// million shares
		return convertVolume(this.putOptionsVolume);
	}
	
	public int getPutOptionsValue() {				// billion VND
		return convertValue(this.putOptionsValue);
	}
	
	public float getTotalTradingVolume() {			// million shares
		return convertVolume(this.putOptionsVolume + this.callOptionsVolume);
	}
	
	public int getTotalTradingValue() {				// billion VND
		return convertValue(this.putOptionsValue + this.callOptionsValue);
	}
	
	public int getMarketValue() {					// billion VND
		return this.marketValue / 1000;
	}
	
	
	protected float convertVolume(int volume) {
		float temp = ((float) volume) / 1000000;
		return ((float) Math.round(temp * 100)) / 100;
	}
	
	
	protected int convertValue(int value) {
		return Math.round(((float) value) / 1000);
	}


	/**
	 * @return 1 đối tượng String chứa tất cả thông tin về một mã cổ phiếu.
	 */
	public String toString() {
		return code + "["+ "referencePrice: " + referencePrice 		+ ", closingPrice: " 	 + closingPrice 
				+ ", valueChange: " 		  + getValueChange() 	+ ", percentageChange: " + getPercentageChange()
			    + ",callOptionsVolume: " 	  + callOptionsVolume 	+ ",callOptionsValue: "  + callOptionsValue
			    + ",putOptionsVolume: " 	  + putOptionsVolume 	+ ",putOptionsValue: " 	 + putOptionsValue 
			    + ",marketValue: " 			  + marketValue 		+ "]";
	}

}



