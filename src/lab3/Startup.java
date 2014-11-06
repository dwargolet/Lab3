
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dworgolet
 */
public class Startup {

    public static void main(String[] args) {
      
       List<Employee> employeeList = new ArrayList<>();
        
       Employee e1 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e2 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e3 = new Employee("Buth", "Steven", "444-444-4444", "189211"); 
       Employee e4 = new Employee("Buth", "Matthew", "555-555-5555", "983813");  
       
       //adding object to list
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
      
        //size of list
        System.out.println(employeeList.size() + "\n");
        
        //casting info from list to another object
        Employee specialE = employeeList.get(2);        
        System.out.println(specialE.toString() + "\n");
        
        //new loop
        for(Employee emp : employeeList) {
            System.out.println(emp.toString());
        }
        
        //experimental methods
        System.out.println(employeeList.indexOf(e3) + "\n");
        
        employeeList.remove(e2);
        for(Employee emp : employeeList) {
            System.out.println(emp.toString());
        }
    }
    
}
