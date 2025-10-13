public class RoundingNumbers{
	public static String roundingNumbers(double number){
			double roundedNumber = Math.floor(number);
			String result = "The original number is: " + number + " and it was rounded down to: " + roundedNumber;
			return result;

	}
	public static void main(String[] args){
	System.out.print(roundingNumbers(5.789));	





	}
}