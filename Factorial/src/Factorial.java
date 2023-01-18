import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		
		int number;
		int factorial = 1;
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		
		for(int x = 1; x<= number; x++) {
			System.out.print(x + "*" +factorial + " = ");
			factorial = factorial * x;
			System.out.println(factorial);
		}
		System.out.println("The answer: " + factorial);
	}
 
}
 
