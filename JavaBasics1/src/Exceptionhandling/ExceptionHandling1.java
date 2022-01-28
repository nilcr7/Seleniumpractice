package Exceptionhandling;
public class ExceptionHandling1 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i = 10;
		int j;
		try{
			j= i/0;//ArithmeticException
			System.out.println("res: "+j);
		}catch(ArithmeticException obj) {
			System.out.println("Exception handled"+obj);
			obj.printStackTrace();
		}		
		System.out.println("Programs ends here...");
	}
}
