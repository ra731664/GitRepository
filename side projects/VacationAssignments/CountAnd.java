package VacationAssignments;
import java.util.*;

public class CountAnd {
   static int count = 0;
   
   public static void main(String[] args) {
      
      String paragraph = "Liverpool Football Club is an English Premier League football club based" +
      " \rin Liverpool. Liverpool F.C. is one of the most successful clubs in \r" +
      "England and has won more European trophies than any other English team \r" +
      "with five European Cups, three UEFA Cups and three UEFA Super Cups. The \r" +
      "club has also won eighteen League titles, seven FA Cups and a record eight \r" +
      "League Cups.Liverpool was founded in 1892 and joined the Football League \r" +
      "the following year. The club has played at Anfield since its formation. \r" +
      "The most successful period in Liverpool's history was the 1970s and '80s" +
      " \rwhen Bill Shankly and Bob Paisley led the club to eleven league titles \r" +
      "and seven European trophies.The club's supporters have been involved in \r" +
      "two major tragedies. The first was the Heysel Stadium disaster in 1985 in" +
      " \rwhich charging Liverpool fans caused a wall to collapse, killing 39 Juventus" +
      " \rsupporters and resulting in English clubs being banned from European \r" +
      "competitions for five years. In the 1989 Hillsborough disaster, 96 Liverpool" +
      " \rsupporters lost their lives in a crush against perimeter fencing.Liverpool" +
      " \rhas long-standing rivalries with neighbours Everton and with Manchester \r" +
      "United. The team changed from red shirts and white shorts to an all-red \r" +
      "home strip in 1964. The club's anthem is \"You'll Never Walk Alone\".";
      
      System.out.println(paragraph);
      
      Scanner input = new Scanner(paragraph);
      
      while(input.hasNext()){
         check(input.next());
      }
      System.out.println("\rThe paragraph above has the word \'and\' " + count + " times.");
   }
   public static void check(String word){
      String and = "and";
      boolean isEqual = word.equals(and);
      if(isEqual) {
         count++;
      }
   }
}