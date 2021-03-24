package au.edu.school;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentController {
	
	public static void main(String[] args) {
	  SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy"); 
	  Student students[] = new Student[5]; 
	     
	 try {
	    students[0] = new Student("Rajesh", 2, sd.parse("01/10/1984"), 300);
		 System.out.println("Rajesh isPass?? " + students[0].ispass() );
		  /*students[0].name = "Rajesh";
		  students[0].RollNumber = "2";       
		  students[0].TotalMarks = 300;
		  students[0].Dob = "1989-01-10";*/
		  
		  students[1] = new Student("Mahesh", 5, sd.parse("01/10/1988"), 700);
		  System.out.println("Mahesh isPass?? " + students[1].ispass() );

		  students[2] = new Student("Suresh", 1, sd.parse("01/10/2021"), 40);
		  System.out.println("Suresh isPass?? " + students[2].ispass() );
		  
		  students[3] = new Student("dinil", 9, sd.parse("01/10/1984"), 400);
		  System.out.println("dinil isPass?? " + students[3].ispass() );
		  
		        
	  } catch (Exception e) {
	    System.out.println(" Exception while execution "+ e);
	  }
      
	  System.out.println("School average "+SchoolUtil.getSchoolAverage(students));
    }
}
