package accessmodifier;

//protected>> is accessible within package and outside the package but through inheritance only

/*class ABC
{
	protected int data =10;
	protected void m1();
	{
		System.out.println(data);
	}
}
 
 
 // another package|               
package accesmodifier1;
import accessmodifierABc;

public class ProtectedNpublic extends ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedNpublic p = new ProtectedNpublic();
		p.data = 100;
		p.m1();	}

}*/


// public>>> we can access with in the class with in the package and outside the package

public class ABC
{
	public int data = 10;
	public void m1()
	{
		System.out.println(data);

	}
}
public class ProtectedNpublic {

	public static void main(String[] args) {
		ABC s= new ABC();
		s.data = 100;
		s.m1();
	}
}
