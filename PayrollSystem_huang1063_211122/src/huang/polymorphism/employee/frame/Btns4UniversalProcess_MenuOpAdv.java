package huang.polymorphism.employee.frame;


public enum Btns4UniversalProcess_MenuOpAdv {

	Process_Data 			 	(1, "Calculate", "./resources/images/calculator.png" ),
	Refresh       			 	(2, "Refresh", "./resources/images/refresh.png" ),
	Output_Results		 	 	(3, "Output Results", "./resources/images/out.png"),
	Clear_Record 			 	(4, "Clear Record", "./resources/images/clear.png"), 
	Set_Profile              	(5, "Set Profile", "./resources/images/set.png"),
	Clear_Profile_and_Results	(6, "Clear Profile/Results", "./resources/images/clear.png"),
	Exit        			 	(7, "Exit" , "./resources/images/exit.png"),
	OpenFile                 	(8, "Open File", "./resources/images/Open.png"),
	ReadFile                 	(9, "Read File", "./resources/images/Read.png"),
	WriteFile                	(10, "Write File","./resources/images/Write_File_25x25.png"),
	NEXT_RECORD					(11, "Next Record", "./resources/images/right_24x24.png"),
	ADD_RECORD					(12, "Enter", "./resources/images/Misc-New-Database-icon_24X24.png"), 
	CloseFile                	(13, "Close File", "./resources/images/fileclose_24x24.png"),
	PieChartDemo             	(14, "Pie-Chart", "./resources/images/Piechart.png"); 	
	
   private final int value; // current menu option
   private final String buttonType;
   private final String imageIconString;

   private Btns4UniversalProcess_MenuOpAdv(int _value, String _optionType, String _imageIconString ) {
	   value=_value;
	   buttonType=_optionType;
	   imageIconString=_imageIconString;
   	}
 
   	public int getValue() {
	   return value;
    }
   	
   	public String getButtonType() {
   		return buttonType;
   	}
   	
	public String getImageIconString() {
   		return imageIconString;
   	}

   	
} 



