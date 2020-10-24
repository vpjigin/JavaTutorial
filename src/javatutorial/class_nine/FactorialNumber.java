/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.class_nine;

/**
 *
 * @author jigin
 */
class FactorialNumber{  
    public static void main(String args[]){  
       int fact=1;

       //to find the factorial of the number
       int number=4;
       
       for(int i=1;i<=number;i++){
           fact=fact*i;    
       }

       System.out.println("Factorial of "+number+" is: "+fact);    
    }  
}  
