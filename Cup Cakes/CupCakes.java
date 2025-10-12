public class CupCakes{
	
	public static int findSmallest (int[] number){
	int smallest = number[0];

	for (int index = 0; index < number.length; index++){
		if (number[index] < smallest)
		smallest = number[index];

	}
	
	return smallest;


	}



	public static int averageArray (int[] number){
	int average = 0;
	int sum = 0;
	int averageCount = 0;
	
	for (int count = 0; count < number.length; count++){
		averageCount = averageCount + 1;
		sum += number[count];
		average = sum / averageCount;	
	}
		return average;
	
	}

	public static int countOccurrence(int[] number, int target){
	int targetCount = 0;
	for (int count = 0; count < number.length; count++){
		if(number[count] == target)
			targetCount += 1;
		
	}
		return targetCount;
	
	}

	public static boolean containsElement(int[] number, int target){
		int targetCount = 0;
		for (int count = 0; count < number.length; count++){
			if(number[count] == target)
				targetCount += 1;
		
	}
		if (targetCount == 0)
		return false;
		else
		return true;
	
	}

	public static int getFirstElement(int[] number ){
		int first = number[0];
		for (int count = 0; count < number.length; count++){
			if(number.length == 0)
				return  0;
		else return first;

		
	}
		return 0;
		
	}

	public static int getLastElement(int[] number ){
	int last = 0;
		for (int count = 0; count < number.length; count++){
			last = number[count];
		if(number.length == 0)
				return  0;
		else return last;

		
		
	}
		return 0;
		
	}


	public static int arrayLength(int[] number ){
		int count = 0;
		for (int index = 0; index < number.length; index++){
			count += 1;

		
		
	}
		return count;
		
	}
	
	public static int getMiddleElement(int[] number ){
			int middle = 0;
		for (int index = 0; index < number.length; index++){
			middle = number[(number.length - 1) /2];
		
		
	}
		return middle;
		
	}
	
	public static int[] swapFirstAndLast(int[] number ){
		
		for(int index = 0; index < number.length; index++){
			int first = number[0];
			number[0] = number[number.length - 1];
			number[number.length - 1] = first;


	}
	return number;
		
	}




	
}