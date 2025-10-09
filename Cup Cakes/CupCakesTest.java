public class CupCakesTest{
	public static void main(String... args){

	int [] numbers = {10, 4, 3, 9, 7, 9,8,5};
	int [] number = {0,0,0,0,0};
	System.out.println(CupCakes.findSmallest(numbers));
	System.out.println(CupCakes.averageArray(numbers));
	System.out.println(CupCakes.countOccurrence(numbers, 10));
	System.out.println(CupCakes.containsElement(numbers, 10));
	System.out.println(CupCakes.getFirstElement(new int[] {1,4,8}));
	System.out.println(CupCakes.getFirstElement(number));
	System.out.println(CupCakes.getLastElement(numbers));
	System.out.println(CupCakes.arrayLength(numbers));
	System.out.println(CupCakes.getMiddleElement(numbers));
	CupCakes.swapFirstAndLast(numbers);
		for (int index = 0; index < numbers.length; index++){
			System.out.print(numbers[index] + "  ");



		}



	}



}