/* Prompt user to enter first point
Save as a
Prompt user to enter second point
Save as b
Prompt user to enter third point
Save as a c
Check if a is equal to b and a is equal to c and b is eual to c
Print equilateral, if not
Check if a is equal to b or a is equal to c or b is equal to c
Print Isoceles, if not
Print Scalane */




import java.util.Scanner;

public class Sides{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter first length: ");
	int a = scanner.nextInt();

	System.out.print("Enter second length: ");
	int b = scanner.nextInt();

	System.out.print("Enter third length: ");
	int c = scanner.nextInt();


	if(a == b && a == c && b==c){
	System.out.println("Equilateral");
	}

	else if(a == b || a == c || b==c){
	System.out.println("Isoseceles");
	}

	else {
	System.out.println("Scalene");
	}


	}
}