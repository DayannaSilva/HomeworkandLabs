/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Zoo_Lab12_Inheritance.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author DayannaSilva
 */
public class Animal {
    protected int id;
    protected String cientifyName;
    protected int arrivalYear;
    protected int yearsOfStay;
    public void computingYearsOfStay (int arrivalYear){
        //Operation operation = new Operation();
        Calendar cal = new GregorianCalendar();
        yearsOfStay = (cal.get(Calendar.YEAR)-arrivalYear); 
        
    }

    public Animal(int id, String cientifyName, int arrivalYear) {
        this.id = id;
        this.cientifyName = cientifyName;
        computingYearsOfStay(arrivalYear);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCientifyName() {
        return cientifyName;
    }

    public void setCientifyName(String cientifyName) {
        this.cientifyName = cientifyName;
    }

    public int getArrivalYear() {
        return arrivalYear;
    }

    public void setArrivalYear(int arrivalYear) {
        this.arrivalYear = arrivalYear;
    }

    public int getYearsOfStay() {
        return yearsOfStay;
    }

    public void setYearsOfStay(int yearsOfStay) {
        this.yearsOfStay = yearsOfStay;
    }
    
    
}
