package employee;

public class Date {

	/* Instance variables */
	private int year;
	private int month;
	private int day;

	/* Constructors */
	public Date() {

		this.year = 2000;
		this.month = 1;
		this.day = 1;
	}

	public Date(int year, int month, int day) {

		this.year = year;
		this.month = month;
		this.day = day;
	}

	/* Accessor and mutator methods */
	public void setYear(int year) {

		/* Check if the parameter is reasonable */
		if ( year <= 0 ) {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		} 
		else {

			this.year = year;
		}
	}
	
	public int getYear() {

		return year;
	}
	
	public void setMonth(int month) {

		/* Check if the parameter is reasonable */
		if (month <= 0 || month > 12) {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		} 
		else {

			this.month = month;
		}
	}

	public int getMonth() {

		return month;
	}

	public void setDay(int Day) {

		/* Check if the parameter is reasonable */
		if (Day <= 0 || Day > 31) {

			System.out.println("Illegal parameter");
			System.exit(0); // Stop this program
		} 
		else {

			this.day = Day;
		}
	}

	public int getDay() {

		return day;
	}

	/* Comparison method */
	public boolean equals(Date otherDate) {

		return month == otherDate.month && day == otherDate.day && year == otherDate.year;
	}

	/* Return the date information of this object */
	public String toString() {

		return month + "/" + day + "/" + year;
	}
}
