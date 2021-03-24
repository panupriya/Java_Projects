package deriveddatatypes;
 // data ius stored in key-value format as a pair
import java.util.HashMap;
import java.util.Map;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm = new HashMap();   // declaration>>> HashMap<intiger,string> hm = new hasMap<intiger,string>();


hm.put(101, "john");      //adding pairs to hashmap
hm.put(102,"david"); 
hm.put(103,"scott");
hm.put(104,"kin");
hm.put(105,"smith");

System.out.println(hm);  //to print values

hm.remove(103);           // remove a pair from has hash map only array name and number is enough
System.out.println("after removing the pairs"+hm);   // printing values after removing a pair

// we cannot add pairs in between, no index number so we cannot add >> if we  write hm.put it will add last
 
// read pairs using for loop
/*for (Map.Entry m:hm.entrySet())  // hm.entrySet() >> returns the pair.. to store this pair we need aa varable'm' and 'Map.Entry' type 
{
	System .out.println(m.getKey()+" "+m.getValue());  // m.getKey>> returns key separately n m.getValue>> returns values separately
}*/
	}

}
