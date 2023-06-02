package huang.polymorphism.employee.buttoncontroller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import huang.polymorphism.employee.earningbook.EmployeeBaseBook_Adv_huang1063;
import huang.polymorphism.employee.frame.Btns4UniversalProcess_MenuOpAdv;
import huang.polymorphism.employee.frame.EmplyeeBaseJFarme_huang1063_V4;
import huang.polymorphism.employee.helper.Helper4SuperEmplyeeBase_huang0163;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BtnController4SuperEmployeeBase_huang1063 {
	EmplyeeBaseJFarme_huang1063_V4 frameEmployee;
	Helper4SuperEmplyeeBase_huang0163 helper;
	public EmployeeBaseBook_Adv_huang1063 employeeBook;
	
	public boolean checkBasicProfile = false;
	
	public JButton[] optionButtons;
	Btns4UniversalProcess_MenuOpAdv[] btnChoicesEnums;
	
	public File fileWrite=null, fileRead=null;
	private String filePath="./filePath";
	JDesktopPane theDesktop;

	
	public BtnController4SuperEmployeeBase_huang1063(EmplyeeBaseJFarme_huang1063_V4 _frameEmployee, JDesktopPane _theDesktop) {
		frameEmployee=_frameEmployee;
		
		optionButtons=frameEmployee.optionButtons;
		btnChoicesEnums=frameEmployee.bas;
		helper=EmplyeeBaseJFarme_huang1063_V4.helper4Employee;
		employeeBook=frameEmployee.employeebook;
		
		theDesktop=_theDesktop;
	}
	
	public void addActionListenerOnButtons() {
		for (int task=0; task<optionButtons.length;++task) {
			optionButtons[task].addActionListener(new ButtonHandlerBySwitch());
		}//end for
	}
	
	private class ButtonHandlerBySwitch implements ActionListener{
		private String taskChiceType_S;
		private Btns4UniversalProcess_MenuOpAdv btnChoice;
		
		public void actionPerformed(ActionEvent event) {
			taskChiceType_S=event.getActionCommand();
			JOptionPane.showMessageDialog(null, taskChiceType_S);
			
			for(int i=0; i<optionButtons.length; i++) {
				if(btnChoicesEnums[i].getButtonType() == taskChiceType_S) {
					btnChoice=btnChoicesEnums[i];
					break;
				}
			}
			
			try {
				switchChoices(btnChoice);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}//end actoinPerformed
	}//end class ButtonHandlerBySwitch
	
	public void switchChoices(Btns4UniversalProcess_MenuOpAdv choiceEnum)throws FileNotFoundException{
		switch(choiceEnum) {
		case Set_Profile: 
			clickBtnToSetProfile();
			break;
		case Process_Data:
			clickBtnToCalculateProcessAll();
			break;
		case Refresh: 
			refreshJFrame();
			break;
		case Output_Results: 
			outputFinalReport();
			break;
		case Clear_Record:
			clearRecordTextFields();
			break;
		case Clear_Profile_and_Results:
			clearProfileAndResults();
			break;
		case OpenFile:
			openfile();
			break;
		case ReadFile: 
//			readFile();
			break;
		case PieChartDemo:
			showPieChartOfWageDistribution();
			break;
		case Exit:	
			exitAppInQuestion();
		default:
			break;
		}
	}//end switchChoices
	
	public void clickBtnToSetProfile() {
		if (helper.isReadFile) {
			JOptionPane.showMessageDialog(null, "Please re-input data.", "GUI needs to be Refleshed !",
					JOptionPane.INFORMATION_MESSAGE);
			refreshJFrame();
		} else {

			helper.prepareBasicProfileUsingCheck();
			checkBasicProfile = helper.checkProfile;

			JOptionPane.showMessageDialog(null, "checkBasicProfile=" + helper.checkProfile);

			if (checkBasicProfile) {

				helper.enableProfileTextBoxs(false);
				setProfile();
				JOptionPane.showMessageDialog(null, "Start Inputting Record", "Basic-Profie OK!",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public void setProfile() {
		frameEmployee.btn_open.setEnabled(true);// added on 01Aug19
		frameEmployee.btn_calculate.setEnabled(false);// old one
		employeeBook = frameEmployee.setBasics2StartBookingEmployee();
	}// end setProfile()
	
	public void clickBtnToCalculateProcessAll() {
		if (checkBasicProfile) {
			/**
			 * <p>
			 * process and show wage-record via check (after confirmed that basic profile
			 * are correctly input).
			 */
			helper.processAndShowWageRecordsUsingCheck();		
		}
	}
	
	public void refreshJFrame() {
		helper.refreshJFrame(theDesktop);	
	}
	
	public void outputFinalReport() {
		helper.outputFinalReport();
	}
	
	/**
	 * Clear text-fields of record.
	 */
	public void clearRecordTextFields() {
		helper.clearRecordTextFields();
	}
	
	public void clearProfileAndResults() {
		helper.clearProfileAndResults();
	}
	
	public void openfile() {
		try {
			helper.openFile(filePath);

		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage(), "FileNotFoundException",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (NullPointerException e) { 
			e.printStackTrace();

			JOptionPane.showMessageDialog(null, e.getMessage(), "NullPointerException",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "     The Basic Profile\ndidn't saved as needed!", "No profile Saved ",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void showPieChartOfWageDistribution() {
		helper.runPieChart3DFX();
	}
		
	public void exitAppInQuestion() {
//		System.exit(0);
		helper.exitAppInQuestion();
	}//end exitAppInQuestion()	
	
	
	
}//end class BtnController4SuperEmployeeBase
	

