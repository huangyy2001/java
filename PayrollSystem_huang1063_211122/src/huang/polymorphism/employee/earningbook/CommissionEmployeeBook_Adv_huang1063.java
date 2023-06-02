// Fig. 10.7: CommissionEmployee.java
// CommissionEmployee class extends Employee.
package huang.polymorphism.employee.earningbook;

import huang.polymorphism.employee.CommissionEmployee_huang1063;

public class CommissionEmployeeBook_Adv_huang1063 extends EmployeeBaseBook_Adv_huang1063<CommissionEmployee_huang1063> {
   // constructor
   public CommissionEmployeeBook_Adv_huang1063(String _companyName, int _employeeNO, boolean _isGUI) {
	    super(_companyName, _employeeNO, _isGUI);
	    
	    formatTitle4EmployeeBook+= String.format("%15s\t%15s\t%15s\n","GrossSale","Rate","Rarnings");
	    
	    header4WageBook+=formatTitle4EmployeeBook;
   }
} 
