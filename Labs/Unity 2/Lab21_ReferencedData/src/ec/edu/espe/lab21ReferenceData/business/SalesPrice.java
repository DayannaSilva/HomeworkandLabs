/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab21ReferenceData.business;

/**
 *
 * @author Dayanna Silva
 */
public class SalesPrice {
    float base;
    float tax;
    float finalPrice;
    public void computeFinalPrice(){
        finalPrice=base*tax/(100+base);
    
    }

    public SalesPrice(float base, float tax, float finalPrice) {
        this.base = base;
        this.tax = tax;
        this.finalPrice = finalPrice;
    }
    

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString() {
        return "SalesPrice{" + "base=" + base + ", tax=" + tax + ", finalPrice=" + finalPrice + '}';
    }
    
    
}
