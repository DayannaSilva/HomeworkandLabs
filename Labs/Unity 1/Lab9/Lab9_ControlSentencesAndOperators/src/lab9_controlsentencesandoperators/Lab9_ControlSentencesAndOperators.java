/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_controlsentencesandoperators;

import ec.edu.espe.Lab9_ControlSentencesAndOperators.model.Operation;
import ec.edu.espe.Lab9_ControlSentencesAndOperators.model.Person;
import java.util.Scanner;

/**
 *
 * @author DayannaSilva
 */
public class Lab9_ControlSentencesAndOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Operation operation = new Operation();
        System.out.println("La suma es:"+operation.add(5,6));
        System.out.println("La resta es:"+operation.subtraction(5,6));
        System.out.println("La multiplicacion es:"+operation.multiplication(5,-6));
        System.out.println(" / La division es:"+operation.division(12,6));*/
        Scanner in = new Scanner (System.in);
        int day,month,year;
        System.out.println("Ingrese el año de nacimiento");
        year = in.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        month = in.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        day = in.nextInt();
        Person person = new Person(day, month, year);
        person.calculateAge();
        System.out.println("Tu edad es:\n" +person.getAgeYear()+ " Años " + person.getAgeMonth()+ " Meses " + person.getAgeDay()+ " Dia ");
        
        
    }
}
