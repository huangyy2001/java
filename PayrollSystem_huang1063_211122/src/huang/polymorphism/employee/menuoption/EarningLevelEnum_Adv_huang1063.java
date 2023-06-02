package huang.polymorphism.employee.menuoption;
import java.awt.Color;
public enum EarningLevelEnum_Adv_huang1063 {

	   LeveLA 			(  15, "Level A" , 		"A",new Color(255,   0,   0), 1000, 15),
	   LeveLB 			(   8, "Level B" , 		"B",new Color(  0, 255,   0),   15,  8),
	   LeveLC 			(   0, "Level C" , 		"C",new Color(  0,   0, 255),    8,  0),
	   UNIT 			(1000, "Thousand", 		" ",new Color(255, 255, 255),   -1, -1),
	   MAX_WORKED_HOURS	(  80, "max worked hours"," ",new Color(255, 255, 255),   -1, -1);

   private final int value; // current menu option
   private final String levelOrUnitType;
   private final String levelCharacter;  
   private final Color indexColor;
   
   private final double upperThreshold;  
   private final double lowerTHreshold;


   EarningLevelEnum_Adv_huang1063( int valueOption, String _levelOrUnitType, String _levelCharacter,
		   Color _indexColor, double _upperThreshold, double _lowerThreshold)
   {
	   value = valueOption;
	   levelOrUnitType = _levelOrUnitType;
	   levelCharacter = _levelCharacter;
	   indexColor = _indexColor;
	   
	   upperThreshold= _upperThreshold;
	   lowerTHreshold= _lowerThreshold;
   	}
 
   	public int getValue() {
	   return value;
    }
   	
   	public String getLevelType() {
   		return levelOrUnitType;
   	}
   	
	public String getLevelCharacter() {
   		return levelCharacter;
   	}
	
	public Color getColor() {
   		return indexColor;
   	}
	
	public double getUpperThreshold() {
   		return upperThreshold;
   	}
	
	public double getLowerThreshold() {
   		return lowerTHreshold;
   	}
   	
} 



