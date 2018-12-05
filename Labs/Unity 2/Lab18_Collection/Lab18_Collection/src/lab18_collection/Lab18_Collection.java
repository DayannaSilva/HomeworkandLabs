/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_collection;

import ec.edu.espe.Lab18_Collection.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author DayannaSilva
 */
public class Lab18_Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Collection things=new ArrayList();
       Person person = new Person(123,"Dayanna",1110);
        System.out.println("size at the begin="+things.size());
        things.add(18000);
        things.add("Hello Quito");
        things.add(5000.25F);
        things.add(person);
        System.out.println("size at the begin="+things.size());
        System.out.println("The element the list is"+things);
        Object[] thingsArray = new Object[things.size()];
        thingsArray = things.toArray();
        System.out.println("The third element is: " + thingsArray[2]);
        things.remove(5000.25F);
        System.out.println("The element the list is"+things);
        things.add(3);
        things.add(3);
        things.add(3);
        System.out.println("size at the begin="+things.size());
        things.remove(3);
        System.out.println("The element the list is"+things);
        things.add(5);
        things.add(8);
        things.add(4);
        things.add(8);
        things.add(9);
        things.add(8);
        System.out.println("size at the begin="+things.size());
        System.out.println("The element the list is"+things);
        things.remove(8);
        System.out.println("The element the list is"+things);
        things.remove(person);
        System.out.println("The element the list is"+things);
        Collection integer = new ArrayList<>();
        integer.add(1);
        integer.add(1.7f);
        ArrayList <Person> person2 =new ArrayList<>();
        
        for (int i=0; i<=5;i++){
            person2.add(new Person(i+1,"Dayanna"+(i+1),i+1000));
        }
        for (Person a:person2)
            System.out.println("Sueldos:"+a);
        
    }
    
    
}
