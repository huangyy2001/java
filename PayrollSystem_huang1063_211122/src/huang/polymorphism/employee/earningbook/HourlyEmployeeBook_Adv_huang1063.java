// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee.
package huang.polymorphism.employee.earningbook;

import java.util.ArrayList;

import huang.polymorphism.employee.HourlyEmployee_huang1063;

public class HourlyEmployeeBook_Adv_huang1063 extends EmployeeBaseBook_Adv_huang1063<HourlyEmployee_huang1063> {
  
   public HourlyEmployeeBook_Adv_huang1063(String _companyName, int _employeeNO,boolean _isGUI) {
      super(_companyName, _employeeNO,_isGUI);
      
      formatTitle4EmployeeBook+= String.format("%15s\t%15s\t%15s\t%15s\n","HourlyWage","Hours","Rate","Rarnings");
	    
	    header4WageBook+=formatTitle4EmployeeBook;
      
   }    
} 
