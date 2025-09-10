import java.util.Scanner;

public class PersonalAssistant3{
	public static void main(String[] args){
 		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.println("Hello, " +name + "! Welcome to your personal assistant.");

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
	
		if(age < 13 ){
			System.out.println("You are a young explorer!");
		}
		else if(age <= 19){
			System.out.println("Teen life is fun enjoy it!");
		}
		else if(age <= 59){
	
		System.out.println("Adulting can be challenging, stay strong!");
		}
		else{
			System.out.println("Wisdom looks good on you!");
		}

		System.out.print("Choose your mood from the following-happy, sad, excited or tired: ");
		String mood = scanner.next();

		if(mood.equals("happy")){
			System.out.println("Keep smiling!");
		}
		else if(mood.equals("sad")){
			System.out.println("Cheer up! Tomorrow is a new day.");
		}
		else if(mood.equals("excited")){
			System.out.println("Awesome! Enjoy your energy!");
		}
		else if(mood.equals("tired")){
			System.out.println("Have a short nap or rest to recharge.");
		}
		else {
			System.out.println("Incorrect input, please input either happy, sad, excited or tired. ");
		}

		System.out.print("Guess a number from 1-10: ");
		int number = scanner.nextInt();
		if(number == 5){
			System.out.println("Bravo! you guessed right, come back for an amazing experience with me.");
		}
		else{
			System.out.println("Oopps!, you guessed wrongly, Try again next time.");
		}
		
		System.out.print("Do you want a suggestion for the day(yes or no): ");
		String suggestion = scanner.next();
		if(suggestion.equals("yes") && mood.equals("happy")){
			System.out.println("Go out and play a sport you like!");
		}
		if(suggestion.equals("yes") && mood.equals("sad")){
			System.out.println("Take a short walk outside and get some fresh air!");
		}
		if(suggestion.equals("yes") && mood.equals("excited")){
			System.out.println("Share your excitement by helping someone!");
		}
		if(suggestion.equals("yes") && mood.equals("tired")){
			System.out.println("Have a short nap or rest to recharge!");
		}

		else if(suggestion.equals("no")){
			System.out.println("No worries! Have a great day anyway!");
		}
		


	}

}