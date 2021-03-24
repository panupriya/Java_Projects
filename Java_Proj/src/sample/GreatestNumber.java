package sample;

public class GreatestNumber {
	public static void main(String[] args) {
	int x= 100;
	int y = 200;
	int z = 1000;
	
	if (x>=y && x>=z)
	{
	System.out.println("the greatest number is"+(x));
	}
	else if(y>=x && y>=z)
	{
		System.out.println("the gretest number is"+(y));
	}
	else
	{
		System.out.println("the gratest number is"+(z));
	}

}
}