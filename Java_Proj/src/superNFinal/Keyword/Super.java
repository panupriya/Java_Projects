package superNFinal.Keyword;
// to refer instance variable
/*class Animal{
	String colour ="white"; // variable
}
class Dog extends Animal {

	String colour = "black";

void displaycolour()
{
	System.out.println(colour);
	System.out.println(super.colour);
}
}
public class Super {
public static void main (String[] args) {
	Dog d = new Dog();
	d.displaycolour();
}
}*/


//  super to invoke method
/*class Animal{
	String colour ="white";
	void eating()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal {

	String colour = "black";

void eating()
{
	System.out.println("eating bread");
super.eating();
}
}
public class Super {
public static void main (String[] args) {
	Dog d = new Dog();
	d.eating();
}
}*/



//invoke parent class constructor


class Animal{
	String colour ="white";
	void eating()
	{
		System.out.println("eating");
	}
	Animal()
	{
		System.out.println("animal is created");
	}
}
class Dog extends Animal {

	String colour = "black";

Dog ()
{
	super();  // invoke parent class constructor
	System.out .println("dog is created");
}
}

public class Super {
public static void main (String[] args) {
	Dog d = new Dog();
	
}
}
