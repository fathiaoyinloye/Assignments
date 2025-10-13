import java.security.SecureRandom;
public class GenerateRandomNumbers{
	public static void main (String... args){
	SecureRandom random = new SecureRandom();

	int number = 5 + (int) (Math.random() * 46);
	System.out.println(number);
	int generateNumbers = 1 + random.nextInt(7);
	System.out.println(generateNumbers);

	
	}


}