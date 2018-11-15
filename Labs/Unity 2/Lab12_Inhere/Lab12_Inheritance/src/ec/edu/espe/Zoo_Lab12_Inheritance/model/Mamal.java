/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Zoo_Lab12_Inheritance.model;

/**
 *
 * @author DayannaSilva
 */
public class Mamal extends Animal {
    private int numberNipple;
    //private int timeOfLactantion;

    public Mamal(int id, String cientifyName, int arrivalYear,int numberNipple) {
        super(id, cientifyName, arrivalYear);
        this.numberNipple=numberNipple;
    }

    public int getNumberNipple() {
        return numberNipple;
    }

    public void setNumberNipple(int numberNipple) {
        this.numberNipple = numberNipple;
    }
    
    
    
}
