/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_unittesting;

import ec.edu.espe.Age_UnitTesting.business.Person;
import ec.edu.espe.Age_UnitTesting.business.Validation;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author DayannaSilva
 */
public class Age {
    static Scanner in = new Scanner(System.in);
    static Calendar cal = new GregorianCalendar();
    static Person person = new Person();
    
    static String name;
    static int bornDay = 0, bornMonth = 0, bornYear = 0;
     
    public static void main(String[] args) {
        String input = ""; 
        System.out.println("-----EDADES-----\n");       
        System.out.println("* Ingresa el nombre * ");
        name = in.nextLine();
        
        do{
            
            do{
                do{
                    System.out.print("\n* Ingrese el año de nacimiento: ");
                    input = in.nextLine();
                }while(Validation.onlyDigit(input));
                bornYear = Integer.parseInt(input);
            }while(Validation.checkYear(bornYear));
            
            do{
                do{
                    System.out.print("\n* Ingrese el mes de nacimiento: ");
                    input = in.nextLine();
                }while(Validation.onlyDigit(input));
                bornMonth = Integer.parseInt(input);
            }while(Validation.cheackMonth(bornMonth));
            
            do{
                do{
                    System.out.print("\n* Ingrese el dia de nacimiento: ");
                    input = in.nextLine();
                }while(Validation.onlyDigit(input));
                bornDay = Integer.parseInt(input);
            }while(Validation.checkDay(bornDay, bornMonth, bornYear));
            
        }while(Validation.checkBorn(bornDay, bornMonth, bornYear));
        
        person.calculateDay(bornDay, bornMonth, bornYear);
        person.calculateMonth(bornDay, bornMonth, bornYear);
        person.calculateAge(bornDay, bornMonth, bornYear);
        
        System.out.println("Nombre"+name+"\n"
                + "Años: "+ person.getAgeYear()+" Meses " +person.getAgeMonth()+" Dias "+ person.getAgeDay()); 
}

}
