import java.util.Scanner;

public class BackToSenderLogistics{

	public static int getAllowance(int successfulDelivery){
		int pay = 0;
		if (successfulDelivery > 0 && successfulDelivery < 50)
			pay = successfulDelivery * 160 + 5000;
		
		else if (successfulDelivery < 60)
			pay = successfulDelivery  * 200 + 5000;
		
		else if (successfulDelivery < 70)
			pay = successfulDelivery  * 250 + 5000;
		
		else if (successfulDelivery < 101)
			pay = successfulDelivery  * 500 + 5000;
		
	return pay;


	}
	public static String menu(){
	
		String menu = """
*********************************************************
*	Back To Sender Logistics Service		*
*********************************************************
*Collection Rate	Amount Per Parcel	Base Pay*
*********************************************************
*less than 50%		160			5,000	*
*50 - 59%		200			5,000	*
*60 - 69%		200			5,000	*
*>= 70%			500			5,000	*
*********************************************************
	""";
	return menu;

	}


	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);

 		String toContinue = "";

		while (!toContinue.equals("done")){
			System.out.println(menu());	

			System.out.print("Enter the number of successful delivery made by the rider: ");
			int delivery = scanner.nextInt();

			while(delivery < 1  || delivery > 100){
				System.out.println("Riders can only have a minimum delivery of 1 and a maximum deliveries of 100");
				System.out.print("Enter the number of successful delivery made by the rider: ");
				delivery = scanner.nextInt();
				if(delivery > 0 && delivery < 101)
					break;
				}
	int result = (getAllowance(delivery));	

	System.out.println("The allowance of rider for " +  delivery + "deliveries is: " + result);
	System.out.print("Enter 'done' if you have calculculated all rider's allowance or enter any other thing to continue: ");
	toContinue = scanner.next().toLowerCase();

		}


	}
	

}