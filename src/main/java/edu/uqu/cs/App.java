package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;

public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters (){

    
    for (int i=1; i<=110; i++){
    
        if (i % 2 == 0){
            System.out.print("Tweetle");
        
        if (i % 4 == 0)
            System.out.print("Beetle");
        
        if (i % 6 == 0)
            System.out.print("Poodle");
        } else {
            System.out.print(" " + i + " ");
        }
       
    }
}


/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 public static void phoneKeypad (String str){


    int len = str.length();

    for (int i=0; i<len; i++){
        char ch = str.charAt(i);

       if (ch>='a'&&ch<='c'){
        System.out.print(2);
       } 
       else if (ch>='d'&&ch<='f'){
        System.out.print(3);
       } 
       else if (ch>='g'&&ch<='i'){
        System.out.print(4);
       } 
       else if (ch>='j'&&ch<='l'){
        System.out.print(5);
       } 
       else if (ch>='m'&&ch<='o'){
        System.out.print(6);
       } 
       else if (ch>='p'&&ch<='s'){
        System.out.print(7);
       } 
       else if (ch>='t'&&ch<='v'){
        System.out.print(8);
       } 
       else if (ch>='w'&&ch<='z'){
        System.out.print(9);
       } 
        
    }
 }

    public static void main(String [] args) {
        

        /* Write your code here */
     Scanner scnr = new Scanner (System.in);

       //call method twisters()
       twisters();
       System.out.println();
       //prompt user to enter a string 
       System.out.println("Entar a string");
       String str = scnr.nextLine().toLowerCase();

       //call method phoneKeypad(string)
       phoneKeypad(str);

    }

}
