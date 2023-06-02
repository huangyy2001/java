package huang.polymorphism.employee.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.text.TextBlock;

import huang.polymorphism.employee.buttoncontroller.BtnController4SuperEmployeeBase_huang1063;
import huang.polymorphism.employee.earningbook.EmployeeBaseBook_Adv_huang1063;
import huang.polymorphism.employee.helper.Helper4SuperEmplyeeBase_huang0163;

//import javafx.scene.shape.Box;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
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
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.awt.event.ActionEvent;

public class EmplyeeBaseJFarme_huang1063_V4 extends JFrame {
	public static EmplyeeBaseJFarme_huang1063_V4 frame;

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
	public JTextField text_a;
	public JTextField text_b;
	public JTextField text_c;
	public JButton btn_calculate;
	public JButton btn_Optupt;
	public JButton btn_Pie;
	public JButton btn_refresh;
	public JButton btn_open;
//	public JButton btn_writeF;
	public JButton btn_readfile;
//	public JButton btn_closeF;
	public JButton btn_exit;
	public JButton btn_setprfile;
	public JButton btn_Clear;
	public JButton btn_earnings;
	public JLabel lbl_look_feel;
	public JLabel lbl_company;
	public JLabel lbl_totalemplyees;
	public JLabel lbl_earnings;
	public JLabel lbl_ssn;
	public JLabel lbl_area;
	public JLabel lbl_employeeC;
	public JLabel lbl_highest;
	public JLabel lbl_firstname;
	public JLabel lbl_lastname;
	public JLabel lbl_lowest;
	public JLabel lbl_average;
	public JLabel lbl_distr;
	public JLabel lbl_unit;
	public JLabel lbl_thousand;
	public JLabel lbl_b_level2;
	public JLabel lbl_a_level;
	public JLabel lbl_b_level;
	public JLabel lbl_c_level;
	public JLabel lbl_a;
	public JLabel lbl_bdown;
	public JLabel lbl_bup;
	public JLabel lbl_c;
	public JSeparator separator;
	public JSeparator separator_1;
	public JSeparator separator_2;
	
	
	
	public static String employeeType;
	public JScrollPane tableAggregate;
	JTabbedPane tabbedPane;
	public String title4InputArea="Main Frame Area",tip4InputArea="Input andCalculate";
	public String title4TextArea="Rport OutputArea",tip4TextAerea="Output Final Report";
	public String title4JList="Record List Area",tip4JList="Output Record List";
	public String title4JTable="Record Output Table",tip4JTable="Output Records to Table";
	
	/**
	 * google "JList DefaultListModel()"
	 *  https://stackoverflow.com/questions/5212983/jlist-add-remove-item
	 *  http://www.java2s.com/Code/Java/Swing-JFC/AnexampleofJListwithaDefaultListModel.htm
	 *  need to figure out later (DefaultListModel)
	 */
	public DefaultListModel<Object> listModel = new DefaultListModel<Object>(); 
	public JTextArea txtArea4RecordTextArea;
	public JList<Object> listArea4RecordListArea;
	public EmployeeBaseBook_Adv_huang1063<?> employeebook;
	
	public JTable table4RecordTextAeea;
	public Box box1, box2, box3;
	
	public Object[][] dataUsed;

	/**
	 * Launch the application.
	 */
	public JButton[] optionButtons;
	public Btns4UniversalProcess_MenuOpAdv[] bas= {
			Btns4UniversalProcess_MenuOpAdv.Process_Data,
			Btns4UniversalProcess_MenuOpAdv.Refresh,
			Btns4UniversalProcess_MenuOpAdv.Clear_Record,
			Btns4UniversalProcess_MenuOpAdv.Set_Profile,
			Btns4UniversalProcess_MenuOpAdv.Clear_Profile_and_Results,
			Btns4UniversalProcess_MenuOpAdv.Output_Results,
			Btns4UniversalProcess_MenuOpAdv.Exit,
			Btns4UniversalProcess_MenuOpAdv.OpenFile,
			Btns4UniversalProcess_MenuOpAdv.ReadFile,
//			Btns4UniversalProcess_MenuOpAdv.WriteFile,
//			Btns4UniversalProcess_MenuOpAdv.CloseFile,
			Btns4UniversalProcess_MenuOpAdv.PieChartDemo};
	
	public static List<JTextField> listTxtFieldsProfileG= new LinkedList<>();
	public static List<JTextField> listTxtFieldsEmployeeG= new LinkedList<>();
	public List<JTextField> listTxtFieldsResults= new LinkedList<>();
	
	public List<String> listTitleName4Table= new LinkedList<>();
	public String[] namesUsed;

	public static JDesktopPane theDesktop=null;

	public static String employeeType4Jframe;
	
	public boolean isSimpleFormat=false;
	
	public static BtnController4SuperEmployeeBase_huang1063 btncontroller;
	public static Helper4SuperEmplyeeBase_huang0163 helper4Employee;

	
	public static void main(String[] args) {
//		employeeType="superBase Emplyee(By YA-YI Huang)-App";
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EmplyeeBaseJFarme_huang1063_V4 frame = new EmplyeeBaseJFarme_huang1063_V4(employeeType);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		EmplyeeBaseJFarme_huang1063_V4 frame_real = new EmplyeeBaseJFarme_huang1063_V4(employeeType);
		//CommissionEmployeeJframe3 component=new CommissionEmployeeJframe3(employeeType);
		Main_Run(frame_real, employeeType, new BtnController4SuperEmployeeBase_huang1063(frame_real,theDesktop));
	}
	
	public static EmplyeeBaseJFarme_huang1063_V4  Main_Run(EmplyeeBaseJFarme_huang1063_V4 component, String _employeeType,
	BtnController4SuperEmployeeBase_huang1063 _btnController/* , JDesktopPane theDesktop */) {	
		
		_btnController.addActionListenerOnButtons();
		
		run2StartOrRefresh(_employeeType, component);
		return component;
	}//end Main_Run
	
	public static void run2StartOrRefresh(String _frameTitle, EmplyeeBaseJFarme_huang1063_V4 component) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = component;					
					frame.setTitle(_frameTitle);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(100, 100, 722, 821);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//end run2StartOrRefresh

	/**
	 * Create the frame.
	 * 
	 * 
	 */
		public EmplyeeBaseJFarme_huang1063_V4(String employeeType) {
//		setTitle("superBase Emplyee(By YA-YI Huang)-App");
		super("Employee-Book Application for "+ employeeType);// either with or without this line is OK(for JFrame)
		employeeType4Jframe=employeeType;
		setupAll();
		helper4Employee=new Helper4SuperEmplyeeBase_huang0163(this);
	}	
	
	protected void setUpTitleAndBasics4Jframe(String _frameTitle, String employeeType) {
		setTitle(_frameTitle +employeeType);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 841);
	}
	
	
	public void setupAll() {
		setUpTitleAndBasics4Jframe("Employee-Book Application for", employeeType);
		createAndSetupCoreComponents4TabbedPane();
		setupComponents4JPanel();
		
		initializeButtonArray();
		initializeTextFieldAarrayList();
		
		initializeTitleNamesList4JTable();
		initiallizedTitleNamesStringList4Table();
		
		getContentPane().add(tabbedPane);
		
	}
	
	protected void createAndSetupCoreComponents4TabbedPane()
	{
		  contentPane= new JPanel();
		  contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED,Color.LIGHT_GRAY,null,Color.cyan,null));
		  
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
		  
		  tabbedPane.setBackgroundAt(0, Color.CYAN);
		  tabbedPane.setBackgroundAt(1, Color.GREEN);
		  tabbedPane.setBackgroundAt(2, Color.YELLOW);
		  tabbedPane.setBackgroundAt(3, Color.MAGENTA);

				
	}
	protected void setupComponents4JPanel()
	{
		  lbl_look_feel = new JLabel("Look&Feel");
		  lbl_look_feel.setBounds(295, 27, 158, 50);
		  lbl_look_feel.setOpaque(true);
		  lbl_look_feel.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_look_feel.setForeground(Color.WHITE);
		  lbl_look_feel.setBackground(Color.DARK_GRAY);
		  lbl_look_feel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		  
		  btn_setprfile = new JButton("Set Profile");
		  btn_setprfile.setBounds(63, 101, 220, 27);
		  btn_setprfile.setForeground(Color.BLACK);
		  btn_setprfile.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_setprfile.setBackground(Color.ORANGE);
		  
		  lbl_company = new JLabel("Company :");
		  lbl_company.setBounds(34, 160, 82, 30);
		  lbl_company.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  lbl_totalemplyees = new JLabel("Total Employees :");
		  lbl_totalemplyees.setBounds(427, 162, 123, 27);
		  lbl_totalemplyees.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  btn_Clear = new JButton("Clear Porfile/Results");
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
		  
		  lbl_earnings = new JLabel("Earnings :");
		  lbl_earnings.setBounds(31, 229, 91, 27);
		  lbl_earnings.setOpaque(true);
		  lbl_earnings.setBackground(Color.PINK);
		  lbl_earnings.setFont(new Font("Bahnschrift", Font.ITALIC, 14));
		  
		  btn_earnings = new JButton("Clear Record");
		  btn_earnings.setBounds(287, 229, 143, 23);
		  btn_earnings.setForeground(Color.BLACK);
		  btn_earnings.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_earnings.setBackground(Color.GRAY);
		  
		  text_earnings = new JTextField();
		  text_earnings.setBounds(128, 232, 149, 21);
		  text_earnings.setColumns(10);
		  
		  lbl_ssn = new JLabel("SSN :");
		  lbl_ssn.setBounds(31, 288, 82, 30);
		  lbl_ssn.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  lbl_firstname = new JLabel("First Name :");
		  lbl_firstname.setBounds(31, 328, 82, 32);
		  lbl_firstname.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  lbl_lastname = new JLabel("Last Name :");
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
		  
		  lbl_area = new JLabel("Results Area");
		  lbl_area.setBounds(495, 247, 153, 30);
		  lbl_area.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_area.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  lbl_employeeC = new JLabel("Employee Counter :");
		  lbl_employeeC.setBounds(406, 296, 143, 18);
		  lbl_employeeC.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  text_employeeC = new JTextField();
		  text_employeeC.setBounds(553, 295, 149, 21);
		  text_employeeC.setColumns(10);
		  
		  lbl_highest = new JLabel("Highest Earning :");
		  lbl_highest.setBounds(406, 323, 143, 18);
		  lbl_highest.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  lbl_lowest = new JLabel("Lowest Earnings :");
		  lbl_lowest.setBounds(406, 350, 143, 18);
		  lbl_lowest.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  lbl_average = new JLabel("Average Earnings :");
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
		  
		  lbl_distr = new JLabel("Distribution of Wage-Levels");
		  lbl_distr.setBounds(50, 485, 665, 51);
		  lbl_distr.setOpaque(true);
		  lbl_distr.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_distr.setForeground(Color.WHITE);
		  lbl_distr.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		  lbl_distr.setBackground(Color.DARK_GRAY);
		  
		  lbl_unit = new JLabel("Unit :");
		  lbl_unit.setBounds(86, 597, 43, 32);
		  lbl_unit.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  
		  lbl_thousand = new JLabel("Thousand(1000)");
		  lbl_thousand.setBounds(143, 597, 115, 33);
		  lbl_thousand.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_thousand.setOpaque(true);
		  lbl_thousand.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		  lbl_thousand.setBackground(Color.PINK);
		  
		  lbl_a_level = new JLabel("15");
		  lbl_a_level.setBackground(Color.WHITE);
		  lbl_a_level.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_a_level.setOpaque(true);
		  lbl_a_level.setBounds(450, 546, 144, 28);
		  lbl_a_level.setFont(new Font("Arial Black", Font.PLAIN, 14));
		  
		  lbl_b_level = new JLabel("8");
		  lbl_b_level.setBackground(Color.WHITE);
		  lbl_b_level.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_b_level.setOpaque(true);
		  lbl_b_level.setBounds(450, 594, 43, 24);
		  lbl_b_level.setFont(new Font("Arial Black", Font.PLAIN, 14));
		  
		  lbl_c_level = new JLabel("8");
		  lbl_c_level.setBackground(Color.WHITE);
		  lbl_c_level.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_c_level.setOpaque(true);
		  lbl_c_level.setBounds(450, 628, 144, 25);
		  lbl_c_level.setFont(new Font("Arial Black", Font.PLAIN, 14));
		  
		  text_a = new JTextField();
		  text_a.setBounds(652, 550, 63, 24);
		  text_a.setHorizontalAlignment(SwingConstants.CENTER);
		  text_a.setFont(new Font("Arial Black", Font.ITALIC, 12));
		  text_a.setColumns(10);
		  
		  text_b = new JTextField();
		  text_b.setBounds(652, 592, 63, 24);
		  text_b.setFont(new Font("Arial Black", Font.ITALIC, 12));
		  text_b.setHorizontalAlignment(SwingConstants.CENTER);
		  text_b.setColumns(10);
		  
		  text_c = new JTextField();
		  text_c.setBounds(652, 626, 63, 24);
		  text_c.setHorizontalAlignment(SwingConstants.CENTER);
		  text_c.setFont(new Font("Arial Black", Font.ITALIC, 12));
		  text_c.setColumns(10);
		  
		  lbl_b_level2 = new JLabel("15");
		  lbl_b_level2.setBounds(551, 594, 43, 24);
		  lbl_b_level2.setOpaque(true);
		  lbl_b_level2.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_b_level2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		  lbl_b_level2.setBackground(Color.WHITE);
		  
		  btn_calculate = new JButton("Calculate");
		  btn_calculate.setBounds(50, 701, 107, 23);
		  btn_calculate.setForeground(Color.BLACK);
		  btn_calculate.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_calculate.setBackground(Color.ORANGE);
		  
		  btn_open = new JButton("OpenFile");
		  btn_open.setBounds(50, 734, 107, 27);
		  btn_open.setForeground(Color.BLACK);
		  btn_open.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_open.setBackground(Color.ORANGE);
		  
		  btn_Optupt = new JButton("Output to TextArea");
		  btn_Optupt.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  	}
		  });
		  btn_Optupt.setBounds(176, 701, 175, 23);
		  btn_Optupt.setForeground(Color.BLACK);
		  btn_Optupt.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_Optupt.setBackground(Color.ORANGE);
		  
		  btn_Pie = new JButton("Pie-Chart Demo");
		  btn_Pie.setBounds(375, 701, 175, 23);
		  btn_Pie.setForeground(Color.BLACK);
		  btn_Pie.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_Pie.setBackground(Color.ORANGE);
		  
		  btn_refresh = new JButton("Refresh");
		  btn_refresh.setBounds(576, 701, 113, 23);
		  btn_refresh.setForeground(Color.BLACK);
		  btn_refresh.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_refresh.setBackground(Color.ORANGE);
		  
		  btn_readfile = new JButton("ReadFile");
		  btn_readfile.setBounds(307, 734, 120, 27);
		  btn_readfile.setForeground(Color.BLACK);
		  btn_readfile.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_readfile.setBackground(Color.ORANGE);
		  
		  btn_exit = new JButton("Exit");
		  btn_exit.setBounds(576, 734, 99, 27);
		  btn_exit.setForeground(Color.BLACK);
		  btn_exit.setFont(new Font("Arial", Font.BOLD, 15));
		  btn_exit.setBackground(Color.ORANGE);
		  
		  separator = new JSeparator();
		  separator.setBounds(247, 200, 246, 9);
		  separator.setForeground(Color.YELLOW);
		  
		  separator_1 = new JSeparator();
		  separator_1.setBounds(236, 466, 246, 9);
		  separator_1.setForeground(Color.YELLOW);
		  
		  separator_2 = new JSeparator();
		  separator_2.setBounds(236, 663, 246, 9);
		  separator_2.setForeground(Color.YELLOW);
		  contentPane.add(lbl_distr);
		  contentPane.add(lbl_unit);
		  contentPane.add(lbl_thousand);
		  contentPane.add(lbl_b_level);
		  contentPane.add(text_b);
		  contentPane.add(lbl_b_level2);
		  contentPane.add(lbl_a_level);
		  contentPane.add(text_a);
		  contentPane.add(lbl_c_level);
		  contentPane.add(text_c);
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
		  contentPane.add(btn_Optupt);
		  contentPane.add(btn_Pie);
		  contentPane.add(btn_refresh);
		  contentPane.add(btn_readfile);
		  contentPane.add(btn_exit);
		  contentPane.add(separator);
		  contentPane.add(separator_1);
		  contentPane.add(separator_2);
		  
		  JLabel lbl_A = new JLabel("A_Level >=");
		  lbl_A.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_A.setFont(new Font("Arial Black", Font.PLAIN, 14));
		  lbl_A.setBackground(Color.WHITE);
		  lbl_A.setBounds(332, 550, 98, 24);
		  contentPane.add(lbl_A);
		  
		  JLabel lbl_bdown = new JLabel("~");
		  lbl_bdown.setOpaque(true);
		  lbl_bdown.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_bdown.setFont(new Font("Arial Black", Font.PLAIN, 14));
		  lbl_bdown.setBackground(Color.WHITE);
		  lbl_bdown.setBounds(503, 594, 34, 24);
		  contentPane.add(lbl_bdown);
		  
		  JLabel lbl_bup = new JLabel("B_Level =");
		  lbl_bup.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_bup.setFont(new Font("Arial Black", Font.PLAIN, 14));
		  lbl_bup.setBackground(Color.WHITE);
		  lbl_bup.setBounds(332, 587, 98, 33);
		  contentPane.add(lbl_bup);
		  
		  JLabel lbl_c = new JLabel("C_Level <=");
		  lbl_c.setHorizontalAlignment(SwingConstants.CENTER);
		  lbl_c.setFont(new Font("Arial Black", Font.PLAIN, 14));
		  lbl_c.setBackground(Color.WHITE);
		  lbl_c.setBounds(325, 626, 107, 23);
		  contentPane.add(lbl_c);
		  
		
	}
	
	protected void initializeButtonArray() {
		JButton [] buttonsInitialized=
			{btn_calculate,btn_refresh,btn_earnings,btn_setprfile,btn_Clear,
			 btn_Optupt,btn_exit,btn_open,btn_readfile,btn_Pie };
		optionButtons=buttonsInitialized;
		for(int i=0; i< bas.length; i++)
		{
			optionButtons[i].setText(bas[i].getButtonType());
			optionButtons[i].setIcon(new ImageIcon(bas[i].getImageIconString()));
		}
		
	}
	
	protected void initializeTextFieldAarrayList() {
			JTextField[] txtfieldsProfile= {text_company,text_totalemployees};
			JTextField[] txtfieldsEmployee= {text_ssn,text_firstname,text_lastname,text_earnings};
			JTextField[] txtfieldsOutput= {text_employeeC,text_highest, text_lowest, text_average,
					text_a,text_b,text_c};
			for(JTextField txtField:txtfieldsProfile)
			{
				listTxtFieldsProfileG.add(txtField);
			}
			
			for(JTextField txtField:txtfieldsEmployee)
			{
				listTxtFieldsEmployeeG.add(txtField);
			}
			
			for(JTextField txtField:txtfieldsOutput)
			{
				listTxtFieldsResults.add(txtField);
			}
	}
	

	
	public void initializeTitleNamesList4JTable() {
		String[] titleNames4Table= {EmployeeRecordIndices.SSN.getRecordIndexType(),EmployeeRecordIndices.FIRST_NAME.getRecordIndexType(),
				EmployeeRecordIndices.LAST_NAME.getRecordIndexType()};
		
		for(String titleName: titleNames4Table)
		{
			listTitleName4Table.add(titleName);
		}
	}
	
	public void initiallizedTitleNamesStringList4Table() {
		namesUsed= new String[listTitleName4Table.size()];
		for (int i=0; i<namesUsed.length;i++)
		{
			namesUsed[i]=listTitleName4Table.get(i).toString();
		}
	}
	public void addJTable2box()
	{
		box3.add(tableAggregate);
	}
	
	public EmployeeBaseBook_Adv_huang1063 setBasics2StartBookingEmployee() {
		employeebook = new EmployeeBaseBook_Adv_huang1063(helper4Employee.CompanyName, helper4Employee.EmployeeNo, true);
		return employeebook;
	}

	public EmplyeeBaseJFarme_huang1063_V4 refreshJFrame(JDesktopPane theDesktop) {
		EmplyeeBaseJFarme_huang1063_V4 component=new EmplyeeBaseJFarme_huang1063_V4(employeeType4Jframe);
		btncontroller=new BtnController4SuperEmployeeBase_huang1063(component, theDesktop);
		component=Main_Run(component, employeeType4Jframe, btncontroller);
		return component;
	}
}
