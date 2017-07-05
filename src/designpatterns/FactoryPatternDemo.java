/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author julia
 */
public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        // Get an object of CircleF and call its draw method.
        ShapeF shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        // Get an object of RectangleF and call its draw method.
        ShapeF shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        // Get an object of SquareF and call its draw method.
        ShapeF shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
        
    }
}
