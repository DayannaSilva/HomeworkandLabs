/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab9_ControlSentencesAndOperators.model;

import java.util.Calendar;
//import java.util.Date;

/**
 *
 * @author DayannaSilva
 */
public class Person {
    private int day,month,year;
    private int ageYear,ageMonth,ageDay;
    
    
    
    public void calculateAge (){
        Calendar today = Calendar.getInstance();
        //date = new Date ();
        
        Operation operation = new Operation();
        ageYear = operation.subtraction(today.get(Calendar.YEAR), getYear());
        ageMonth = operation.subtraction((today.get(Calendar.MONTH)+1), getMonth());
        ageDay = operation.subtraction(today.get(Calendar.DAY_OF_MONTH), getDay());        
       
    }

    public Person(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the ageYear
     */
    public int getAgeYear() {
        return ageYear;
    }

    /**
     * @param ageYear the ageYear to set
     */
    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    /**
     * @return the ageMonth
     */
    public int getAgeMonth() {
        return ageMonth;
    }

    /**
     * @param ageMonth the ageMonth to set
     */
    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }

    /**
     * @return the ageDay
     */
    public int getAgeDay() {
        return ageDay;
    }

    /**
     * @param ageDay the ageDay to set
     */
    public void setAgeDay(int ageDay) {
        this.ageDay = ageDay;
    }
    
    

    
}
