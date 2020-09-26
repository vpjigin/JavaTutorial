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
public class AppClass {
    
    
    //constructor
    //1. constructor doesn't have return type
    //2. constructor has same name as the class name
    //3. constructor is very similar to that of java method
    //4. constructor will be initializing along with the object creation.
    //5. n number of constructor can be initialized in a java class
    public AppClass(){
        System.out.println("constructor reached");
    }
    
    public AppClass(int a){
        System.out.println("Value of a is "+a);
    }
    
    public AppClass(int a, boolean b){
        
    }
    
    public AppClass(boolean b,int a){
        
    }
    
    
    
    public int add(int a,int b){
        
        int c = a + b;
        
        return c;
    }
    
    
    public int multiplication(int a, int b){
        int c = a * b;
        
        return c;
    }
    
    
}
