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
public class ShapeFactory {
    
    // Use getShape method to get object of type ShapeF
    
    public ShapeF getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } 
        
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleF();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RectangleF();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new SquareF();
        }
        
        return null;
    }
}
