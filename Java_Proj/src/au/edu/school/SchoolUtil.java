package au.edu.school;

public class SchoolUtil {

  public static float getSchoolAverage(Student [] students) {
	
	int mark = 0;
	int numberOfStudents = students.length;
	int average = 0;
	
	for (Student student : students) {
      if (student != null ) { 
		mark = mark + student.getMark();
	  }
	}
	
	average = mark/numberOfStudents;
	return  average;
  }
	
}
