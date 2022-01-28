package variables;
class Variables11 
{
	double salary;//non-static
    static int empId;//static
	public static void main(String[] args) 
	{
		System.out.println("Program Starts....");
	    int deptCode=505;//local 
		System.out.println("local variables: "+deptCode);
		System.out.println("Static Global variables: "+Variables11.empId);
		//object reference variable
			//Variables11 v1;
		//new object creation
			//v1=new Variables11();
				//or
		// object declaration and initilization
		Variables11 v1=new Variables11();
		System.out.println("Non-static global variables:"+v1.salary);
		v1.salary=45000.26;
		System.out.println("Non-static global variables:"+v1.salary);
		System.out.println("********************************");
		Variables11 v2=new Variables11();
		System.out.println("Non-static global variables:"+v2.salary);		
		System.out.println("Program Ends....");
	}
}

/*
Java stores in memory --> 1. stack 2. heap
1. Stack---> execution purpose
2. Heap ---> Storage purpose --> random storage
*/
