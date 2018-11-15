/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo_lab12_inheritance;

import ec.edu.espe.Zoo_Lab12_Inheritance.model.Animal;
import ec.edu.espe.Zoo_Lab12_Inheritance.model.Files;
import ec.edu.espe.Zoo_Lab12_Inheritance.model.Mamal;
import ec.edu.espe.Zoo_Lab12_Inheritance.model.Reptile;
import java.io.File;

/**
 *
 * @author DayannaSilva
 */
public class Zoo_Lab12_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal [] animal = new Animal [4];
        Files arch = new Files ();
        File file = new File("ZOO.csv");
        String data = "";
        animal [0] = new Mamal(6,"Oso", 1997, 2);
        animal [1] = new Mamal(4, "Leon", 1999, 4);
        animal[2] = new Reptile(5, 20, "Lagarto", 1997);
        animal[3] = new Reptile(2, 100, "Anaconda", 2000);
                
        for(Animal a : animal)
            if(a instanceof Mamal){
                data= "El animal es un : " + a.getCientifyName() 
                         + ", tiene " + ((Mamal) a).getNumberNipple() 
                         + " tetillas\nsu id es: " + a.getId() + " su estancia es de "
                         + a.getYearsOfStay() + " años";
                arch.write(file, data);
            }else{
                data = "El animal es un : " + a.getCientifyName() 
                     + ", tiene " + ((Reptile) a).getNumberOfEggs()
                     + " huevossu id es: " + a.getId() + " su estancia es de "
                     + a.getYearsOfStay() + " años";
                arch.write(file, data);  
            }
        
    }
    
}
