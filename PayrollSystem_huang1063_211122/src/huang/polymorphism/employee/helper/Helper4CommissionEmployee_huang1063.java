package huang.polymorphism.employee.helper;

import huang.library.enummenu.NumberType_MenuOption;
import huang.polymorphism.employee.CommissionEmployee;
import huang.polymorphism.employee.CommissionEmployee_huang1063;
import huang.polymorphism.employee.earningbook.CommissionEmployeeBook_Adv_huang1063;
import huang.polymorphism.employee.earningbook.EmployeeBaseBook_Adv_huang1063;
import huang.polymorphism.employee.frame.CommissionEmployeeJframe3_huang1063;
import huang.polymorphism.employee.frame.EmployeeRecordIndices;

public class Helper4CommissionEmployee_huang1063 extends Helper4SuperEmplyeeBase_huang0163{
	
	public Helper4CommissionEmployee_huang1063(CommissionEmployeeJframe3_huang1063 component) {
		super(component);
		frameEmployee = (CommissionEmployeeJframe3_huang1063) component;
	}
	
	@Override
	public void checkInputRecordData() {
		super.checkInputRecordData();
		if(checkRecord) {
			checkRecord= validationNumber_GUI.checkNumberValueByComparing_1flag(
					((CommissionEmployeeJframe3_huang1063)frameEmployee).text_GrossSales.getText(),
					EmployeeRecordIndices.GROSS_SALES.getRecordIndexType(),0,1,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
			
			if(!checkRecord)
				((CommissionEmployeeJframe3_huang1063)frameEmployee).text_GrossSales.setText("");
		}
		if(checkRecord) {
			checkRecord= validationNumber_GUI.checkNumberValueInRange_min0P1max0N1(
					((CommissionEmployeeJframe3_huang1063)frameEmployee).text_Commission.getText(),
					EmployeeRecordIndices.COMMISSION_RATE.getRecordIndexType(),0.0,1.0,false,false,
					NumberType_MenuOption.DOUBLE_NUMBER_TYPE.getValueIndex());
			
			if(!checkRecord)
				((CommissionEmployeeJframe3_huang1063)frameEmployee).text_Commission.setText("");
		}
	}
	
	@Override
	public void getInputDataReady(boolean _checkRecord) {
		super.getInputDataReady(_checkRecord);
		if(_checkRecord) {
			
			_grossSales=Double.parseDouble(((CommissionEmployeeJframe3_huang1063)frameEmployee)
					.text_GrossSales.getText());
			_commissionRate=Double.parseDouble(((CommissionEmployeeJframe3_huang1063)frameEmployee)
					.text_Commission.getText());
			
		}
	}
	
	@Override
	public void processAndShowWageRecordsUsingCheck() {
		if(employeeCounter<EmployeeNo) {
			checkInputRecordData();
			getInputDataReady(checkRecord);
			if(checkRecord) {
				CommissionEmployee_huang1063 record=new CommissionEmployee_huang1063(_firstName, _lastName, _SSN,
				frameEmployee.isSimpleFormat,_grossSales, _commissionRate);
				addNprocessEveryNewRecord(record);
			}
		}
			
	}
	
	@Override
	public Object[][] returnObjectArray() {
		Object[][]data=new Object[eList_Commission.size()][frameEmployee.listTitleName4Table.size()];
		
		for(int i=0;i<eList_Commission.size();i++) {
			Object[] object= {eList_Commission.get(i).getSocialSecurityNumber(),
					eList_Commission.get(i).getFirstName(),eList_Commission.get(i).getLastName(),
					eList_Commission.get(i).getGrossSales(),eList_Commission.get(i).getCommissionRate(),
					eList_Commission.get(i).earnings(),eList_Commission.get(i).getLevel(),
					eList_Commission.get(i).getColor()};
			
			data[i]=object;
		}
		
		return data;
	}
	
	@Override
	public void displayNcompleteEarningBookResults_Adv(EmployeeBaseBook_Adv_huang1063 employeBook) {
		CommissionEmployeeBook_Adv_huang1063 _employebook=(CommissionEmployeeBook_Adv_huang1063)employeBook;
		
		if(employeeCounter!=0) {
			_employebook.getAveUsingLamdas(eList_Commission);
			_employebook.produceLevelArray_Adv(eList_Commission);
			_employebook.getMaximMumUsingLamdas(eList_Commission);
			_employebook.getMinimunUsingLamdas(eList_Commission);
			
			frameEmployee.text_average.setText(twoDigits.format(_employebook.meanEarning));
			frameEmployee.text_highest.setText(twoDigits.format(_employebook.highest));
			frameEmployee.text_lowest.setText(twoDigits.format(_employebook.lowestE));
		}
	}
	
}
