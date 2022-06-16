/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Book {

   
    public static void main(String[] args) {
        int pages=0;
        int pagetoGetTo=0;
        int numberOfPagesToTurn=0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Insert number of pages of your book: ");
        pages=in.nextInt();
        
        System.out.println("Insert page you want to get to: ");
        pagetoGetTo=in.nextInt();
        
        numberOfPagesToTurn=pageCount(pages, pagetoGetTo);
        System.out.println("You have to turn: "+numberOfPagesToTurn+" pages");
    }
    
   public static int pageCount(int n, int p) {
       // Pages to turn
        int PtT=0;
        int aux=n/2;
        int a=0,b=0;       
       if (p>aux){
           a=n-p;
           b=a/2;
           PtT=b;
         if(n%2!=0 & a==1){               
           PtT=b;
         }else if(n%2 ==0 & a==1){        
           PtT=b+1;
         } 
       }else{       
          PtT=p/2; 
       }
        
     return PtT;
    }
   
   
   
}
    

