import java.util.Scanner;

public class PizzaWahalaTest{
	public static void main (String[] args){

		Scanner scanner = new Scanner(System.in);


		String menu = """


			WELCOME TO IYA MOSES PIZZA JOINT
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
		System.out.print("Choose Pizza Type : ");
		String menuChoice = scanner.nextLine().toLowerCase();

		boolean choice = true;
		
		switch(menuChoice)  {
					
			case "sapa size"  -> {

				System.out.print("Enter the number of people eating the Pizza: ");
				int people = scanner.nextInt();
				System.out.println(PizzaCalculation.getSapaSize(people));


			}

			case "small money"  -> {
				System.out.print("Enter the number of people eating the Pizza: ");
				int people = scanner.nextInt();
				System.out.println(PizzaCalculation.smallMoneySize(people));




								}

		case "big boys"  -> {

			System.out.print("Enter the number of people eating the Pizza: ");
			int people = scanner.nextInt();
			System.out.println(PizzaCalculation.bigMoneySize(people));

			}

		case "odogwu"  -> {

			System.out.print("Enter the number of people eating the Pizza: ");
			int people = scanner.nextInt();
			System.out.println(PizzaCalculation.odogwuSize(people));

			
			}
		
		default -> System.out.println("Invalid Input");


}

	}




}