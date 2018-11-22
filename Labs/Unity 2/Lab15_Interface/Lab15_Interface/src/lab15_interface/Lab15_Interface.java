/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_interface;

import ec.edu.espe.Lab15_Interface.model.Mamal;
import ec.edu.espe.Lab15_Interface.model.Reptile;
import interfacelab15.Animal;

/**
 *
 * @author DayannaSilva
 */
public class Lab15_Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        animal = new Mamal();
        System.out.println("Reptil");
        animal.assignHabitat();
        animal.feed();
        animal = new Reptile();
        System.out.println("Mamal");
        animal.assignHabitat();
        animal.feed();
        
        
        
       
        
        
        
       
    }
    
}
