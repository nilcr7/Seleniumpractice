package variables;
class Variables4
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts....");
		System.out.println("We are learning Java Variables.\n************* Local Variable *********");
		/*
		//declare a variable: datatype variableName;		
		//initiliaze a variable: variableName = value;
				//or
		// datatype variableName=value;
			20 10
			20+10 =30
			20*10 =200
			20/10 =2
			20-10 =10

			a. 6	b.4		c.3		d.8
		*/
		//int a=20;
		//int b=10;
		//int res=a+b;
				//or
		int a=20,b=10,res;
		res=a+b;
		System.out.println("varibale a= "+a+"\nvariable b= "+b+"\nSum of a,b= "+res);
		res=a-b;
		System.out.println("varibale a= "+a+"\nvariable b= "+b+"\nSub of a,b= "+res);
		res=a*b;
		System.out.println("varibale a= "+a+"\nvariable b= "+b+"\nMulti of a,b= "+res);
		res=a/b;
		System.out.println("varibale a= "+a+"\nvariable b= "+b+"\nDiv of a,b= "+res);
		System.out.println("Program Ends....");
	}
}