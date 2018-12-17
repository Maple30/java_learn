
public class Student {

	public String name;
	private String sid;
	private String sClass;
	private String department;
	
	public String getname() {
		return name;
	}
	
	public String getsid() {
		return sid;
	}
	
	public String getsClass() {
		return sClass;
	}
	
	public String getdepartment() {
		
		return department;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setsid(String sid) {
		this.sid = sid;
	}
	
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	
	public void setdepartment(String department) {
		this.department = department;
	}
	
	public void setall(String name, String sid, String sClass, String department) {
		this.name = name;
		this.sid = sid;
		this.sClass = sClass;
		this.department = department;
	}
	
	public boolean equals(Student otherStudent) {
		return name == otherStudent.name && sid == otherStudent.sid;
	}
	
	public String toString() {
		return "Name:" + name + ", SID: " + sid + ", Student class: " + sClass + ", Department: " + department; 
	}
}
