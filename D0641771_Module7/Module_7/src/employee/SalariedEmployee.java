package employee;

public class SalariedEmployee extends Employee {

	private double salary;

	/* Constructors */
	public SalariedEmployee() {

		super(); // Call base class's empty constructor
	}

	public SalariedEmployee(String name, Date date, int age, double salary) {

		super(name, date, age); // Call base class's constructor which contains
								// some arguments
		
		/* Check if parameters are reasonable */
		if (salary >= 0) {

			this.salary = salary;
		} 
		else {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		}
	}

	/* Accessor and mutator methods */
	public void setSalary(double salary) {

		/* Check if the parameter is reasonable */
		if (salary >= 0) {

			this.salary = salary;
		} 
		else {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		}
	}

	public double getSalary() {

		return salary;
	}

	/* Declare an appropriate method of salaried employee */
	public double getPay() {

		return salary / 12;
	}

	/* Comparison method */
	public boolean equals(SalariedEmployee otherEmployee) {

		return getName().equals(otherEmployee.getName()) 
				&& getHireDate().equals(otherEmployee.getHireDate())
				&& age == otherEmployee.age 
				&& salary == otherEmployee.salary;
	}

	/* Return the information of salaried employee */
	public String toString() {

		return super.toString() + "\n$" + salary + " per year";
	}
}
