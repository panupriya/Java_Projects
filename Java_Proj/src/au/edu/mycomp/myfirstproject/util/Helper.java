package au.edu.mycomp.myfirstproject.util;

public class Helper {

 private static final int START_POSITION = 9;
 private static final int END_POSITION = 12;
 
 public static boolean isColorRed(String incomingStringData) {
	 System.out.println(incomingStringData.substring(START_POSITION, END_POSITION));
	 if (incomingStringData.substring(START_POSITION, END_POSITION).equals("RED")) {
		 return true; 
	 } else {
		 return false;
	 }
	 
 }
}
