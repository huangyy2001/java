package huang.polymorphism.employee.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import huang.polymorphism.employee.Employee_huang1063;
import huang.polymorphism.employee.buttoncontroller.BtnController4SuperEmployeeBase_huang1063;
import huang.polymorphism.employee.earningbook.CommissionEmployeeBook_Adv_huang1063;
import huang.polymorphism.employee.earningbook.EmployeeBaseBook_Adv_huang1063;
import huang.polymorphism.employee.earningbook.HourlyEmployeeBook_Adv_huang1063;
import huang.polymorphism.employee.helper.Helper4CommissionEmployee_huang1063;
import huang.polymorphism.employee.helper.Helper4HourlyEmployee_huang1063;
import huang.polymorphism.employee.helper.Helper4SuperEmplyeeBase_huang0163;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class HourlyEmployeeJframe_huang1063 extends EmplyeeBaseJFarme_huang1063_V4 {

	public JTextField text_hourlywage;
	public JTextField text_hours;
	public JTextField text_exhuorRate;
	

//	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CommissionEmployeeJframe3 frame = new CommissionEmployeeJframe3(employeeType);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		employeeType="Hourly Employee(by YA-YI Huang)";
		HourlyEmployeeJframe_huang1063 component= new HourlyEmployeeJframe_huang1063(employeeType);
		Main_Run(component, employeeType, new BtnController4SuperEmployeeBase_huang1063(component, null));
		
	}

	/**
	 * Create the frame.
	 */
	public HourlyEmployeeJframe_huang1063(String employeeType) {
		super(employeeType);
		employeeType4Jframe="Hourly Employee(by YA-YI Huang)";
		helper4Employee=new Helper4HourlyEmployee_huang1063(this);

	}
	
	protected void setupComponents4JPanel() {

		super.setupComponents4JPanel();
		
		JLabel lblNewLabel = new JLabel("hourly Wage");
		lblNewLabel.setBounds(34, 408, 95, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblHours = new JLabel("hours");
		lblHours.setBounds(34, 433, 47, 15);
		contentPane.add(lblHours);
		
		text_hourlywage = new JTextField();
		text_hourlywage.setBounds(131, 405, 96, 21);
		contentPane.add(text_hourlywage);
		text_hourlywage.setColumns(10);
		
		text_hours = new JTextField();
		text_hours.setColumns(10);
		text_hours.setBounds(131, 430, 96, 21);
		contentPane.add(text_hours);
		
		JLabel lblNewLabel_1_1 = new JLabel("extrahourRate");
		lblNewLabel_1_1.setBounds(247, 408, 99, 15);
		contentPane.add(lblNewLabel_1_1);
		
		text_exhuorRate = new JTextField();
		text_exhuorRate.setColumns(10);
		text_exhuorRate.setBounds(247, 430, 96, 21);
		contentPane.add(text_exhuorRate);
	}
	
	@Override
	public void initializeTitleNamesList4JTable() {
		super.initializeTitleNamesList4JTable();
		
		listTitleName4Table.add(EmployeeRecordIndices.HOURLY_WAGE.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.HOURS_WORKED.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.EXTRA_HOURS_RATE.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.EARNINGS.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.WAGE_LEVEL.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.INDEX_COLOR.getRecordIndexType());
	}
	
	@Override
	public EmployeeBaseBook_Adv_huang1063 setBasics2StartBookingEmployee()
	{
		employeebook=new HourlyEmployeeBook_Adv_huang1063(helper4Employee.CompanyName,helper4Employee.EmployeeNo,true);
		
		return employeebook;
	}
	
	@Override
	public EmplyeeBaseJFarme_huang1063_V4 refreshJFrame(JDesktopPane theDesktop) {
		EmplyeeBaseJFarme_huang1063_V4 component=new HourlyEmployeeJframe_huang1063(employeeType4Jframe);
		btncontroller=new BtnController4SuperEmployeeBase_huang1063(component, theDesktop);
		component=Main_Run(component, employeeType4Jframe, btncontroller);
		return component;
	}
	
	@Override
	public void initializeTextFieldAarrayList() {
		super.initializeTextFieldAarrayList();
		
		listTxtFieldsEmployeeG.add(text_hourlywage);
		listTxtFieldsEmployeeG.add(text_hourlywage);
		listTxtFieldsEmployeeG.add(text_exhuorRate);
	}
}
