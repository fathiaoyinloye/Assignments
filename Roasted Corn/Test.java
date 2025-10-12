public class Test{
	public static void main(String[] args){
	
	String output = "";
	String letters = "on";
	if (letters.length() > 2)
		output = "" + letters.charAt(0) + letters.charAt(1) + letters.charAt(letters.length()-2) + letters.charAt(letters.length()-1);
	else
		output = "\"\"";	
	System.out.print(output);
	
	/*	for (int count = 1; count < letters.length(); count+=2){
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