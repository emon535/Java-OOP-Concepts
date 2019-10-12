/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package LoanCalculator;

/**
 *
 * @author Dell OptiPlex
 */
public class BicycleRegistration {
    public static void main(String[] args) {
        Bicycle mongoose, core ;
        String emon, mitul;
        
        mongoose = new Bicycle();
        core = new Bicycle();
        
        mongoose.setOwnerName("Foysal Ahmed Emon");
        core.setOwnerName("Faria Tasnim Mitul");
        
        emon = mongoose.getOwnerName();
        mitul = core.getOwnerName();
        
        System.out.println(emon +" and "+ mitul);
    }
}
