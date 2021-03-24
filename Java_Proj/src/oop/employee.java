package oop;

public class employee {
	int eid;
	String ename;
	double salary;
	String job;
	 
	void display()
	   {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(salary);
		System.out.println(job);
		}
	void bonus()
	{
		System.out.println((salary*10)/100);
	}
  
	public static void main(String[] args) {
		employee emp1 = new employee();
		emp1.eid = 1020;
		emp1.ename = "john";
		emp1.salary = 100000;
		emp1.job = "manager";
		emp1.display();
		

		employee emp2 = new employee();
		emp2.eid = 1030;
		emp2.ename = "jot";
		emp2.salary = 80000;
		emp2.job = " assistant manager";
		emp2.display();
		
	}
}
