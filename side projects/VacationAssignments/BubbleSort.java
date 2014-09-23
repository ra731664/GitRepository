/** This is known as Bubble sort to sort out each element individually from left to right
 */
package VacationAssignments;
import java.util.*;

public class BubbleSort{
   public static void main(String[] args) {
      int[] array = {9,7,5,3,6,8,7,11,2,23,34,44,53,23,1,4,19,17,28};
      int temp;
      
      for(int h=0; h < array.length; h++){
         for(int i=0; i < array.length-1; i++){
            if (array[i] > array[i+1]) {
               temp = array[i+1];
               array[i+1] = array[i];
               array[i] = temp;           
            }
         }
      }
            
      for(int k=0; k<array.length; k++) {
         System.out.println(array[k] + " ");
      }   
   }
}

/** Another method I tried to use to sort was 
      for(int h=0; h < array.length; h++){
         for(int i=0; i < array.length-1; i++){
            if (array[h] < array[i+1]) {
               int temp = array[i+1];
               array[i+1] = array[h];
               array[h] = temp; 
            }
         }
      }
            
    But it inserts the highest value in array[0]
 */ 