/*
This program was created by Dylan T 
It was created on May 3rd, 2018 
This program counts the number and squares them staring from one going to nine using an ArrayList
 */


package squares;

import java.util.*;
        
public class Squares {

    public static void main(String[] args) {
        
        ArrayList <String> squares = new ArrayList();//Declares an arraylist
        Collections.addAll(squares, "0", "1", "4", "9", "16", "25", "36", "42", "64", "81");//Assigns sqaures arraylist
        System.out.println("Squares ArrayList");//Prints Squares arraylist to the screen
        System.out.println("******************");// Prints *'s to the screen
        for(int i = 0; i < squares.size(); i++){//Declares a for loop 
            System.out.println("Number :" + i + " Square :" + squares.get(i));// Prints the for loop to the screen
            
        }       
        
    }
}
