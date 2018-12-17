
public class Lab_4 {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "May";
		student1.setsid("d0050578");
		student1.setsClass("1A");
		student1.setdepartment("Chinese");

		student2.setname("Ken");
		student2.setsid("d0054789");
		student2.setsClass("1B");
		student2.setdepartment("IECS");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		
		
		student1.setsClass("1C");
		student1.setdepartment("Finance");
		System.out.println(student1.toString());
		
		if(student1.equals(student2)) {
			System.out.println("Student1 is equal to Student2");
		}else {
			System.out.println("Student1 is not equal to Student2");
		}
	}
}
