package sample;
import java.util.Scanner;

public class MatMul2 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		sc = new Scanner(System.in);
		
		System.out.println("enter the size of array a");
		int rowa = sc.nextInt();
		int cola = sc.nextInt();
		
		System.out.println("enter the size of array b");
		int rowb = sc.nextInt();
		int colb = sc.nextInt();
		
		// read a and b
		
		System.out.println("Enter the element of array a");
		for(i=0; i<rowa; i++) 
		 {
			for(j=0; j<cola; j++) 
		   {
		
		a[i][j] = sc.nextInt();
		
	       }
			System.out.println();
	      }
		
		System.out.println("Enter the element of array b");
		
		for(i=0; i<rowb; i++) 
		 {
			for(j=0; j<colb; j++) 
		   {
		
		b[i][j] = sc.nextInt();
		
	       }
			System.out.println("\n");
	      }
		
		
		//print a and b

	    System.out.println("the elements of array a");
	    for (i = 0; i < rowa; ++i) {
	        for (j = 0; j < cola; ++j) {

	            System.out.print(a[i][j]);
	            System.out.print("\t");

	        }
	        System.out.println("\n");
	    }
	    System.out.println("the elements of array b");
	    for (i = 0; i < rowb; ++i) {
	        for (j = 0; j < colb; ++j) {

	            System.out.print(b[i][j]);
	            System.out.print("\t");

	        }
	        System.out.println("\n");

	    }
		
	    
	    //multiplication of a and b
	    
	    for(i=0;i<rowa;i++)
	    {
	    	for(j=0;j<colb;j++)
	    	{
	    		c[i][j]=0;
	    		for (k=0;k<cola;k++)
	    		{
	    			c[i][j] += a[i][k]*b[k][j];
	    			
	    		} // end of k loop
	    	}// end of j loop
	    } // end of i loop
	    
	    // to print the result
	     System.out.println("multiplied mateix is");
	    for(i=0;i<rowa;i++)
	    {
	    	for(j=0;j<colb;j++)
	    	{
	    		System.out.print(c[i][j]);
	    		System.out.print("\t");
	    	}
	    	System.out.println("\n");
	    	
	    }
	}

}
