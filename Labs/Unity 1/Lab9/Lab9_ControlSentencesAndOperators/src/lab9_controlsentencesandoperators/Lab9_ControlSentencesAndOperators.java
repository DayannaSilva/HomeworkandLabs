/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_controlsentencesandoperators;

import ec.edu.espe.Lab9_ControlSentencesAndOperators.model.Operation;

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
        Operation operation = new Operation();
        System.out.println("La suma es:"+operation.add(5,6));
        System.out.println("La resta es:"+operation.subtraction(5,6));
        System.out.println("La multiplicacion es:"+operation.multiplication(5,-6));
        System.out.println(" / La division es:"+operation.division(12,6));
    }
    
}
