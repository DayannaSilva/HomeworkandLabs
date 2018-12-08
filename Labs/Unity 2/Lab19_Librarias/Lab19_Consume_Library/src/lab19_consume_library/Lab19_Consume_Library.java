/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_consume_library;

import ec.edu.espe.area.Figure;
import ec.edu.espe.area.Triangle;
import ec.edu.espe.operation.BasicOperation;

/**
 *
 * @author DayannaSilva
 */
public class Lab19_Consume_Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figure figure = new Triangle(1,2);
        float localArea;
        localArea=figure.conputeArea();
        System.out.println("La area es:"+figure.getArea());
        BasicOperation op = new BasicOperation(2,4);
        System.out.println("La Suma es:"+op.add());
        System.out.println("La Resta es:"+op.sub());
        System.out.println("La Multiplicacion es:"+op.mul());
        System.out.println("La division es:"+op.div());
        
    }
    
}
