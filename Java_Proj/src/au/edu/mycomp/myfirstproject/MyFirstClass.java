package au.edu.mycomp.myfirstproject;

import java.text.SimpleDateFormat;
import au.edu.mycomp.myfirstproject.util.Helper;


public class MyFirstClass {
	
	private String suppliedString;
	
	MyFirstClass(String tString) {
		//tString should not be null
		this.suppliedString =tString;
	}
	
	public void setSuppliedString(String tString) {
		
		suppliedString = tString;
	}
	
	
	public String getSuppliedString() {
		return suppliedString;
	}
	
	
	public static void main(String[] args) {
		
		MyFirstClass myClass = new MyFirstClass("SSSSSSkkkREDJJJJJJJffffRRRRRRRRR");
		System.out.println(" get value "+myClass.getSuppliedString());	
		
		
		System.out.println(" is RED ? "+Helper.isColorRed(myClass.getSuppliedString()));
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		System.out.println(" Current date "+sd.format(new java.util.Date()));
		System.out.print(new java.util.Date());
		
	}

}
