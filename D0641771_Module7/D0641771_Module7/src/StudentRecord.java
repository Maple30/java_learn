
public class StudentRecord extends Student{
	private int height;
	private int weight;
	
	public StudentRecord() {
		height = 0;
		weight = 0;
	}
	
	public StudentRecord(String sid, String name,String sclass, double grade, int height, int weight) {
		super(sid, name, sclass, grade);
		if(height > 0 && weight > 0) {
			this.height = height;
			this.weight = weight;
			
		} else {
			System.out.println("NOPE");
			System.exit(0);
		}
		
	}
	
	public void setwieght(int weight) {
		this.weight = weight;
	}
	
	public void setheight(int height) {
		this.height = height;
	}
	
	public int getheight() {
		return height;
	}
	
	public int getweight() {
		return weight;
	}

	public boolean equals(StudentRecord oth) {
		if(super.getGrade() == oth.getGrade() && super.getClass().equals(oth.getClass()) && super.getName().equals(oth.getName()) && super.getSClass().equals(oth.getSClass()) && height == oth.height && weight == oth.weight ) {
			return true;
		} else return false;
	}
	
	public String toString() {
		return "SID: " + super.getSid() + ", Name: " + super.getName() + ", Class: " + super.getClass() + ", Grade: " + super.getGrade() + ", Height: " + height + ", Weight: " + weight;
	}
}
