/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.class_six;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Youtube
 */
public class ListExample {
    
    public static void main(String[] args) {
        
        List<String>list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("ac");
        list.add("ad");
        list.add("ae");
        
        /*int size = list.size();
        for(int i= 0;i<size;i++){
            System.out.println(list.get(i));
        }*/
        
        List<String>copy_list = new ArrayList<>();
        
        copy_list.addAll(list);
        int size = copy_list.size();
        
        for(int i= 0;i<size ;i++){
            System.out.println(copy_list.get(i));
        }
        
        
        
        
    }
    
}
