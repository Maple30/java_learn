
public class student {

	private String name;
	private String sid;
	public String sClass;
	public String department;
	
	public student() {
		name = "N/A";
	    sid = "N/A";
	    sClass = "N/A";
	    department = "N/A";
	}
	
	public student(String name, String sid, String sClass, String department){
		this.name = name;
	    this.sid = sid;
	    this.sClass = sClass;
	    this.department = department;
	}
	
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
	
	
	public boolean equals(student otherStudent) {
		return name == otherStudent.name && sid == otherStudent.sid;
	}
	
	public String toString() {
		return "Name:" + name + ", SID: " + sid + ", Student class: " + sClass + ", Department: " + department; 
	}

}
