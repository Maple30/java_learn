package employee;

public class Employee {

	/* Instance variables */
	private String name;
	private Date hireDate;
	protected int age;

	/* Constructors */
	public Employee() {

		name = "N/A";
		hireDate = new Date(2014, 1, 1);
	}

	public Employee(String name, Date hireDate, int age) {

		/* Check if passed objects are null */
		if (name == null || hireDate == null) {

			System.out.println("Passed objects may cause null pointer execption!");
			System.exit(0); // Stop this program
		}

		this.name = name;
		this.hireDate = hireDate;
		this.age = age;
	}

	/* Accessor and mutator methods */
	public String getName() {

		return name;
	}

	public Date getHireDate() {

		return hireDate;
	}
	
	public int getAge() {
		
		return age;
	}

	public void setName(String name) {

		/* Check if passed object is null */
		if (name == null) {

			System.out.println("Passed object may cause null pointer execption!");
			System.exit(0); // Stop this program
		} 
		else {

			this.name = name;
		}
	}

	public void setHireDate(Date hireDate) {

		/* Check if passed object is null */
		if (hireDate == null) {

			System.out.println("Passed object may cause null pointer execption!");
			System.exit(0); // Stop this program
		} 
		else {

			this.hireDate = hireDate;
		}
	}
	
	public void setAge(int age) {
		
		/* Check if passed parameter is reasonable */
		if (age > 0) {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		} 
		else {

			this.age = age;
		}
	}

	/* Comparison method */
	public boolean equals(Employee otherEmployee) {

		return name.equals(otherEmployee.name)
				&& hireDate.equals(otherEmployee.hireDate) 
				&& age == otherEmployee.age;
	}

	/* Return the date information of this object */
	public String toString() {

		return "Name: " + name + ", Hire date: " + hireDate.toString() + ", Age: " + age;
	}
}
