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
public class Reptile extends Animal {
    private int numberOfEggs;

    public Reptile(int numberOfEggs, int id, String cientifyName, int arrivalYear) {
        super(id, cientifyName, arrivalYear);
        this.numberOfEggs=numberOfEggs;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }
    
}
