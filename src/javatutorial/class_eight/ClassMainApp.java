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
public class ClassMainApp {
    
    public static void main(String[] args) {
        
        
        /*AppClass app_class = new AppClass();
        
        AppClass app_class1 = new AppClass(4);
        
        int add_result = app_class.add(2,4);
        int multi_result = app_class.multiplication(2, 4);
        
        
        System.out.println("add value "+add_result);
        System.out.println("multiplication value "+multi_result);*/
        
        SingletonAppClass object = SingletonAppClass.getObject();
        object.print();
        
    }
    
}
