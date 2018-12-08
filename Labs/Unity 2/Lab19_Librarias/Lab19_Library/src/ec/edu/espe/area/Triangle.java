/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.area;

/**
 *
 * @author DayannaSilva
 */
public class Triangle extends Figure{
    private float height;
    private float base;

    @Override
    public float conputeArea() {
        area = (height*base)/2;
    return area;
    }

    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    
    
}
    
    

