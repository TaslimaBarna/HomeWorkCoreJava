package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		// Object aboutMe is instantiated from AboutMe class here.
		// Constructor is also initialized when an object is created.
		AboutMe aboutMe = new AboutMe();
		// Variables are initialized here.
		aboutMe.name = "Taslima Barna";
		aboutMe.address = "86 Grace Avenue, Lynbrook, NY";
		aboutMe.age = 27;
		aboutMe.rent = 3200;
		aboutMe.cellnum = 3476056611l;
		aboutMe.zip = 11563;
		aboutMe.height = 5.3f;
		aboutMe.mygrade = 4.500000096;
		aboutMe.gender = 'F';
		aboutMe.uscitizen = true;

		// Method is initialized.
		aboutMe.aboutMe();
		System.out.println("\n******************************************\n");
		AboutMe aboutAlex = new AboutMe(); // Object aboutMe is instantiating from AboutMe class here.
		// The variables are initialized here.
		aboutAlex.name = "Alex";
		aboutAlex.address = "80 Grace Avenue, Lynbrook,NY";
		aboutAlex.age = 30;
		aboutAlex.rent = 3100;
		aboutAlex.cellnum = 3476593650l;
		aboutAlex.zip = 11563;
		aboutAlex.height = 5.5f;
		aboutAlex.mygrade = 4.9500000;
		aboutAlex.gender = 'F';
		aboutAlex.uscitizen = true;
		aboutAlex.aboutMe();

	}

}
