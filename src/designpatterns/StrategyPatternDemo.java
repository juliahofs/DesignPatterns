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
public class StrategyPatternDemo {
    
    public static void main(String[] args) {
        ContextStrategy context = new ContextStrategy(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        
        context = new ContextStrategy(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        
        context = new ContextStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
