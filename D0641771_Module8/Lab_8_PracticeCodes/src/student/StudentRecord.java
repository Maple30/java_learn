package student;

public class StudentRecord extends Student {

	/* Instance */
	private float height;
	private float weight;

	/* Constructors */
	public StudentRecord() {

		height = 0;
		weight = 0;
	}

	public StudentRecord(String id, String name, String sclass, double grade, float height, float weight) {

		super(id, name, sclass, grade);

		this.height = height;
		this.weight = weight;
	}

	public StudentRecord(StudentRecord record) {

		super(record.getSid(), record.getName(), record.sclass, record.getGrade());

		this.height = record.height;
		this.weight = record.weight;
	}

	/* Mutator and accessor methods */
	public void setHigh(float high) {

		this.height = high;
	}

	public void setWeight(float weight) {

		this.weight = weight;
	}

	public float getHigh() {

		return height;
	}

	public float getWeight() {

		return weight;
	}

}
