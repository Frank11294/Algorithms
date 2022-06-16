/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdivideandconquer;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class TestDivideandConquer {


    public static void main(String[] args) {

        int number=0;
        int [] array = new int[10000000];
        Scanner in = new Scanner(System.in);
        
      
        for (int i = 0; i < array.length; i++) {
            array[i]=i;        
        }
        
        System.out.println("Insert the number you wanna search in the array: ");
        number=in.nextInt();
        
        
          DivideAndConquer(array,number);
//        BruteForce(array,number);
        
        
        
    }
    
        static boolean DivideAndConquer(int [] array,int x){
           int left = 0;
           int right = array.length-1;
           
           while(left<=right){
              int mid = left + ((right-left)/2);
               System.out.println("Mid: "+mid+" Left: "+left+" Rigt: "+right);
              if(array[mid] == x){
                 return true;
              }else if(x < array[mid]){
                 right=mid - 1 ;
              }else{
                 left=mid+1;
              }
              
           }
          
        
         return false;
    }
        
        
        static boolean BruteForce(int [] array,int x){
    
            for (int i = 0; i < array.length-1; i++) {
                if(array[x]==x){
                  return true;
                }
            }
        
        return false;
    }
        
    
}
