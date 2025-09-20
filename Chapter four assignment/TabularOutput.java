/*  	print out N N2 N3 N4 seperated by tab
	create a variable count which will be equal to 1
	count should countinue increasing until it is less than or equal to 5
	print on the following seperated by tab
	count
	count times count
	count times count times count
	count times count times count times count
												*/

public class TabularOutput{
public static void main(String[] args){


System.out.println("N\tN^2\tN^3\tN^4");

for(int count = 1; count <= 5; count++){
	System.out.println(count + "\t" + count * count + "\t" + count * count * count + "\t" + count * count * count * count);

}





}
}