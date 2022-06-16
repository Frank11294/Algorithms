
package budget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author frank
 */
public class Budget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int budget = 60;
//        int [] keyboards = {50,40,60};
//        int [] drives = {5,8};
//        
        int budget = 10;
        int [] keyboards = {3,1};
        int [] drives = {5,2,8};

//        int budget = 5;
//        int [] keyboards = {4};
//        int [] drives = {5};
        System.out.println(getMoneySpent(keyboards,drives,budget));

    }
    
    
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       List<Integer> posibilities = new ArrayList<>();
       int gotcha=0,aux=0;
      
        for (int i = 0; i < keyboards.length; i++) {
            for (int j=0;j < drives.length;j++){     
              posibilities.add(keyboards[aux] + drives[j]);      
            }            
            aux++;
            }
        Collections.sort(posibilities);
        System.out.println(posibilities.toString());     
        boolean aux3=true;
        
        if(posibilities.size()==1){
          if(posibilities.get(0)>b){
            return -1;
          }else{
            return posibilities.get(0);
          }
        }else{
           for (int i = 0; i <posibilities.size(); i++) {
            if(posibilities.get(i)<b && aux3){ 
               posibilities.remove(posibilities.get(i));
               
            }else if(posibilities.get(i)>b && aux3){
                gotcha=posibilities.get(i-1);
                aux3=false;                
            }
            
        }
        
        }
        

        
        System.out.println(posibilities.toString());     
        

      return gotcha;
         }
}

