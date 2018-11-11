/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlsentencesandoperators_lab10;

import ec.edu.espe.ControlSentencesAndOperators_Lab10.model.Operation;
import ec.edu.espe.ControlSentencesAndOperators_Lab10.model.Person;
import ec.edu.espe.Files_Lab10.model.Files;
import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author DayannaSilva
 */
public class Lab10_ControlSentencesAndOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        int day,month,year;
        Files arch = new Files();
        File file = new File ("Archivo.csv");//Crear el archivo       
        String name, data;
        
        int valid = 0;
            
        System.out.println("-------****EDAD****-------");
        System.out.println("Ingrese su Nombre");
        name = in.nextLine(); 
        System.out.println("Ingrese el año de nacimiento");
        year = in.nextInt();
        if (year < 0) {
            System.out.println("Año erroneo");
            System.out.println("Ingrese el años positivo");
            year = in.nextInt();
        }
        System.out.println("Ingrese el mes de nacimiento");
        month = in.nextInt();
        if (month < 0 | month > 12) {
            System.out.println("Mes erroneo");
            System.out.println("Ingrese meses del 1 al 12");
            month = in.nextInt();
        }
        System.out.println("Ingrese el dia de nacimiento");
        day = in.nextInt();
        if (day < 0 | day > 31) {
            System.out.println("Dia erroneo");
            System.out.println("Ingrese el dia positivos o menores que 31");
            day = in.nextInt();
        }
        Person person = new Person(year, month, day);
        person.calcAge(year,month,day); 

        data = name + "," + person.getAgeYear() + "," + person.getAgeMonth() + "," + person.getAgeDay();
        arch.Write(file, data);
        System.out.println("***Edades***");
        arch.Read(file);
        }  
        
}
