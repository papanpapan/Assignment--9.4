import java.util.*;
public class ArrayEven_No {
public static void main(String args[]){
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(12);
	al.add(35);
	al.add(45);
	al.add(34);
	al.add(43);
	al.add(38);
	System.out.println("Unsorted List :"+al);
	for(int i=0;i<al.size();i++){
		int even=al.get(i)%2;
		if(even==0){
			System.out.println("The Number is Even :"+al.get(i));
			al.remove(i);
		}
	}
	Collections.sort(al);
	System.out.println("sorted List :"+al);
	
  }
}