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
import huang.polymorphism.employee.helper.Helper4CommissionEmployee_huang1063;
import huang.polymorphism.employee.helper.Helper4SuperEmplyeeBase_huang0163;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class CommissionEmployeeJframe3_huang1063 extends EmplyeeBaseJFarme_huang1063_V4 {
	public JTextField text_GrossSales;
	public JTextField text_Commission;
	public JLabel lblGroosSales;
	public JLabel lblCommissionrate;
	

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
		employeeType="commission Employee(by YA-YI Huang)";
		CommissionEmployeeJframe3_huang1063 component= new CommissionEmployeeJframe3_huang1063(employeeType);
		Main_Run(component, employeeType, new BtnController4SuperEmployeeBase_huang1063(component, null));
		
	}

	/**
	 * Create the frame.
	 */
	public CommissionEmployeeJframe3_huang1063(String employeeType) {
		super(employeeType);
		employeeType4Jframe="commission Employee(by YA-YI Huang)";
		helper4Employee=new Helper4CommissionEmployee_huang1063(this);

	}
	
	protected void setupComponents4JPanel() {

		super.setupComponents4JPanel();
		lblGroosSales = new JLabel("Gross Sales:");
		lblGroosSales.setFont(new Font("Arial", Font.BOLD, 14));
		lblGroosSales.setBounds(41, 435, 88, 15);
		contentPane.add(lblGroosSales);
		
		lblCommissionrate = new JLabel("Commission Rate:");
		lblCommissionrate.setFont(new Font("Arial", Font.BOLD, 14));
		lblCommissionrate.setBounds(287, 409, 138, 15);
		contentPane.add(lblCommissionrate);
		
		text_GrossSales = new JTextField();
		text_GrossSales.setBounds(141, 434, 128, 21);
		contentPane.add(text_GrossSales);
		text_GrossSales.setColumns(10);
		
		text_Commission = new JTextField();
		text_Commission.setBounds(313, 434, 96, 21);
		contentPane.add(text_Commission);
		text_Commission.setColumns(10);
	}
	
	@Override
	public void initializeTitleNamesList4JTable() {
		super.initializeTitleNamesList4JTable();
		
		listTitleName4Table.add(EmployeeRecordIndices.GROSS_SALES.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.COMMISSION_RATE.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.EARNINGS.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.WAGE_LEVEL.getRecordIndexType());
		listTitleName4Table.add(EmployeeRecordIndices.INDEX_COLOR.getRecordIndexType());
	}
	
	@Override
	public EmployeeBaseBook_Adv_huang1063 setBasics2StartBookingEmployee()
	{
		employeebook=new CommissionEmployeeBook_Adv_huang1063(helper4Employee.CompanyName,helper4Employee.EmployeeNo,true);
		
		return employeebook;
	}
	
	@Override
	public EmplyeeBaseJFarme_huang1063_V4 refreshJFrame(JDesktopPane theDesktop) {
		EmplyeeBaseJFarme_huang1063_V4 component=new CommissionEmployeeJframe3_huang1063(employeeType4Jframe);
		btncontroller=new BtnController4SuperEmployeeBase_huang1063(component, theDesktop);
		component=Main_Run(component, employeeType4Jframe, btncontroller);
		return component;
	}
	
	@Override
	public void initializeTextFieldAarrayList() {
		super.initializeTextFieldAarrayList();
		listTxtFieldsEmployeeG.add(text_GrossSales);
		listTxtFieldsEmployeeG.add(text_Commission);
	}
}
