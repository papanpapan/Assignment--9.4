import java.util.*;
public class ArrayDuplicate {
	public static void main(String args[]){
		ArrayList<String>al=new ArrayList<String>();
		al.add("Papan");
		al.add("Raju");
		al.add("Amit");
		al.add("Papan");
		Iterator<String> i=al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	  }
	}