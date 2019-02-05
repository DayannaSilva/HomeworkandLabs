/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab9_ControlSentencesAndOperators.model;

/**
 *
 * @author DayannaSilva
 */
public class Operation {
    private int operand1;
    private int operand2;
    private int result;
    public int add (int operand1, int operand2){
        result = operand1 + operand2;
        return result;
    }
    public int subs (int operand1, int operand2){
        result = add(operand1,(-operand2));
        return result;
    }
    public int multiplication (int operand1, int operand2){
        int cont=0;
        int acum=0;
        boolean cheak = false;
        //Valor absoluto
        if (operand2<0){
            operand2 = (-operand2);
            cheak = true;
        }
        while (cont<operand2){
            acum = add(acum,operand1);
            cont++;
        }
        if (cheak) return -acum;
        else return acum;
    }
    public int division (int operand1, int operand2){
        int cont=0;
        while(operand1>=operand2){
            operand1=add(operand1,(-operand2));
            cont++;
        }
        System.out.print("El residuo es:"+operand1);
        return cont;
    }

    

    
}
