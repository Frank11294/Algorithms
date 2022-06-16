/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subarray.division;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class SubarrayDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
    
        static int solve(int n, int[] s, int d, int m){
        int aux=0;
        int temp=0;
        int iteraciones=m;
        
        // n -> tamaño del array
        // s -> Array
        // d -> valor dentro de ese cuadrado
        // m -> cuadrado del chocolate
        
        if(m==1){
            if(s[0]==d){
                aux=1;
            }else{
                aux=0;
            }
        }else{   
         aux=m;
       }
       
        
        return aux;
    }
    
}
