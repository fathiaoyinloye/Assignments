import java.util.Scanner;

public class TwelveDaysOfChristmasSong{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	for(int count = 1; count <= 12; count++){
	System.out.print("Enter a day between 1-12: ");
	int day = scanner.nextInt();
	
	switch(day){
	case 1: System.out.println("A patridge in a pear tree");
		break;
	case 2: System.out.println("Two turtle doves");
		break;
	case 3: System.out.println("Three French hens");
		break;
	case 4: System.out.println("Four calling birds");
		break;
	case 5: System.out.println("Five golden rings");
		break;
	case 6: System.out.println("Six geese a-laying");
		break;
	case 7: System.out.println("Seven swans a-swimming");
		break;
	case 8: System.out.println("Eight maids a-milking");
		break;
	case 9: System.out.println("Nine ladies dancing");
		break;
	case 19: System.out.println("Ten lords a-leaping");
		break;
	case 11: System.out.println("Eleven Pipers piping");
		break;
	case 12: System.out.println("Twelve drummers drumming");

		break;
	default: System.out.println("Invalid inputed day");
		break;
	}
	}



	}
}