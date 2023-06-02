// Fig. 10.8: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class extends CommissionEmployee.
package huang.polymorphism.employee.earningbook;

import java.util.ArrayList;

import huang.polymorphism.employee.BasePlusCommissionEmployee_huang1063;
public class BasePlusCommissionEmployeeBook_Adv_huang1063 extends EmployeeBaseBook_Adv_huang1063<BasePlusCommissionEmployee_huang1063> {


   // constructor
   public BasePlusCommissionEmployeeBook_Adv_huang1063(String _companyName, int _employeeNo, boolean _isGUI) 
   {
      super(_companyName, _employeeNo, _isGUI); 
      formatTitle4EmployeeBook+=
    		  String.format("%10s\t%10s\t%10s\t%10s\n","GrossSale","Rate","BaseSalary","Rarnings");
	  header4WageBook+=formatTitle4EmployeeBook;
   } 
} 