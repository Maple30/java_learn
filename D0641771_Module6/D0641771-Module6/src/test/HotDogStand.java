package test;

public class HotDogStand {
	private static int 	totalSold;
	private String standName;
	private int sold;
	
	//construct
	public HotDogStand(){
		standName = "N/A";
	}
	
	public HotDogStand(String standName){
		this.standName = standName;
	}
	
	public void setsold(int sold) {
		this.sold = sold;
	}
	
	public void setstandName(String standName) {
		this.standName = standName;
	}
	
	public int getsold() {
		return sold;
	}
	
	public String getstandName() {
		return standName;
	}
	
	public void justSold(int sold){
		this.sold += sold;
		totalSold = totalSold + sold;
	}
	
	public static int getTotalSold() {
		return HotDogStand.totalSold;
	}
}
