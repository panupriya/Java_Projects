package ArrayNString;

public class string {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s = "WELCOME";
		String s1 = " TO JAVA";
		String s2 = "selanium";
		
		
		
		System.out.println(s.length()); // to get the length of the string
		System.out.println(s.concat(s1)); // combines a specific string at the end of another string 
		System.out.println(s1.trim()); //removes right and left side one space but in between space is considered as a space
        System.out.println(s.charAt(3)); //return a character value at the given index number n the index number starts from zero
        System.out.println(s.contains("Wel")); // search the sequence of character in the string it returns true if char value is found otherwise false
        System.out.println(s.contains("WEL")); // it is case sensitive
        System.out.println(s.equals("Welcome")); // compare the given string based on the content of the string if any charactor not matched it returns false 
        System.out.println(s.equals("WELCOME")); // If all characters are matched it returns true. it is also case sensitive
        System.out.println(s.equalsIgnoreCase("Welcome")); // compare string based on the content but not check the case
        System.out.println(s.equalsIgnoreCase("WELCOME"));
        System.out.println(s.replace("E","A")); // return a string by replacing old character with new one - replacing character
        System.out.println(s.replace("E","A")); // return a string by replacing old character with new one - replacing character
	    System.out.println(s1.replace("TO","NEW")); // return a string by replacing old character with new one - replacing  sequence of characters
	    System.out.println(s.substring(1,3)); // returns substring of a string based on  starting index and ending index
	    System.out.println(s.substring(0,4)); // starting index start from '0' and ending index starts from'1'
	    System.out.println(s.toLowerCase());// return the string into lower case letter
	    System.out.println(s2.toUpperCase()); // return the string into upper case letter

	}

}
