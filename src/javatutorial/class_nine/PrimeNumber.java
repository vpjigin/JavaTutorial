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
public class PrimeNumber{    
    public static void main(String args[]){    
        int i,m=0,flag=0; 
        
        //number which is used to check wheather it is prime or not
        int n=15;
        
        m=n/2;  
        
        if(n==0 || n==1){  
            System.out.println(n+" is not prime number");      
        }
        else{  
            for(i=2;i<=m;i++){      
                if(n%i==0){      
                    System.out.println(n+" is not prime number");      
                    flag=1;      
                    break;      
                }      
            }  
        
            if(flag==0)  { 
                System.out.println(n+" is prime number"); }  
            }  
    }    
}   
