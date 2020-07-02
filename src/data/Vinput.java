package data;


import java.util.*;


/**
 * Lớp về đối tượng dữ liệu của VN-Index.
 * @author Dinh Cong Duy
 */
public class Vinput extends Input{
	
	private String date;
	private float todayPoint; 
	private float yesterdayPoint; 
	private float minPrice;
	private float maxPrice;
	private float openPrice;
	
	/* Constructor */
	public Vinput() {
	
	}
	
	public Vinput(String date, float referencePrice, float closingPrice,
				  int callOptionsVolume, int callOptionsValue, 
				  int putOptionsVolume , int putOptionsValue,
				  float maxPrice, float minPrice, float openPrice) {
		super("VN-Index", referencePrice, closingPrice, callOptionsVolume, 
			  callOptionsValue, putOptionsVolume, putOptionsValue);
		this.date 			= date;
		this.todayPoint 	= closingPrice;
		this.yesterdayPoint = referencePrice;
		this.maxPrice 		= maxPrice;
		this.minPrice 		= minPrice;
		this.openPrice		= openPrice;
	}

	
	/* Getters */
	public String getDate() {
		return date;
	}

	public float getTodayPoint() {
		return todayPoint;
	}

	public float getYesterdayPoint() {
		return yesterdayPoint;
	}
	
	public float getPointChange() {
		return getTodayPoint() - getYesterdayPoint();
	}
	
	public float getMinPrice() {
		return minPrice;
	}
	
	public float getMaxPrice() {
		return maxPrice;
	}
	
	public float getOpenPrice() {
		return openPrice;
	}
	
	/**
	 * @param date   	Ngày muốn lấy dữ liệu
	 * @param vinputs  	List có các phần tử là dữ liệu VN-Index theo ngày.
	 * @return Mảng chứa 2 đối tượng Vinput của ngày hôm qua và hôm nay.
	 */
	public static Vinput[] todays(String date, List<Vinput> vinputs) {
		Vinput[] result = new Vinput[2];
		for(int i = 0; i < vinputs.size(); i++) {
			if(vinputs.get(i).getDate().equals(date)) {
				result[0] = vinputs.get(i);
				result[1] = vinputs.get(i+1);
				break;
			}
		}
		return result;
	}
}	
