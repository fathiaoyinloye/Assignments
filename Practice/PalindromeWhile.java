public class PalindromeLoop{
	public static void main(String[] args){
		int digit = 0;
		int number = 151;
		int reverseNumber = 0;
		int multiplier = 10;
		int numberToCheck = number;
		int count = 1;

		while (count < 0){
		digit = number % 10;
		number = number/10;
		reverseNumber = reverseNumber * multiplier + digit;
		if (count == 1)
		reverseNumber = digit * 1;
		count = count + 1;
		System.out.println(reverseNumber);
		System.out.println(number);
		System.out.println(count);

		}	

		//if (numberToCheck == reverseNumber)
		//	System.out.println("Its a Palindrome");
		//	else
		//	System.out.print("Its not a Palindrome");
		

	}

}