public class RoundingNumbersToSpecificDecimalPlace{
	public static String roundingtoTenth(double number){
			double roundedNumber = Math.floor(number * 10)/10;
			String result = "The original number is: " + number + " and it was rounded down to: " + roundedNumber;
			return result;

	}
	public static String roundingtoHundredth(double number){
			double roundedNumber = Math.floor(number * 100)/100;
			String result = "The original number is: " + number + " and it was rounded down to: " + roundedNumber;
			return result;

	}
	public static String roundingtoThousandth(double number){
			double roundedNumber = Math.floor(number * 1000)/1000;
			String result = "The original number is: " + number + " and it was rounded down to: " + roundedNumber;
			return result;

	}





	public static void main(String[] args){
	System.out.println(RoundingNumbers.roundingNumbers(5.789456));	
	System.out.println(roundingtoTenth(5.789456));
	System.out.println(roundingtoHundredth(5.789456));
	System.out.println(roundingtoThousandth(5.789456));


	}
}