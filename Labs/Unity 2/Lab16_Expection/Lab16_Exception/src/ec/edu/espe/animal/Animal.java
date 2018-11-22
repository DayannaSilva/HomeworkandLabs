/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.animal;

/**
 *
 * @author DayannaSilva
 */
public class Animal {
    public String eyes;
    static int barnNumber=7;
    public void feed(){
        System.out.println("The animal is eating");
    }
    public void assignBarn (int bn){
        barnNumber=bn;
    }

    public  int getBarnNumber() {
        return barnNumber;
    }
    
}
