package data;


import java.io.File;
import java.util.*;

import csvparsers.ReadFile;


/**
 * Class dùng để chỉ ra tên của công ti ứng với mã cổ phiếu của công ti đó.
 * @author Nguyễn Thành Long
 */
public final class StockInfor {
	private final static String filePath = new File("").getAbsolutePath();
	private final static String path = filePath+"\\data\\DS_MCK.csv";
	private static Map<String, String> corpName =  ReadFile.readInfor(path);
	
	/**
	 * Đưa vào một mã cổ phiếu và trả về tên công ti ứng với mã cổ phiếu đó.
	 * @param code  Mã cổ phiếu
	 * @return Tên của công ti ứng với mã cổ phiếu đó.
	 */
	public static String search(String code) {
		/*if(code.equals("HVN")) {
			return "Tổng công ty Hàng không Việt Nam (Vietnam Airlines)";
		}
		if(code.equals("VHM")) {
			return "Vinhomes";
		}
		if(code.equals("VRE")) {
			return "Vincoms Retail";
		}*/
		return corpName.get(code);
	}
	
}
