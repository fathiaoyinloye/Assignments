public class NewAstericks{
	public static void main(String[] args){
	
		for(int i = 1; i <= 10; i++){
			for(int y = 1; y <= i; y++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for(int i = 1; i <= 10; i++){
			for(int y = 11; y > i; y--){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 1; i <= 10; i++){
			for(int y = 1; y <= i; y++){
				System.out.print("  ");
			}
			for(int y = 11; y > i; y--){
				System.out.print(" *");
			}
			System.out.println();
		}

			System.out.println();

		for(int i = 1; i <= 5; i++){
			for(int y = 5; y > i; y--){
				System.out.print("  ");
			}
			for(int y = 1; y <= i; y++){
				System.out.print(" *");
			}

			System.out.println();
		}
	

	}
}