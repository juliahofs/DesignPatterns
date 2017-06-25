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
public class SingleObject {
    
    // Create an object of SingleObject
    private static SingleObject instance;
    
    // Make the constructor private so this class cannot be instantiated
    private SingleObject(){}
    
    // Get the only available object
    public static SingleObject getInstance() {
        
        // Create cached instance if it does not exist yet
        if (instance == null) {
            instance = new SingleObject();
        }
        
        // Return cached instance
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Hello world!");
    }
}
