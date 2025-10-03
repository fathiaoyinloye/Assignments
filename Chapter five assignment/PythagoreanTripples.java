public class PythagoreanTripples{
	public static void main(String[] args){
	
		for (int length1 = 1; length1  <= 5; length1++){
			for (int length2 = 3; length2  <= 7; length2++){
				for(int length3 = 5; length3  <= 10; length3++){
			
				
			int length1Square = length1 * length1;
			int length2Square = length2 * length2;
			int length3Square = length3 * length3;
			int SumOfOtherLengthSquare = length1Square + length2Square;
					if(length3Square == SumOfOtherLengthSquare);
					System.out.println(length1 + "  " + length2 + "  " + length3 + " are pythagorean tripples");

				}

			}
		}
	}

}