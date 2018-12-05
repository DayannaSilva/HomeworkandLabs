/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab18_Collection;

/**
 *
 * @author DayannaSilva
 */
public class Person {
    private int id;
    private String name;
    private int salary;

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" + "" + id + ", " + name + ", " + salary;
    }

    

    

    
    
    
}
