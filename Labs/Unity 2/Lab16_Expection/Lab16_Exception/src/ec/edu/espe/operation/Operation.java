/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.operation;

/**
 *
 * @author DayannaSilva
 */
public class Operation {
    public float divide (float d1, float d2){
        float quotient;
        quotient=d1/d2;
        return quotient;
    }
    public float add (float s1, float s2){
        float result;
        result=s1+s2;
        return result;
    
    }
    public short add (short s1, short s2){
        short result;
        result= (short)(s1+s2);
        return result;
    }
    
}
