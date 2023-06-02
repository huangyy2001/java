// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee.
package huang.polymorphism.employee;
public class HourlyEmployee_huang1063 extends Employee_huang1063 {
   private double hourlywage; // wage per hour
   private double hours; // hours worked for week
   private double extraHourRate;
   private double maxWorkedHours = 80;
   private double maxRate = 2.0;
   private double minRate = 1.0;
   private double norMalWH =40.0;

   // constructor
   public HourlyEmployee_huang1063(String firstName, String lastName, String socialSecurityNumber, 
		   boolean _isSimpleFormat,double hourlywage, double hours, 
		   double _extraHourRate, double _maxWorkedHours, double _minRate, 
		   double _maxRate, double _normalWH) {
      super(firstName, lastName, socialSecurityNumber,_isSimpleFormat);
      
      maxWorkedHours=_maxWorkedHours;
      minRate=_minRate;
      maxRate=_maxRate;
      norMalWH=_normalWH;

      if (hourlywage < 0.0) { // validate wage
         throw new IllegalArgumentException("Hourly wage must be >= 0.0");
      }

      if ((hours < 0.0) || (hours > maxWorkedHours)) { // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");
      }
      
      if ((_extraHourRate < minRate) || (_extraHourRate > maxRate)) { // validate hours
          throw new IllegalArgumentException(
             "Extra-Hour Rate must be must be >= "+minRate+"and<="+maxRate);
       }
      
      this.hourlywage = hourlywage;
      this.hours = hours;
      this.extraHourRate=_extraHourRate;
   } 

   // set wage
   public void setWage(double wage) {
      if (wage < 0.0) { // validate wage
         throw new IllegalArgumentException("Hourly wage must be >= 0.0");
      }

      this.hourlywage = wage;
   } 

   // return wage
   public double getWage() {
	   return hourlywage;
   }

   // set hours worked
   public void setHours(double hours) {
      if ((hours < 0.0) || (hours > maxWorkedHours)) { // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= "+maxWorkedHours);
      }

      this.hours = hours;
   } 

   // return hours worked
   public double getHours() {
	   return hours;
   }

   public void setExtraHoutRate(double _extraHourRate) {
	   if((extraHourRate<1.0)) {
		   throw new IllegalArgumentException("Extra-Hour Rate must be > 1.0");
	   }
	   
	   this.extraHourRate=_extraHourRate;
   }
   
   public double getExtraHourRate() {
	   return extraHourRate;
   }
   
   // calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings() {                                          
      if (getHours() <= norMalWH) { // no overtime                           
         return getWage() * getHours();                                
      }                                                                
      else {                                                           
         return norMalWH * getWage() + (getHours() - norMalWH) * getWage() * getExtraHourRate();  
      }                                                                
   }                                                                   

   // return String representation of HourlyEmployee object              
   @Override 
   public String toString() {                                  
		return String.format(
	    		  isSimpleFormat ? ("\n%10s\t%50s\t%15.2f\t%15.2f\t%15.2f\t%15.2f")
	    				  		 : ("\n%10s\t%50s\t%,15.2f\t%15.2f\t%15.2f\t%15.2f"),
	    	      "H-Employee",super.toString(),getWage(),getHours(),getExtraHourRate(), earnings());              
	   } 
   
   @Override
   public String toString2() {                                            
      return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f %s: %,.2f", 
         super.toString(), "hourly wage", getWage(),                     
         "hours worked", getHours(),"rate",getExtraHourRate());                                    
   }     
   
   @Override
   public String toString3() {                                  
		return String.format("\r\n%10s, %s, %15.2f, %15.2f, %15.2f, %15.2f",
	    	      "H-Employee",super.toString3(),getWage(),getHours(),getExtraHourRate(), earnings());              
	   } 
   
} 
