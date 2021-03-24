package superNFinal.Keyword;


// final keyword for variable

 /*public class Final {
   final int speed = 40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Final f =new Final();
 //f.speed= 100; // compile time error
System.out.println(f.speed);
	}

}*/


// final keyword for method
/*class Bike;
final void run() // final method we cannot overrid this method in child class
{
	System.out.println("running.....");
}
class Hoda extends Bike
{
	void run() // compile time run
	{
		System.out.println("started...");
	}
}
public class Final {
	public static void main(String[] args) {
		Final f = new Final();
		f.run(); // cannot use
	}
}*/


// final key word for class
final class Bike1 // final class so that we cannot extend to clid class
{
	int speed =40;
	void run()
	{
		System.out.println("speed");
		
	}
}
 class honda extends Bike1 // compile error
 {
 }
 public class Final {
		public static void main(String[] args) {
		

	}
}