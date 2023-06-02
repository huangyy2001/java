package huang.polymorphism.employee.helper;
import huang.polymorphism.employee.frame.Btns4UniversalProcess_MenuOpAdv;
import huang.polymorphism.employee.frame.CommissionEmployeeJframe3_huang1063;
import huang.polymorphism.employee.frame.EmployeeRecordIndices;
import huang.polymorphism.employee.frame.EmplyeeBaseJFarme_huang1063_V4;
import huang.polymorphism.employee.menuoption.EarningLevelEnum_Adv_huang1063;
import lo.library.components.jtable.TableDialogEditDemoWithLevels;
import lo.library.components.jtable.app_extends.TableDialogEditDemo_newByMCLo_UsingExtends;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import huang.library.checkandvalidation.InputNumberValidation;
import huang.library.checkandvalidation.InputNumberValidation_GUI_CONSOLE;
import huang.library.enummenu.FileStream_MenuOption_Adv;
import huang.library.enummenu.NumberType_MenuOption;
import huang.library.filestream.Choice4FileStreamType;
import huang.library.filestream.FileChoosing2WriteOrRead;
import huang.library.filestream.FileChoosing4WriteOrRead_25Dec20_extends;
import huang.library.filestream.FileChoosing4WriteOrRead_27Oct20_huang1063;
import huang.library.filestream.OpenFileRecord_huang1063;
import huang.library.jfreechart_adv.piechart.PieChart3DDemo2;
import huang.polymorphism.employee.BasePlusCommissionEmployee;
import huang.polymorphism.employee.BasePlusCommissionEmployee_huang1063;
import huang.polymorphism.employee.CommissionEmployee;
import huang.polymorphism.employee.CommissionEmployee_huang1063;
import huang.polymorphism.employee.Employee;
import huang.polymorphism.employee.Employee_huang1063;
import huang.polymorphism.employee.HourlyEmployee;
import huang.polymorphism.employee.HourlyEmployee_huang1063;
import huang.polymorphism.employee.SalariedEmployee;
import huang.polymorphism.employee.SalariedEmployee_huang1063;
import huang.polymorphism.employee.buttoncontroller.BtnController4SuperEmployeeBase_huang1063;
import huang.polymorphism.employee.earningbook.EmployeeBaseBook_Adv_huang1063;

public class Helper4SuperEmplyeeBase_huang0163 {
	 EmplyeeBaseJFarme_huang1063_V4 frameEmployee; 
	 public int EmployeeNo=0;
	 public String CompanyName="";
	 
	 String _SSN="";
	 String _firstName="";
	 String _lastName="";
	 
	 public double _grossSales=0;
	 public double _commissionRate=0.0;
	 
	 public double _baseSalary=0;
	 
	 public double _hourlyWage=0.0;
	 public double _rate4ExtraHours=0.0;
	 public double _hoursWorked=0;
	 public double _maxHoursPerWeek=80.0;
	 public double _min4rateOfExtraHours=1.0;
	 public double _max4rateOfExtraHours=2.0;
	 public double _MAX_WORKED_HOURS=168;
	 public double _normalHoursWorked=40.0;
	 
	 public double _weekSalary=0;
	    
	 public int employeeCounter=0;
	 public static DecimalFormat twoDigits=new DecimalFormat("0.00");
	 protected boolean checkON=true;

	 public boolean checkProfile=false;
	 boolean checkRecord=false;
	 
	 static EmplyeeBaseJFarme_huang1063_V4 employeebaseJFrame=null;
	 
	 
	 public String filePath="./filePath";
	 public FileChoosing4WriteOrRead_25Dec20_extends fileChoosing4WriteOrRead;
	 
	 public ObjectOutputStream outputO;
	 public Formatter outputT;
	 protected ObjectOutputStream inputO;
	 protected Scanner inputT;
	 public File fileWritten=null;
	 
	 String companyString;
	 String employeeNoString;
	 
	 public boolean isReadFile=false;
	 public boolean isCreateFile=false;
	 protected boolean isFileChoosenOK=false;
	 
	 //static FileStream_MenuOption_Adv streamType_MeanOption=null;
	 public boolean isJOptionPaneUsed=false;
	 public boolean useSimpleOne=true;
	 public boolean useJPane=true;
	 
	protected InputNumberValidation validation_GUI = new InputNumberValidation(false, true);// OK
	protected InputNumberValidation_GUI_CONSOLE validationNumber_GUI = new InputNumberValidation_GUI_CONSOLE(false,
				true);
	
	static FileStream_MenuOption_Adv streamType_MenuOption = null;

	 
	 ArrayList<CommissionEmployee_huang1063> eList_Commission=new ArrayList<CommissionEmployee_huang1063>();
	 ArrayList<BasePlusCommissionEmployee_huang1063> eList_BasePlusCommission =new ArrayList<BasePlusCommissionEmployee_huang1063>();
	 ArrayList<SalariedEmployee_huang1063> eList_Salaried =new ArrayList<SalariedEmployee_huang1063>();
	 ArrayList<HourlyEmployee_huang1063> eList_Hourly=new ArrayList<HourlyEmployee_huang1063>();
	 
	 public Helper4SuperEmplyeeBase_huang0163(EmplyeeBaseJFarme_huang1063_V4 _frmemployee) {
		 	frameEmployee= _frmemployee;
		 	setUpNewStartUp4Buttons();
		 	setupDistribution4WageLevels();
		 	
	 }
	 
	 
		public void prepareBasicProfileUsingCheck() {

			checkProfile = validationNumber_GUI.checkStringNotEmpty(frameEmployee.text_company.getText(),
					EmployeeRecordIndices.COMPANY_NAME.getRecordIndexType());

			if (checkON)
				JOptionPane.showMessageDialog(null, "employee=" + frameEmployee.getClass());

			if (checkProfile) {
				CompanyName = validationNumber_GUI.stringInput;// obtain company name (added 24Nov19)
				checkProfile = validationNumber_GUI.checkNumberValueByComparing_1flag(frameEmployee.text_totalemployees.getText(),
						EmployeeRecordIndices.EMPLOYEE_NO.getRecordIndexType(), 0, 1,
						NumberType_MenuOption.INT_NUMBER_TYPE.getValueIndex());

				if (!checkProfile)
					frameEmployee.text_totalemployees.setText("");
				else {
					EmployeeNo = validationNumber_GUI.numberValue.intValue();// obtain number of employees (added 24Nov19)

					/**
					 * if basic profile are ready, then Open-File process can start from here
					 * (24Nov19)
					 */
					frameEmployee.btn_open.setEnabled(true);
				}
			}
		}// prepareBaseProfileUsingCheck()
	 
		public void resetButtons4NewStart(boolean _isEnable) {
			for (int i = 0; i < frameEmployee.bas.length; i++) {
				frameEmployee.optionButtons[i].setEnabled(_isEnable/* true */);
			}
		}//end resetButtons4NewStart

		public void setUpNewStartUp4Buttons() {
			resetButtons4NewStart(false);
			frameEmployee.btn_setprfile.setEnabled(true);
			frameEmployee.btn_exit.setEnabled(true);
			frameEmployee.btn_refresh.setEnabled(true);
			frameEmployee.btn_readfile.setEnabled(true);
		}//end setUpNewStartUp4Buttons
		
		public void setupDistribution4WageLevels() {
			frameEmployee.lbl_a_level.setText("" + EarningLevelEnum_Adv_huang1063.LeveLA.getValue());
			frameEmployee.lbl_b_level2.setText("" + EarningLevelEnum_Adv_huang1063.LeveLA.getValue());
			frameEmployee.lbl_b_level.setText("" + EarningLevelEnum_Adv_huang1063.LeveLB.getValue());
			frameEmployee.lbl_c_level.setText("" + EarningLevelEnum_Adv_huang1063.LeveLB.getValue());
			frameEmployee.lbl_unit
					.setText("" + EarningLevelEnum_Adv_huang1063.UNIT.getLevelType() + " (" + EarningLevelEnum_Adv_huang1063.UNIT.getValue() + ")");
		}//end setupDistribution4WageLevels()
		
		
		public void enableProfileTextBoxs(boolean isEnable) {
			boolean condition = false;

			for (JTextField txtField : employeebaseJFrame.listTxtFieldsProfileG) {
				txtField.setEnabled(isEnable);
				condition = !isEnable;
			}

			for (JTextField txtField : frameEmployee.listTxtFieldsResults)
				txtField.setEnabled(!isEnable);
//				txtField.setEnabled(isEnable);

			for (JTextField txtField : employeebaseJFrame.listTxtFieldsEmployeeG)
				txtField.setEnabled(!isEnable);

			if (condition == true) //// ????if-else: need to confirm if there are something wrong..//
			{
//	        	frmEmployee.btnCalculate.setText(Button_MenuOption.Process_Data.name()); 

				frameEmployee.btn_calculate.setText(Btns4UniversalProcess_MenuOpAdv.Process_Data.getButtonType());
				frameEmployee.btn_setprfile.setEnabled(false);
			} else {
//	        	frmEmployee.btnCalculate.setText(Button_MenuOption.Process_Data.name());
				frameEmployee.btn_calculate.setText(Btns4UniversalProcess_MenuOpAdv.Process_Data.getButtonType());
				frameEmployee.btn_setprfile.setEnabled(true);// false
			}
		}// end enableProfileTextBoxs
		
		public void checkInputRecordData() {
			checkRecord=false;
			
			checkRecord=validationNumber_GUI.checkStringNotEmpty(frameEmployee.text_ssn.getText(),
					EmployeeRecordIndices.SSN.getRecordIndexType());
			if(checkRecord) {
				checkRecord=validationNumber_GUI.checkStringNotEmpty(frameEmployee.text_firstname.getText(),
						EmployeeRecordIndices.FIRST_NAME.getRecordIndexType());
			}
			if(checkRecord) {
				checkRecord=validationNumber_GUI.checkStringNotEmpty(frameEmployee.text_lastname.getText(),
						EmployeeRecordIndices.LAST_NAME.getRecordIndexType());
			}
		}
		
		public void getInputDataReady(boolean _checkRecord) 
		{
			if(_checkRecord)
			{
				_SSN=frameEmployee.text_ssn.getText();
				_firstName = frameEmployee.text_firstname.getText();
				_lastName= frameEmployee.text_lastname.getText();
			}	
		}
		
		
		public void outputFinalReport() {
			frameEmployee.txtArea4RecordTextArea.setText(frameEmployee.employeebook.toString());
			
//			JOptionPane.showMessageDialog(null,frameEmployee.employeeBook.recordsConcatenated, 
//					"txtArea", JOptionPane.INFORMATION_MESSAGE);

			frameEmployee.listArea4RecordListArea.setModel(frameEmployee.listModel);
			frameEmployee.addJTable2box();
		}//end outputFinalReport()
		
		
		
		public void openFile(String _filePath) throws FileNotFoundException, NullPointerException, IOException {
			isReadFile = false;
			isCreateFile = true;
			employeeCounter = 0;

			JOptionPane.showMessageDialog(null, "This file writer is for log report.", "Write a text-based report",
					JOptionPane.INFORMATION_MESSAGE);
			fileWritten = OpenFileRecord_huang1063.getfile(_filePath, useJPane);
			if (fileWritten != null) {
				OpenFileRecord_huang1063.openFile(fileWritten, "Write a log-file for preview");
			}

			if (OpenFileRecord_huang1063.output != null) {
				// -------Below is for choosing Stream-type used for writing accounts' profile
				JOptionPane.showMessageDialog(null, "The next file writer choosed is for recording every account record.",
						"Write Account Records", JOptionPane.INFORMATION_MESSAGE);
				ImageIcon icon = new ImageIcon("./resources/images/qustion_message_120x120.png");
				streamType_MenuOption = Choice4FileStreamType.decideWhichFileStreamType(icon, false);// OK
				/**
				 * true: use JOptionPane; false: use ListDialog (JList app)
				 * 
				 * JList: https://docs.oracle.com/javase/tutorial/uiswing/components/list.html
				 * https://docs.oracle.com/javase/tutorial/uiswing/examples/components/index.html
				 */
				JOptionPane.showMessageDialog(null, streamType_MenuOption, "Stream-type Chosen",
						JOptionPane.INFORMATION_MESSAGE);
				if (streamType_MenuOption != null) {
					// -------Below is for fileChooser used for writing account records-------
					// JOptionPane.showMessageDialog(null,"filePath="+filePath);

					/**
					 * Below are OK too. They were used originally... 
					 */
//					fileChoosing4WriteOrRead = new FileChoosing4WriteOrRead_v2(true, false,
//							streamType_MenuOption.getValue());
//					fileChoosing4WriteOrRead.chooseFile(_filePath);
					fileChoosing4WriteOrRead = new FileChoosing4WriteOrRead_25Dec20_extends(true, false,
							streamType_MenuOption.getValue());
					fileChoosing4WriteOrRead.chooseFile(_filePath, "Create File");

					if (fileChoosing4WriteOrRead.result == JFileChooser.APPROVE_OPTION) {
						fileChoosing4WriteOrRead.openFile2Write(streamType_MenuOption.getOptionType());

						String compannyString = String.format("%s\t%s\n", "Company", CompanyName);
						String employeeNoString = String.format("%s\t%s", "EmployeeNo", EmployeeNo);
						if (streamType_MenuOption == FileStream_MenuOption_Adv.BYTE_BASED) {
							outputO = fileChoosing4WriteOrRead.outputO;// here output has been implemented and not 'null'

							// write basic profile into file 
							outputO.writeObject(compannyString);
							outputO.writeObject(employeeNoString);
						} else {
							outputT = fileChoosing4WriteOrRead.outputT;// here output has been implemented and not 'null'

							// write basic profile into file 
							outputT.format(compannyString);
							outputT.format(employeeNoString);
						}
						frameEmployee.btn_open.setEnabled(false); 
						frameEmployee.btn_calculate.setEnabled(true); 
						frameEmployee.btn_Clear.setEnabled(true);//added 27Dec20
					}
				} else
					JOptionPane.showMessageDialog(null, "you just cancel the action!");
			} // end if (OpenFileRecord.output != null)
		}//end openFile
		
		
		public void clearRecordTextFields() {
			for (JTextField txtField : EmplyeeBaseJFarme_huang1063_V4.listTxtFieldsEmployeeG)
				txtField.setText("");
		}//end clearRecordTextField		
		
		public void clearProfileAndResults() {
			for (JTextField txtField : EmplyeeBaseJFarme_huang1063_V4.listTxtFieldsProfileG)
				txtField.setText("");

			for (JTextField txtField : frameEmployee.listTxtFieldsResults)
				txtField.setText("");

		}//end clearProfileAndResults()
		
		public void addNprocessEveryNewRecord(Employee_huang1063 record) {
			employeeCounter += 1;

			//1. add every raw record to employee-book and further process and complete every salary/record profile
			frameEmployee.employeebook.processEverySalaryProfie(record);
			JOptionPane.showMessageDialog(null, "Employee: " + employeeCounter + ":\n" + record.toString2());
			
			//2. add/write every record to report/file and show processed results
			writeRecord2ReportFileNdisplayCompleteRecord(record);
			
			//3. add every record to its corresponding arrayList.
			addRecord2CorrespondingArrayList(record);
			
			//4. go to final phase to both display whole results and test all conditions
			go2FinalPhaseIfDoneAllRecordsInput();
		}
		
		public void writeRecord2ReportFileNdisplayCompleteRecord(Employee_huang1063 record) {

			if (!isReadFile) {
				// output record and flush buffer
				addEveryRecord2FileStream(record);
			} // end if
			
			frameEmployee.txtArea4RecordTextArea
					.setText(frameEmployee.employeebook.recordsConcatenated); 
			
//			JOptionPane.showMessageDialog(null,frameEmployee.employeeBook.recordsConcatenated, 
//					"txtArea", JOptionPane.INFORMATION_MESSAGE);

			frameEmployee.listModel.addElement(record.toString3());

			if (!isReadFile)// only for creating file.
				frameEmployee.text_earnings.setText(twoDigits.format(record.earnings()));		

			frameEmployee.text_employeeC.setText(String.format("%d", employeeCounter));
		}//end writeRecord2ReportFileNdisplayCompleteRecord
		
		public void addEveryRecord2FileStream(Employee_huang1063 record) {
			// output record and flush buffer
			if (streamType_MenuOption == FileStream_MenuOption_Adv.BYTE_BASED) {
				try {
					outputO.writeObject(record);
					outputO.flush();
				} catch (IOException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Something wrong with your record data!",
							"No data was added into file", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				outputT.format("%s", record);
			}
		}//end addEveryRecord2FileStream
		
		public void addRecord2CorrespondingArrayList(Employee_huang1063 record) {
			if (record instanceof SalariedEmployee_huang1063) {
				eList_Salaried.add((SalariedEmployee_huang1063) record);
			} else if (record instanceof HourlyEmployee_huang1063) {
				eList_Hourly.add((HourlyEmployee_huang1063) record);
			} else if (record instanceof BasePlusCommissionEmployee_huang1063) {
				System.out.println("I am in BasePlusCommissionEmploye");
				eList_BasePlusCommission.add((BasePlusCommissionEmployee_huang1063) record);
			} else if (record instanceof CommissionEmployee_huang1063) {
				eList_Commission.add((CommissionEmployee_huang1063) record);
				System.out.println("I am in CommissionEmployee");
			} else {
				System.out.println("Add Nothing!");
			}		
		}//end addRecord2CorrespondingArrayList
		
		public void go2FinalPhaseIfDoneAllRecordsInput() {
			/**
			 * 1. Firstly, check If EmployeeCounter Equal to EmployeeNo (i.e. all record
			 * needed have been done with input.)
			 */
			if (employeeCounter == EmployeeNo) {
				/**
				 * 2. If true--> go to final phase:
				 */

				JOptionPane.showMessageDialog(null, "All employees' records have done input!");
				/**
				 * need to move to step 2.3) (below).Otherwise, no level-distributions produced. 
				 */
				
				/**
				 * 2.1) add whole records to JTable.
				 */
				addWholeRecords2JTable();
				
				/**
				 * 2.2) show whole GradeBook Results in form.
				 * (make sure the augment of 'frameEmployee.employeeBook' is used, instead of
				 * 'employeeBook'. Otherwise, it would be gone wrong)
				 */
				displayNcompleteEarningBookResults(frameEmployee.employeebook);				
				/**
				 * 2.3) write log-file and close all opened files
				 */	
				WriteLogFile(frameEmployee.employeebook);
				closefile();
				/**
				 * 2.4) reset all btns' conditions for new start, and 
				 *      disable 'Open File' and 'Calculate' btns.  
				 */
				resetButtons4NewStart(true);			
				frameEmployee.btn_open.setEnabled(false);
				frameEmployee.btn_calculate.setEnabled(false);
			}
		}//end go2FinalPhaseIfDoneAllRecordsInput
		
		public void addWholeRecords2JTable() {
			frameEmployee.dataUsed = returnObjectArray();

//			TableDialogEditDemoWithLevels demoTable = new TableDialogEditDemoWithLevels(//OK
//						frameEmployee.table4RecordTextAeea, frameEmployee.namesUsed, frameEmployee.dataUsed);
	
			TableDialogEditDemo_newByMCLo_UsingExtends demoTable = new TableDialogEditDemo_newByMCLo_UsingExtends(//OK too
				frameEmployee.table4RecordTextAeea, frameEmployee.namesUsed, frameEmployee.dataUsed);

			frameEmployee.tableAggregate = demoTable.scrollPane;		
		}//end addWholeRecords2JTable()
		
		public Object[][] returnObjectArray() {
			return null;
		}//end returnObjectArray()
		
		public void displayNcompleteEarningBookResults(EmployeeBaseBook_Adv_huang1063 _employeBook) {
			/**
			 * 1. Successively display earning-book results on form-related areas (if employeeCounter != 0).
			 */
			if (employeeCounter != 0) {

				// below 3 need to confirm...
				frameEmployee.text_a.setText("" + frameEmployee.employeebook.aLevel);
				frameEmployee.text_b.setText("" + frameEmployee.employeebook.bLevel);
				frameEmployee.text_c.setText("" + frameEmployee.employeebook.cLevel);

				frameEmployee.text_employeeC.setText(String.format("%d", _employeBook.employeeCounter));
				frameEmployee.text_highest.setText(twoDigits.format(_employeBook.highest));
				frameEmployee.text_lowest.setText(twoDigits.format(_employeBook.lowestE));
				/**
				 * 2. After done the last record, then:
				 *   2.1) complete final earning-book by calculating mean earnings of company
				 *        considered (also the categories' distribution will be produced in
				 *        employee-book).
				 *   2.2) display mean earnings on form.
				 *   
				 * (Implement in inherited classes)
				 */

				displayNcompleteEarningBookResults_Adv(_employeBook);
			}//end if
			else {
				JOptionPane.showMessageDialog(null, "老兄/老姊! 沒半個人 算什麼東東啊 !", "No preset-profile or input",
						JOptionPane.ERROR_MESSAGE);
			}
		}//end displayNcompleteEarningBookResults
		
		public void displayNcompleteEarningBookResults_Adv(EmployeeBaseBook_Adv_huang1063 _employeBook) {
			
		}
		
		public void WriteLogFile(EmployeeBaseBook_Adv_huang1063 _employeBook) {
			if (fileWritten != null && OpenFileRecord_huang1063.output != null) {
				OpenFileRecord_huang1063.output.format(frameEmployee.employeebook.toString());
			} else {
				JOptionPane.showMessageDialog(null, "No file was choosen!", "Choose a file FIRST.",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}
		}//end WriteLogFile
		
		public void closefile() {
			OpenFileRecord_huang1063.closeFile();
			fileChoosing4WriteOrRead.closeFile();
			isFileChoosenOK = false;
		}//end closefile
		
		public void runPieChart3DFX() {
			PieChart3DDemo2 app=null;
			String[] categories=new String[3];
			categories=Stream.of(
					EarningLevelEnum_Adv_huang1063.LeveLA.getLevelType(),
					EarningLevelEnum_Adv_huang1063.LeveLB.getLevelType(),
					EarningLevelEnum_Adv_huang1063.LeveLC.getLevelType()).toArray(String[]::new);
			double[] values4Categories= new double[categories.length];
			String title="Wage-Level Distribution";
			
			values4Categories[0]=frameEmployee.employeebook.aLevel;
			values4Categories[1]=frameEmployee.employeebook.bLevel;
			values4Categories[2]=frameEmployee.employeebook.cLevel;
			
			boolean isOriginalDemo=false;
			app = new PieChart3DDemo2(title,categories,values4Categories,isOriginalDemo);
			app.pack();
			app.setVisible(true);
		}
		
		public void exitAppInQuestion() {
			frameEmployee.dispose();
		}
		
		public void refreshJFrame(JDesktopPane theDesktop) {
			if(frameEmployee!=null) {
				frameEmployee.dispose();
				
				frameEmployee=frameEmployee.refreshJFrame(theDesktop);
				
				if(theDesktop!=null)
				{
					theDesktop.add(frameEmployee);
				}
			}else 
				JOptionPane.showMessageDialog(null,"You haven't started anything yet!",
						"Start Input data first",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		public void processAndShowWageRecordsUsingCheck() {
			
		}			
	}// end class Helper4SuperEmployeeBase
	

