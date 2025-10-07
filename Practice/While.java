public class While{
	public static void main(String... args){
		
		int digit = 0;
		int number = 152;
		int reverseNumber = 0;
		int multiplier = 10;
		int numberToCheck = number;
		int count = 5;
		while(number > 0 ){
			digit = number % 10;
			number = number / 10;
			reverseNumber = reverseNumber * multiplier + digit;
			if (count == 5)
				reverseNumber = digit * 1;
	
			count++;
			System.out.println(reverseNumber);	
			}
		if (numberToCheck == reverseNumber)
			System.out.println("Its a Palindrome");
		else
			System.out.print("Its not a Palindrome");

	
	}

}