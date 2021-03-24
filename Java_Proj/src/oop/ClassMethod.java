package oop;
// assign values by using method
/*public class ClassMethod {
	int sid;
	String sname;
	char grade;
	 void getValues(int id,String name,char g)
	 {
		 sid = id;
		 sname = name;
		 grade = g;
	 }
	 
	void display()
	{
		System.out.println( sid+"  "+sname+"  "+grade);
	}
}*/

  // assign values by using constructor
public class ClassMethod {
	int sid;
	String sname;
	char grade;
	 ClassMethod(int id,String name,char g) // should have same name of class
	 {
		 sid = id;
		 sname = name;
		 grade = g;
	 }
	 
	void display()
	{
		System.out.println( sid+"  "+sname+"  "+grade);
	}
}