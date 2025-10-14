public class PixelQuantization{
	public static void main(String... args){

		int[] pixelColours = {5, 250,78,45,22,199,150, 56};

		for (int index = 0; index < pixelColours.length; index++){
			if (pixelColours[index] <=0)
				pixelColours[index] = 0;

			else if (pixelColours[index] <= 20)
				pixelColours[index] = 10;

			else if (pixelColours[index] <= 40)
				pixelColours[index] = 30;

			else if (pixelColours[index] <= 60)
				pixelColours[index] = 50;

			else if (pixelColours[index] <= 80)
				pixelColours[index] = 70;

			else if (pixelColours[index] <= 100)
				pixelColours[index] = 90;

			else if (pixelColours[index] <= 120)
				pixelColours[index] = 110;

			else if (pixelColours[index] <= 140)
				pixelColours[index] = 130;
			
			else if (pixelColours[index] <= 160)
				pixelColours[index] = 150;

			else if (pixelColours[index] <= 180 || pixelColours[index] <= 180){
				pixelColours[index] = 170;}
			else{
				pixelColours[index] = 190;}
	
			System.out.print(pixelColours[index] + "  ");

		}



	}
}