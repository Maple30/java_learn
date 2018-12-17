
public class Module {

	public static void main(String[] args) {
		StudentRecord[] studentarr = new StudentRecord[3];
		studentarr[0] = new StudentRecord("D02020202", "John", "資訊二甲", 80, 170, 70); 
		studentarr[1] = new StudentRecord("D02020202", "John", "資訊二甲", 80, 170, 70);
		studentarr[2] = new StudentRecord("D03030303", "Mary", "資訊一乙", 85, 160, 45);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(studentarr[i].toString());
			System.out.println("===================================");
		}
		
		if(studentarr[0].equals(studentarr[1])) {
			System.out.println("Is studentarr[0] equal to studentarr[1]? true");
		}else {
			System.out.println("Is studentarr[0] equal to studentarr[1]? false");
		}
		
		if(studentarr[2].equals(studentarr[1])) {
			System.out.println("Is studentarr[1] equal to studentarr[2]? true");
		}else {
			System.out.println("Is studentarr[1] equal to studentarr[2]? false");
		}
	}

}
