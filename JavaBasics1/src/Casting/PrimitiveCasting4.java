package Casting;

public class PrimitiveCasting4 {

	public static void main(String[] args) {
		byte b = 5;
		short s = b;
		int i = s;
		long l = s;
		float f = s;
		double d = s;
		System.out.println("Examples of Widening Type casting...!!");
		System.out.println("byte to short : " + s);
		System.out.println("byte to int : " + i);
		System.out.println("byte to long : " + l);
		System.out.println("byte to float : " + f);
		System.out.println("byte to double : " + d);
	}
}
