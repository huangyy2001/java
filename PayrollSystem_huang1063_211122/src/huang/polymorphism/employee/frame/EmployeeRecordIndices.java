package huang.polymorphism.employee.frame;


public enum EmployeeRecordIndices {

	   COMPANY_NAME 	(0, "Company Name"),
	   EMPLOYEE_NO  	(1, "No of Employees"),
	   SSN  			(2, "SSN" ),
	   FIRST_NAME  		(3, "First Name" ),
	   LAST_NAME   		(4, "Last Name"),
	   WEEKLY_SALARY    (5, "Weekly S."), //"Weekly Salary"; S.: Salary
	   HOURLY_WAGE      (6, "Hourly W."), //"Hourly Wage"; W.: Wage
	   HOURS_WORKED     (7, "Work Hours"),//"Hours Worked"
	   GROSS_SALES      (8, "G. Sales"), //"Gross Sales"
	   COMMISSION_RATE  (9, "C. Rate"), //"Commission Rate"
	   BASE_SALARY      (10, "Base Salary"),
	   EARNINGS    		(11, "Earnings"),
	   EMPLOYEE_COUNTER	(12, "Employee Counter"),
	   LOWEST_EEARNINGS (13, "Lowest E."),//"Lowest Earnings"
	   HIGHEST_EEARNINGS(14, "Highest E."),//"Highest Earnings"
	   AVERAGE_EEARNINGS(15, "Average E."), //"Average Earnings"
	   WAGE_LEVEL		(16, "Wage Level"),
	   INDEX_COLOR		(17, "Index Color"),
	   EXTRA_HOURS_RATE	(18, "Rate_EH"), //"Rate4ExtraHours"; EH: Extra-Hours	
	   MAX_WORKED_HOURS	(168, "Max Worked-Hours");//168=24*7(total hours in one week)

   private final int value; // current menu option
   private final String optionType;


   private EmployeeRecordIndices(int _value, String _optionType ) {
	   value=_value;
	   optionType=_optionType;
 
   	}
 
   	public int getValue() {
	   return value;
    }
   	
   	public String getRecordIndexType() {
   		return optionType;
   	}

   	
} 



