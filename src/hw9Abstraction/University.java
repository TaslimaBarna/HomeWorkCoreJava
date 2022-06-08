package hw9Abstraction;

public interface University extends College, Hospital {

	/*
	 * An Interface can inherit more than one Interface by extends keyword Extends
	 * keyword is used for the inheritance in Interface An Interface can't inherit a
	 * regular class or an abstract class by extends keyword More than one
	 * inheritance is possible for interface
	 */
	public void classSize();

	public abstract void playground();

	public void teacher();

	/*
	 * public University() {} Interface can not have constructor. Interface cannot
	 * be instantiated (cannot create object).
	 */
	public default void gymnasium() {

	}

	public static void library() {

	}
}
