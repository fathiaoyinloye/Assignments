/*	prompt user to enter a letter in lowercase
	if letter  is 'a' or 'e' or 'i' or 'o' or 'u'
	print  letter is a vowel, if not
	if letter is 'b' or 'c' or 'd' or 'f' or 'g' or 'h' or 'j' or 'k' or 'l' or 'm' or 
	'n' or 'p' or 'q' or 'r' or 's' or 't' or 'u' or 'v' or 'w' or 'x' or 'y' or 'z'
	print letter is a consonant, if not
	print Invalid input, pleae input a letter in lowercase



												*/
import java.util.Scanner;

public class VowelOrConsonant{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter a letter in lowercase: ");
		char letter = scanner.next().charAt(0);
	
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ){
			System.out.println(letter + " is a vowel");
		}
		else if(letter == 'b' || letter == 'c' || letter == 'd' || letter == 'f' || letter == 'g' || letter == 'h' || letter == 'j' ){
			System.out.println(letter + " is a consonant");
		}
		else if(letter == 'k' || letter == 'l' || letter == 'm' || letter == 'n' || letter == 'p' || letter == 'q' || letter == 'r' ){
			System.out.println(letter + " is a consonant");
		}
		else if(letter == 's' || letter == 't' || letter == 'v' || letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z' ){
			System.out.println(letter + " is a consonant");
		}
	

		else{
			System.out.println("Invalid input, please enter a letter in lowercase" );
		}


	}
}