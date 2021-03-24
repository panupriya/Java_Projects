package exceptionhandling;

public class Unchekedhandiling {
	public static void main (String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		int a = 100;
		try
		{
		System.out.println(a/0);    // if we put a/2 we will get output as 50
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception in to catch block");
		}
		System.out.println("program is completed");
		System.out.println("program is exited");
		}

     }
  // another way >>one try block can have multiple catch block
/*try
{
  statements;
}
catch(ArithmeticException type)
{
  statements;
}
catch(NullpointException type)
{
  statements;
}
catch(NumberformatException type)
{
  statements;
}*/



// if we dont know what kind of exception the format is >> this is the most accepted method (if we put "welcome" instead of null we will gwt 7 as the answer

 /*String s = null;
 try
 {
	 System.out.println(s.length());
 }
 catch (Exception e)
 {
	 System.out.println("ëntered in to catch block");
 }*/



// another way using finally ... finally block will always excecute (exception doesnot occure, occure and handled, occures and not handled cases) 
 /*try
{
statements;
}
catch (exception type)
{
statements;
}
Finally
{
statements;
}*/

/*public class Unchekedhandiling {
	public static void main (String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		int a = 100;
		try
		{
		System.out.println(a/0);   
		}
		catch(Exception e)
		{
			System.out.println("Exception in to catch block");
		}
		Finally
		{
		System.out.println("program is completed");
		}
		System.out.println("program is exited");
		}

     }*/
