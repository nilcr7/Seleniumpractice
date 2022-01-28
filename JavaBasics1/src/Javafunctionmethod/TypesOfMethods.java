package Javafunctionmethod;

public class TypesOfMethods {
	
	static void display() {
		System.out.println("Some logic");
		return;//optional statement because if you don't write dn java compile will write it at the compilation time
	}
	@SuppressWarnings("unused")
	private static void call(final double d) {
		System.out.println("Some logic");
		//return;
	}
	protected static int getAge() {
		/** some logic */
		return 25;
	}
	public static char getSalary(int emop) {
		/** some logic	 */
		return 'A';
	}
	
	void display1() {
		System.out.println("Some logic");
		return;//optional statement because if you don't write dn java compile will write it at the compilation time
	}
	@SuppressWarnings("unused")
	private void call1(final double d) {
		System.out.println("Some logic");
		//return;
	}
	protected int getAge1() {
		/** some logic */
		int num=25;
		return num;
	}
	public char getSalary1(int emop,double d, char c1) {
		/** some logic	 */
		return 'A';
	}

	public static void main(String[] args) {
		
	}

}
