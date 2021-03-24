package JavaInheritance;


	class A
	{
		int a;
		void display()
		{
			System.out.println(a);
		}
	}
class B extends A // one class inherits the properties and behaviour of another class B is child of parent class A
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
public class SingleInher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
A aobj = new A();
aobj.a=10;
aobj.display();

B bobj = new B();
bobj.b=20;
bobj.print();
aobj.a=100;
aobj.display();
	}
}

