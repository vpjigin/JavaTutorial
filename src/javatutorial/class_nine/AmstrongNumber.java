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
class ArmstrongNumber {  
    public static void main(String[] args)  {  
        int c=0,a,temp;  
        
        //to check number
        int n=153;
        
        temp=n;
        
        while(n>0) // 0
        {
            a=n%10; //1
            n=n/10; //0
            c=c+(a*a*a);  //152 + 1 = 153
        }
        
        if(temp==c)
            System.out.println("armstrong number");   
        else
            System.out.println("Not armstrong number");   
     }  
}  