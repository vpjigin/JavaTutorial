/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.class_four;

/**
 *
 * @author Youtube
 */
public class InstanceOfOperator {
    
    public static void main(String[] args) {
        
        RelationalOperator a = new RelationalOperator();
        RelationalOperator a1 = new RelationalOperator();
        
        if(a instanceof RelationalOperator){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
    
}
