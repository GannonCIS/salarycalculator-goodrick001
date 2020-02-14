/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
           
       }
        public int calcSalary(int hourlyRate){
            int salary = hourlyRate*40*52;
          
            return salary;
               
    }
        public int calcHourly(int salary){
            int hourlyRate = salary/52/40;
            return hourlyRate;
    }
        public double takeHomePerMonth(int salary, double taxRate){
        int takeHomePerMonth = (int) (salary/12*.8);
            return takeHomePerMonth;
    }
        public double calcTaxes(int salary, double taxRate){
            double calcTaxes = (salary*.2);
            return calcTaxes;   
    }
        
            
     
}


