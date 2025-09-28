public class TaskSeven{
	public static void main(String[] args){
	int number = 4;
	int product = 1;
	int sum = 0;
	for(int count = 1; count <= 5; count++){
		product = product * number;
		sum = sum + product;
		
	}
	System.out.println(sum);
	System.out.println();

	sum = 0;
	number = 8;
	product = 1;
	for(int count = 1; count <=5; count++){
		product = product * number;
		sum = sum + product;

	}
		System.out.println(sum);


	

	}
}