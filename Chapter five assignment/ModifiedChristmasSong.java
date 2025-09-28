import java.util.Scanner;

public class ModifiedChristmasSong{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	for(int count = 1; count <= 12; count++){
		System.out.print("Enter a day between 1-12: ");
		int day = scanner.nextInt();
		
		System.out.println();
		switch(day){
		case 12: {System.out.println("On the twelfth day of Christmas");
			System.out.println("My True Love gave to me");break;}

		case 11: {System.out.println("On the eleventh day of Christmas");
			System.out.println("My True Love gave to me");break;}

		case 10: {System.out.println("On the tenth day of Christmas");
			System.out.println("My True Love gave to me");break;}


		case 9: {System.out.println("On the ninth day of Christmas");
			System.out.println("My True Love gave to me");break;}


		case 8: {System.out.println("On the eighth day of Christmas");
			System.out.println("My True Love gave to me");break;}

		case 7: {System.out.println("On the seventh day of Christmas");
			System.out.println("My True Love gave to me");break;}

		case 6:{System.out.println("On the sixth day of Christmas");
			System.out.println("My True Love gave to me");break;}


		case 5: {System.out.println("On the fifth day of Christmas");
			System.out.println("My True Love gave to me");break;}


		case 4: {System.out.println("On the fourth day of Christmas");
			System.out.println("My True Love gave to me");break;}


		case 3: {System.out.println("On the third day of Christmas");
			System.out.println("My True Love gave to me");break;}


		case 2: {System.out.println("On the second day of Christmas");
			System.out.println("My True Love gave to me");break;}


		case 1: {System.out.println("On the first day of Christmas");
			System.out.println("My True Love gave to me");break;}

		default: System.out.println("Invalid inputed day");

		}
		
	
		switch(day){
		case 12: System.out.println("Twelve drummers drumming");

		case 11: System.out.println("Eleven Pipers piping");

		case 10: System.out.println("Ten lords a-leaping");

		case 9: System.out.println("Nine ladies dancing");

		case 8: System.out.println("Eight maids a-milking");

		case 7: System.out.println("Seven swans a-swimming");

		case 6: System.out.println("Six geese a-laying");

		case 5: System.out.println("Five golden rings");

		case 4: System.out.println("Four calling birds");

		case 3: System.out.println("Three French hens");

		case 2: System.out.println("Two turtle doves");

		case 1: System.out.println("A patridge in a pear tree");break;

		default: System.out.println("Invalid inputed day");



		}
	}



	}
}