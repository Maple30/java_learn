import employee.Date;
import employee.Employee;
import employee.HourlyEmployee;
import employee.SalariedEmployee;

public class Module_8 {

	public static void main(String[] args) {
		
		HourlyEmployee joe = new HourlyEmployee("Joe", new Date(2016, 11, 28), 30, 18.2, 176);
		HourlyEmployee joeCopy = new HourlyEmployee(joe);
		
		SalariedEmployee tom = new SalariedEmployee("Tom", new Date(2016, 11, 28), 30, 40000);
		SalariedEmployee andy = new SalariedEmployee("Andy", new Date(2015, 10, 2), 31, 45000);
		
		showEmployee(joe);
		showEmployee(joeCopy);
		showEmployee(tom);
		showEmployee(andy);
		
		System.out.println("Is joe equal to joeCopy? " + joe.equals(joeCopy));
		System.out.println("Is tom equal to andy? " + tom.equals(andy));		
	}
	
	public static void showEmployee(Employee employee) {
					
			System.out.println("************" + employee.getClass().getSimpleName() + "************");
			System.out.println(employee + "\n");
		
	}
}

