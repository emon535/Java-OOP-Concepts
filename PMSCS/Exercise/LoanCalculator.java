/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoanCalculator;

/**
 *
 * @author Foysal Ahmed Emon
 */

import java.util.*;
 public class LoanCalculator {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the Total Loan Amount: ");
        int p = in.nextInt();  
		System.out.print("Input the Annual Interest: ");
		int i = in.nextInt(); 
		System.out.print("Input the Loan Period : ");
                int n = in.nextInt(); 
		System.out.print("\n");
                
                System.out.print("The result is: "+ getTheValue(p,i,n));
		System.out.print("\n");
    }
    
    public static double getTheValue(int p, int rate, int n)
    {   
        double  m = 0;   
        double  monthlyRate = rate/0.12;
        
        double value = Math.pow(monthlyRate*(monthlyRate+1), n);
        double anotherValue = Math.pow((1+monthlyRate), n);
        
        m = p* value / anotherValue-1;
//        int m = p* (i*(1+i)^n)/(1+i)^n-1;
        
        return m;
    }
}