
public class Distance {
	
	public static void main(String[] args){
		
		//variable
		final int monthlyDeposit = 100;
		final double interestRate = 0.05;
		double monthlyInterest, compounding;
		double month2, month3, month4, month5, month6;
		
		monthlyInterest = interestRate / 12;
		compounding = 1 + monthlyInterest;
		
		month2 = monthlyDeposit * compounding;
		month3 = (monthlyDeposit + month2) * compounding;
		month4 = (monthlyDeposit + month3) * compounding;
		month5 = (monthlyDeposit + month4) * compounding;
		month6 = (monthlyDeposit + month5) * compounding;

		System.out.println("The account value after the sixth month " + month6);


	}

}
