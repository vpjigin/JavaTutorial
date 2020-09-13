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
public class LogicalOperator {
    
    public static void main(String[] args) {
        
        //logical AND
        //syntaxt (condition1) && (condition2)
        
        //logical OR
        //syntaxt (condition1) || (condition2)
        
        int a = 1;
        int b = 2;
        
        int x = 3;
        int y = 3;
       
        //logical AND( && )
        /*if( (a == b) && (x == y) ){
            System.out.println("both are true");
        }
        else{
            System.out.println("else");
        }*/
        
        //logical OR( || )
        if( (a == b) || (x == y) ){
            System.out.println("either are true");
        }
        else{
            System.out.println("else");
        }
        
        
        
        
    }
    
}
