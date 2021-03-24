                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             package ArrayNString;

public class Array {

	public static void main(String[] args) {
		// one diamentional array
int a[]= new int[5]; 
                     //int a[] = {100,200,300,400,500}; another way of declaration
a[0]=100;
a[1]=200;
a[2]=300;
a[3]=400;
a[4]=500;
System.out.println(a.length); // to find length of an array
System.out.println(a[3]);  // to read specific value
/*for(int i=0;i<=a.length-1;i++) // to read multiple values
{
	System.out.println(a[i]);
}*/
for(int i:a) // to read multipl values using enhaced for loop method
{
	System.out.println(i);
}
}

}

