package VacationAssignments;
import java.util.*;

public class FindMinimum {
   public static void main(String[] args) {
      int[] array = {9,7,5,3,6,8,7,11,2,23,34,44,53,23,4,19,17,28,-25,-23,0,-1};

      Arrays.sort(array);
      int i = 0;
      while (array[i] <= 0) {
         i++;
      }
         System.out.println("The minimun positive number is " + array[i]);
   }
}