/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo_project;

import ec.edu.espe.zoo_project.model.Coustumer;

/**
 *
 * @author daya_
 */
public class Zoo_Project {
private static String name = "Juan";

    public static void main(String[] args) {
        Coustumer client;
        client = new Coustumer ("Juan");
        System.out.println ("El name es:"+name);
    }
   
}
