// Fig. 10.8: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class extends CommissionEmployee.
package huang.polymorphism.employee;
public class BasePlusCommissionEmployee_huang1063 extends CommissionEmployee_huang1063 {
   private double baseSalary; // base salary per week
   private double extraHourRate;

   // constructor
   public BasePlusCommissionEmployee_huang1063(String _firstName, String _lastName, 
      String _socialSecurityNumber, boolean _isSimpleFormat, double _grossSales,
      double _commissionRate, double _baseSalary) {
      super(_firstName, _lastName, _socialSecurityNumber, _isSimpleFormat,
         _grossSales, _commissionRate);

      if (_baseSalary < 0.0) { // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }      
             
      this.baseSalary = _baseSalary;                
   }

   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) { // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }
            
      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary() {return baseSalary;}

   // calculate earnings; override method earnings in CommissionEmployee
   @Override                                                            
   public double earnings() {return getBaseSalary() + super.earnings();}

   // return String representation of BasePlusCommissionEmployee object
   @Override                                                           
   public String toString() {                                          
      return String.format(
    		  isSimpleFormat ? ("\r\n%12s\t%15s\t%15s\t%15s\t%,15.2f\t%15.2f\t%15.2f\t%15.2f")
    				  		 : ("\r\n%12s\t%15s\t%15s\t%15s\t%15.2f\t%15.2f\t%15.2f\t%15.2f"),
    		  "B+C-Employee",getFirstName(), getLastName(), getSocialSecurityNumber(),getGrossSales(),
    		  getCommissionRate(), getBaseSalary(), earnings());                           
   }  
   
   
   public String toString2() {                                          
	      return String.format("%s %s; %s: $%,.2f","base-salaried", super.toString(),"base salary", getBaseSalary());                              
	   }                    
   
   
   public String toString3() {                                          
	      return String.format("\r\n%12s, %15s, %15s, %15s, %,-15.2f, %-15.2f, %-15.2f, %-15.2f",
	  "B+C-Employee",getFirstName(), getLastName(), getSocialSecurityNumber(),getGrossSales(),
	  getCommissionRate(), getBaseSalary(), earnings());                                  
	   }                    
} 