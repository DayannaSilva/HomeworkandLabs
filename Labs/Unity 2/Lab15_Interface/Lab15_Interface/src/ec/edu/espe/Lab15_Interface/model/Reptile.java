/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab15_Interface.model;

import interfacelab15.Animal;

/**
 *
 * @author DayannaSilva
 */
public class Reptile implements Animal {

    @Override
    public void feed() {
        System.out.println("Esta comiendo insectos");
    }

    @Override
    public void assignHabitat() {
        System.out.println("Se le asigno un pantano");
    }
    
    
}
