import employee.Date;
import employee.HourlyEmployee;
import employee.SalariedEmployee;

public class Module_7 {

	public static void main(String[] args) {
		
		HourlyEmployee hourlyEmployee_no_args = new HourlyEmployee();
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Joe", new Date(2016, 11, 28), 30, 18.2, 176);
		
		System.out.println(hourlyEmployee_no_args);
		System.out.println("======================");
		System.out.println(hourlyEmployee);
		System.out.println("======================");
		
		SalariedEmployee[] salariedEmployees = new SalariedEmployee[3];
		
		salariedEmployees[0] = new SalariedEmployee("Andy", new Date(2015, 10, 2), 31, 45000);
		salariedEmployees[1] = new SalariedEmployee("Tom", new Date(2016, 11, 28), 30, 40000);
		salariedEmployees[2] = new SalariedEmployee("Tom", new Date(2016, 11, 28), 30, 40000);
		
		for( int i = 0 ; i < salariedEmployees.length ; i++ ) {
			
			System.out.println("salariedEmployees[" + i + "]");
			System.out.println(salariedEmployees[i]);
			System.out.println("======================");
		}
		
		System.out.println("Is salariedEmployees[0] equal to salariedEmployees[1]? " 
		                  + salariedEmployees[0].equals(salariedEmployees[1]));
		
		System.out.println("Is salariedEmployees[1] equal to salariedEmployees[2]? " 
                          + salariedEmployees[1].equals(salariedEmployees[2]));
		
	}
}
