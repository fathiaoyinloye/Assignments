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

}