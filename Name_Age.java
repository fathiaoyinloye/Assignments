import java.util.Scanner;

public class Name_Age{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String name1 = scanner.next();
		System.out.print("Enter first age: ");
		int age1 = scanner.nextInt();
	
		System.out.print("Enter second name: ");
		String name2 = scanner.next();
		System.out.print("Enter second age: ");
		int age2 = scanner.nextInt();
	
		System.out.print("Enter third name: ");
		String name3 = scanner.next();
		System.out.print("Enter third age: ");
		int age3 = scanner.nextInt();

		int youngest = age1;
		String youngest_name = name1;
		
		if(age2 < youngest){
		youngest = age2;
		youngest_name = name2;
		}
		
		if(age3 < youngest){
		youngest = age3;
		youngest_name = name3;
		}
		System.out.printf("The youngest is: %s%n", youngest_name);

		int oldest = age2;
		String oldest_name = name2;
		
		if(age1 > oldest){
		oldest = age1;
		oldest_name = name1;
		}
		
		if(age3 > oldest){
		oldest = age3;
		oldest_name = name3;
		}
		System.out.printf("The oldest is: %s%n", oldest_name);



	}
}