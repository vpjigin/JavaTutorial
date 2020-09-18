/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.class_six;

/**
 *
 * @author Youtube
 */
public class FibanocciSeriesExample {
    
    
    public static void main(String[] args) {
        
        //0,1,1,2,3,5,8......
        
        
        int n1 = 0;
        int n2 = 1;
        
        int n3 = 0;
        
        System.out.println(n1);
        System.out.println(n2);
        
        for(int i=2;i<20;i++){
            
            n3 = n1 + n2;
            System.out.print(n3+"  ");
            
            n1 = n2;
            n2 = n3;
            
        }
        
    }
    
}
