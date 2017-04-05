import java.util.Arrays;


public class TestEmployee {
	public static void main(String args[]){
		 //sorting custom object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", "Manager", 10000);
        empArr[1] = new Employee(20, "Arun", "Officer", 20000);
        empArr[2] = new Employee(5, "Lisa", "Police", 5000);
        empArr[3] = new Employee(1, "Pankaj", "Army", 50000);
        
        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Salary
        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Designation
        Arrays.sort(empArr, Employee.DesignationComparator);
        System.out.println("Employees list sorted by Designation:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Name
        Arrays.sort(empArr, Employee.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
        
       
      }

}
