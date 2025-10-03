public class ModifiedCompoundInterest{
	public static void main(String[] args){
	
	double principal = 1000.0;
	double rateOne = 0.05;
	double rateTwo = 0.06;
	double rateThree = 0.07;
	double rateFour = 0.08;
	double rateFive = 0.09;
	double rateSix = 0.1;
		System.out.println("Years"+ "\t" + "5%" + "\t" + "6%" + "\t" + "7%" + "\t" + "8%"+ "\t" + "9%"+ "\t" + "10%");
		for(int year = 1; year <=10; year++){
		double amountOne = principal * Math.pow(1 + rateOne, year);	
		double amountTwo = principal * Math.pow(1 + rateTwo, year);	
		double amountThree = principal * Math.pow(1 + rateThree, year);	
		double amountFour = principal * Math.pow(1 + rateFour, year);	
		double amountFive = principal * Math.pow(1 + rateFive, year);	
		double amountSix = principal * Math.pow(1 + rateSix, year);


	int amountOneInt = (int) amountOne;
	int amountTwoInt = (int) amountTwo;
	int amountThreeInt = (int) amountThree;
	int amountFourInt = (int) amountFour;
	int amountFiveInt = (int) amountFive;
	int amountSixInt = (int) amountSix;

		
	System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d%n", year, amountOneInt,amountTwoInt,amountThreeInt,amountFourInt,amountFiveInt,amountSixInt);
	

// convert to dollars and cent
// I converted to double, how do i get the fractional part to convert to cent- convert the double datatype

		}

	}	
}