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
import static java.lang.System.in;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author DayannaSilva
 */
public class Lab10_ControlSentencesAndOperators {
    static int day = 0, month = 0, year = 0;
    static Scanner in = new Scanner(System.in);
    static Calendar cal = new GregorianCalendar();
    static Files arch = new Files();
    static File file = new File("Age.csv");
    static Person person = new Person(year, month, day);
    static String name, data;
    public static void main(String[] args) {
        byte op;
        do{
        System.out.println("*** Registro de Edades ***");
        
        System.out.println("**************************");
        System.out.println("*   Que desea hacer????   *");
        System.out.println("**************************");
        System.out.println("    1. Ingresar Datos");
        System.out.println("    2. Leer Datos");
        System.out.println("    3. Modificar Datos");
        System.out.println("    4. Borrar Datos");
        System.out.println("    5. Salir");
        do{
            System.out.println("* Elija una opcion *");
            op = in.nextByte();
        }while(op <= 0 || op > 6);
        
        switch(op){
            case 1:
               writer();
                break;
            case 2:
               read(true);
                break;
            case 3:
               modify();
                break;
            case 4:
               delete();
                break;
            case 5:
                System.out.println("Fin");
                break;
        }
        }while(op != 5);
    }
    public static void read(boolean check){
        System.out.print("*** Registro ***");
        arch.readFile(file);
        if(check){
        System.out.println("* Digite cualquier cosa para regresar al Menu*");
        in.next();
        }
    }
    public static void modify(){
        read(false);
        String nameModify;
        System.out.println("Que Nombre desea moodificar");
        nameModify = in.nextLine();
        String inString = Info();
        arch.modifyFile(file, nameModify, data, true);
        
        System.out.println("** Registro Modificado **");
        System.out.println("* Elija otra opcion *");
        in.next();
    }
    public static void delete(){
        read(false);
        String otherName;
        in.nextLine();
        System.out.println("Escriba el nombre del que desea eliminar los datos");
        otherName = in.nextLine();
        
        arch.deleteFile(file, otherName);
    }
    public static void writer(){        
        data = Info();
        
        arch.write(file, data);
        System.out.println("*** Registro Exitoso!!!!! ***\n"
                + "Nombre: " + name + " " +
                + person.getAgeYear() + " años "
                        + person.getAgeMonth() + " meses "
                                + person.getAgeDay() +" dias");
        System.out.println("* Elija otra opcion *");
        in.next();
    }
     public static String Info(){
        boolean check = false;
        in.nextLine();
        System.out.println("Ingrese su Nombre");
        name = in.nextLine();
        while (!check){
            System.out.println("Ingrese el año de nacimiento");
            year = in.nextInt();
            if (year < 0) {
                System.out.println("Año erroneo");
                System.out.println("Ingrese el años positivo");
                year = in.nextInt();
                check = true;
            }
            System.out.println("Ingrese el mes de nacimiento");
            month = in.nextInt();
            if (month < 0 | month > 12) {
                System.out.println("Mes erroneo");
                System.out.println("Ingrese meses del 1 al 12");
                month = in.nextInt();
                check = true;
            }
            System.out.println("Ingrese el dia de nacimiento");
            day = in.nextInt();
            if (day < 0 | day > 31) {
                System.out.println("Dia erroneo");
                System.out.println("Ingrese el dia positivos o menores que 31");
                day = in.nextInt();
                check = true;
            }
            if(check) check = false;
            else check = true;
        }
        person.calcAge(year,month,day);
        return "("+ name + "), " + person.getAgeYear() + ", " 
                + person.getAgeMonth() + ", " + person.getAgeDay();
       
     }
    
}
