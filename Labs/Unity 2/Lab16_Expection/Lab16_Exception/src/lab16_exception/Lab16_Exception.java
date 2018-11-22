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
        
        Animal animal = null;
        System.out.println(""+animal.eyes);
        
        
    }
    
}
