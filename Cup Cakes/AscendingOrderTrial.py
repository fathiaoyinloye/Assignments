public class AscendingOrder{

	public static int[] ascendingOrder(int[] numbers){
		int smallest = numbers[0];
		for (int count = 0; count < numbers.length; count++){
			if (numbers[count] < smallest)
				numbers[count] = smallest;
			

		
		}
		return numbers;

	}




	public static void main(String[] args){
	
		int[] result = ascendingOrder(new int[] {10, 13, 4, 9, 56, 31, 78, 90,43, 65});
			for(int index = 0; index < result.length; index++){
				System.out.print(result[index]);

			}
	

	}

}