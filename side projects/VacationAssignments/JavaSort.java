package VacationAssignments;

//import java.util.*;

public class JavaSort {
   public static void main(String[]args){
      int[] array = {9,7,5,3,6,8,7,11,2,23,34,44,53,23,1,4,19,17,28};
      
      java.util.Arrays.sort(array); 
      //This method uses insertion sort if less than 7 input, otherwise, merge sort
      
      for(int i = 0; i < array.length; i++){
         System.out.println(array[i] + " ");
      }
   }
}
