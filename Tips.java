import java.util.Scanner;

public class Tips {
	
	public static void main(String[] args){
		
		//variables
		double subtotal, gratuityRate, gratuity, total;
		Scanner input = new Scanner(System.in);
		
		// reads subtotal and gratuity
		System.out.print("Enter the subtotal and a gratuity rate: ");
		subtotal = input.nextDouble();
		gratuityRate = input.nextDouble();
		
		// solve for gratuity and total
		gratuity = subtotal * gratuityRate / 100.0;
		total = gratuity + subtotal;
		
		//print result
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
		
	}

}
