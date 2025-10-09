public class Swap{
	public static void main(String[] args){

int[] numbers = {1,3,4,7,4,3,5};

		int i = numbers[0];
		numbers[0] = numbers[6];
		numbers[6] = i;


	
	
	for(int index = 0; index < 7; index++){
		System.out.println(numbers[index]);
		


	}


}
}