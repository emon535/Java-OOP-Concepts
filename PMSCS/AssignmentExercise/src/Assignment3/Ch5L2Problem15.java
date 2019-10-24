package Assignment3;

import java.util.Scanner;

 class Ch5L2Problem15 {
	public static final int INVALID_DIMENSION = -1;
	
	private double aSide,bSide,cSide;
	
	public void Ch5L2Problem15(double a,double b, double c) {
		setDimension(aSide,bSide,cSide);
	}
	
	public void setDimension(double a, double b , double c) {
		if(a >0 && b>0 && c>0) {
			aSide=a;
			bSide=b;
			cSide=c;
		}
	}
	
	public double getParameter(){
		double parameter = INVALID_DIMENSION;
		if (isValueValid()) {
		parameter = aSide+bSide+cSide;
		}
		return parameter;
	}
	
	public double getArea(){
		double diameter = INVALID_DIMENSION;
		if (isValueValid()) {
		diameter = aSide*bSide*cSide;
		}
		return diameter;
	}
	
	
	
	private boolean isValueValid(){
		return aSide != INVALID_DIMENSION;
	}


}


public class TringleCreator {
		public static void main(String[] args) {
			double a, b, c , parameter , area;
			
			Ch5L2Problem15 Tringle;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enger A,B and C");
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			c = scanner.nextDouble();
			Tringle = new Ch5L2Problem15(a,b,c);

			parameter = Tringle.getParameter();
			area = Tringle.getArea();
			System.out.println("Input Parameter:  " + parameter);
			System.out.println("Area: " + area);

			
		}
}
