 import java.util.Scanner;

 public class MaximumFinder {
 	public static void main(String[] args) {

  		 Scanner input = new Scanner(System.in);
 
  		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
 		double number2 = input.nextDouble(); 
 		double number3 = input.nextDouble(); 
      	
		double maximumValue = number1;

		if (number2 > maximumValue) {                                   
			 maximumValue = number2;                                        
   		}                                                           
         
   		if (number3 > maximumValue) {                                     
      			maximumValue = number3;                                        
   		}   
	
		System.out.println("Maximum is: " + maximumValue );                                                        
                                                               
               
	} 
}      
                                                