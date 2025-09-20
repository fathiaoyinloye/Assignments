
/* 
Pseudocode
prompt a user to enter a number
save it as input in a container
create another container called square  and will be equal to zero
start an iteration process and assume that we dont know the number of times which we be equal to zero then we assume that the number of times is lesser than the number itself or its greater and we will assign this to it
Our container square will then be equal to the number plus square itself again
Print the square of the number  */



import java.util.Scanner;
public class SquareLoop{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int square = 0;

		for(int times = 0; times < number || times > number ; times++){
		square = number + square;
		}
		System.out.print(square);
	}
}