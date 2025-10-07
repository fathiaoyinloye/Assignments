public class PalindromeLoop{
	public static void main(String[] args){
		int digit = 0;
		int number = 72;
		int reverseNumber = 0;
		int multiplier = 10;
		int numberToCheck = number;
		for (int count = 1; number > 0; count ++){

			digit = number % 10;
			number = number/10;
			reverseNumber = reverseNumber * multiplier + digit;
			if (count == 1)
				reverseNumber = digit * 1;
			System.out.println(reverseNumber);

		}	

		if (numberToCheck == reverseNumber)
			System.out.println("Its a Palindrome");
			else
			System.out.print("Its not a Palindrome");
	

	}

}