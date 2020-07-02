package data;


import java.util.*;


/**
 * Lớp khởi tạo các nhóm ngành và đưa các cổ phiếu cùng 1 nhóm ngành
 * vào thành 1 nhóm tương ứng. 
 * @author Dinh Cong Duy
 */
public class GroupStock {
	
	private String name;
	private List<Input> members;
	private static Map<String, List<String>> groupStocks;
	
	/* Khởi tạo bảng băm với key là tên nhóm ngành,
	 * value là một List các mã cổ phiếu thuộc nhóm ngành tương ứng */
	static {
		groupStocks = new HashMap<String, List<String>>();
		groupStocks.put("Nhóm ngân hàng", 
						Arrays.asList("BID","CTG","HDB","MBB","TCB","VCB","VPB"));
		groupStocks.put("Nhóm dầu khí",
						Arrays.asList("ASP","PGC","PJT","PLX","PVD","PVT","PXS"));
		groupStocks.put("Nhóm thủy sản", 
						Arrays.asList("ANV","IDI","VHC","TS4"));
		groupStocks.put("Nhóm hàng không", 
						Arrays.asList("HVN","VJC"));
		groupStocks.put("Họ VinGroup", 
						Arrays.asList("VRE","VIC","VHM"));
		groupStocks.put("Bluechip VN30", 
						Arrays.asList("BID","BVH","CTD","CTG","EIB","FPT","GAS","HDB",
									  "HPG","MBB","MSN","MWG","NVL","PLX","PNJ","POW",
									  "REE","ROS","SAB","SBT","SSI","STB","TCB","VCB",
									  "VHM","VIC","VJC","VNM","VPB","VRE"));
	}
	
	/* Constructor */
	public GroupStock(String name, List<Input> inputs) {
		this.name = name;
		members = new ArrayList<Input>();
		init(inputs);
	}
	
	private void init(List<Input> inputs) {
		List<String> groupCode = groupStocks.get(name);
		for(Input input : inputs) {
			if (groupCode.contains(input.code)) {
				members.add(input);
			}
		}
	}
	
	/* Getter */
	public String getName() {
		return name;
	}
	
	public List<Input> getMembers(){
		return members;
	}
}
