/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

import java.util.Scanner;

/**
 *
 * @author Dell OptiPlex
 */
public class CoffeeBagCalculation {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input the Total Number of Coffee Bag: ");
        double numberOfBags = in.nextInt();
        
        
        System.out.print("Input the Total Number of Coffee Bag: ");
        double weight = in.nextInt();
        
       CoffeeBag BagOne = new CoffeeBag(numberOfBags, weight);
        
       
                
        System.out.println(BagOne.getCoffeePrice());
    
    }
}
