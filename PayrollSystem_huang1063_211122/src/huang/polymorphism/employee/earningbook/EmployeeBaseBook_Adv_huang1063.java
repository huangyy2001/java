// Fig. 10.4: Employee.java
// Employee abstract superclass.
package huang.polymorphism.employee.earningbook;

import huang.polymorphism.employee.menuoption.EarningLevelEnum_Adv_huang1063;
import huang.polymorphism.employee.Employee;

import java.awt.Color;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


import huang.polymorphism.employee.Employee_huang1063;
import javax.swing.JOptionPane;

public class EmployeeBaseBook_Adv_huang1063 <T extends Employee_huang1063> {
	static private DecimalFormat twDigits= new DecimalFormat("0.00");
	
	public String finalReport4WageBook="";
	public String header4WageBook=
			"\r\n\t@______________________________________@\n\n"
		  + "\r\n\t\t  Wage-Book Report for the Company     \n\n"
		  + "\r\n\t@______________________________________@\n";
	
	public String formatTitle4EmployeeBook = String.format("   \t%15s\t%15s\t%15s\t","FirstN","LastN",
			"SSN");
	public String formatTitleConsole="";
	public String formatTitleGUI="";
	public String recordsConcatenated="";
	public int employeeCounter = 0; 
	public double total = 0.0, highest = Double.MIN_VALUE, lowestE = Double.MAX_VALUE, meanEarning = 0.0;
	public String firstNameLowest, lastNameLowest, firstNameHighest, lastNamehighest,
	nameLowest, nameHighest;
	public String SSNlowest="",SSNhighest="";
	
	public int highestEarningIndex, lowestEarningIndex;
	
	
	public int aLevel = 0, bLevel = 0, cLevel = 0;
	
	public String[] levelsS = { EarningLevelEnum_Adv_huang1063.LeveLA.getLevelType(), 
			EarningLevelEnum_Adv_huang1063.LeveLB.getLevelType(),
	EarningLevelEnum_Adv_huang1063.LeveLC.getLevelType()};
	
	public double[] levelsV = new double[levelsS.length];
	public List<?> commRecordlist_ALevel;
	public List<?> commRecordList_BLevel;
	public List<?> commRecordList_CLevel;
	
	public Color indexColor = EarningLevelEnum_Adv_huang1063.LeveLA.getColor();
	public double unitNT = 1000;
	public String CompanyName;
	public int EmployeeNo;
	public String LevelLetter;
	public boolean isGUI;
	public EmployeeBaseBook_Adv_huang1063(String _companyName, int _employeeNo, boolean _isGUI) {
		CompanyName=_companyName;
		EmployeeNo=_employeeNo;
		isGUI =_isGUI;
		
		header4WageBook += String.format("\r\nCompany: %s\nEmployNo: %3d\t\r\n", CompanyName, EmployeeNo);
	}
	public void processEverySalaryProfie(Employee_huang1063 record) {
		
	recordsConcatenated += record;
	LevelLetter = incrementLetterEarningLevelCounter(record.earnings());
	record.setLevel(LevelLetter);
	record.setColor (indexColor);
	employeeCounter += 1;
	}
	
	public String incrementLetterEarningLevelCounter(double wage) {
		String levelS ="";
		int wageInt = (int) (wage / EarningLevelEnum_Adv_huang1063.UNIT.getValue());
		
		if (wageInt >= EarningLevelEnum_Adv_huang1063.LeveLA.getValue()) {
			levelS = EarningLevelEnum_Adv_huang1063.LeveLA.getLevelCharacter();
			indexColor= EarningLevelEnum_Adv_huang1063.LeveLA.getColor();
			++aLevel;
		}else if (wageInt >= EarningLevelEnum_Adv_huang1063.LeveLB.getValue()){
			levelS = EarningLevelEnum_Adv_huang1063.LeveLB.getLevelCharacter();
			indexColor= EarningLevelEnum_Adv_huang1063.LeveLB.getColor();
			++bLevel;
		}else {
			levelS = EarningLevelEnum_Adv_huang1063.LeveLC.getLevelCharacter();
			indexColor= EarningLevelEnum_Adv_huang1063.LeveLC.getColor();
			++cLevel;
		}
		return levelS;
	}
	
	public void getAveUsingLamdas(ArrayList<T> _employeeRec) {
		meanEarning = _employeeRec.stream().mapToDouble(T::earnings).average().getAsDouble();
	}
	
	public void getMinimunUsingLamdas(ArrayList<T> _employees) {
		lowestE = (_employees.stream()
				.sorted(Comparator.comparing(T::earnings))
				.findFirst()
				.get()
				.earnings());
		JOptionPane.showMessageDialog(null, lowestE);
		firstNameLowest =(_employees.stream()
				.sorted(Comparator.comparing(T::earnings))
				.findFirst()
				.get()
				.getFirstName());
		lastNameLowest = (_employees.stream()
				.sorted(Comparator.comparing(T::earnings))
				.findFirst()
				.get()
				.getLastName());
		SSNhighest= (_employees.stream()
				.sorted(Comparator.comparing(T::earnings))
				.findFirst()
				.get()
				.getSocialSecurityNumber());
		nameLowest= firstNameLowest+" "+lastNameLowest;	
	}
	
	public void getMaximMumUsingLamdas(ArrayList<T> _Employees) {
		highest=(_Employees.stream()
				.sorted(Comparator.comparing(T::earnings))
				.reduce((a,b)->b).orElse(null))
				.earnings();
		firstNameHighest=(_Employees.stream()
				.sorted(Comparator.comparing(T::earnings))
				.reduce((a,b)->b).orElse(null))
				.getFirstName();
		lastNamehighest=(_Employees.stream()
				.sorted(Comparator.comparing(T::earnings))
				.reduce((a,b)->b).orElse(null))
				.getLastName();
		SSNhighest=(_Employees.stream()
				.sorted(Comparator.comparing(T::earnings))
				.reduce((a,b)->b).orElse(null))
				.getSocialSecurityNumber();
		
		nameHighest= firstNameHighest+" "+lastNamehighest;
	}
	
	public List<T> fiterRecordList4Level(List<T> _employeeRecordList, 
			EarningLevelEnum_Adv_huang1063 _earingLevelInquiry){
		List<T> filteredRecordList = filterRecord(_employeeRecordList,
				(T a)-> a.earnings()<(_earingLevelInquiry.getUpperThreshold()*EarningLevelEnum_Adv_huang1063.UNIT.getValue())
						&&
						a.earnings()>(_earingLevelInquiry.getLowerThreshold()*EarningLevelEnum_Adv_huang1063.UNIT.getValue()));
		
		return filteredRecordList;
	}
	
	
	public List<T> filterRecord(List<T> employeeRecordList, Predicate<T> p)
	{
		List<T> result = new ArrayList<>();
		for(T record : employeeRecordList) {
			if(p.test(record)) {
				result.add(record);
			}
		}
		return result;
	}
	
	public void produceLevelArray_Adv(List<T> _emplyeeRecordList) {
		commRecordlist_ALevel= new ArrayList<T>();
		commRecordList_BLevel= new ArrayList<T>();
		commRecordList_CLevel= new ArrayList<T>();
		commRecordlist_ALevel= fiterRecordList4Level(_emplyeeRecordList, EarningLevelEnum_Adv_huang1063.LeveLA);
		commRecordList_BLevel= fiterRecordList4Level(_emplyeeRecordList, EarningLevelEnum_Adv_huang1063.LeveLB);
		commRecordList_CLevel= fiterRecordList4Level(_emplyeeRecordList, EarningLevelEnum_Adv_huang1063.LeveLC);
		levelsV[0]= (double)(commRecordlist_ALevel).size();
		levelsV[1]= (double)(commRecordList_BLevel).size();
		levelsV[2]= (double)(commRecordList_CLevel).size();
	}
	
	@Override
	public String toString() {
		finalReport4WageBook="";
		finalReport4WageBook=header4WageBook+recordsConcatenated;
		
		if(isGUI)
			finalReport4WageBook+="\r\n\t@____________@\n";
		else 
			finalReport4WageBook+="\r\n\t@@@@@@@@@@@@@@\n";
		
		finalReport4WageBook+= "\r\n\r\nSalary average for this week:"+ twDigits.format(meanEarning);
		finalReport4WageBook+= "\r\n\r\nLowest Salary:"+ twDigits.format(lowestE);
		finalReport4WageBook+= "\tName:"+ nameLowest;
		finalReport4WageBook+= "\r\nHighest Salary:"+twDigits.format(highest);
		finalReport4WageBook+= "\tName:"+ nameHighest;
		
		finalReport4WageBook+=String.format("\r\n\r\n%s\n\tA: %3d\r\n\tB: %3d\r\n\tC: %3d\r\n\r\n",
				"No. of emplyess who earned in each level:\r\n",
				(int)levelsV[0],(int) levelsV[1],(int) levelsV[2]);
		return finalReport4WageBook;
	}	
} 

