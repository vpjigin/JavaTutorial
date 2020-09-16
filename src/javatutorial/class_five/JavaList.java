/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.class_five;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Youtube
 */
public class JavaList {
    
    public static void main(String[] args) {
        
        //list
        
        //how to declare a list
        List<String> books = new ArrayList<String>();
        books.add("E-book");
        books.add("PDF");
        books.add("Excel");
        books.add("samplebook");
        
        
        /*if(books.isEmpty()){
            System.out.println("this list is empty");
        }else{
            System.out.println("this list is not empty");
        }*/
        
        int size = books.size();
        
        for(int i = 0;i<size;i++){
            
            String book = books.get(i);
            
            //for moving into the nextline
            System.out.println(book);
            
            // to print in one line
            System.out.print(book);
            
        }
        
        
        
        
        
        
    }
    
}
