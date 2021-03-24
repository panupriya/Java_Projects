package JavaMethod;
// not taking parameters and not returning value
/*public class Calculation {
	int x = 10;
	int y =20;
	void sum()
	{
System.out.println(x+y);
	}

public static void main(String[] args) {
	Calculation cal = new Calculation();
	cal.sum();
}
}*/



// not taking parameters but returning value
/*public class Calculation {
	int x = 10;
	int y =20;
	int sum()
	{ 
		return (x+y);
	}
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		int res= cal.sum();
		System.out.println(res);
	}
	}*/



// taking parameters but not returning the value
/*public class Calculation {
void sum(int a, int b)
{
	System.out.println(a+b);
	}
public static void main (String[] args) {
	Calculation cal = new Calculation();
	cal.sum(100,200);

}
}*/


//taking parameters and returning value
public class Calculation {
int sum(int a, int b)
{
	return(a+b);
	}
public static void main (String[] args) {
	Calculation cal = new Calculation();
	System.out.println(cal.sum(100, 200));

}
}

