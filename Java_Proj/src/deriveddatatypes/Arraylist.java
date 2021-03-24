package deriveddatatypes;
import java.util.ArrayList;
public class Arraylist {
// we can store any type of elements
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add("John");     // array declaration format >> list.add() >> index number starts from zero
		list.add("David");   // it can hold string value
		list.add("Scott");
		list.add("Smith");
		list.add("10");      // it can hold integer
		list.add('A');      // it can hold character as well

		
		System.out.println(list.size());                        // to get size of an array
		System.out.println("Before removing elements"+ list);  // to print all elements in array list
		 
		
		// remove an element and find size n elements in the array list
		
		list.remove(2);                                        // index starts from 0 followed by 1,2,3,4...
		System.out.println(list.size());                       // to get size of an array
		System.out.println("After removing elements"+ list);  // to print all elements after removing one from the array list
		 
		
		//Insert a new into array list
		
		list.add(1,"scott2");                                  //list.add(<index number> , <new element>)
		System.out.println(list.size());                       // to get size of an array
		System.out.println("After inserting elements"+ list);  // to print all elements after inserting elements
		  
		for(Object s:list)                                  // read values using for loop
		{
			System.out.println(s);                         // object type variable can hold any type of value
		}
	}

}
