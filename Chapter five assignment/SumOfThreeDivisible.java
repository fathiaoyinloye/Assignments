public class SumOfThreeDivisible{

	public static void main(String[] args){


	/* int count = 0;
	int sum = 0;
	while(count <30){
		count = count + 3;
		sum = sum + count;
			
	}
	System.out.println(sum);	*/
	int sum = 0;
	for(int count = 1; count <=30; count++){
		if(count % 3 == 0){
		sum = sum + count;

		}
	}
		System.out.println(sum);	


	}
}