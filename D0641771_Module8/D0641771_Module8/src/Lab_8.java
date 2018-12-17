import student.student;
import student.StudentRecord;

public class Lab_8 {

	public static void main(String[] args) {
		StudentRecord john = new StudentRecord("D02020202", "john", "資訊二甲", 80, 170, 70);
		StudentRecord mary = new StudentRecord("D03030303", "mary", "資訊一乙", 85, 160, 45);
		StudentRecord  johnCopy = new StudentRecord(john);
		
		showstudent(john);
		showstudent(mary);
		showstudent(johnCopy);
		System.out.println("\n");
		if(john.equals(johnCopy)) {
			System.out.println("Is john equal to johnCopy? true");
		}else {
			System.out.println("Is john equal to johnCopy? false");
		}
		
		if(john.equals(mary)) {
			System.out.println("Is john equal to mary? true");
		}else {
			System.out.println("Is john equal to mary? false");
		}
	}
	
	public static void showstudent(student stu) {
		System.out.println("*************");
		System.out.println(stu);
	}

}
