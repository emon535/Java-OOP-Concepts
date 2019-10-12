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
public class CoffeeBag {
    
    public static final double PRICE_PER_POUND = 5.99;
    public static final double TAX_RATE = 7.25;
    
    private double  numberOfbag, weight = 0;
    
    private CoffeeBag(double _numberOfbags, double _weight){
        numberOfbag = _numberOfbags;
        weight = _weight;
    }
    
    
    
    public double getCoffeePrice (){
        double totalPrice = weight+numberOfbag+PRICE_PER_POUND;
        return totalPrice + totalPrice*TAX_RATE;
    }
}