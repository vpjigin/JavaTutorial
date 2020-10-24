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
public class FibonacciSeries{  
    public static void main(String args[]) {    
        int n1=0,n2=1,n3,i,count=10;

        //printing '0' and '1'
        System.out.print(n1+" "+n2); 

        //for loop starts from index 1 becauser 0 and 1 already printed in console
        for(i=2;i<count;++i){    
            n3=n1+n2;
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }    
  
    }
}  
