/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.class_three;

import java.util.Scanner;

/**
 *
 * @author Youtube
 */
public class ConsoleApplication {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("First number to add?");
        int a = sc.nextInt();
        
        System.out.println("Second number to add?");
        int b = sc.nextInt();
        
        int total = a + b;
        System.out.println("The total of two numbers is "+total);
        
    }
    
}
