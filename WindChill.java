import java.util.Scanner;

public class WindChill {
	
	public static void main(String[] args){
		
		//variables
		double outsideTemp, speed, windChill; 
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the temperature in Fahrenheit: ");
		outsideTemp = input.nextDouble();
		
		System.out.print("Enter the wind speed miles per hour: ");
		speed = input.nextDouble();
		
		windChill = 35.74 + 0.6215 * outsideTemp -35.75 * Math.pow(speed, 0.16) +
				0.4275 * outsideTemp * Math.pow(speed, 0.16);
		if( speed<2 || (outsideTemp < -58 || outsideTemp > 41)){
			System.out.println("sorry, speed<2 || (outsideTemp < -58 || outsideTemp > 41)");

		}else{
		System.out.println("The wind chill index is " + windChill);
		}

		
		
	}

}
