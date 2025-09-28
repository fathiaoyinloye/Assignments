public class TaskNine{
	public static void main(String[] args){
	int number = 4;
	int product = 1;
	int sum = 0;
	for(int count = 1; count <= 5; count++){
		product = product * number;
		sum = sum + product;
		
	}

	int sum2 = 0;
	number = 8;
	product = 1;
	for(int count = 1; count <=5; count++){
		product = product * number;
		sum2 = sum2 + product;

	}
	int newSum = sum + sum2;
	int power = newSum * newSum;
	System.out.print(power);


	

	}
}