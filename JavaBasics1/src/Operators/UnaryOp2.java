package Operators;

public class UnaryOp2 {

	public static void main(String[] args) {

		int a = 77, b;
		b = a++;// b=77, a=78
		int x = a, y;// x=78
		System.out.println(x);// 78
		y = ++x;// y=79, x=79
		System.out.println(a);// 78
		System.out.println(b);// 77
		System.out.println(x);// 79
		System.out.println(y);// 79

		int p = 10, q = 20, res;

		res = p++ + --q;// res = 10 + 19
		System.out.println("res: " + res);// 29
		System.out.println("p: " + p);// 11
		System.out.println("q: " + q);// 19
		System.out.println("*****************************");
		int res1 = ++p + ++q;// res1 = 12 + 20
		System.out.println(res1);// 32
		System.out.println("p: " + p);// 12
		System.out.println("q: " + q);// 20

	}

}
