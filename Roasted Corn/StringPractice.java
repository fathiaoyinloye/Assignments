public class StringPractice{
	public static void main(String[] args){
String letters = "Bola";
String output = "";
int number = 3;
	if (number % 1 == 0){
		for (int count = 0; count < number; count++){
			output += letters;
		}
	}
	else
		output = letters;
	
	//return	output

		System.out.println(output);


	
/*String [] words = {"boy", "father", "microscope", "jollofrice"};

	String longestWords = words[0];
	int longest = words[0].length();
	for(int count = 1; count < words.length; count++){
		if (words[count].length() > longest){
		longest = words[count].length();
		longestWords = words[count];
		}
	String result =  longest + "  "  + longestWords;
		System.out.println(result);




}	






		String output = "";
		String letters = "enly";
		if (letters.length() < 3){
			output = letters;
			System.out.print(output);

		}
		while(letters.length() >=3){
			String removeSuffix = "";
			String lastThreeCharacters = letters.substring(letters.length()-3, letters.length());
			String lastTwoCharacters = letters.substring(letters.length()-2, letters.length());

			if (!lastThreeCharacters.equalsIgnoreCase("ing") && !lastTwoCharacters.equalsIgnoreCase("ly")){
				output = letters + "ing";
			}
			else if (lastThreeCharacters.equalsIgnoreCase("ing")){
				removeSuffix = letters.substring(0, letters.length() - 3);
				output = removeSuffix + "ly";
			}
			else if (lastTwoCharacters.equalsIgnoreCase("ly")){
				removeSuffix = letters.substring(0, letters.length() - 2);
				output = removeSuffix + "ing";
			}

			System.out.print(output);
			break;
		}

	if (letters.length() > 2)
		output = "" + letters.charAt(0) + letters.charAt(1) + letters.charAt(letters.length()-2) + letters.charAt(letters.length()-1);
	else
		output = "\"\"";	
	System.out.print(output);
	
		for (int count = 1; count < letters.length(); count+=2){
			output += letters.charAt(count);

		}
	System.out.print(output);

	
	

	
	String one = "Fathia";
	String two = "Tope";
	String three = one + two;
	String four = "" + one.charAt(0) + one.charAt(1);

	String five = one.substring(0, 3);//substring is better when it's in sequence

	System.out.println(four);

	System.out.print(five); */

		
	}
}