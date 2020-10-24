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
class PalindromeNumber {  
    public static void main(String args[]){  
        int r,sum=0,temp; //45  
        
        //number which is used to check weather it is palindrome or not
        int n=454;

        temp=n;    
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;    
        }
        
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
