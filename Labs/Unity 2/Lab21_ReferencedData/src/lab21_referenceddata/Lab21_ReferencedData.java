/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21_referenceddata;

import ec.edu.espe.lab21ReferenceData.business.SalesPrice;

/**
 *
 * @author Dayanna Silva
 */
public class Lab21_ReferencedData {

    
    public static void main(String[] args) {
        SalesPrice salesPrice = new SalesPrice(20,10,0);
        float base=0;
        float tax=12;
        float finalPrice=0;
        Integer numero;
        base=10;
        System.out.println("priting from main -> Base = "+base+"Final Price = "+finalPrice);
        computeFinalPrice(base, tax, finalPrice);
        System.out.println("Priting from main -> Base = "+base+"Final Price = "+finalPrice);
        System.out.println("Priting from main"+salesPrice);
        computeFinalPrice(salesPrice);
        System.out.println("Priting from main"+salesPrice);
        numero=10;
        System.out.println("Priting from main"+numero);
        power(numero);
        System.out.println("Priting from main"+numero);
        
    }
    public static void computeFinalPrice(float mBase, float mTax , float mFinalPrice){
        mFinalPrice = (mBase*mTax)/100+mBase;
        System.out.println("Priting from main -> Base = "+mBase+"Final Price = "+mFinalPrice);
    
    }
    public static void computeFinalPrice(SalesPrice mSalesPrice){
        mSalesPrice.setFinalPrice((mSalesPrice.getBase()*mSalesPrice.getTax())/100+mSalesPrice.getBase());
        System.out.println("Priting from computeFinalPrice -> Base = "+mSalesPrice);
        
    }
    public static void power(Integer numero){
       numero= numero*numero;
        System.out.println("Priting from main->"+numero);
    }
}
