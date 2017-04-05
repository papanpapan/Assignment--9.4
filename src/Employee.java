import java.util.Comparator;
public class Employee implements Comparable<Employee> {
	    private int id;
	    private String name;
	    private String designation;
	    private int salary;
public int getID(){
	return id;
}
public String getName(){
	return name;
}
public String getDesignation(){
	return designation;
}
public int getSalary(){
	return salary;
}

	    public Employee(int id, String name, String designation, int salary) {
	        this.id = id;
	        this.name = name;
	        this.designation= designation;
	        this.salary = salary;
	    }

	    public static  Comparator<Employee>SalaryComparator=new Comparator<Employee>(){
	    	public int compare(Employee e1,Employee e2){
	    		return e1.getSalary()-e2.getSalary();
	    	}
	    };
	    public static  Comparator<Employee>NameComparator=new Comparator<Employee>(){
	    	public int compare(Employee e1,Employee e2){
	    		return e1.getName().compareTo(e2.getName());
	    	}
	    };
	    public static Comparator<Employee>DesignationComparator=new Comparator<Employee>(){
	    	public int compare(Employee e1,Employee e2){
	    		return e1.getDesignation().compareTo(e2.getDesignation());
	    	}
	    };
		public int compareTo(Employee e) {
		
			return this.id-e.id;
	   }
		
}