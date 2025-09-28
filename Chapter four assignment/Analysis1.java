/*	create an empty container called passes where you want to save all student that passes
	create an empty container called failures where you want to save all student that fail
	create a container that keeps track of how many times you want to repeat an action
	it should be one call it studenctCounter
	A repetiton should occur and this should continue as long as studentcounter is less than or equal to ten
	prompt user to enter 1 for pass and 2 for fail
	save as result
	check if result is equal to 1, increase pass by 1, if not
	check if result is equal to 0, increase fail by 1, if not
	check if result is less than 1 or 2; if yes, break and continue
	studentcounter shoud increse by one at every iteraton process
	if all paaases is greater than
	print  Bonus to instructor
	print passes and failure	


						*/

import java.util.Scanner; 
 
public class Analysis1{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int passes = 0;                          
		int failures = 0;                        
		int studentCounter = 1;
		
		while (studentCounter <= 10) {
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			 int result = input.nextInt(); 
    		
		
 		if (result == 1) {                           
   		passes = passes + 1;                      
		}      
                                      
		else if(result == 2){                                      
   		failures = failures + 1;                  
		}        

		else if(result != 1 || result  != 2){
			continue;
		}  
		       
		studentCounter = studentCounter + 1;
		
            
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		if (passes > 8) {                               
   		System.out.println("Bonus to instructor!");  
	                                      
		}
		}
	}
}