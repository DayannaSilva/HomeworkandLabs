/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Age_UnitTesting.business;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

/**
 *
 * @author DayannaSilva
 */
public class Validation {
    
    static boolean dayBornMonth;
    static boolean leapDay;
    static boolean leapYear;
    
    public static boolean onlyDigit(String digit){
        Pattern patron = Pattern.compile("^[0-9]+$");
        if(!patron.matcher(digit).find())
            System.out.println("\n*** Solo se permite ingresar ENTEROS POSITIVOS");
        return !patron.matcher(digit).find();
    } 
    
    public static boolean checkDay(int day, int month, int year){
        
        if(month>=1|| month<=12)
            if(day<0 || day>31){
                System.out.println("\n***Ha ingresado mal el dia***");
                return true;
            }else{
                dayBornMonth = false;
                return false;
            }
 
                
        if(month == 2)
            if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                leapYear = true;
                if(day<0 || day>29){
                    System.out.println("\n***Ha ingresado mal el dia***");
                    return true;
                }else{
                    leapDay = false;
                    return false;
                }
                    
            }else{
                if(day<0 || day>28){
                    System.out.println("\n***Ha ingresado mal el dia***");
                    return true;
                }else{
                    leapDay = true;
                    return false;
                }
            }
        return true;
    }
    
    public static boolean checkYear(int year){
        Calendar cal = new GregorianCalendar();
         int actualYear=cal.get(Calendar.YEAR);
        if (year < 1900 || year > actualYear){
                System.out.println("\n*** Año Incorrecto ***");
                return true;
        }else
            return false;
    }
    
    public static boolean cheackMonth(int month){
        Calendar cal = new GregorianCalendar();
        if (month<1 || month>12){
                System.out.println("\n*** Ha ingresado mal el mes ***");
                return true;
        }else
            return false;
    }
    
    public static boolean checkBorn(int day, int month, int year){
        Calendar cal = new GregorianCalendar();
        int actualYear=cal.get(Calendar.YEAR);
        int actualMonth=cal.get(Calendar.MONTH);
        int actualDay=cal.get(Calendar.DAY_OF_MONTH);
        if(year >= actualYear && month >= actualMonth && day >= actualDay ){
                System.out.println("\n*** No ha nacido ***");
                return true;
        }else
            return false;
    }
    
}
    

