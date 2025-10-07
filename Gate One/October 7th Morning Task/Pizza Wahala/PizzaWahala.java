import java.util.Scanner;

public class PizzaWahala{
	public static void main (String[] args){

		Scanner scanner = new Scanner(System.in);


		String menu = """


			WELCOME TO IYA MOSES PIZA JOINT
	*********************************************************************************
		No	PIZZA TYPE	*   NUMBER OF SLICES	*	PRICE PER BOX	
	*********************************************************************************
		1	Sapa size	*	4		*		2,500	
	*********************************************************************************
		2	Small Money	*	6		*		2900	
	*********************************************************************************
		3	Big boys	*	8		*		4,000	
	*********************************************************************************
		4	Odogwu		*	12		*		5,200	
	*********************************************************************************
	
	


""";
		System.out.println(menu);
		System.out.print("Please, Choose your choice from(No 1 - 4) above: ");
		String menuChoice = scanner.next();
		
		switch(menuChoice)  {

			case "1"  -> {

				System.out.print("Enter the number of people eating the Pizza: ");
				int people = scanner.nextInt();
				int calNumber = people;
				int boxes = people/4;
				if(people % 4 != 0){
				//people = people + (people % 4);
				boxes = boxes + 1;
				}
				int remainder =  (people % 4) - 4;
				int price = boxes * 2500;
		
			
				System.out.println("The number of boxes is: " + boxes);	
				System.out.println("The number of remaining slice is: " + -remainder);
				System.out.println("The price of pizza is: " + price);



			}

			case "2"  -> {
				System.out.print("Enter the number of people eating the Pizza: ");
				int people = scanner.nextInt();
				int calNumber = people;
				int boxes = people/6;
				if(people % 6 != 0){
					//people = people + (people % 6);
				boxes = boxes + 1;
				}
				int remainder =  (people % 6) - 6;
				int price = boxes * 2900;
		
			
				System.out.println("The number of boxes is: " + boxes);	
				System.out.println("The number of remaining slice is: " + -remainder);
				System.out.println("The price of pizza is: " + price);

				}

		case "3"  -> {

			System.out.print("Enter the number of people eating the Pizza: ");
			int people = scanner.nextInt();
			int calNumber = people;
			int boxes = people/6;
			if(people % 8 != 0){
				//people = people + (people % 8);
				boxes = boxes + 1;
			}
				int remainder =  (people % 8) - ;
			int price = boxes * 4000;
		
			
			System.out.println("The number of boxes is: " + boxes);	
			System.out.println("The number of remaining slice is: " + -remainder);
			System.out.println("The price of pizza is: " + price);
			}

		case "4"  -> {

			System.out.print("Enter the number of people eating the Pizza: ");
			int people = scanner.nextInt();
			int calNumber = people;
			int boxes = people/12;
			if(people % 12 != 0){
				//people = people + (people % 12);
				boxes = boxes + 1;
			}
				int remainder =  (people % 12) - 12;
			int price = boxes * 5200;
		
			
			System.out.println("The number of boxes is: " + boxes);	
			System.out.println("The number of remaining slice is: " + -remainder);
			System.out.println("The price of pizza is: " + price);


			}
		
		default -> System.out.println("Invalid Input");


}

	}




}