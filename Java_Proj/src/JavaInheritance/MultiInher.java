package JavaInheritance;
// when a class is derived from another class which is also derived from another class
class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A // class B is child of parent class A
{
    int b;
     void print()
   {
	System.out.println(b);
    }
}
class C extends B // class c is the child class of parent b
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}

public class MultiInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A aobj = new A();
aobj.a=10;
aobj.display();

B bobj = new B();
bobj.b = 20;
bobj.print();

bobj.a= 100;
bobj.display();

C cobj = new C();
cobj.c = 30;
cobj.show();

cobj.b= 200;
cobj.print();

cobj.a = 300;
cobj.display();
 

}

}
