/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_arrays;

import ec.edu.espe.Lab11_Arrays.model.Files;
import ec.edu.espe.Lab11_Arrays.model.Person;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DayannaSilva
 */
public class Lab11_Arrays {
    static File file; 
    static Files arch;

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int year,month,day;
        String name,data;
        
        Person[] person = new Person[10]; 
        Files filen = new Files();
        File file = new File("archivo.csv");
        
        for(int i=0;i<person.length;i++){
        
            System.out.print("Ingrese el nombre: ");
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
            in.nextLine();
            
            person[i] = new Person(year,month,day);                   
            person[i].calcAge(year,month,day);   
            data = "Nombre:" + ":" + name + "edad:" + ":" + person[i].getAgeYear();
            filen.write(file, data);
            
         }
    }
    
}
