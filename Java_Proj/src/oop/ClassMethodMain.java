package oop;

/*public class ClassMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassMethod stu1 = new ClassMethod();
		 stu1.getValues(1010,"john",'A');
		
		 stu1.display();
			
	}

}*/
public class ClassMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated
		ClassMethod stu1 = new ClassMethod(1010,"john",'A');
		// donot need calling invoked at the time of object creation
	      stu1.display();
		// constructor will not return any value not even void
	
	}

}
