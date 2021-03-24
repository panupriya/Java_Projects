package JavaInheritance;
// a parent class has more than one child
class parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class child1 extends parent 
{
    int x;
     void print()
   {
	System.out.println(x);
    }
}
class child2 extends parent 
{
	int y;
	void show()
	{
		System.out.println(y);
	}
}
class child3 extends parent 
{
	int z;
	void view()
	{
		System.out.println(z);
	}
}
public class Hierarchial {
public static void main (String[] args) {
	child1 c1= new child1();
	c1.a=100;
	c1.x=200;
	c1.display();
	c1.print();
	
	child2 c2= new child2();
	c2.a=10;
	c2.y=20;
	c2.display();
	c2.show();
	 
	child3 c3= new child3();
	c3.a=1000;
	c3.z=2000;
	c3.display();
	c3.view();
	 
	
		
}
}
