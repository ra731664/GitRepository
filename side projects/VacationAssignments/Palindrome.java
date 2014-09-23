/** This program is used to check if a word is a palindrome. I used the string builder reverse function to check
 *  to see if the original word matches the reversed word.
 */
package VacationAssignments;
import java.util.*;

public class Palindrome{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a word that you wish to check");
      String word = input.nextLine();
      isPalindrome(word);
   }

   public static void isPalindrome(String word) {
      String string1 = word;
      String string2 = reverse(word);
      //System.out.println(string1.equals(string2)); to test equals function
      boolean isPal = string1.equals(string2);
      if (isPal == true) {
         System.out.println(string1 + " is a palindrome.");
      } else { 
         System.out.println(string1 + " is not a palindrome.");
      }
   }   
   public static String reverse(String x) {
      StringBuilder stringBuilder = new StringBuilder(x);
      stringBuilder.reverse();
      String y = stringBuilder.toString();
      //System.out.println(y); to test reverse function
      return y;
   }
}