/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Age_UnitTesting.business;

/**
 *
 * @author DayannaSilva
 */
public class CalculeAge {
    public int day(int bornDay, int bornMonth, int bornYear){
        Person person = new Person();
        person.calculateDay(bornDay, bornMonth, bornYear);
        person.calculateMonth(bornDay, bornMonth, bornYear);
        person.calculateAge(bornDay, bornMonth, bornYear);
        System.out.println("");
        return  person.getAgeDay();
    }
    
    public int year(int bornDay, int bornMonth, int bornYear){
        Person age = new Person();
        age.calculateDay(bornDay, bornMonth, bornYear);
        age.calculateMonth(bornDay, bornMonth, bornYear);
        age.calculateAge(bornDay, bornMonth, bornYear);
        return age.getAgeYear();
    }
    public int month(int bornDay, int bornMonth, int bornYear){
        Person age = new Person();
        age.calculateDay(bornDay, bornMonth, bornYear);
        age.calculateMonth(bornDay, bornMonth, bornYear);
        age.calculateAge(bornDay, bornMonth, bornYear);
        return age.getAgeMonth();
    }
    
}
