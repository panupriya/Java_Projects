
package sample;
import java.util.Scanner;
public class PositiveOrNegative {
   
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		   
		/*System.out.println("ARGUMENT..................."+args[0]+">>>"+ args[1]);*/
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		number = scan.nextInt();    
		scan.close();
		if (number>0)
		{
			System.out.println("the number is positive");
		}
		else if(number<0) 
		{
			System.out.println("the number is negative");
		}
		else
		{
			System.out.println("the given number is neither positive nor negative");
		}
	}
	
	

}
