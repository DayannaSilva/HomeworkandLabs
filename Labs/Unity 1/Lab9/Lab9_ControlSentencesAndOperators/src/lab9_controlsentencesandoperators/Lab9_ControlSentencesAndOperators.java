/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_controlsentencesandoperators;

import ec.edu.espe.Lab9_ControlSentencesAndOperators.model.Operation;
import ec.edu.espe.Lab9_ControlSentencesAndOperators.model.Person;
import java.io.File;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author DayannaSilva
 */
public class Lab9_ControlSentencesAndOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Calendar today = Calendar.getInstance();
        Scanner in = new Scanner (System.in);
        int day,month,year;
        String name;
        char resp = 'n';
        int valid = 0;
        do{         
        System.out.println("-------****EDAD****-------");
        System.out.println("Fecha:"+today.get(Calendar.YEAR)+"-"+(today.get(Calendar.MONTH)+1)+"-"+today.get(Calendar.DAY_OF_MONTH));
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
        
        System.out.println("DESEA INGRESAR NUEVA FECHA y/n: ");
        System.out.println("Si (y) - NO (n): ");
            in.nextLine();
            resp = in.next().toLowerCase().charAt(0);
        }while(resp == 'y');
        System.out.println("EL PROGRAMA HA FINALIZADO");
        }
        
        
        
        
}
