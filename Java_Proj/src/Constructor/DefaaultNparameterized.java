package Constructor;
//default constructor
/*public class DefaaultNparameterized {
	int x;
	int y;
	DefaaultNparameterized() //default
	{
		x=10;
		y=20;
	}
	void display()
	{
		System.out.println(x+y);
	}
	 public static void main(String[] args) {
		 DefaaultNparameterized de = new DefaaultNparameterized();
				 de.display();
	 }

}*/
   

// parameterized constructor
public class DefaaultNparameterized {
	
	int x;
	int y;
	DefaaultNparameterized(int a, int b)
	{
	x=a;
	y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		 DefaaultNparameterized pz = new DefaaultNparameterized(100,200); // invoke default constructor
				 pz.display();
	
	}
	
	}
