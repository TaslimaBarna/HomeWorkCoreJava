package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// default Constructor is initialized here.

		System.out.println("\n_______First outcome_______\n");
		Computer computerN = new Computer();

		// Parameterized constructor is initialized here.

		System.out.println("\n_______Second outcome_______\n");
		Computer computerT = new Computer("Apple", "MacbookAir", "MacOS Mojave", 800, false, 'A');

		System.out.println("\n_______Third outcome_______\n");
		Computer computerB = new Computer("HP", "Lenovo", "Windows11", 700, false, 'A');

	}
}
