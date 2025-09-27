import java.util.Scanner;

public class IVR{
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);

		String prompt = """
		Welcome to MTN.com
		1 -> To speak English
		2 -> To speak in Yoruba
		3 -> To speak in Hausa

""";
	System.out.println(prompt);
	System.out.print("Enter a number: ");
	int promptUser = scanner.nextInt();
	
	switch(promptUser){
		case 1 -> {System.out.println("Speak in English");
				String english = """
				1 -> To know your number
				2 -> To talk to a customer agent
				3 -> To borrow airtime
				""";
				System.out.print(english );

				System.out.print("Enter an option: " );
				int userInput = scanner.nextInt();

				switch(userInput){
				case 1 -> {System.out.print("Your number is 0977689");}
				case 2 -> {System.out.print("Waiting to connect with an agent");}
				case 3 -> {System.out.print("How much do you want to borrow");}
				}


			}
		case 2 -> {System.out.print("How can I help you2");}
		case 3 -> {System.out.print("How can I help you3");}

	
		}
	}

}

