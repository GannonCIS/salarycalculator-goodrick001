/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author sethg
 */
public class SalaryCalculator {
    private SalaryCalculator myCalc = new SalaryCalculator(); 
    
    private int hours = 40;
    
    private double taxRate = .2;
    
    private int salary = 60000;
    
    private int hourlyRate = 29;
    
    private double takeHomePerMonth = 4640;
    
    public void printout(){
        System.out.println("Salary = " + hourlyRate*40*52);
        System.out.println("Hourly Rate = " + salary/52/40);
        System.out.println("Take Home Per Month = " + salary/12*.8);
        System.out.println("Taxes Taken Out of Salary = " + salary*.2);
    }
   
    
}   


