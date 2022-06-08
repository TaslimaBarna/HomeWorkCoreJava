package hw3JavaVariables;

public class AboutMe {
	// Here string is declared as a reference variable.
	public String informationAboutMe;
	// The variables are initialized.
	public String name = "Taslima Barna";
	public String address = "86 Grace Avenue, Lynbrook,NY,";
	public byte age = 27;
	public short rent = 3200;
	public long cellnum = 3476056611l;
	public int zip = 11563;
	public float height = 5.3f;
	public double mygrade = 4.500000096000;
	public char gender = 'F';
	public boolean UScitizen = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Object aboutMe is instantiating from AboutMe class here.
		System.out.println("Name:" + aboutMe.name + "\nAge:" + aboutMe.age + "\nGender:" + aboutMe.gender);
		System.out.println("Height:" + aboutMe.height + "\nCell:" + aboutMe.cellnum + "\nGrade: " + aboutMe.mygrade
				+ "\nAddress:" + aboutMe.address + "\nZip:" + aboutMe.zip + "\nRent:" + aboutMe.rent + "\nCitizen:"
				+ aboutMe.UScitizen);

	}

}
