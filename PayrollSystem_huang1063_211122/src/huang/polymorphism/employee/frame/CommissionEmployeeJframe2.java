package huang.polymorphism.employee.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class CommissionEmployeeJframe2 extends EmplyeeBaseJFarme_huang1063_V3 {
	public JTextField text_GrossSales;
	public JTextField text_Commission;
	public JLabel lblGroosSales;
	public JLabel lblCommissionrate;
	

//	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CommissionEmployeeJframe2 frame = new CommissionEmployeeJframe2(employeeType);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CommissionEmployeeJframe2(String employeeType) {
		super(employeeType);

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
	
	protected void initializeTextFieldAarrayList() {
		super.initializeTextFieldAarrayList();
		listTxtFieldsEmployeeG.add(text_GrossSales);
		listTxtFieldsEmployeeG.add(text_Commission);
	}
}
