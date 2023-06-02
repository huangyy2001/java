package huang.polymorphism.employee.helper;

import huang.library.enummenu.NumberType_MenuOption;
import huang.polymorphism.employee.CommissionEmployee;
import huang.polymorphism.employee.CommissionEmployee_huang1063;
import huang.polymorphism.employee.HourlyEmployee_huang1063;
import huang.polymorphism.employee.earningbook.CommissionEmployeeBook_Adv_huang1063;
import huang.polymorphism.employee.earningbook.EmployeeBaseBook_Adv_huang1063;
import huang.polymorphism.employee.earningbook.HourlyEmployeeBook_Adv_huang1063;
import huang.polymorphism.employee.frame.CommissionEmployeeJframe3_huang1063;
import huang.polymorphism.employee.frame.EmployeeRecordIndices;
import huang.polymorphism.employee.frame.HourlyEmployeeJframe_huang1063;

public class Helper4HourlyEmployee_huang1063 extends Helper4SuperEmplyeeBase_huang0163{
	
	public Helper4HourlyEmployee_huang1063(HourlyEmployeeJframe_huang1063 component) {
		super(component);
		frameEmployee = (HourlyEmployeeJframe_huang1063) component;
	}
	
	
	
	@Override
	public void checkInputRecordData() {
		super.checkInputRecordData();
		if(checkRecord) {
			checkRecord= validationNumber_GUI.checkNumberValueByComparing_1flag(
					((HourlyEmployeeJframe_huang1063)frameEmployee).text_hourlywage.getText(),
					EmployeeRecordIndices.HOURLY_WAGE.getRecordIndexType(),0,1,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
			
			if(!checkRecord)
				((HourlyEmployeeJframe_huang1063)frameEmployee).text_hourlywage.setText("");
		}
		if(checkRecord) {
			checkRecord= validationNumber_GUI.checkNumberValueInRange_min0P1max0N1(
					((HourlyEmployeeJframe_huang1063)frameEmployee).text_hours.getText(),
					EmployeeRecordIndices.HOURS_WORKED.getRecordIndexType(),0,80,false,false,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
			
			if(!checkRecord)
				((HourlyEmployeeJframe_huang1063)frameEmployee).text_hours.setText("");
		}
		if(checkRecord) {
			checkRecord= validationNumber_GUI.checkNumberValueInRange_min0P1max0N1(
					((HourlyEmployeeJframe_huang1063)frameEmployee).text_exhuorRate.getText(),
					EmployeeRecordIndices.EXTRA_HOURS_RATE.getRecordIndexType(),1,2,false,false,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
			
			if(!checkRecord)
				((HourlyEmployeeJframe_huang1063)frameEmployee).text_exhuorRate.setText("");
		}
	}
	
	@Override
	public void getInputDataReady(boolean _checkRecord) {
		super.getInputDataReady(_checkRecord);
		if(_checkRecord) {
			
			_hourlyWage=Double.parseDouble(((HourlyEmployeeJframe_huang1063)frameEmployee)
					.text_hourlywage.getText());
			_hoursWorked=Double.parseDouble(((HourlyEmployeeJframe_huang1063)frameEmployee)
					.text_hours.getText());
			_rate4ExtraHours=Double.parseDouble(((HourlyEmployeeJframe_huang1063)frameEmployee)
					.text_exhuorRate.getText());
			
		}
	}
	
	@Override
	public void processAndShowWageRecordsUsingCheck() {
		if(employeeCounter<EmployeeNo) {
			checkInputRecordData();
			getInputDataReady(checkRecord);
			if(checkRecord) {
				HourlyEmployee_huang1063 record=new HourlyEmployee_huang1063(_firstName, _lastName, _SSN,
				frameEmployee.isSimpleFormat,_hourlyWage,_hoursWorked,_rate4ExtraHours,_maxHoursPerWeek,_min4rateOfExtraHours
				,_max4rateOfExtraHours,_normalHoursWorked);
				addNprocessEveryNewRecord(record);
			}
		}
			
	}
	
	@Override
	public Object[][] returnObjectArray() {
		Object[][]data=new Object[eList_Hourly.size()][frameEmployee.listTitleName4Table.size()];
		
		for(int i=0;i<eList_Hourly.size();i++) {
			Object[] object= {eList_Hourly.get(i).getSocialSecurityNumber(),
					eList_Hourly.get(i).getFirstName(),eList_Hourly.get(i).getLastName(),
					eList_Hourly.get(i).getWage(),eList_Hourly.get(i).getHours(),
					eList_Hourly.get(i).getExtraHourRate(),eList_Hourly.get(i).earnings(),
					eList_Hourly.get(i).getLevel(),
eList_Hourly.get(i).getColor()};
			
			data[i]=object;
		}
		
		return data;
	}
	
	@Override
	public void displayNcompleteEarningBookResults_Adv(EmployeeBaseBook_Adv_huang1063 employeBook) {
		HourlyEmployeeBook_Adv_huang1063 _employebook=(HourlyEmployeeBook_Adv_huang1063)employeBook;
		
		if(employeeCounter!=0) {
			_employebook.getAveUsingLamdas(eList_Hourly);
			_employebook.produceLevelArray_Adv(eList_Hourly);
			_employebook.getMaximMumUsingLamdas(eList_Hourly);
			_employebook.getMinimunUsingLamdas(eList_Hourly);
			
			frameEmployee.text_average.setText(twoDigits.format(_employebook.meanEarning));
			frameEmployee.text_highest.setText(twoDigits.format(_employebook.highest));
			frameEmployee.text_lowest.setText(twoDigits.format(_employebook.lowestE));
		}
	}
	
}
