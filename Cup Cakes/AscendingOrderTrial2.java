public class AscendingOrderTrial2{
		public static void main(String[] args){


		int[] numbers = {10, 13, 4, 0, 9, 56, 31, 78, 90,43, 65};

			for (int count = -1; count < numbers.length; count++){
				for(int counter = 0; counter <= count; counter++){
					if (numbers[count] < numbers[counter]){
						int temporary = numbers[counter];
						numbers[counter] = numbers[count];
						numbers[count] = temporary;
					}

					

								
			}
		
		}
					for (int count = 0;count < numbers.length; count++){
								System.out.print(numbers[count]+ " ");

			
	}

	}

}