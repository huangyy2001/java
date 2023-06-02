// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee.
package huang.polymorphism.employee.earningbook;

import java.util.ArrayList;
import huang.polymorphism.employee.SalariedEmployee_huang1063;

public class SalariedEmployeeBook_Adv_huang1063 extends EmployeeBaseBook_Adv_huang1063<SalariedEmployee_huang1063> {


   public SalariedEmployeeBook_Adv_huang1063(String _companyName, int _employeeNO,  boolean _isGUI) 
   {
      super(_companyName, _employeeNO,_isGUI); 
      formatTitle4EmployeeBook+= 
    		  String.format("%15s\t%15s\n","WeeklySalary","Rarnings");
	    
	  header4WageBook+=formatTitle4EmployeeBook;
   }
} 