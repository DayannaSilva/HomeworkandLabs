/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Age_UnitTesting.business;

import java.util.Calendar;

/**
 *
 * @author DayannaSilva
 */
public class Person {
    
    private int bornDay,bornYear,bornMonth;
    private int ageYear,ageDay,ageMonth;
    
    Calendar cal = Calendar.getInstance();
    Operation operation = new Operation();

   
    public void calculateAge(int bornDay,int bornMonth,int bornYear){
        
        ageYear = operation.subs(cal.get(Calendar.YEAR),this.bornYear);
    }
    
    public void calculateDay(int bornDay,int bornMonth,int bornYear){
        
        ageDay=operation.subs(cal.get(Calendar.DAY_OF_MONTH), bornDay);
        
        if(Validation.dayBornMonth){
            ageDay=ageDay+30; 
            if(ageDay >= 30){
                ageDay = operation.subs(ageDay, 30);
                ageMonth++;
            }
        }else{
            ageDay=ageDay+31; 
            if(ageDay >= 31){
                ageDay = operation.subs(ageDay, 31);
                ageMonth++;
            }
                
        }
           
    }
    
    public void calculateMonth(int bornDay, int bornMonth, int bornYear){
        
        if(bornMonth >= (1 + cal.get(Calendar.MONTH)) 
                && (bornDay >= cal.get(Calendar.DAY_OF_MONTH))){
            this.bornYear = operation.add(bornYear,1);
        }
        else 
            this.bornYear = bornYear;
        
        if((operation.subs(cal.get(Calendar.MONTH) + 1, bornMonth) <= 0) 
                && (bornDay >= 30))
            bornMonth++;
            
        ageMonth = operation.subs(cal.get(Calendar.MONTH) + 1, bornMonth);
        
        if (ageDay>=cal.get(Calendar.DAY_OF_MONTH)) 
            ageMonth=ageMonth-1;
         
        if(ageMonth < 0)
            ageMonth = operation.add(12, ageMonth);
        
    }

     public Person() {
        
        operation = new Operation();
        cal = Calendar.getInstance(); 
    }
    

    public int getBornDay() {
        return bornDay;
    }

    public void setBornDay(int bornDay) {
        this.bornDay = bornDay;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public int getBornMonth() {
        return bornMonth;
    }

    public void setBornMonth(int bornMonth) {
        this.bornMonth = bornMonth;
    }

    public int getAgeYear() {
        return ageYear;
    }

    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    public int getAgeDay() {
        return ageDay;
    }

    public void setAgeDay(int ageDay) {
        this.ageDay = ageDay;
    }

    public int getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }
    
    
    
}
