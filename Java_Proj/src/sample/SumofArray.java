package sample;

public class SumofArray {
	public static void main(String[] args) {
		/*int a[]  = {100,200,300,400,500,600};
        int sum =0;
        for (int num: a) {
        	sum = sum + num;
        }
        System.out.println("the sum of array  "+sum);
        }
}*/
		
		// to find odd n even numbers in an array
int a[] = {2,3,4,5,6,7,8,9,10,11,12};
System.out.println("even numbers are");
for(int i=0; i<a.length; i++)
{
 if(a[i]%2==0)	 
 {
System.out.println(a[i]);
}
}
System.out.println("odd numbers are");
for(int i=0; i<a.length; i++)
{
 if(a[i]%2!=0)
 {
System.out.println(a[i]);
}
}
	}
}
