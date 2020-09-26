/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.class_eight;

/**
 *
 * @author Youtube
 */
public class SingletonAppClass {
    
    private static SingletonAppClass object = null;
    
    private SingletonAppClass(){
        
    }
    
    public static SingletonAppClass getObject(){
        if(object == null){
            object = new SingletonAppClass();
        }
        
        return object;
    }
    
    
    public void print(){
        System.out.println("printing");
    }
    
}
