package hw9Encapsulation;

public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;

	// Getter is a method that reads the value of a variable.
	public String getName() {
		return name;
	}

	// Setter is a method that updates the value of a variable.
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}
