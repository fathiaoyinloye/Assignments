public class Largest{

	public static int findLargest (int[] number){
	int largest = number[0];

	for (int count = 0; count < number.length; count++){
		if (number[count] > largest)
		largest = number[count];

	}
	
	return largest;

	}



	public static int[] findTwoLargest (int[] number){
		int largest = number[0];
		int secondLargest = 0;

		for (int count = 0; count < number.length; count++){
			if (number[count] > largest){
				secondLargest = largest;
			largest = number[count];
			}

			if (number[count] < largest && number[count] > secondLargest){
				secondLargest = largest;
				largest = number[count];
			}

		

		}

		int[] result = {largest, secondLargest};

		
		return result;
		
		
	}




	public static void main(String[] args){

	System.out.println(findLargest(new int[] {10, 13, 4, 9, 56, 31, 78, 90,43, 65}));

	int[] result = findTwoLargest(new int[] {10, 13, 4, 9, 56, 31, 78, 90,43, 65});
	for(int index = 0; index < 2; index++){
		System.out.println(result[index]);

		}
		




}



}