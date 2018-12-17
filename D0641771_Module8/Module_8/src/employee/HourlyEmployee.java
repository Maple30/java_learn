package employee;

public class HourlyEmployee extends Employee {

	/* Instance variables */
	private double wageRate;
	private double hours;

	/* Constructors */
	public HourlyEmployee() {

		super(); // Call base class's empty constructor
	}

	public HourlyEmployee(String name, Date date, int age, double wageRate, double hours) {

		super(name, date, age); // Call base class's constructor which contains
								// some arguments

		/* Check if parameters are reasonable */
		if (wageRate >= 0 && hours >= 0) {

			this.wageRate = wageRate;
			this.hours = hours;
		} 
		else {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		}
	}
	
	public HourlyEmployee(HourlyEmployee employee) {

		super(employee.getName(), employee.getHireDate(), employee.getAge()); // Call base class's constructor which contains
																			  // some arguments

		/* Check if parameters are reasonable */
		if (wageRate >= 0 && hours >= 0) {

			this.wageRate = employee.wageRate;
			this.hours = employee.hours;
		} 
		else {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		}
	}

	/* Accessor and mutator methods */
	public void setWageRate(double wageRate) {

		/* Check if the parameter is reasonable */
		if (wageRate >= 0) {

			this.wageRate = wageRate;
		} 
		else {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		}
	}

	public double getWageRate() {

		return wageRate;
	}

	public void setHours(double hours) {

		/* Check if the parameter is reasonable */
		if (hours >= 0) {

			this.hours = hours;
		} 
		else {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		}
	}

	public double getHours() {

		return hours;
	}

	/* Declare an appropriate method of hourly employee */
	public double getPay() {

		return wageRate * hours;
	}

	/* Comparison method */
	public boolean equals(HourlyEmployee otherEmployee) {

		return super.equals(otherEmployee)
				&& wageRate == otherEmployee.wageRate && hours == otherEmployee.hours;
	}

	/* Return the information of hourly employee */
	public String toString() {

		return super.toString() + "\n$" + wageRate + " per hour for " + hours + " hours";
	}
}
