package Encapsulation;

class EncapsulationDemo {
	private int ssn;
	private String empName;
	private int empAge;
	// Getter and Setter methods
	public void getEmpSSN() {
		System.out.println(ssn);
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
	public void setEmpName(String newValue) {
		empName = newValue;
	}
	public void setEmpSSN(int newValue) {
		ssn = newValue;
	}
}

public class Encap2 {
	public static void main(String args[]) {
		EncapsulationDemo obj = new EncapsulationDemo();
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee SSN: " + obj.getEmpSSN());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("**************************************");
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		obj.setEmpSSN(112233);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee SSN: " + obj.getEmpSSN());
		System.out.println("Employee Age: " + obj.getEmpAge());
	}
}