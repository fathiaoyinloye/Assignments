public class AstericksPattern{

	public static void main(String[] args){
	

			for(int count = 0; count <= 6; count++){
				
				for(int counter = 1; counter <= count; counter++){
					System.out.print("*");

				}


				for(int counter = 5; counter >= count + 1; counter--){
					System.out.print(" ");

				}
				for(int counter = 5; counter >= count+1; counter--){
					System.out.print("*");

				}
	
	
				System.out.println();
			}

	}
}