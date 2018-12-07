import java.util.Scanner;

public class Years {
	
	public static void main(String[] args){
		//variables
		int minutes, years, days;
		Scanner input = new Scanner(System.in);
		
		//asking
		System.out.print("Enter the number of minutes: ");
		minutes = input.nextInt();
		
		//calculatin
		years = minutes / (365*24*60);
		days = (minutes % years)/(60*24); 
		
		//printout
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
		
		
	}

}
