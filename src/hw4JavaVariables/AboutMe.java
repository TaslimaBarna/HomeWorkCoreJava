package hw4JavaVariables;

public class AboutMe {
// All the variables are declared.
	public String name;
	public String address;
	public byte age;
	public short rent;
	public long cellnum;
	public int zip;
	public float height;
	public double mygrade;
	public char gender;
	public boolean uscitizen;

	// Constructor AboutMe is declared.
	public AboutMe() {
		System.out.println("This is all about me:");
	}

	// Method aboutMe is implemented.
	public void aboutMe() {
		System.out.println("Name:" + name + "\nAge:" + age + "\nGender:" + gender);
		System.out.println("Height:" + height + "\nCell:" + cellnum + "\nGrade: " + mygrade + "\nAddress:" + address
				+ "\nZip:" + zip + "\nRent:" + rent + "\nCitizen:" + uscitizen);

	}

}
