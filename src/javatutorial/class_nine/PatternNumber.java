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
public class PatternNumber   
{   
    public static void main(String args[])   
    {   
        //i for rows and j for columns      
        //row denotes the number of rows you want to print  
        int i, j, row=6;   
        //outer loop for rows  
        for(i=0; i<row; i++)   
        {   
            //inner loop for columns  
            for(j=0; j<=i; j++)   
            {   
                //prints stars   
                System.out.print("* ");   
            }   
            //throws the cursor in a new line after printing each line  
            System.out.println();   
        }   
    }   
}  
