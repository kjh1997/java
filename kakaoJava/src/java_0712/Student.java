package java_0712;

public class Student extends Human {
	private String number;
	private String major;
	
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number= number;
		this.major = major;
	}
	@Override
	public String printInformation() {
		return this.getName() + "     " + this.getAge() + "     " +this.getHeight() + "     " +
				this.getWeight() + "     " +this.getNumber() + "     " +this.getMajor();
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String age) {
		this.number = number;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String age) {
		this.major = major;
	}
}
