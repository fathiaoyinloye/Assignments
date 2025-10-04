public class Kata{
	public static int factorOf(int number){
		int sum = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0) {
			sum = sum + 1;
			}
			
		}
	return sum;	
	}
	 
	public static boolean isPrime(int number){
		int sum = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0) {
			sum = sum + count;
				
			}
 		}

		int prime = number + 1;		
		if(prime == sum){
			return true;
		}
		else{
			return false;
		}





	}


		public static boolean isOdd(int number){
		if (number % 2 != 0)
		return true;
		else
		return false;		
		}

		public static boolean isLeapYear(int number){
		int sum = 0;
		if (number % 4 == 0 && number % 100 != 0){
		 sum = 1 + 1;
		}
		else if (number % 4 == 0 && number % 100 == 0 && number % 400 == 0){
		 sum = 1 + 1;
		}
		else{
		 sum = 1;

	}

	if (sum == 2)
		return true;
	else
		return false;

	}
	
	public static double convertToCelcius(double fahrenheit){
	
	double celcius = 5 * (fahrenheit - 32)/ 9;
	
	return celcius;
	}

	public static void printStars(int number){
	
		for(int count = 0; count < number; count++){				
			System.out.println();
			for(int counter = 0; counter <=count; counter++){
				System.out.print("* ");
			}
					

		}

	}

	public static boolean isEven(int number){
		if (number % 2 == 0)
		return true;
		else
		return false;		
		}

	public static float divide(int numberOne, int numberTwo){
		if (numberTwo == 0)
		return 0;
		float nummberOneFloat = numberOne;
		float nummberTwoFloat = numberTwo;

		float quotient = nummberOneFloat/nummberTwoFloat;
		return quotient;
	}

	public static long factorialOf(int number){
		int factorial = 1;
		for(int count = 1; count <= number; count++){
			factorial *= count;
		}
		return factorial;
		
	}

	public static int squareOf(int number){
	int square = number * number;
	return square;
	
	}
	public static int subtract(int numberOne, int numberTwo){
		int  largest = numberOne;
		int lowest = numberTwo;
		if(numberTwo > largest){
			largest = numberTwo;
			lowest = numberOne;
		}
		int subtract = largest - lowest;
		return subtract;

	}		
	public static boolean isSquare(int number){
		int sum = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0) {
			sum = sum + 1;
			}
					
		}
		if(sum % 2 == 0)
			return false;
		else
			return true;

	}

	public static boolean isPalindrome(int number){

		int digit1 = number/10000;
		int digit2 = (number % 10000) / 1000;
		int digit3 = (number % 1000) / 100;
		int digit4 = (number % 100) / 10;
		int digit5 = number % 10;
				
		if(digit1 == digit5 && digit2  == digit4)
			return true;	
		else
			return false;
		



}


}