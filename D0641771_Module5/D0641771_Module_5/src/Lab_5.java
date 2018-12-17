
public class Lab_5 {

	public static void main(String[] args) {
		student student1 = new student("May", "d0550578", "1A", "chinese");
		student student2 = new student("May", "d0550578", "1C", "IECS");
		student student3 = new student("Alley", "d0058798", "2A", "Finance");
		
		if(student1.equals(student2)) {
			System.out.println("Student 1 is equal to Student 2");	
		} else {
			System.out.println("Student 1 is not equal to Student 2");
		}
	
		System.out.println(student1.toString());
		System.out.println(student2.toString() + "\n");
		
		if(student3.equals(student2)) {
			System.out.println("Student 2 is equal to Student 3");	
		} else {
			System.out.println("Student 2 is not equal to Student 3");
		}
	
		System.out.println(student2.toString());
		System.out.println(student3.toString() + "\n");
		
		System.out.println("May changed her major from Chinese to IECS!");
		student1.setdepartment("IECS");
		System.out.println(student1.toString());
	}

}
