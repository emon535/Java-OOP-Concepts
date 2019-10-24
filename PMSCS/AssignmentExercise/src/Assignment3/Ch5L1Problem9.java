package Assignment3;

public class Ch5L1Problem9 {
	
	public static void main(String[] args) {
		System.out.println("Find the 10th power:");
		
		int inputNumber = 1000000;
		
		double whichPowerOfTen = Math.log10(inputNumber);
		
		System.out.println(whichPowerOfTen);
		String output = "";
		switch ((int)(whichPowerOfTen)) {
		case 6:
			output="Million" ;
			break;
		case 9:
			output="Billion" ;
			break;
		case 12:
			output="Trillion" ;
		case 15:
			output="Quadrillion" ;
		case 18:
			output="Quintillion" ;
		case 21:
			output="Sextillion" ;
		case 30:
			output="Nonillion" ;
		case 100:
			output="Googol" ;
		default:
			output="The input was not correct";
			break;
		}
		
		System.out.println(output);
	}

}
