public class PizzaCalculation{

	public static String getSapaSize(int people){
		int boxes = people/4;
		if(people % 4 != 0)
			boxes = boxes + 1;
				
			int totalSlice = 4 * boxes;
			int remainder = totalSlice - people;
			int price = boxes * 2500;
		
		String output = "The number of boxes is: "  + boxes + "\nThe number of remaining slice is: " + remainder + "\nThe price of pizza is: " + price;



			return output;
					
	}



	public static String smallMoneySize(int people){
		int boxes = people/6;
		if(people % 6 != 0)
			boxes = boxes + 1;
				
		int totalSlice = 6 * boxes;
		int remainder = totalSlice - people;
		int price = boxes * 2900;
		
			
		String output = "The number of boxes is: "  + boxes + "\nThe number of remaining slice is: " + remainder + "\nThe price of pizza is: " + price;


		return output;
	
	}

		public static String bigMoneySize(int people){
		int boxes = people/8;
		if(people % 8 != 0)
			boxes = boxes + 1;
				
		int totalSlice = 8 * boxes;
		int remainder = totalSlice - people;
		int price = boxes * 4000;
		
			
		String output = "The number of boxes is: "  + boxes + "\nThe number of remaining slice is: " + remainder + "\nThe price of pizza is: " + price;


		return output;

	
	}
	public static String odogwuSize(int people){
		int boxes = people/12;
		if(people % 12 != 0)
			boxes = boxes + 1;
				
		int totalSlice = 12 * boxes;
		int remainder = totalSlice - people;
		int price = boxes * 5200;
		
			
		String output = "The number of boxes is: "  + boxes + "\nThe number of remaining slice is: " + remainder + "\nThe price of pizza is: " + price;


		return output;

	
	}





}