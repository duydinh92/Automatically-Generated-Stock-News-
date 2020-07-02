package csvparsers;


import java.io.*;
import java.util.*;
import data.*;


/**
 * Cung cấp các phương thức để lấy dữ liệu từ file rồi tạo ra
 * những đối tượng thích hợp để lưu trữ các dữ liệu đó.
 * @author Nguyễn Thành Long
 */
public class ReadFile {
	
	/**
	 * Đưa vào một đối tượng String có nội dung là một số Float, rồi trả về 
	 * đối tượng Float có nội dung tương ứng. 
	 * @param str  Đối tượng String đưa vào để trả về đối tượng Float.
	 */
	private static float parseFloat(String str) {
		return Float.parseFloat(str.trim());
	}
	
	/**
	 * Đưa vào một đối tượng String có nội dung là số nguyên có ngăn cách các
	 * phần bằng dấu phẩy, rồi trả về một đối tượng Integer có nội dung tương
	 * ứng đã được loại bỏ dấu phẩy.
	 * @param str 	Đối tượng String đưa vào để trả về đối tượng Integer.
	 */
	private static int parseInt(String str) {
		return Integer.parseInt(str.trim().replace(",", ""));
	}
	
	
	/**
	 * Đưa vào đường dẫn tới file chứa danh sách tên các công ti ứng với
	 * các mã chứng khoán, và trả về một Map để lưu trữ các dữ liệu trong đó.
	 * @param path Đường dẫn tới file chứa danh sách công ti cùng mã chứng
	 * khoán tương ứng.
	 * @return Bảng băm chứa có key là mã chứng khoán,
	 * value là tên của công ti ứng với mã đó.
	 */
	public static Map<String,String> readInfor(String path) {
		Map<String,String> infor = new HashMap<String,String>();
		
		try(BufferedReader bir = new BufferedReader(new FileReader(path))){
			String line = bir.readLine();
			line = bir.readLine();
			
			while(line != null) {
				List<String> result = GetContent.getContent(line);
				infor.put(result.get(0).trim(),result.get(1).trim());
				line = bir.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return infor;
	}
	
	/**
	 * Đưa vào đường dẫn tới file chứa bảng dữ liệu chứng khoán theo ngày,
	 * trả về một List chứa dữ liệu từ bảng chứng khoán đó.
	 * @param path 	Đường dẫn tới file chứa dữ liệu chứng khoán.
	 * @return 1 List với mỗi phần tử là một đối tượng Input 
	 * chứa các dữ liệu về một mã chứng khoán lấy ra từ bảng dữ liệu.
	 */
	public static List<Input> readInput(String path) {
		List<Input> inputs = new ArrayList<>();
		
		try(BufferedReader bir = new BufferedReader(new FileReader(path))){
			String line = bir.readLine();
			line = bir.readLine();
			
			while(line != null) {
				List<String> result = GetContent.getContent(line);
				inputs.add(new Input(
						result.get(2).trim(),
						parseFloat(result.get(3)),
						parseFloat(result.get(5)),
						parseInt(result.get(11)),
						parseInt(result.get(12)),
						parseInt(result.get(13)),
						parseInt(result.get(14)),
						parseInt(result.get(17))
				));
				line = bir.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputs;
	}
	
	/**
	 * Đưa vào một đường dẫn tới file chứa bảng dữ liệu VN-Index,
	 * trả về một List chứa dữ liệu từ bảng VN-Index đó.
	 * @param path  Đường dẫn tới file chứa dữ liệu VN-Index.
	 * @return 1 List với mỗi phần tử là một đối tượng Vinput 
	 * chứa các dữ liệu về VN-Index theo ngày lấy ra từ bảng dữ liệu.
	 */
	public static List<Vinput> readVinput(String path) {
		List<Vinput> vinputs = new ArrayList<>();
		
		try(BufferedReader bir = new BufferedReader(new FileReader(path))){
			String line = bir.readLine();
			line = bir.readLine();
			
			while(line != null) {
				List<String> result = GetContent.getContent(line);
				vinputs.add(new Vinput(
						result.get(1),
						parseFloat(result.get(3)),
						parseFloat(result.get(5)),
						parseInt(result.get(11)),
						parseInt(result.get(12)),
						parseInt(result.get(13)),
						parseInt(result.get(14)),
						parseFloat(result.get(6)),
						parseFloat(result.get(7)),
						parseFloat(result.get(4))
						
				));
				line = bir.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vinputs;
	}
	
	
	/* Test */
//	public static void main(String[] args) {
//		String path1 = "C:\\Users\\Phong Vu\\eclipse-workspace\\Project\\data\\stock_code_07-04-2020.csv";
//		List<Input> inputs = readInput(path1);
//		//System.out.println(inputs.get(1).toString());
//		GroupStock Project = new GroupStock("Bluechip VN30",inputs);
//		System.out.println(Project.getMembers().get(1).toString());
//		System.out.println(Project.getMembers().size());
//		//String path2 = "C:\\Users\\User\\Desktop\\OOP Project\\Project\\data\\DS_MCK.csv";
//		//String path3 = "C:\\Users\\User\\Desktop\\OOP Project\\Project\\data\\VNINDEX.csv";
//		//Vinput[] todays = Vinput.todays("7/4/2020", ReadFile.readVinput(path3));
//	}
}
