public class PalindromePrimeCheck{
	public static void main(String[] args){
		
	System.out.print(isPalindromeAndPrime(10));



	}

	public static boolean isPalindromeAndPrime(int number){
		int digit = 0;
		int reverseNumber = 0;
		int multiplier = 10;
		int numberToCheck = number;
		int palindrome = number;

		for (int count = 1; number > 0; count ++){

			digit = number % 10;
			number = number/10;
			reverseNumber = reverseNumber * multiplier + digit;
			if (count == 1)
				reverseNumber = digit * 1;

			}	

		if (numberToCheck == reverseNumber)
		palindrome = number;
			else
		palindrome = 0;

		int sum = 0;
		for(int count = 1; count <= numberToCheck; count++){
			if(numberTocheck % count == 0) {
			sum = sum + count;
				
			}
 		}

		int prime = numberTocheck + 1;		
		if(prime == sum)
		prime = numberToCheck;
		else
		prime = 0;
		
		if(palindrome == numberToCheck)
		return true;
		else
		return false;



}









}