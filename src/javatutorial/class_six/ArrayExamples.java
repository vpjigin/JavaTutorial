/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.class_six;

import java.sql.Array;
import java.util.Arrays;

/**
 *
 * @author Youtube
 */
public class ArrayExamples {
    
    public static void main(String[] args) {
        
        
        // HOW TO PRINT ALL THE DATA FROM AN ARRAY
        /*String a[] =  new String [5];
        a[0] = "10";
        a[1] = "20";
        a[2] = "30";
        a[3] = "40";
        a[4] = "50";*/
        
        /*
        for(int i = 0;i<5;i++){
            a[i] = i;
        }
        */
        
        /*int size = a.length;
        for(int i =0;i<size;i++){
            System.out.println(a[i]);
        }*/
        
        
        //PRINT LARGEST ELEMENT IN AN ARRAY
        //1st method
        /*int b[] = new int[]{5,4,88,1,999,102};
        
        int max_number = Arrays.stream(b).max().getAsInt();
        System.out.println(max_number);*/
        
        //2nt method
        /*int c[] = new int[]{8,5,4,5,555,222};
        
        int max_value = 0;
        
        for(int i = 0;i<c.length;i++){
            
            if(max_value < c[i]){
                max_value = c[i];
            }
            
        }
        
        System.out.println(max_value);*/
        
        
        //COPY ALL ELEMENTS IN ONE ARRAY TO ANOTHER
        String ab[] = new String[]{"a","b","c","d"};
        
        String cd[] = new String[4];
        
        System.arraycopy(ab, 1, cd, 0, 3);
        
        for(int i=0;i<cd.length;i++){
            System.out.println(cd[i]);
        }
        
        
        
        
    }
    
}
