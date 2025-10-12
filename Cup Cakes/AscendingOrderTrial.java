public class AscendingOrderTrial{

	public static int[] ascendingOrder(int[] numbers){
			for (int count = 0; count < numbers.length; count++){
				for(int counter = count + 1; counter <= count; counter++){
					if (numbers[count] < numbers[counter]){
						int temporary = numbers[counter];
						numbers[counter] = numbers[count];
						numbers[count] = temporary;
					}		
			}
			
			

		}
		return numbers;

	}




	public static void main(String[] args){
	
		int[] result = ascendingOrder(new int[] {10, 13, 4, 0, 9, 56, 31, 78, 90,43, 65});
			for(int index = 0; index < result.length; index++){
				System.out.print(result[index] + " ");

			}
	

	}

}