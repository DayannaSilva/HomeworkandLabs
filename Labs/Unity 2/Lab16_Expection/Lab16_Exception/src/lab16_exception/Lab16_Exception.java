/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_exception;

import ec.edu.espe.animal.Animal;
import ec.edu.espe.operation.Operation;

/**
 *
 * @author DayannaSilva
 */
public class Lab16_Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operation operation = new Operation();
        float result;
        result = operation.divide(3, 5);
        System.out.println("La respuesta es:"+result);
        result = operation.divide(386, 897);
        System.out.println("La respuesta es:"+result);
        result = operation.divide(5.8f, 1.3f);
        System.out.println("La respuesta es:"+result);
        result = operation.divide(8, 0);
        System.out.println("La respuesta es:"+result);
        System.out.println("Suma"+operation.add(1.2f,2.4f));
        System.out.println("Suma"+operation.add(1.2f,2.9f));
        result=operation.add(2,2.4f);
        System.out.println("Suma"+result);
        
        Animal animal = new Animal();
        animal.eyes = "Brown";
        if (animal!=null)
            System.out.println("The animal exist");
        else 
            System.out.println("The animal not exist");
        try{
            System.out.println("The first line running");
            System.out.println(""+animal.eyes);
            System.out.println("The program is running");
            
        }catch (NullPointerException e){
            if (animal==null)
                animal = new Animal ();
                animal.eyes = "Brown";
            
               // System.out.println("");
            //else
                //System.out.println(animal.eyes = "Brown");
            /*System.out.println("Ha ocurrido un error " +e);
            System.out.println(e.getMessage());
            if (e.toString().equals("java.lang.NullPointerException"))
            System.out.println("Ha ocurrido un error");;
            System.out.println(e.getStackTrace());
            e.printStackTrace();*/
        }finally{
            System.out.println("Afther the exception");
        }
        System.out.println("This is Barn Number = " + animal.getBarnNumber());
        
        Animal animal2 = new Animal();
        System.out.println(animal.getBarnNumber());
        animal.assignBarn(18);
        System.out.println(animal2.getBarnNumber());
        
    }
    
}
