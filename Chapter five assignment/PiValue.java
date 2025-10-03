public class PiValue{
	public static void main(String[] args){


		double pi = 4;
		int count = 1;
		double denominator = 3;
		double numerator = 4;
		while(count <= 10){
			pi = pi + numerator/ denominator;
			denominator = denominator + 2;
			count = count + 1;
			System.out.printf("denominator is %f%n", denominator);
			System.out.printf("pi is %f%n", pi);

		}
	}
}
// sometimes, datatype affects calculations