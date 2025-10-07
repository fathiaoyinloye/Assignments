public class PizzaCalculation{

	public static void getSapaSize(int people){
		int boxes = people/4;
		if(people % 4 != 0)
			boxes = boxes + 1;
				
			int totalSlice = 4 * boxes;
			int remainder = totalSlice - people;
			int price = boxes * 2500;
		
			
				System.out.println("The number of boxes is: " + boxes);	
				System.out.println("The number of remaining slice is: " + remainder);
				System.out.println("The price of pizza is: " + price);
	
	
	}



	public static void smallMoneySize(int people){
		int boxes = people/6;
		if(people % 6 != 0)
			boxes = boxes + 1;
				
		int totalSlice = 6 * boxes;
		int remainder = totalSlice - people;
		int price = boxes * 2900;
		
			
		System.out.println("The number of boxes is: " + boxes);	
		System.out.println("The number of remaining slice is: " + remainder);
		System.out.println("The price of pizza is: " + price);
	
	
	}

		public static void bigMoneySize(int people){
		int boxes = people/8;
		if(people % 8 != 0)
			boxes = boxes + 1;
				
		int totalSlice = 8 * boxes;
		int remainder = totalSlice - people;
		int price = boxes * 4000;
		
			
		System.out.println("The number of boxes is: " + boxes);	
		System.out.println("The number of remaining slice is: " + remainder);
		System.out.println("The price of pizza is: " + price);
	
	
	}
	public static void odogwuSize(int people){
		int boxes = people/12;
		if(people % 12 != 0)
			boxes = boxes + 1;
				
		int totalSlice = 12 * boxes;
		int remainder = totalSlice - people;
		int price = boxes * 5200;
		
			
		System.out.println("The number of boxes is: " + boxes);	
		System.out.println("The number of remaining slice is: " + remainder);
		System.out.println("The price of pizza is: " + price);
	
	
	}





}