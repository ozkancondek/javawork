package Enums;
  enum Season {WINTER,SPRING,SUMMER,FALL}
public class Introduction {
	//defining an enum
	//	 public enum Season {WINTER,SPRING,SUMMER,FALL}
 
	//main method  
	 public static void main(String[] args) {  
	 //traversing the enum  
	 for (Season s : Season.values())  
	 System.out.println(s);  
	 System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
	 System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
	 System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
	 }
	 
	
}


//Its always better to use Enums to declare constants as the objective of interfaces are on a totally different level.