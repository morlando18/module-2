import java.util.Scanner;
public class Temperatures {
	public static void main(String[] args){
		double fahrenheit, celsius;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		celsius = input.nextDouble();
		fahrenheit = (9.0/5)*celsius+32;
		System.out.println((int)celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		
		
	}
}
