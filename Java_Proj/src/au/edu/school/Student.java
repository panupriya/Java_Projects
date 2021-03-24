package au.edu.school;

import java.util.Date;

public class Student {
	
	private String name;
	private int rollnNumber;
	private Date dob;
	private int totalMarks;
	
  Student(String tName,int tRollNumber, Date tDob, int tTotalMarks ) throws Exception {
	
	validateDOB(tDob);
	  
	this.dob = tDob;
	this.name = tName;
	this.rollnNumber = tRollNumber;
	this.totalMarks = tTotalMarks;
  }

  public boolean ispass() {
	
	if(this.totalMarks > 210) {
	return true;
	} else {
	  return false;
	 }
	
  }

  private boolean validateDOB(Date tDob) throws Exception {
	if( new java.util.Date().compareTo(tDob) < 0)  {
		throw new Exception(": DOB cannot be in future ");
	}
	return true;
  }
  
  public int getMark () {
	return this.totalMarks ;
  }
  
  public String getStudentName () {
	return this.name ;
  }

}
