package stringDemo;

public class Student {

	String name;
	int roll;
	int standard;
	
	public Student(String name, int roll, int standard) {
		super();
		this.name = name;
		this.roll = roll;
		this.standard = standard;
		}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", standard=" + standard + "]";
	}

	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}

	public int getStandard() {
		return standard;
	}
	

}