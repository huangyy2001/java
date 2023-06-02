package huang.polymorphism.employee.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

//import javafx.scene.shape.Box;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Box;

public class EmplyeeBaseJFarme_huang1063_V2 extends JFrame {

	public JPanel contentPane;
	public JTextField text_company;
	public JTextField text_totalemployees;
	public JTextField text_earnings;
	public JTextField text_ssn;
	public JTextField text_firstname;
	public JTextField text_lastname;
	public JTextField text_employeeC;
	public JTextField text_highest;
	public JTextField text_lowest;
	public JTextField text_average;
	public JTextField text_a_level;
	public JTextField text_b_level1;
	public JTextField text_c_level;
	public JTextField text_b_level2;
	
	public static String employeeType;
	
	JTabbedPane tabbedPane;
	public String title4InputArea="Main Frame Area",tip4InputArea="Input andCalculate";
	public String title4TextArea="Rport OutputArea",tip4TextAerea="Output Final Report";
	public String title4JList="Record List Area",tip4JList="Output Record List";
	public String title4JTable="Record Output Table",tip4JTable="Output Records to Table";
	
	public JTextArea txtArea4RecordTextArea;
	public JList<Object> listArea4RecordListArea;
	
	public JTable table4RecordTextAeea;
	public Box box1, box2, box3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmplyeeBaseJFarme_huang1063_V2 frame = new EmplyeeBaseJFarme_huang1063_V2();
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
	public EmplyeeBaseJFarme_huang1063_V2() {
//		setTitle("superBase Emplyee(By YA-YI Huang)-App");
		setTitle("Application of "+employeeType);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 821);
		createAndSetupCoreComponents4TabbedPane();
		setupComponents4JPanel();
//		contentPane = new JPanel();
//		contentPane.setBackground(Color.LIGHT_GRAY);
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		
//		
//		JLabel lbl_look_feel = new JLabel("Look&Feel");
//		lbl_look_feel.setBounds(295, 27, 158, 50);
//		lbl_look_feel.setOpaque(true);
//		lbl_look_feel.setHorizontalAlignment(SwingConstants.CENTER);
//		lbl_look_feel.setForeground(Color.WHITE);
//		lbl_look_feel.setBackground(Color.DARK_GRAY);
//		lbl_look_feel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
//		
//		JButton btn_setprfile = new JButton("Set Profile");
//		btn_setprfile.setBounds(63, 101, 220, 27);
//		btn_setprfile.setForeground(Color.BLACK);
//		btn_setprfile.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_setprfile.setBackground(Color.ORANGE);
//		
//		JLabel lbl_company = new JLabel("Company :");
//		lbl_company.setBounds(34, 160, 82, 30);
//		lbl_company.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		JLabel lbl_totalemplyees = new JLabel("Total Employees :");
//		lbl_totalemplyees.setBounds(427, 162, 123, 27);
//		lbl_totalemplyees.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		JButton btn_Clear = new JButton("Clear Porfile/Results");
//		btn_Clear.setBounds(489, 101, 226, 27);
//		btn_Clear.setForeground(Color.BLACK);
//		btn_Clear.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_Clear.setBackground(Color.ORANGE);
//		
//		text_company = new JTextField();
//		text_company.setBounds(120, 165, 149, 21);
//		text_company.setColumns(10);
//		
//		text_totalemployees = new JTextField();
//		text_totalemployees.setBounds(560, 165, 139, 21);
//		text_totalemployees.setColumns(10);
//		
//		JLabel lbl_earnings = new JLabel("Earnings :");
//		lbl_earnings.setBounds(31, 229, 91, 27);
//		lbl_earnings.setOpaque(true);
//		lbl_earnings.setBackground(Color.PINK);
//		lbl_earnings.setFont(new Font("Bahnschrift", Font.ITALIC, 14));
//		
//		JButton btn_earnings = new JButton("Clear Record");
//		btn_earnings.setBounds(287, 229, 143, 23);
//		btn_earnings.setForeground(Color.BLACK);
//		btn_earnings.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_earnings.setBackground(Color.GRAY);
//		
//		text_earnings = new JTextField();
//		text_earnings.setBounds(128, 232, 149, 21);
//		text_earnings.setColumns(10);
//		
//		JLabel lbl_ssn = new JLabel("SSN :");
//		lbl_ssn.setBounds(31, 288, 82, 30);
//		lbl_ssn.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		JLabel lbl_firstname = new JLabel("First Name :");
//		lbl_firstname.setBounds(31, 328, 82, 32);
//		lbl_firstname.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		JLabel lbl_lastname = new JLabel("Last Name :");
//		lbl_lastname.setBounds(31, 366, 82, 32);
//		lbl_lastname.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		text_ssn = new JTextField();
//		text_ssn.setBounds(131, 293, 149, 21);
//		text_ssn.setColumns(10);
//		
//		text_firstname = new JTextField();
//		text_firstname.setBounds(131, 334, 149, 21);
//		text_firstname.setColumns(10);
//		
//		text_lastname = new JTextField();
//		text_lastname.setBounds(131, 372, 149, 21);
//		text_lastname.setColumns(10);
//		
//		JLabel lbl_area = new JLabel("Results Area");
//		lbl_area.setBounds(495, 247, 153, 30);
//		lbl_area.setHorizontalAlignment(SwingConstants.CENTER);
//		lbl_area.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		JLabel lbl_employeeC = new JLabel("Employee Counter :");
//		lbl_employeeC.setBounds(406, 296, 143, 18);
//		lbl_employeeC.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		text_employeeC = new JTextField();
//		text_employeeC.setBounds(553, 295, 149, 21);
//		text_employeeC.setColumns(10);
//		
//		JLabel lbl_highest = new JLabel("Highest Earning :");
//		lbl_highest.setBounds(406, 323, 143, 18);
//		lbl_highest.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		JLabel lbl_lowest = new JLabel("Lowest Earnings :");
//		lbl_lowest.setBounds(406, 350, 143, 18);
//		lbl_lowest.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		JLabel lbl_average = new JLabel("Average Earnings :");
//		lbl_average.setBounds(406, 381, 143, 18);
//		lbl_average.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		text_highest = new JTextField();
//		text_highest.setBounds(553, 322, 149, 21);
//		text_highest.setColumns(10);
//		
//		text_lowest = new JTextField();
//		text_lowest.setBounds(553, 349, 149, 21);
//		text_lowest.setColumns(10);
//		
//		text_average = new JTextField();
//		text_average.setBounds(548, 377, 149, 21);
//		text_average.setColumns(10);
//		
//		JLabel lbl_distr = new JLabel("Distribution of Wage-Levels");
//		lbl_distr.setBounds(50, 431, 665, 51);
//		lbl_distr.setOpaque(true);
//		lbl_distr.setHorizontalAlignment(SwingConstants.CENTER);
//		lbl_distr.setForeground(Color.WHITE);
//		lbl_distr.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
//		lbl_distr.setBackground(Color.DARK_GRAY);
//		
//		JLabel lbl_unit = new JLabel("Unit :");
//		lbl_unit.setBounds(91, 555, 43, 32);
//		lbl_unit.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		
//		JLabel lbl_thousand = new JLabel("Thousand(1000)");
//		lbl_thousand.setBounds(140, 555, 115, 33);
//		lbl_thousand.setHorizontalAlignment(SwingConstants.CENTER);
//		lbl_thousand.setOpaque(true);
//		lbl_thousand.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
//		lbl_thousand.setBackground(Color.PINK);
//		
//		JLabel lbl_a_level = new JLabel("A_Level >=");
//		lbl_a_level.setBounds(349, 517, 80, 32);
//		lbl_a_level.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
//		
//		JLabel lbl_b_level = new JLabel("B_Level =");
//		lbl_b_level.setBounds(349, 555, 80, 32);
//		lbl_b_level.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
//		
//		JLabel lbl_c_level = new JLabel("C_Level <=");
//		lbl_c_level.setBounds(349, 594, 80, 32);
//		lbl_c_level.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
//		
//		text_a_level = new JTextField();
//		text_a_level.setBounds(439, 522, 149, 24);
//		text_a_level.setHorizontalAlignment(SwingConstants.CENTER);
//		text_a_level.setFont(new Font("Arial Black", Font.ITALIC, 12));
//		text_a_level.setText("15");
//		text_a_level.setColumns(10);
//		
//		text_b_level1 = new JTextField();
//		text_b_level1.setBounds(439, 560, 48, 24);
//		text_b_level1.setFont(new Font("Arial Black", Font.ITALIC, 12));
//		text_b_level1.setHorizontalAlignment(SwingConstants.CENTER);
//		text_b_level1.setText("8");
//		text_b_level1.setColumns(10);
//		
//		text_c_level = new JTextField();
//		text_c_level.setBounds(439, 599, 149, 24);
//		text_c_level.setHorizontalAlignment(SwingConstants.CENTER);
//		text_c_level.setFont(new Font("Arial Black", Font.ITALIC, 12));
//		text_c_level.setText("8");
//		text_c_level.setColumns(10);
//		
//		text_b_level2 = new JTextField();
//		text_b_level2.setBounds(548, 560, 48, 24);
//		text_b_level2.setText("15");
//		text_b_level2.setFont(new Font("Arial Black", Font.ITALIC, 12));
//		text_b_level2.setColumns(10);
//		
//		JLabel lbl_b_level2 = new JLabel("~");
//		lbl_b_level2.setBounds(504, 555, 34, 33);
//		lbl_b_level2.setOpaque(true);
//		lbl_b_level2.setHorizontalAlignment(SwingConstants.CENTER);
//		lbl_b_level2.setFont(new Font("Arial Black", Font.PLAIN, 14));
//		lbl_b_level2.setBackground(Color.WHITE);
//		
//		JButton btn_a_level = new JButton("");
//		btn_a_level.setBounds(606, 524, 76, 25);
//		btn_a_level.setForeground(Color.BLACK);
//		btn_a_level.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_a_level.setBackground(Color.ORANGE);
//		
//		JButton btn_b_level = new JButton("");
//		btn_b_level.setBounds(606, 563, 76, 25);
//		btn_b_level.setForeground(Color.BLACK);
//		btn_b_level.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_b_level.setBackground(Color.ORANGE);
//		
//		JButton btn_c_level = new JButton("");
//		btn_c_level.setBounds(606, 601, 76, 25);
//		btn_c_level.setForeground(Color.BLACK);
//		btn_c_level.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_c_level.setBackground(Color.ORANGE);
//		
//		JButton btn_calculate = new JButton("Calculate");
//		btn_calculate.setBounds(50, 651, 107, 23);
//		btn_calculate.setForeground(Color.BLACK);
//		btn_calculate.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_calculate.setBackground(Color.ORANGE);
//		
//		JButton btn_open = new JButton("OpenFile");
//		btn_open.setBounds(50, 707, 107, 27);
//		btn_open.setForeground(Color.BLACK);
//		btn_open.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_open.setBackground(Color.ORANGE);
//		
//		JButton btn_8 = new JButton("Output to TextArea");
//		btn_8.setBounds(176, 651, 175, 23);
//		btn_8.setForeground(Color.BLACK);
//		btn_8.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_8.setBackground(Color.ORANGE);
//		
//		JButton btn_Pie = new JButton("Pie-Chart Demo");
//		btn_Pie.setBounds(371, 651, 175, 23);
//		btn_Pie.setForeground(Color.BLACK);
//		btn_Pie.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_Pie.setBackground(Color.ORANGE);
//		
//		JButton btn_refresh = new JButton("Refresh");
//		btn_refresh.setBounds(576, 651, 113, 23);
//		btn_refresh.setForeground(Color.BLACK);
//		btn_refresh.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_refresh.setBackground(Color.ORANGE);
//		
//		JButton btn_readfile = new JButton("ReadFile");
//		btn_readfile.setBounds(309, 707, 120, 27);
//		btn_readfile.setForeground(Color.BLACK);
//		btn_readfile.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_readfile.setBackground(Color.ORANGE);
//		
//		JButton btn_exit = new JButton("Exit");
//		btn_exit.setBounds(518, 707, 99, 27);
//		btn_exit.setForeground(Color.BLACK);
//		btn_exit.setFont(new Font("Arial", Font.BOLD, 15));
//		btn_exit.setBackground(Color.ORANGE);
//		
//		JSeparator separator = new JSeparator();
//		separator.setBounds(247, 200, 246, 9);
//		separator.setForeground(Color.YELLOW);
//		
//		JSeparator separator_1 = new JSeparator();
//		separator_1.setBounds(236, 411, 246, 9);
//		separator_1.setForeground(Color.YELLOW);
//		
//		JSeparator separator_2 = new JSeparator();
//		separator_2.setBounds(232, 632, 246, 9);
//		separator_2.setForeground(Color.YELLOW);
//		contentPane.setLayout(null);
//		contentPane.add(lbl_distr);
//		contentPane.add(lbl_unit);
//		contentPane.add(lbl_thousand);
//		contentPane.add(lbl_b_level);
//		contentPane.add(text_b_level1);
//		contentPane.add(lbl_b_level2);
//		contentPane.add(text_b_level2);
//		contentPane.add(lbl_a_level);
//		contentPane.add(text_a_level);
//		contentPane.add(lbl_c_level);
//		contentPane.add(text_c_level);
//		contentPane.add(btn_a_level);
//		contentPane.add(btn_b_level);
//		contentPane.add(btn_c_level);
//		contentPane.add(lbl_company);
//		contentPane.add(text_company);
//		contentPane.add(btn_setprfile);
//		contentPane.add(lbl_totalemplyees);
//		contentPane.add(text_totalemployees);
//		contentPane.add(btn_Clear);
//		contentPane.add(lbl_ssn);
//		contentPane.add(text_ssn);
//		contentPane.add(lbl_lastname);
//		contentPane.add(lbl_firstname);
//		contentPane.add(text_lastname);
//		contentPane.add(text_firstname);
//		contentPane.add(lbl_average);
//		contentPane.add(lbl_highest);
//		contentPane.add(lbl_employeeC);
//		contentPane.add(lbl_lowest);
//		contentPane.add(text_lowest);
//		contentPane.add(text_highest);
//		contentPane.add(text_average);
//		contentPane.add(text_employeeC);
//		contentPane.add(lbl_earnings);
//		contentPane.add(text_earnings);
//		contentPane.add(btn_earnings);
//		contentPane.add(lbl_area);
//		contentPane.add(lbl_look_feel);
//		contentPane.add(btn_open);
//		contentPane.add(btn_calculate);
//		contentPane.add(btn_8);
//		contentPane.add(btn_Pie);
//		contentPane.add(btn_refresh);
//		contentPane.add(btn_readfile);
//		contentPane.add(btn_exit);
//		contentPane.add(separator);
//		contentPane.add(separator_1);
//		contentPane.add(separator_2);
	}
	protected void createAndSetupCoreComponents4TabbedPane()
	{
		contentPane=new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED,Color.LIGHT_GRAY,null,Color.CYAN,null));
		
		contentPane.setLayout(null);
		  
		  box1=Box.createHorizontalBox();
		  box2=Box.createHorizontalBox();
		  box3=Box.createHorizontalBox();
		  
		  txtArea4RecordTextArea=new JTextArea(500,650);
		  txtArea4RecordTextArea.setEditable(false);
		  box1.add(new JScrollPane(txtArea4RecordTextArea));
		  
		  listArea4RecordListArea=new JList<>();
		  listArea4RecordListArea.setBounds(10,10,500,600);
		  listArea4RecordListArea.setAutoscrolls(true);
		  box2.add(new JScrollPane(listArea4RecordListArea));
		  
		  tabbedPane=new JTabbedPane();
		  tabbedPane.addTab(title4InputArea,null,contentPane,tip4InputArea);
		  tabbedPane.addTab(title4TextArea,null,box1,title4TextArea);
		  tabbedPane.addTab(title4JList,null,box2,tip4JList);
		  tabbedPane.addTab(title4JTable,null,box3,tip4JTable);
		  
		  getContentPane().add(tabbedPane);
				
	}
	protected void setupComponents4JPanel()
	{
		JLabel lbl_look_feel = new JLabel("Look&Feel");
		lbl_look_feel.setBounds(295, 27, 158, 50);
		lbl_look_feel.setOpaque(true);
		lbl_look_feel.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_look_feel.setForeground(Color.WHITE);
		lbl_look_feel.setBackground(Color.DARK_GRAY);
		lbl_look_feel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		
		JButton btn_setprfile = new JButton("Set Profile");
		btn_setprfile.setBounds(63, 101, 220, 27);
		btn_setprfile.setForeground(Color.BLACK);
		btn_setprfile.setFont(new Font("Arial", Font.BOLD, 15));
		btn_setprfile.setBackground(Color.ORANGE);
		
		JLabel lbl_company = new JLabel("Company :");
		lbl_company.setBounds(34, 160, 82, 30);
		lbl_company.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel lbl_totalemplyees = new JLabel("Total Employees :");
		lbl_totalemplyees.setBounds(427, 162, 123, 27);
		lbl_totalemplyees.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JButton btn_Clear = new JButton("Clear Porfile/Results");
		btn_Clear.setBounds(489, 101, 226, 27);
		btn_Clear.setForeground(Color.BLACK);
		btn_Clear.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Clear.setBackground(Color.ORANGE);
		
		text_company = new JTextField();
		text_company.setBounds(120, 165, 149, 21);
		text_company.setColumns(10);
		
		text_totalemployees = new JTextField();
		text_totalemployees.setBounds(560, 165, 139, 21);
		text_totalemployees.setColumns(10);
		
		JLabel lbl_earnings = new JLabel("Earnings :");
		lbl_earnings.setBounds(31, 229, 91, 27);
		lbl_earnings.setOpaque(true);
		lbl_earnings.setBackground(Color.PINK);
		lbl_earnings.setFont(new Font("Bahnschrift", Font.ITALIC, 14));
		
		JButton btn_earnings = new JButton("Clear Record");
		btn_earnings.setBounds(287, 229, 143, 23);
		btn_earnings.setForeground(Color.BLACK);
		btn_earnings.setFont(new Font("Arial", Font.BOLD, 15));
		btn_earnings.setBackground(Color.GRAY);
		
		text_earnings = new JTextField();
		text_earnings.setBounds(128, 232, 149, 21);
		text_earnings.setColumns(10);
		
		JLabel lbl_ssn = new JLabel("SSN :");
		lbl_ssn.setBounds(31, 288, 82, 30);
		lbl_ssn.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel lbl_firstname = new JLabel("First Name :");
		lbl_firstname.setBounds(31, 328, 82, 32);
		lbl_firstname.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel lbl_lastname = new JLabel("Last Name :");
		lbl_lastname.setBounds(31, 366, 82, 32);
		lbl_lastname.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		text_ssn = new JTextField();
		text_ssn.setBounds(131, 293, 149, 21);
		text_ssn.setColumns(10);
		
		text_firstname = new JTextField();
		text_firstname.setBounds(131, 334, 149, 21);
		text_firstname.setColumns(10);
		
		text_lastname = new JTextField();
		text_lastname.setBounds(131, 372, 149, 21);
		text_lastname.setColumns(10);
		
		JLabel lbl_area = new JLabel("Results Area");
		lbl_area.setBounds(495, 247, 153, 30);
		lbl_area.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_area.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel lbl_employeeC = new JLabel("Employee Counter :");
		lbl_employeeC.setBounds(406, 296, 143, 18);
		lbl_employeeC.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		text_employeeC = new JTextField();
		text_employeeC.setBounds(553, 295, 149, 21);
		text_employeeC.setColumns(10);
		
		JLabel lbl_highest = new JLabel("Highest Earning :");
		lbl_highest.setBounds(406, 323, 143, 18);
		lbl_highest.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel lbl_lowest = new JLabel("Lowest Earnings :");
		lbl_lowest.setBounds(406, 350, 143, 18);
		lbl_lowest.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel lbl_average = new JLabel("Average Earnings :");
		lbl_average.setBounds(406, 381, 143, 18);
		lbl_average.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		text_highest = new JTextField();
		text_highest.setBounds(553, 322, 149, 21);
		text_highest.setColumns(10);
		
		text_lowest = new JTextField();
		text_lowest.setBounds(553, 349, 149, 21);
		text_lowest.setColumns(10);
		
		text_average = new JTextField();
		text_average.setBounds(548, 377, 149, 21);
		text_average.setColumns(10);
		
		JLabel lbl_distr = new JLabel("Distribution of Wage-Levels");
		lbl_distr.setBounds(50, 431, 665, 51);
		lbl_distr.setOpaque(true);
		lbl_distr.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_distr.setForeground(Color.WHITE);
		lbl_distr.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lbl_distr.setBackground(Color.DARK_GRAY);
		
		JLabel lbl_unit = new JLabel("Unit :");
		lbl_unit.setBounds(91, 555, 43, 32);
		lbl_unit.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		
		JLabel lbl_thousand = new JLabel("Thousand(1000)");
		lbl_thousand.setBounds(140, 555, 115, 33);
		lbl_thousand.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_thousand.setOpaque(true);
		lbl_thousand.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		lbl_thousand.setBackground(Color.PINK);
		
		JLabel lbl_a_level = new JLabel("A_Level >=");
		lbl_a_level.setBounds(349, 517, 80, 32);
		lbl_a_level.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lbl_b_level = new JLabel("B_Level =");
		lbl_b_level.setBounds(349, 555, 80, 32);
		lbl_b_level.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JLabel lbl_c_level = new JLabel("C_Level <=");
		lbl_c_level.setBounds(349, 594, 80, 32);
		lbl_c_level.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		text_a_level = new JTextField();
		text_a_level.setBounds(439, 522, 149, 24);
		text_a_level.setHorizontalAlignment(SwingConstants.CENTER);
		text_a_level.setFont(new Font("Arial Black", Font.ITALIC, 12));
		text_a_level.setText("15");
		text_a_level.setColumns(10);
		
		text_b_level1 = new JTextField();
		text_b_level1.setBounds(439, 560, 48, 24);
		text_b_level1.setFont(new Font("Arial Black", Font.ITALIC, 12));
		text_b_level1.setHorizontalAlignment(SwingConstants.CENTER);
		text_b_level1.setText("8");
		text_b_level1.setColumns(10);
		
		text_c_level = new JTextField();
		text_c_level.setBounds(439, 599, 149, 24);
		text_c_level.setHorizontalAlignment(SwingConstants.CENTER);
		text_c_level.setFont(new Font("Arial Black", Font.ITALIC, 12));
		text_c_level.setText("8");
		text_c_level.setColumns(10);
		
		text_b_level2 = new JTextField();
		text_b_level2.setBounds(548, 560, 48, 24);
		text_b_level2.setText("15");
		text_b_level2.setFont(new Font("Arial Black", Font.ITALIC, 12));
		text_b_level2.setColumns(10);
		
		JLabel lbl_b_level2 = new JLabel("~");
		lbl_b_level2.setBounds(504, 555, 34, 33);
		lbl_b_level2.setOpaque(true);
		lbl_b_level2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_b_level2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbl_b_level2.setBackground(Color.WHITE);
		
		JButton btn_a_level = new JButton("");
		btn_a_level.setBounds(606, 524, 76, 25);
		btn_a_level.setForeground(Color.BLACK);
		btn_a_level.setFont(new Font("Arial", Font.BOLD, 15));
		btn_a_level.setBackground(Color.ORANGE);
		
		JButton btn_b_level = new JButton("");
		btn_b_level.setBounds(606, 563, 76, 25);
		btn_b_level.setForeground(Color.BLACK);
		btn_b_level.setFont(new Font("Arial", Font.BOLD, 15));
		btn_b_level.setBackground(Color.ORANGE);
		
		JButton btn_c_level = new JButton("");
		btn_c_level.setBounds(606, 601, 76, 25);
		btn_c_level.setForeground(Color.BLACK);
		btn_c_level.setFont(new Font("Arial", Font.BOLD, 15));
		btn_c_level.setBackground(Color.ORANGE);
		
		JButton btn_calculate = new JButton("Calculate");
		btn_calculate.setBounds(50, 651, 107, 23);
		btn_calculate.setForeground(Color.BLACK);
		btn_calculate.setFont(new Font("Arial", Font.BOLD, 15));
		btn_calculate.setBackground(Color.ORANGE);
		
		JButton btn_open = new JButton("OpenFile");
		btn_open.setBounds(50, 707, 107, 27);
		btn_open.setForeground(Color.BLACK);
		btn_open.setFont(new Font("Arial", Font.BOLD, 15));
		btn_open.setBackground(Color.ORANGE);
		
		JButton btn_8 = new JButton("Output to TextArea");
		btn_8.setBounds(176, 651, 175, 23);
		btn_8.setForeground(Color.BLACK);
		btn_8.setFont(new Font("Arial", Font.BOLD, 15));
		btn_8.setBackground(Color.ORANGE);
		
		JButton btn_Pie = new JButton("Pie-Chart Demo");
		btn_Pie.setBounds(371, 651, 175, 23);
		btn_Pie.setForeground(Color.BLACK);
		btn_Pie.setFont(new Font("Arial", Font.BOLD, 15));
		btn_Pie.setBackground(Color.ORANGE);
		
		JButton btn_refresh = new JButton("Refresh");
		btn_refresh.setBounds(576, 651, 113, 23);
		btn_refresh.setForeground(Color.BLACK);
		btn_refresh.setFont(new Font("Arial", Font.BOLD, 15));
		btn_refresh.setBackground(Color.ORANGE);
		
		JButton btn_readfile = new JButton("ReadFile");
		btn_readfile.setBounds(309, 707, 120, 27);
		btn_readfile.setForeground(Color.BLACK);
		btn_readfile.setFont(new Font("Arial", Font.BOLD, 15));
		btn_readfile.setBackground(Color.ORANGE);
		
		JButton btn_exit = new JButton("Exit");
		btn_exit.setBounds(583, 707, 99, 27);
		btn_exit.setForeground(Color.BLACK);
		btn_exit.setFont(new Font("Arial", Font.BOLD, 15));
		btn_exit.setBackground(Color.ORANGE);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(247, 200, 246, 9);
		separator.setForeground(Color.YELLOW);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(236, 411, 246, 9);
		separator_1.setForeground(Color.YELLOW);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(232, 632, 246, 9);
		separator_2.setForeground(Color.YELLOW);
		contentPane.setLayout(null);
		contentPane.add(lbl_distr);
		contentPane.add(lbl_unit);
		contentPane.add(lbl_thousand);
		contentPane.add(lbl_b_level);
		contentPane.add(text_b_level1);
		contentPane.add(lbl_b_level2);
		contentPane.add(text_b_level2);
		contentPane.add(lbl_a_level);
		contentPane.add(text_a_level);
		contentPane.add(lbl_c_level);
		contentPane.add(text_c_level);
		contentPane.add(btn_a_level);
		contentPane.add(btn_b_level);
		contentPane.add(btn_c_level);
		contentPane.add(lbl_company);
		contentPane.add(text_company);
		contentPane.add(btn_setprfile);
		contentPane.add(lbl_totalemplyees);
		contentPane.add(text_totalemployees);
		contentPane.add(btn_Clear);
		contentPane.add(lbl_ssn);
		contentPane.add(text_ssn);
		contentPane.add(lbl_lastname);
		contentPane.add(lbl_firstname);
		contentPane.add(text_lastname);
		contentPane.add(text_firstname);
		contentPane.add(lbl_average);
		contentPane.add(lbl_highest);
		contentPane.add(lbl_employeeC);
		contentPane.add(lbl_lowest);
		contentPane.add(text_lowest);
		contentPane.add(text_highest);
		contentPane.add(text_average);
		contentPane.add(text_employeeC);
		contentPane.add(lbl_earnings);
		contentPane.add(text_earnings);
		contentPane.add(btn_earnings);
		contentPane.add(lbl_area);
		contentPane.add(lbl_look_feel);
		contentPane.add(btn_open);
		contentPane.add(btn_calculate);
		contentPane.add(btn_8);
		contentPane.add(btn_Pie);
		contentPane.add(btn_refresh);
		contentPane.add(btn_readfile);
		contentPane.add(btn_exit);
		contentPane.add(separator);
		contentPane.add(separator_1);
		contentPane.add(separator_2);
		
		JButton btn_writeF = new JButton("write File");
		btn_writeF.setForeground(Color.BLACK);
		btn_writeF.setFont(new Font("Arial", Font.BOLD, 15));
		btn_writeF.setBackground(Color.ORANGE);
		btn_writeF.setBounds(176, 707, 107, 27);
		contentPane.add(btn_writeF);
		
		JButton btn_closeF = new JButton("Close File");
		btn_closeF.setForeground(Color.BLACK);
		btn_closeF.setFont(new Font("Arial", Font.BOLD, 15));
		btn_closeF.setBackground(Color.ORANGE);
		btn_closeF.setBounds(450, 707, 107, 27);
		contentPane.add(btn_closeF);
		
	}
}
