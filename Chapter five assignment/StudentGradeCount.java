import java.util.Scanner;

public class StudentGradeCount{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	int grade = 0;
	int countA = 0;
	int countB = 0;
	int countC = 0;
		for(int student = 1; student <= 5; student++){
		
			System.out.print("Enter student grade(A = 1: B = 2 C = 3: "); 
			grade = scanner.nextInt();			
			switch(grade){
			case 1:
			countA = countA + 1;
			break;
			case 2:
			countB = countB + 1;
			break;
			case 3:
			countC = countC + 1;
			break;
			}
			
			System.out.println("A: was scored by: " + countA + "Student");
			System.out.println("B: was scored by: " + countB + "Student");
			System.out.println("C: was scored by: " + countC + "Student");
		}
	}
}